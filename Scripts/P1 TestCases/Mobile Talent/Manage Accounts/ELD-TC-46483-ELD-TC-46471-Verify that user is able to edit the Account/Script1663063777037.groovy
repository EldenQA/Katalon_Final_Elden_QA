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

//WebUI.navigateToUrl(GlobalVariable.url)
WebUI.navigateToUrl(GlobalVariable.url, FailureHandling.STOP_ON_FAILURE)

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

    if (tabNames1 == 'Manage Accounts') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    'Test Account')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

TestObject testObj3 = findTestObject('Account_Creation/allJobsList')

List<WebElement> elements3 = WebUI.findWebElements(testObj3, 2)

for (WebElement ele3 : elements3) {
    text3 = ele3.getText()

    System.out.println(text3)

    if (text3.equalsIgnoreCase('Test Account')) {
        ele3.click()

        break
    }
}

TestObject testObj6 = findTestObject('Account_Creation/buttonsOnAccountDetailsPage')

List<WebElement> elements6 = WebUI.findWebElements(testObj6, 2)

for (WebElement ele6 : elements6) {
    text6 = ele6.getText()

    System.out.println(text6)

    if (text6.equalsIgnoreCase('Edit')) {
        ele6.click()

        break
    }
}

WebUI.scrollToElement(findTestObject('Account_Creation/input__vm.accountDetailsForm.contactDTO.pri_503879'), 2)

address = RandomStringUtils.randomAlphabetic(5)

WebUI.clearText(findTestObject('Account_Creation/input__vm.accountDetailsForm.contactDTO.pri_503879'))

WebUI.sendKeys(findTestObject('Account_Creation/input__vm.accountDetailsForm.contactDTO.pri_503879'), ('73 Ray St,' + address) + 
    'Pleasanton, , United States')

WebUI.scrollToElement(findTestObject('Object Repository/Account_Creation/button_Next'), 2)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Next'))

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Next_1'))

WebUI.scrollToElement(findTestObject('Account_Creation/button_Confirm'), 2)

WebUI.click(findTestObject('Account_Creation/button_Confirm'))

WebUI.verifyElementText(findTestObject('Account_Creation/h3_Thank You for the confirmation. Account _7daf0d'), 'Thank You, your changes have been confirmed.')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration2 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count2 = allTabsOnAdministration2.size()

for (int l2 = 0; l2 < count2; l2++) {
    tabNames12 = allTabsOnAdministration2.get(l2).getText()

    System.out.println(tabNames12)

    if (tabNames12 == 'Manage Accounts') {
        allTabsOnAdministration2.get(l2).click()

        break
    }
}

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    'Test Account')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

TestObject testObj7 = findTestObject('Account_Creation/allJobsList')

List<WebElement> elements7 = WebUI.findWebElements(testObj7, 2)

for (WebElement ele7 : elements7) {
    text7 = ele7.getText()

    System.out.println(text7)

    if (text7.equalsIgnoreCase('Test Account')) {
        ele7.click()

        break
    }
}
WebUI.verifyElementText(findTestObject('Account_Creation/addressFieldOnAccountDetail'), '73 Ray St,' + address + 
    'Pleasanton, , United States')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()
