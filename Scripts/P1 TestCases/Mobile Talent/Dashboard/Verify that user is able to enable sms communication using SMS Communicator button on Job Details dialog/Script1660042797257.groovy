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
import org.testng.asserts.Assertion as Assertion
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

WebUI.scrollToElement(findTestObject('Dashboard/editMicrositeLocator'), 2)
List<WebElement> enableCountElement = driver.findElements(By.xpath('//span[text()="Enable "]'))
int enablCount = enableCountElement.size()
int enableCountAfterEnabled = enablCount - 1
System.out.println(enablCount)
List<WebElement> smsCommunicatorButton = driver.findElements(By.cssSelector('tr > .action-icons-space.ng-scope.sms-act.text-center a'))
int smsCommunicatorButtonSize = smsCommunicatorButton.size()

for (WebElement smsText : smsCommunicatorButton) {
    smsEnableDisbale = smsText.getText()

    if (smsEnableDisbale.equalsIgnoreCase('Enabled')) {
        System.out.println('Already Activated ')
    } else {
        smsText.click()

        break
    }
}
WebUI.click(findTestObject('Dashboard/confirmSMSPopup'))
WebUI.scrollToElement(findTestObject('MTP Locators/successMessageLocator'), 2)
successMessage = WebUI.getText(findTestObject('MTP Locators/successMessageLocator'))
System.out.println(successMessage)
//WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'SMS Communicator enabled on campaign Software Engineer_Angular. Please visit candidate screen to start communicating with candidates')
WebUI.scrollToElement(findTestObject('Dashboard/editMicrositeLocator'), 2)
List<WebElement> enableCountElement2 = driver.findElements(By.xpath('//span[text()="Enable "]'))
int enableCount2 = enableCountElement2.size()
System.out.println(enableCount2)
Assert.assertEquals(enableCountAfterEnabled, enableCount2)
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

	WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
	WebUI.closeBrowser()
