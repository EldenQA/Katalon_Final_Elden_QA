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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
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

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.scrollToElement(findTestObject('Dashboard/firstJobLocator'), 2)

WebUI.click(findTestObject('Dashboard/firstJobLocator'))

WebUI.verifyElementPresent(findTestObject('Dashboard/buttonInsidePhonePreview'), 2)

List<WebElement> buttonOnJobDetailDialog = driver.findElements(By.cssSelector('div.modal[style*="display: block;"] div.modal-content div.quick-links'))

for (WebElement element : buttonOnJobDetailDialog) {
    buttonOnJobDetailDialogText = element.getText()

    System.out.println(buttonOnJobDetailDialogText)

    if (buttonOnJobDetailDialogText.equalsIgnoreCase('Launch New Boost')) {
        Assert.assertEquals(buttonOnJobDetailDialogText, 'Launch New Boost', 'button is not present')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('SMS Enabled') || buttonOnJobDetailDialogText.equalsIgnoreCase(
        'SMS Communicator')) {
        System.out.println('Button is present ')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('Private') || buttonOnJobDetailDialogText.equalsIgnoreCase('Public')) {
        System.out.println('Button is present ')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('Contact Candidates')) {
        Assert.assertEquals(buttonOnJobDetailDialogText, 'Contact Candidates', 'button is not present')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('Media Performance')) {
        Assert.assertEquals(buttonOnJobDetailDialogText, 'Media Performance', 'button is not present')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('Analytics Report')) {
        Assert.assertEquals(buttonOnJobDetailDialogText, 'Analytics Report', 'button is not present')
    } else if (buttonOnJobDetailDialogText.equalsIgnoreCase('Upload Candidates')) {
        Assert.assertEquals(buttonOnJobDetailDialogText, 'Upload Candidates', 'button is not present')

        break
    } else {
        throw new IOException()
    }
}
driver.findElement(By.cssSelector('.modal-dialog.modal-large .close')).click()

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()


