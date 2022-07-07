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
import org.openqa.selenium.remote.server.DriverFactory
import org.testng.Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(keyValue)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/MediaSourceLocator'))

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/AddMediaSourceLocator'), 3)

WebUI.waitForPageLoad(5)

List<WebElement> allMediaSources = driver.findElements(By.cssSelector('div[class=\'input-group js-zeroclipboard-container\']'))

int beforecreationMediaSources = allMediaSources.size()

int beforecreationMediaSources1 = beforecreationMediaSources + 2

System.out.println(beforecreationMediaSources1)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/AddMediaSourceLocator'))

WebUI.sendKeys(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/searchMediaSourceLocator'), ' Referral Portal')

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFromIndex'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/createSourceButton'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/AddMediaSourceLocator'))

WebUI.sendKeys(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/searchMediaSourceLocator'), ' Career Page')

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFromIndex'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/createSourceButton'))


List<WebElement> allMediaSources1 = driver.findElements(By.cssSelector('div[class=\'input-group js-zeroclipboard-container\']'))

int afterCreation = allMediaSources1.size()

System.out.println(afterCreation)

if (beforecreationMediaSources1 == afterCreation) {
    driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()
}

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element3 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element3.sendKeys(keyValue)

for (int a = 0; a <= 2; a++) {
	ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('MTP Locators/campaignfolderLocator'))

WebUI.click(findTestObject('MTP Locators/plusIconOnCampaignFolder'))

WebUI.dragAndDropToObject(findTestObject('MTP Locators/dragPosition1'), findTestObject('MTP Locators/dragPosition2'))

WebElement element = driver.findElement(By.cssSelector('div[class=\'growl-message ng-binding\']'))

textOnElement = element.getText()
System.out.println(textOnElement)
Assert.assertEquals(textOnElement, "Campaign has been moved to QA folder")
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
	

