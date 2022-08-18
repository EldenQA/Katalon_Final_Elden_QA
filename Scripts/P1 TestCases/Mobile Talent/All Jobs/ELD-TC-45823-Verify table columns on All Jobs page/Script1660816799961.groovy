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

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath(GlobalVariable.allJobsLocator)).click()


List < WebElement > elements = driver.findElements(By.cssSelector('table.table tr th'))

for (WebElement text: elements) {
    

    headerText = text.getText()
    if (headerText.equalsIgnoreCase('#')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Job ID')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Job Title')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Launch Date')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Visitors')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Candidates')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Conversion Rate')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Pending Submissions')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Status')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Promote')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('SMS Communicator')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Microsite')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Action')) {
        System.out.println('column header is present')
    } else if (headerText.equalsIgnoreCase('Bot')) {
        System.out.println('column header is present')
    } else {

        throw new IOException('Column is not present ')
    }
}

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()