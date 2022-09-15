import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'), GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Login'))

WebUI.click(findTestObject('Object Repository/Account_Creation/span_Administration'))

WebUI.click(findTestObject('Object Repository/Account_Creation/span_Manage Accounts'))

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Create New Account'))

AccountName = ('Account' + RandomStringUtils.randomNumeric(8))

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__accountName'), AccountName)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__email'), 'katalon@yopmail.com')

WebUI.click(findTestObject('Account_Creation/div__selected-flag'))

WebUI.click(findTestObject('Object Repository/Account_Creation/span_India ()'))

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_United States_primaryPhoneNumber'), '9623521252')

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/select_--Select-- Advertising, Arts, Entert_612296'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__vm.accountDetailsForm.contactDTO.pri_503879'), '73 Ray St, Pleasanton, CA 94566, United States')

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/select_--Select-- GBARBRCACOMXPHPLUSIN'), '9', 
    true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__vm.accountDetailsForm.contactDTO.zip'), '177107')

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__vm.accountDetailsForm.contactDTO.city'), 'Pleasanton')

driver.findElement(By.cssSelector('div.btn.btn-primary.btn-file')).click()

Robot rb = new Robot()

rb.delay(2000)

StringSelection ss = new StringSelection('C:\\Users\\atsharma\\Pictures\\photos.jpg')

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/select_--Select-- PunjabAndaman And nicobar_78b03e'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__contactFirstName'), 'katalon_3')

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__contactLastName'), 'katalon')

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__contactEmail'), 'katalon@yopmail.com')

WebUI.scrollToElement(findTestObject('Object Repository/Account_Creation/label_Use account address'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_United States_contactPhoneNumber'), '3152779908')

WebUI.click(findTestObject('Object Repository/Account_Creation/label_Use account address'))

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Next'))

WebUI.click(findTestObject('Object Repository/Account_Creation/ul__multiselect-search-list'))

WebUI.setText(findTestObject('Object Repository/Account_Creation/input__ng-pristine ng-untouched ng-valid ng_084d1e'), 'atish')

WebUI.click(findTestObject('Object Repository/Account_Creation/li_atish sharma'))

WebUI.click(findTestObject('Object Repository/Account_Creation/span_Add User'))

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Next_1'))

WebUI.scrollToElement(findTestObject('Account_Creation/button_Confirm'), 2)

WebUI.click(findTestObject('Account_Creation/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Account_Creation/h3_Thank You for the confirmation. Account _7daf0d'))

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
    AccountName)

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

TestObject testObj7 = findTestObject('Account_Creation/allJobsList')

List<WebElement> elements7 = WebUI.findWebElements(testObj7, 2)

for (WebElement ele7 : elements7) {
    text7 = ele7.getText()

    System.out.println(text7)

    if (text7.equalsIgnoreCase(AccountName)) {
        ele7.click()

        break
    }
    

}
WebUI.verifyElementText(findTestObject('Account_Creation/accountName'), AccountName)
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()
