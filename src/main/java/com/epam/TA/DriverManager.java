package com.epam.TA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static final Logger LOG = LogManager.getLogger(DriverManager.class);

    private DriverManager() {
    }

    private static DriverManager instance = new DriverManager();


    public static DriverManager getInstance() {
        return instance;
    }


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<WebDriver>();

    public WebDriver getDriver() {
        LOG.info("Driver initialize");
        if (driverPool.get() == null) {
            driverPool.set(initWebDriver());
        }
        return driverPool.get();
    }

    static WebDriver initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.gmail.com");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return webDriver;
    }
}
