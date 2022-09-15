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
import org.openqa.selenium.By.ByLinkText as ByLinkText
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select as Select
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'), GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration1.size()

for (int l = 0; l < count; l++) {
    tabNames1 = allTabsOnAdministration1.get(l).getText()

    System.out.println(tabNames1)

    if (tabNames1 == 'SMS - BOT') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

TestObject testObj = findTestObject('Administration/SMS Bot/buttonsOnSMSBotPage')

List<WebElement> buttonsOnSmsBot = WebUI.findWebElements(testObj, 2)

for (WebElement button : buttonsOnSmsBot) {
    textOnButton = button.getText()

    System.out.println(textOnButton)

    if (textOnButton.equalsIgnoreCase('Bot Settings')) {
        button.click()
		break
    }
  
}

Thread.sleep(1000)

WebUI.scrollToElement(findTestObject('Administration/SMS Bot/botRulesButton'), 4)

WebUI.click(findTestObject('Administration/SMS Bot/botRulesButton'), FailureHandling.STOP_ON_FAILURE)

TestObject testObj2 = findTestObject('Administration/SMS Bot/buttonsOnSMSBotPage')

List<WebElement> buttonsOnSmsBot2 = WebUI.findWebElements(testObj2, 2)

for (WebElement button2 : buttonsOnSmsBot2) {
	textOnButton2 = button2.getText()

	System.out.println(textOnButton2)

	if (textOnButton2.equalsIgnoreCase('Bot Settings')) {
		KeywordUtil.logInfo('button is present')
	}
	else if (textOnButton2.equalsIgnoreCase('Bot AI'))
	{
		KeywordUtil.logInfo('button is present')	
	}
	else
	{
		throw new IOException()
	}
}
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
