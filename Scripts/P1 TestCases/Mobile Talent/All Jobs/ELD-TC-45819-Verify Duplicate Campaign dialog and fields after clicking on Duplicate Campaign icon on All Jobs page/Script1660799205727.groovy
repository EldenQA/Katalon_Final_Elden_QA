import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select as Select
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

Properties pro = new Properties()

pro.load(new FileInputStream('Files/P1_Job.properties'))

keyValue = pro.getProperty('Job')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath(GlobalVariable.allJobsLocator)).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title="Search"]')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(keyValue)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

for (int j = 0; j < 11; j++) {
    ac.sendKeys(Keys.TAB).perform()
}

List<WebElement> buttonsOnDashboard = driver.findElements(By.cssSelector('tbody > tr:nth-of-type(1) i[data-title]'))

int buttonsOnDashboardSize = buttonsOnDashboard.size()

System.out.println(buttonsOnDashboardSize)

for (int i = 0; i < buttonsOnDashboardSize; i++) {
    attribute = buttonsOnDashboard.get(i).getAttribute('data-title')

    System.out.println(attribute)

    if (attribute.equalsIgnoreCase('Duplicate Campaign')) {
        buttonsOnDashboard.get(i).click()

        break
    }
}

List<WebElement> filedsOnDuplicateCampaign = driver.findElements(By.cssSelector('label[class="col-sm-3 control-label"]'))

string1 = '* Account'

string2 = '* Campaign Name'

string3 = '* Description'

string4 = '* Campaign Folder'

string5 = '* Microsite Name'

for (WebElement text : filedsOnDuplicateCampaign) {
    textOnDuplicateCampaign = text.getText()

    System.out.println(textOnDuplicateCampaign)

    if (string1.equalsIgnoreCase(textOnDuplicateCampaign)) {
        System.out.println('Attribute is present')
    } else if (string2.equalsIgnoreCase(textOnDuplicateCampaign)) {
        System.out.println('Attribute is present')
    } else if (string3.equalsIgnoreCase(textOnDuplicateCampaign)) {
        System.out.println('Attribute is present')
    } else if (string4.equalsIgnoreCase(textOnDuplicateCampaign)) {
        System.out.println('Attribute is present')
    } else if (string5.equalsIgnoreCase(textOnDuplicateCampaign)) {
        System.out.println('Attribute is present')
    } else {
        throw new IOException('Attribute is not present')
    }
    
    
}
WebUI.click(findTestObject('All_Jobs/closeDuplicateDialog'))
WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()

