import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.SimpleDateFormat as SimpleDateFormat
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
import net.sf.jasperreports.engine.export.data.DateTextValue as DateTextValue
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

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration1.size()

for (int l = 0; l < count; l++) {
    tabNames1 = allTabsOnAdministration1.get(l).getText()

    System.out.println(tabNames1)

    if (tabNames1 == 'Manage Hiring Events') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/createHiringEventButton'))

EventName = RandomStringUtils.randomNumeric(6)

System.out.println(EventName)

WebUI.sendKeys(findTestObject('Administration/Manage_Hiring_Events/eventName'), 'HiringEvent' + EventName)

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/startDataLocator'))

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/30DateLocator'))

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/endDate'))

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/30DateLocator'))

WebUI.sendKeys(findTestObject('Administration/Manage_Hiring_Events/locationLocatorHiringEvent'), 'Pragpur, Himachal Pradesh, India')
WebElement element3 = driver.findElement(By.cssSelector('div > input[name="eventLocation"]'))
ac.sendKeys(element3, Keys.SPACE).build(). perform()
ac.sendKeys(Keys.ARROW_DOWN).build(). perform()
ac.sendKeys(Keys.ENTER).build(). perform()
Thread.sleep(3000)
pro.load(new FileInputStream('README.md'))

keyValue = pro.getProperty('Message')

pro.load(new FileInputStream('Files/P1_Job.properties'))

keyValue2 = pro.getProperty('Job')

WebUI.sendKeys(findTestObject('Administration/Manage_Hiring_Events/descriptionHiringEvent'), keyValue)

WebUI.sendKeys(findTestObject('Administration/Manage_Hiring_Events/campaignInputField'), keyValue2)

WebUI.click(findTestObject('Administration/Manage_Hiring_Events/selectCampaign'))

WebUI.scrollToElement(findTestObject('CarrierPage/SubmitButton'), 2)

WebUI.click(findTestObject('CarrierPage/SubmitButton'))

Thread.sleep(2000)

List<WebElement> hiringEvent = driver.findElements(By.cssSelector('tr td:nth-of-type(2) a'))

for (WebElement hiringEventElement : hiringEvent) {
    hiringEventElementText = hiringEventElement.getText()

    System.out.println(hiringEventElementText)

    if (hiringEventElementText.equalsIgnoreCase('HiringEvent' + EventName)) {
        Assert.assertEquals(hiringEventElementText, 'HiringEvent' + EventName)

       WebUI.click(findTestObject('Administration/Manage_Hiring_Events/deleteHiringEvent'))

        WebUI.click(findTestObject('Dashboard/confirmSMSPopup'))
		

        break
    } else {
        throw new IOException('Hiring event is not created ')
    }
}

Thread.sleep(2000)
List<WebElement> hiringEvent2 = driver.findElements(By.cssSelector('tr td:nth-of-type(2) a'))

for (WebElement hiringEventElement2 : hiringEvent2) {
	hiringEventElementText2 = hiringEventElement2.getText()

	System.out.println(hiringEventElementText2)

	if (hiringEventElementText2.equalsIgnoreCase('HiringEvent' + EventName)) {
		throw new IOException('Hiring event is not deleted ')
		break        
	} 
}
WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))
WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
