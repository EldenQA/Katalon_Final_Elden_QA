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

By actionIconDashboardBy = By.xpath('//div[@id="contentMainDiv"]/div[3]/div/div[3]/div/div[2]/div/div/table/tbody/tr//div/a/i')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/Welcome to the Mobile Talent_Text_Locator'))

ac.sendKeys(Keys.PAGE_DOWN).perform()

Thread.sleep(2000)

List<WebElement> buttonsOnDashboard = driver.findElements(actionIconDashboardBy)

int buttonsOnDashboardSize = buttonsOnDashboard.size()

System.out.println(buttonsOnDashboardSize)

for (int i = 0; i < buttonsOnDashboardSize; i) {
    attribute = buttonsOnDashboard.get(i).getAttribute('data-title')

    System.out.println(attribute)

    if (attribute.equalsIgnoreCase('View Microsite')) {
        buttonsOnDashboard.get(i).click()

        break
    }
}

viewMicrositeTitle = WebUI.getText(findTestObject('Dashboard/viewMicrositeDialogTitleText'))

Assert.assertEquals(viewMicrositeTitle, 'View Microsite')


WebUI.click(findTestObject('Dashboard/closeViewMicrositePopup'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
