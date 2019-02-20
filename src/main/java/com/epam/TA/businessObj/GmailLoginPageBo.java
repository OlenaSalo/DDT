package com.epam.TA.businessObj;
import com.epam.TA.pages.GmailPageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class GmailLoginPageBo {
    public static final Logger LOG = LogManager.getLogger(GmailLoginPageBo.class);


    private GmailPageObject gmailPageObject = new GmailPageObject();

    public void logIn(String username, String psw)
    {
        LOG.info("Log In pass ");
       gmailPageObject.getLoginInput().sendMsgToField(username);
       gmailPageObject.getNextButton().click();
       gmailPageObject.getPswInput(psw);
       gmailPageObject.getNextButton().click();

    }

}
