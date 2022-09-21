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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

Actions ac = new Actions(driver)

pro.load(new FileInputStream('Files/P1_Job.properties'))

keyValue = pro.getProperty('Job')

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

WebUI.sendKeys(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/searchMediaSourceLocator'), ' Career Page')

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFromIndex'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/createSourceButton'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration1.size()

for (int l = 0; l < count; l++) {
    tabNames1 = allTabsOnAdministration1.get(l).getText()

    System.out.println(tabNames1)

    if (tabNames1 == 'Manage Career Page') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

WebUI.click(findTestObject('All_Jobs/searchJobIcon'))

WebUI.sendKeys(findTestObject('CarrierPage/jobTitleLocator'), keyValue)

WebUI.click(findTestObject('Administration/Manage_Microsite/searchButton'))

TestObject testObj = findTestObject('Administration/Manage Carrer Page/jobTitleList')

List<WebElement> elements = WebUI.findWebElements(testObj, 2)

for (WebElement ele : elements) {
    text = ele.getText()

    System.out.println(text)

    if (text.equalsIgnoreCase(keyValue)) {
        KeywordUtil.logInfo('Job is present')
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))	
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		WebUI.closeBrowser()
        break
    } else {
        throw new com.kms.katalon.core.exception.StepFailedException()
    }
}

