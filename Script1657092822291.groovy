mport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

Properties pro1 = new Properties()
Properties pro = new Properties()
FileWriter fw = new FileWriter('Referral.properties')
pro1.load(new FileInputStream('Referral.properties'))

pro1.setProperty('EmailAddress', 'Refer'+ RandomStringUtils.randomAlphabetic(4)+'@yopmail.com')
pro1.setProperty('PhoneNumber', '1325' + RandomStringUtils.randomNumeric(6))
pro1.store(fw, 'Comments')

emailAddress = pro1.getProperty('EmailAddress')

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Mobile Recruitment/i_Mobile Recruitment Platform_fas fa-chevron-down'))

WebUI.click(findTestObject('MTP Locators/refferalPortalValueFromDropDown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Referal Portal/closeReferralPopup'))

List<WebElement> listOfAllElemenets = driver.findElements(By.cssSelector('li[class=\'nav-item \']'))

int size = listOfAllElemenets.size()

for (int i = 0; i < size; i++) {
    text = listOfAllElemenets.get(i).getText()

    if (text.equalsIgnoreCase('Job(s)')) {
        listOfAllElemenets.get(i).click()

        break
    }
}

WebUI.sendKeys(findTestObject('Referal Portal/searchJobLocator'), keyValue)

WebUI.scrollToElement(findTestObject('Referal Portal/referButtonLocator'), 0)

WebUI.click(findTestObject('Referal Portal/referButtonLocator'))

nameOFCandidateToBeRefered = ('Refer' + RandomStringUtils.randomNumeric(4))

//emailOFTheCandidate = (('Refer' + RandomStringUtils.randomNumeric(4)) + '@yopmail.com')

System.out.println('Candidate Name=' + nameOFCandidateToBeRefered)

System.out.println('Email of the Candidate =' + nameOFCandidateToBeRefered)

WebUI.sendKeys(findTestObject('Referal Portal/nameLocator'), nameOFCandidateToBeRefered)

WebUI.sendKeys(findTestObject('Referal Portal/emailAddressLocator'), emailAddress)

WebUI.sendKeys(findTestObject('Referal Portal/phoneNumberLocator'), '1325' + RandomStringUtils.randomNumeric(6))

WebUI.click(findTestObject('Referal Portal/ReferAFriendLocator'))
WebElement listOfElements3 = driver.findElement(By.cssSelector('tr:nth-of-type(1) > td:nth-of-type(7) > .badge.badge-primary'))
status= listOfElements3.getText()
System.out.println('Status of the Candidate'+ status)

List<WebElement> listOfElements2 = driver.findElements(By.cssSelector('tr>td:nth-of-type(4)'))
int sizeofElements = listOfElements2.size()
for (int j = 0; j < sizeofElements; j++) {
    textofElements = listOfElements2.get(j).getText()
    System.out.println(textofElements)
	
	if(textofElements.equalsIgnoreCase(emailAddress)&& status.equalsIgnoreCase("REFERRED") ) {
		driver.findElement(By.cssSelector(".dropdown-toggle.pointer > h4")).click()
		driver.findElement(By.cssSelector(".dropdown-item.pointer")).click()
		break				
	}
}

