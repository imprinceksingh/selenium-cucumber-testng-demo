package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeetingPage extends BasePage {
	
	 public MeetingPage(WebDriver driver) {
	        super(driver);
	    }
	 
	 @FindBy(xpath="//a[@id='personal-menu-item-meeting']")
	 WebElement meetingButn;
	 
	 @FindBy(xpath="(//*[contains(text(),'Schedule a Meeting')])[1]")
	 WebElement scheduleMeetBtn;
	 
	 @FindBy(xpath="(//input[@class='zm-input__inner'])[1]")
	 WebElement meetingName;
	 
	 @FindBy(xpath="(//input[@class='zm-input__inner'])[2]")
	 WebElement meetingDate;
	 
	 @FindBy(xpath="(//span[@class='zm-button__slot'])[16]")
	 WebElement meetingSave;
	 
	 @FindBy(xpath="(//button[@class='zm-button--plain zm-button--small zm-button'])[8]")
	 WebElement deleteBtn1;
	 
	 @FindBy(xpath="(//button[@class='zm-button--danger zm-button--small zm-button'])[1]")
	 WebElement deleteBtn2;
	 
	 @FindBy(xpath="//span[@id='participant-video']")
	 WebElement prticpntCheck;
	 
	 
	 
	 
	 public void meetingBtnClick() {
		 explicitWait(meetingButn);
		 meetingButn.click();
	 }
	 
	 public void meetingName(String name) {
		 explicitWait(scheduleMeetBtn);
		 scheduleMeetBtn.click();
		 explicitWait(meetingName);
		 meetingName.sendKeys(name);
		 scrollToElement(meetingSave);
		 meetingSave.click();
	 }
	 
	 public void deleteMeeting() {
		 explicitWait(prticpntCheck);
		 scrollToElement(prticpntCheck);
		 explicitWait(deleteBtn1);
		 deleteBtn1.click();
		 explicitWait(deleteBtn2);
		 hoverOnElement(deleteBtn2);
		 deleteBtn2.click();
		 
	 }
}
