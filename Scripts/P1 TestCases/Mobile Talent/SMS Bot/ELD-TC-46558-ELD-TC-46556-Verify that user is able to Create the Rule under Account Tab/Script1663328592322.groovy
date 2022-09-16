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

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'), GlobalVariable.accountAdmin)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'), GlobalVariable.accountAdminPassword)

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




TestObject testObj4 = findTestObject('Administration/SMS Bot/universal-accountButton')

List<WebElement> elements4 = WebUI.findWebElements(testObj4, 2)

for (WebElement button4 : elements4) {
	buttonText4 = button4.getText()

	System.out.println(buttonText4)

	if (buttonText4.equalsIgnoreCase('Account')) {
		button4.click()

		break
	}
}

WebUI.click(findTestObject('Administration/SMS Bot/addRuleButton'))

ruleTitle = ('RuleNumber' + RandomStringUtils.randomNumeric(6))

WebUI.sendKeys(findTestObject('Administration/SMS Bot/ruleTitle'), ruleTitle)

WebUI.sendKeys(findTestObject('Administration/SMS Bot/keywordResponse'), ruleTitle)

Actions ac = new Actions(driver)


ac.sendKeys(Keys.ENTER).perform()

WebUI.sendKeys(findTestObject('Administration/SMS Bot/botResponse'), 'Yes,Automated bot is working')

TestObject testObj2 = findTestObject('Administration/SMS Bot/submitButton')

List<WebElement> elements2 = WebUI.findWebElements(testObj2, 2)

for (WebElement button : elements2) {
	buttonText = button.getText()

	System.out.println(buttonText)

	if (buttonText.equalsIgnoreCase('Submit')) {
		button.click()
	}
	
	break
}

TestObject testObj3 = findTestObject('Administration/SMS Bot/allRulesList')

List<WebElement> elements3 = WebUI.findWebElements(testObj3, 2)

for (WebElement button3 : elements3) {
	buttonText3 = button3.getText()

	System.out.println(buttonText3)

	if (buttonText3.equalsIgnoreCase(ruleTitle)) {
		KeywordUtil.logInfo('Rule is present')
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		break
	}
}



WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'), GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> tabUnderAdministration = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

countSize = tabUnderAdministration.size()

for (int p = 0; p < countSize; p++) {
    tabNames = tabUnderAdministration.get(p).getText()

    System.out.println(tabNames)

    if (tabNames == 'SMS - BOT') {
        tabUnderAdministration.get(p).click()
        break
    }
}
TestObject testObj5 = findTestObject('Administration/SMS Bot/universal-accountButton')

List<WebElement> elements5 = WebUI.findWebElements(testObj5, 2)

for (WebElement button5 : elements5) {
	buttonText5 = button5.getText()

	System.out.println(buttonText5)

	if (buttonText5.equalsIgnoreCase('Universal')) {
		button5.click()

		break
	}
}


//Test Case : Verify that rule added under 'Account' tab is not displayed under 'Universal' tab, on 'Sms Bot' page.
TestObject testObj6 = findTestObject('Administration/SMS Bot/allRulesList')

List<WebElement> elements6 = WebUI.findWebElements(testObj6, 2)

for (WebElement button6 : elements6) {
	buttonText6 = button6.getText()

	System.out.println(buttonText6)

	if (buttonText6!=ruleTitle) {
		KeywordUtil.logInfo('Rule is not present')
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		WebUI.closeBrowser()
		break
	}
	else {
		throw new IOException()
	}
}	

