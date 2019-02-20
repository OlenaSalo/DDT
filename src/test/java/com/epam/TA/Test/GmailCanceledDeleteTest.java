package com.epam.TA.Test;
import com.epam.TA.DriverManager;
import com.epam.TA.businessObj.GmailDeleteCanceled;
import com.epam.TA.businessObj.GmailLoginPageBo;
import com.epam.TA.unit.CVSReaderObject;
import com.epam.TA.unit.JsonObject;
import com.epam.TA.unit.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;


public class GmailCanceledDeleteTest {
    public static final Logger LOG = LogManager.getLogger(GmailCanceledDeleteTest.class);

    JsonObject jsonObject = new JsonObject();
    CVSReaderObject cvsReaderObject = new CVSReaderObject();

    @BeforeSuite(alwaysRun = true)
    public void configSuite() {

        LOG.info("===================================");
        LOG.info("   TESTS  VALID - STARTED");
        LOG.info("===================================");
    }

    @Test(dataProvider = "getUser")
    public void verifyDeleteCanceledMsgTest(String userName, String password) {
        GmailLoginPageBo gmailPageObject = new GmailLoginPageBo();
        GmailDeleteCanceled gmailDeleteCanceled = new GmailDeleteCanceled();
        gmailPageObject.logIn(userName, password );
        gmailDeleteCanceled.selectMsg();
        gmailDeleteCanceled.canceledDeleteMsg();
            Assert.assertTrue(gmailDeleteCanceled.varifyCanceledDelete());

    }

    @AfterMethod
            public void closeAll() {
        DriverManager.getInstance().getDriver().quit();
    }


    @DataProvider(parallel = true)
    public Object[][] getUser() throws FileNotFoundException {

       return cvsReaderObject.getCSVTestData("src/main/resources/userCSV.csv");
    }
}





