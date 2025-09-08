package testCases;

import factory.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.MeetingPage;
import pageObjects.ZoomLogin;
import resources.ConfigReader;

import java.util.Properties;

public class TC01_LoginPage {
   WebDriver driver;
   ZoomLogin zoomLogin;
   Properties prop;
   MeetingPage meetPage;

   @BeforeClass
    public void setup(){
       driver = BaseClass.initDriver();
       prop = ConfigReader.initProp();
   }

   @Test(priority =0)
    public void testLogin(){
       driver.get(prop.getProperty("url"));
   }
   @Test(priority=1)
   public void testLoginWindow() {
       zoomLogin = new ZoomLogin(driver);
       zoomLogin.signInClick();
       zoomLogin.setEmailInput(prop.getProperty("email"));
       zoomLogin.clickNextButton();
       zoomLogin.setPasswordInput(prop.getProperty("password"));
       zoomLogin.clickLoginButton();
       
	   

   }
   @Test(priority =2)
   public void meetingsPage() {
	   meetPage =  new MeetingPage(driver);
	   meetPage.meetingBtnClick();
	   meetPage.meetingName(prop.getProperty("meetingName"));
	   
   }
   
   @Test(priority=3)
   public void meetingDelete() {
	   meetPage =  new MeetingPage(driver);
	   meetPage.deleteMeeting();
   }
   
   @AfterClass
   public void tearDown() {
	   driver.quit();
	   
   }
}
