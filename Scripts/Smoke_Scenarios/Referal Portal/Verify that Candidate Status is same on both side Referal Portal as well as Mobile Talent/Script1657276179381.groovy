import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Mobile Talent Pool'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_All Candidates_fa fa-search'))

Properties pro = new Properties()

pro.load(new FileInputStream('Referral.properties'))

CandidateDetail = pro.getProperty('NameOfCandidate')
emailDetail= pro.getProperty('EmailAddress')

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Name_Name'), 
    CandidateDetail)

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/button_Search'))

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 2)



WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))
List<WebElement> allStatus = driver.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

	int count = allStatus.size()

	System.out.println(count)

	for (int i = 0; i <= count; i++) {
		status1 = allStatus.get(i).getText()

		System.out.println(status1)

		if (status1.equalsIgnoreCase('Saved For Future Requirement'))
				{
				allStatus.get(i).click()
				break	
				}
	}
	WebElement statusOfCandidateButton = driver.findElement(By.cssSelector('span[class=\'lead-details-status ng-binding\']'))
	
	textonButton = statusOfCandidateButton.getText()
	
	System.out.println(textonButton)
	
	if(textonButton.equalsIgnoreCase('Saved For Future Requirement')) {
		
		WebUI.click(findTestObject('Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))
		WebUI.click(findTestObject('MTP Locators/refferalPortalValueFromDropDown'))	
	}
	
WebUI.click(findTestObject('Referal Portal/closeReferralPopup'))
List<WebElement> listOfAllElemenets = driver.findElements(By.cssSelector('li[class=\'nav-item \']'))

int size = listOfAllElemenets.size()

for (int j = 0; j < size; j++) {
    text = listOfAllElemenets.get(j).getText()

    if (text.equalsIgnoreCase('Referral(s)')) {
        listOfAllElemenets.get(j).click()

        break
    }
}

//WebUI.sendKeys(findTestObject('Referal Portal/referralSearchLocator'), emailDetail)
driver.findElement(By.cssSelector("input[name= 'search']")).sendKeys(emailDetail);
    Thread.sleep(3000);
	WebElement listOfElements3 = driver.findElement(By.cssSelector("span[class='badge badge-primary']"));
			String status23= listOfElements3.getText();
			System.out.println(status23);

List<WebElement> listOfElements2 = driver.findElements(By.cssSelector('tr>td:nth-of-type(4)'))
int sizeofElements = listOfElements2.size()
for (int k = 0; k < sizeofElements; k++) {
	textofElements = listOfElements2.get(k).getText()
	System.out.println(textofElements)
	if(textofElements.equalsIgnoreCase(emailDetail) && status23.equalsIgnoreCase("Saved For Future Requirement")){
		
		driver.findElement(By.cssSelector(".dropdown-toggle.pointer > h4")).click()
		driver.findElement(By.cssSelector(".dropdown-item.pointer")).click()
	
		break
	}
else {	
	System.out.println("Status is not same as Mobile Talent")
	throw new IOException("sorry device error");
	}
}

WebUI.closeBrowser()

