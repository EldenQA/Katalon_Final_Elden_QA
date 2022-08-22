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

List<WebElement> hiringEventActionIcon = driver.findElements(By.cssSelector('tr .link-color-black i'))

count2 = hiringEventActionIcon.size()

for (int m = 0; m < count2; m++) {
    hiringEventActionIconNames = hiringEventActionIcon.get(m).getAttribute('data-title')

    System.out.println(hiringEventActionIconNames)

    if (hiringEventActionIconNames.equalsIgnoreCase('Edit Hiring Event')) {
        hiringEventActionIcon.get(m).click()

        break
    }
}

WebUI.clearText(findTestObject('Administration/Manage_Hiring_Events/eventName'))



EventName = RandomStringUtils.randomNumeric(6)
WebUI.sendKeys(findTestObject('Administration/Manage_Hiring_Events/eventName'), ('Hiring Event' + EventName) + '(edited)')
//WebUI.scrollToElement(findTestObject('CarrierPage/SubmitButton'), 2)
ac.sendKeys(Keys.PAGE_DOWN).build(). perform()
ac.sendKeys(Keys.PAGE_DOWN).build(). perform()
Thread.sleep(1000)
List <WebElement> buttonSub = driver.findElements(By.cssSelector('.col-sm-9 button'))
for(WebElement buttons:buttonSub )
{	buttonText = buttons.getText()
	if (buttonText.equalsIgnoreCase('Submit'))
	{
		buttons.click()
		WebUI.click(findTestObject('Dashboard/confirmSMSPopup'))
		break
	}

}
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration2 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration2.size()

for (int n = 0; n < count; n++) {
	tabNames2 = allTabsOnAdministration2.get(n).getText()

	System.out.println(tabNames2)

	if (tabNames2 == 'Manage Hiring Events') {
		allTabsOnAdministration2.get(n).click()

		break
	}
}

List<WebElement> hiringEvent = driver.findElements(By.cssSelector('tr td:nth-of-type(2) a'))

for (WebElement hiringEventElement : hiringEvent) {
	hiringEventElementText = hiringEventElement.getText()

	System.out.println(hiringEventElementText)

	if (hiringEventElementText.equalsIgnoreCase('Hiring Event' + EventName + '(edited)')) {
		Assert.assertEquals(hiringEventElementText, 'Hiring Event' + EventName + '(edited)')
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		WebUI.closeBrowser()
		break
	} else {
		throw new IOException('Hiring event is not edited')
	}
}
