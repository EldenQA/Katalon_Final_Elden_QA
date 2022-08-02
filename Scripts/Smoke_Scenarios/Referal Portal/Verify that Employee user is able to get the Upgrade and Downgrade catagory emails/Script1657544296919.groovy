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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

//WebUI.callTestCase(findTestCase('Smoke_Scenarios/Mobile Talent/Verify that user is able to Change the License Type'), [:], 
  //  FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver1 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro1 = new Properties()
Properties pro3 = new Properties()

Properties pro = new Properties()

FileWriter fw = new FileWriter('Referral.properties')

pro1.load(new FileInputStream('Referral.properties'))

pro1.setProperty('EmailAddress', ('Refer' + RandomStringUtils.randomAlphabetic(4)) + '@yopmail.com')

pro1.setProperty('PhoneNumber', '1325' + RandomStringUtils.randomNumeric(6))

pro1.setProperty('NameOfCandidate', 'Referral' + RandomStringUtils.randomAlphanumeric(5))

pro1.store(fw, 'Comments')

emailAddress = pro1.getProperty('EmailAddress')

nameOFCandidateToBeRefered = pro1.getProperty('NameOfCandidate')

Actions ac = new Actions(driver1)

pro.load(new FileInputStream('job.properties'))

keyValue = pro.getProperty('JobName')

pro3.load(new FileInputStream('Files/interviewPortal.properties'))

InterviewPanelist = pro3.getProperty('PanelistEmailName_1')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    InterviewPanelist)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.interviewPanelistPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('InterviewPortal/navigatorDropdown'))

WebUI.click(findTestObject('InterviewPortal/selectReferalPortal'))

Thread.sleep(2000)

WebUI.click(findTestObject('Referal Portal/closeReferralPopup'))

List<WebElement> listOfAllElemenets = driver1.findElements(By.cssSelector('li[class=\'nav-item \']'))

int size = listOfAllElemenets.size()

for (int i = 0; i < size; i++) {
    text = listOfAllElemenets.get(i).getText()

    if (text.equalsIgnoreCase('Job(s)')) {
        listOfAllElemenets.get(i).click()

        break
    }
}

WebUI.sendKeys(findTestObject('Referal Portal/searchJobLocator'), keyValue)

WebUI.scrollToElement(findTestObject('Referal Portal/referButtonLocator'), 0)

WebUI.click(findTestObject('Referal Portal/referButtonLocator'))

emailOFTheCandidate = (('Refer' + RandomStringUtils.randomNumeric(4)) + '@yopmail.com')

System.out.println('Candidate Name=' + nameOFCandidateToBeRefered)

System.out.println('Email of the Candidate =' + nameOFCandidateToBeRefered)

WebUI.sendKeys(findTestObject('Referal Portal/nameLocator'), nameOFCandidateToBeRefered)

WebUI.sendKeys(findTestObject('Referal Portal/emailAddressLocator'), emailAddress)

WebUI.sendKeys(findTestObject('Referal Portal/phoneNumberLocator'), '1325' + RandomStringUtils.randomNumeric(6))

WebUI.click(findTestObject('Referal Portal/ReferAFriendLocator'))

WebElement listOfElements3 = driver1.findElement(By.cssSelector('tr:nth-of-type(1) > td:nth-of-type(7) > .badge.badge-primary'))

status = listOfElements3.getText()

System.out.println('Status of the Candidate' + status)

List<WebElement> listOfElements2 = driver1.findElements(By.cssSelector('tr>td:nth-of-type(4)'))

int sizeofElements = listOfElements2.size()

for (int j = 0; j < sizeofElements; j++) {
    textofElements = listOfElements2.get(j).getText()

    System.out.println(textofElements)

    if (textofElements.equalsIgnoreCase(emailAddress) && status.equalsIgnoreCase('REFERRED')) {
        driver1.findElement(By.cssSelector('.dropdown-toggle.pointer > h4')).click()

        driver1.findElement(By.cssSelector('.dropdown-item.pointer')).click()

        break
        
        WebUI.closeBrowser()
    }
}

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https:yopmail.com/en/')

WebDriver driver2 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro2 = new Properties()

Actions ac2 = new Actions(driver2)

pro2.load(new FileInputStream('Referral.properties'))

email = pro2.getProperty('EmailAddress')

phone = pro2.getProperty('PhoneNumber')

name = pro2.getProperty('NameOfCandidate')

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    email)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

for (int j = 0; j <= 5; j++) {
    ac2.sendKeys(Keys.TAB).perform()
}

ac2.sendKeys(Keys.TAB.ENTER).perform()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipCodeLocator'), '100')

Thread.sleep(2000)

WebUI.click(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/zipLocationCheckBoxLocator'))

driver2.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    name)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    name)

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    email)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver2.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys(phone)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/selectFirstOptionFromDropdown'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'), 
    'Continue')

WebUI.closeBrowser()

Thread.sleep(2000)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver3 = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver3.findElement(By.cssSelector('a[title=\'Mobile Talent Pool\'] > .ng-scope')).click()

driver3.findElement(By.cssSelector('span[data-title= "Search"]')).click()

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    2)

WebUI.sendKeys(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    name)

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'), 
    2)

WebUI.click(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

List<WebElement> allStatus5 = driver3.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count5 = allStatus5.size()

System.out.println(count5)

for (int e = 0; e <= count5; e++) {
    status5 = allStatus5.get(e).getText()

    System.out.println(status5)

    if (status5.equalsIgnoreCase('Joined')) {
        allStatus5.get(e).click()

        WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
            'Joined')

        break
    }
}

    ((driver3) as JavascriptExecutor).executeScript('window.open(arguments[0])', 'https://yopmail.com/en/')

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    InterviewPanelist)

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_YOPmail - Disposable Email Address/i_'))

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.switchToWindowTitle('Inbox')

WebUI.takeScreenshot(('ScreenShots/Upgrade/screenshot_' + System.currentTimeMillis()) + '.jpg')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'))

List<WebElement> allStatus6 = driver3.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count6 = allStatus6.size()

System.out.println(count6)

for (int f = 0; f <= count6; f++) {
    status6 = allStatus6.get(f).getText()

    System.out.println(status6)

    if (status6.equalsIgnoreCase('Separated')) {
        allStatus6.get(f).click()

        WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/clickOnCandidateStatus'), 
            'Separated')

        break
    }
}

WebUI.switchToWindowIndex(1)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Inbox/span_Show pictures'))

WebUI.takeScreenshot(('ScreenShots/DownGrade/screenshot_' + System.currentTimeMillis()) + '.jpg')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()

