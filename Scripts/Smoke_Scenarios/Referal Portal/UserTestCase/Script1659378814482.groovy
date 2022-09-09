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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

pro.load(new FileInputStream('Files/interviewPortal.properties'))

InterViewPanelist = pro.getProperty('PanelistEmailName_1')
ipName= pro.getProperty('PanelistName_1')

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Login'))

//WebElement drop = driver.findElement(By.cssSelector("a[title='Administration']"))
driver.findElement(By.cssSelector('a[title=\'Administration\']')).click()

//action.moveToElement(drop).perform()
List<WebElement> dropdownValues = driver.findElements(By.cssSelector('ul[class=\'dropdown-menu\'] li a'))

int dropdownValuesCount = dropdownValues.size()

for (int i = 0; i < dropdownValuesCount; i++) {
    dropdownText = dropdownValues.get(i).getText()

    if (dropdownText.equalsIgnoreCase('Manage Users')) {
        dropdownValues.get(i).click()

        break
    }
}

driver.findElement(By.cssSelector('span[data-title="Search"]')).click()

List<WebElement> userSearchElement = driver.findElements(By.cssSelector('div[class="input-calendar"] input'))

int userSearchElementSize = userSearchElement.size()

for (int q = 0; q < userSearchElementSize; q++) {
    userSearchElementText = userSearchElement.get(q).getAttribute('name')

    if (userSearchElementText.equalsIgnoreCase('email')) {
        userSearchElement.get(q).sendKeys(InterViewPanelist)

        WebUI.click(findTestObject('MTP Locators/searchLocator'))

        break
    }
}

List<WebElement> userAfterSearchElement = driver.findElements(By.cssSelector('.ng-scope > td:nth-of-type(6) a i'))

int userAfterSearchElementSize = userAfterSearchElement.size()

for (int r = 0; r < userAfterSearchElementSize; r++) {
    userAfterSearchElementText = userAfterSearchElement.get(r).getAttribute('data-title')

    if (userAfterSearchElementText.equalsIgnoreCase('Edit User')) {
        userAfterSearchElement.get(r).click()

        break
    }
}

Select sl = new Select(driver.findElement(By.cssSelector('select[name="roleId"]')))

sl.selectByValue('11')

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/createSourceButton'))

WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'User'+' '+ ipName+' '+ipName+' '+'has been updated successfully.')
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
