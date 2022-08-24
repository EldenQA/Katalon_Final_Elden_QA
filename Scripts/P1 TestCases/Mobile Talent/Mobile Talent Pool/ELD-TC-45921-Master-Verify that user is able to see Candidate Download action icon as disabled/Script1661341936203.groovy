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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory
import org.testng.Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

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

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Administration'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Manage Accounts'))

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    'Test Account')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

List<WebElement> manageAccountAction = driver.findElements(By.cssSelector('.ng-scope tr a i'))

for (WebElement singleActionItem : manageAccountAction) {
    singleActionItemText = singleActionItem.getAttribute('data-title')

    if (singleActionItemText.equalsIgnoreCase('Account Settings')) {
        singleActionItem.click()

        break
    }
}

Thread.sleep(2000)

List<WebElement> toggleButton = driver.findElements(By.xpath(GlobalVariable.ManageAccountToggleButton))

for (WebElement singleElement : toggleButton) {
    toggleButtonText = singleElement.getText()

    System.out.println(toggleButtonText)

    if (toggleButtonText.equalsIgnoreCase('Enable Candidate Excel Download')) {
        WebElement element = driver.findElement(By.cssSelector('.toggle-container .btn-switch'))
        element.click()
        WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'Account Settings have been disabled successfully.')

        break
    }
}

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.navigateToUrl(GlobalVariable.url)
WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	GlobalVariable.masterUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
	GlobalVariable.masterPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Mobile Talent Pool'))


List<WebElement> mtpIcons = driver.findElements(By.cssSelector('div[class="col-sm-6 text-right talent-leads"] button span'))

for (WebElement singlemtpIcons : mtpIcons) {
	mtpIconsText = singlemtpIcons.getAttribute('data-title')
	System.out.println(mtpIconsText)
	
	if (mtpIconsText.equalsIgnoreCase('Download Disabled')) {
		System.out.println('Download icon is disabled')
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		break
		
		}
}

//WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'),
	GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Administration'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/span_Manage Accounts'))

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'),
	'Test Account')

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/i_Create New Account_fa fa-search'))

List<WebElement> manageAccountAction2 = driver.findElements(By.cssSelector('.ng-scope tr a i'))

for (WebElement singleActionItem2 : manageAccountAction2) {
	singleActionItemText2 = singleActionItem2.getAttribute('data-title')

	if (singleActionItemText2.equalsIgnoreCase('Account Settings')) {
		singleActionItem2.click()

		break
	}
}

Thread.sleep(2000)

List<WebElement> toggleButton2 = driver.findElements(By.xpath(GlobalVariable.ManageAccountToggleButton))

for (WebElement singleElement2 : toggleButton2) {
	toggleButtonText2 = singleElement2.getText()

	System.out.println(toggleButtonText2)

	if (toggleButtonText2.equalsIgnoreCase('Enable Candidate Excel Download')) {
		WebElement element2 = driver.findElement(By.cssSelector('.toggle-container .btn-switch'))
		element2.click()
		WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'Account Settings have been enabled successfully.')
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))
		WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		WebUI.closeBrowser()
		break
	}
}

