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
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

Actions ac = new Actions(driver)

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath(GlobalVariable.allJobsLocator)).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title="Search"]')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(keyValue)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

for (int j = 0; j < 11; j++) {
    ac.sendKeys(Keys.TAB).perform()
}

WebUI.click(findTestObject('Survey Form/surveyFormLocator'))

WebUI.click(findTestObject('Object Repository/Survey Form/Page_Mobile Talent  Mobile Recruitment/span_Select microsite'))

WebUI.setText(findTestObject('Survey Form/Page_Mobile Talent  Mobile Recruitment/input_Select microsite_form-control ui-sele_1cb159'), 
    'Automation_SurveyForm')

ac.sendKeys(Keys.TAB).perform()

WebUI.click(findTestObject('Object Repository/Survey Form/Page_Mobile Talent  Mobile Recruitment/button_Save'))

driver.findElement(By.xpath(GlobalVariable.allJobsLocator)).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element3 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element3.sendKeys(keyValue)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/micrositeLinkLocator'))

WebUI.switchToWindowIndex(1)

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()
surveyCandidate= 'Survey'+RandomStringUtils.randomAlphabetic(6)
WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    surveyCandidate)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    'Candidate')

email = (('d' + RandomStringUtils.randomAlphabetic(4)) + '@yopmail.com')

System.out.println(email)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    email)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

phoneNumber = ('1325' + RandomStringUtils.randomNumeric(6))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys(phoneNumber)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'), 
    'Continue')

WebUI.switchToWindowIndex(0)

driver.findElement(By.cssSelector('.modal-dialog.modal-large .close')).click()

driver.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), surveyCandidate)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'), 3)

for (int i = 0; i <= 4; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

emailAddress = WebUI.getText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/emailOnMTP'))

System.out.println(emailAddress)

if (emailAddress == email) {
    WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
        2)
}

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

Thread.sleep(2000)

List<WebElement> allStatus = driver.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count = allStatus.size()

System.out.println(count)

for (int i = 0; i <= count; i++) {
    status = allStatus.get(i).getText()

    System.out.println(status)

    if (status.equalsIgnoreCase('Hired')) {
        allStatus.get(i).click()

        WebUI.scrollToElement(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
            2)

        WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 'Hired')

        break
    }
}

WebUI.closeBrowser()
WebUI.openBrowser('')

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Yopmail.com/input_Type the Email name of your choice_login'), email)
//WebUI.setText(findTestObject('Object Repository/Yopmail.com/input_Type the Email name of your choice_login'), 'drizt@yopmail.com')

WebUI.click(findTestObject('Object Repository/Yopmail/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/Yopmail/Page_Inbox/a_Start Survey'))

WebUI.navigateToUrl(GlobalVariable.surveyFormURL)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    'Dinesh')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    'Yadav')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
  email)
//WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    //'drizt@yopmail.com')

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

WebDriver driver2 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

driver2.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys(phoneNumber)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

//WebUI.click(findTestObject('Registration/surveyForm/firstRadioButton'))
WebUI.click(findTestObject('MTP Locators/radioButtonofQuestionnareFile'))
WebUI.click(findTestObject('Registration/nextButtonOnQuestionnareForm'))
WebUI.click(findTestObject('MTP Locators/radioButtonofQuestionnareFile'))
//WebUI.click(findTestObject('Registration/surveyForm/firstRadioButton'))

WebUI.click(findTestObject('Registration/doneButtonOnQuestionnarePage'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebDriver driver3 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

driver3.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('MTP Locators/surveyLocator'), 2)

WebUI.click(findTestObject('MTP Locators/surveyLocator'))

//questions = WebUI.getText(findTestObject('MTP Locators/surveyQuestionLocator'))
//System.out.println(questions)
WebUI.verifyElementText(findTestObject('MTP Locators/surveyQuestionLocator'), GlobalVariable.survey)

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()

