import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.interactions.Actions as Actions

//WebUI.callTestCase(findTestCase('P1 TestCases/Mobile Talent/ManageTemplate/Verify that user is successfully able to create the template(French (FR)'), 
//    [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('P1 TestCases/Mobile Talent/ManageTemplate/Verify that user is successfully able to create the template(Italian (IT))'), 
    [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Job_Creation/Launch Job/a_Launch New Job'))

WebUI.click(findTestObject('MTP Locators/metaDataLocator'))
Thread.sleep(2000)

File f = new File('download.png')

String logoPath = f.getAbsolutePath()

Robot rb = new Robot()

StringSelection ss = new StringSelection(logoPath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)

FileWriter fw = new FileWriter('Files/P1_Job.properties')

Input = ('Campaign_Italian (IT)_' + RandomStringUtils.randomNumeric(6))

pro.setProperty('Campaign_Italian', Input)

pro.store(fw, 'comments')

WebUI.setText(findTestObject('Job_Creation/Launch Job/jobNameInput'), Input //keyValue is the Created Template value "Template"
    )

WebUI.click(findTestObject('Job_Creation/Launch Job/campaignLanguageLocator'))

TestObject objects = findTestObject('Job_Creation/Launch Job/campaignLanguageSelector')

List<WebElement> elements = WebUI.findWebElements(objects, 2)

for (WebElement ele : elements) {
    text = ele.getText()

    System.out.println(text)

    if (text.equalsIgnoreCase('Italian (IT)')) {
        ele.click()

        break
    }
}

WebUI.click(findTestObject('Job_Creation/Launch Job/campaignFamily'))

WebUI.click(findTestObject('Job_Creation/Launch Job/campaignFunctionId'))

pro.load(new FileInputStream('README.md'))

keyValue = pro.getProperty('Message')

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/descriptionInputBox'), keyValue)

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/qualificationLocator'), 'master')

WebElement element = driver.findElement(By.cssSelector('span[aria-valuetext=\'0\']'))

int value = element.getSize().width

ac.dragAndDropBy(element, value, 0).build().perform()

WebElement element_1 = driver.findElement(By.cssSelector('span[aria-valuetext=\'10\']'))

int value2 = element_1.getSize().width

ac.dragAndDropBy(element_1, value2, 0).build().perform()

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/mendetorySkillInput'), 'java')

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/mendetorySkillInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Job_Creation/Launch Job/selectMendetorySkill'))

Thread.sleep(1000)

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/Alternative SkillsInputBox'), 'selenium')

Thread.sleep(1000)

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/Alternative SkillsInputBox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Job_Creation/Launch Job/selectAlternetiveSkill'))

WebUI.click(findTestObject('Job_Creation/Launch Job/departmentID'))

WebUI.click(findTestObject('Job_Creation/Launch Job/designationID'))

WebUI.click(findTestObject('Job_Creation/Launch Job/projectId'))

WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/positionCount'), '4')

WebUI.click(findTestObject('Job_Creation/Launch Job/selectQuarter'))

WebUI.click(findTestObject('Job_Creation/Launch Job/input__dueDate'))

WebUI.click(findTestObject('Job_Creation/Launch Job/currentDate'))

//WebUI.sendKeys(findTestObject('Job_Creation/Launch Job/currentDate'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Job_Creation/Launch Job/button_Next'))

ac.sendKeys(Keys.PAGE_DOWN).perform()

pro.load(new FileInputStream('Files/P1_Template.properties'))

keyValue = pro.getProperty('Template_Italian')

driver.findElement(By.cssSelector('span [class = \'fa fa-search\']')).click()

driver.findElement(By.cssSelector('input[type = \'Text\']')).sendKeys(keyValue)

ac.sendKeys(Keys.PAGE_DOWN).perform()

Thread.sleep(2000)

driver.findElement(By.xpath('//button[text() = \' Search\']')).click()

By buttonBy = By.cssSelector('div[class=\'select-template\']')

By selectTemplateBy = By.cssSelector('button[class=\'btn btn-yellow\']')

WebElement button_s = driver.findElement(buttonBy)

ac.moveToElement(button_s).perform()

Thread.sleep(3000)

WebElement selectTemplate = driver.findElement(selectTemplateBy)

ac.click(selectTemplate).perform()

WebUI.click(findTestObject('Job_Creation/Launch Job/button_Next'))

WebUI.click(findTestObject('Job_Creation/selectAllLocationCheckBox'))

WebUI.scrollToElement(findTestObject('Job_Creation/Launch Job/button_Next'), 2)

WebUI.click(findTestObject('Job_Creation/Launch Job/button_Next'))

WebUI.scrollToElement(findTestObject('Job_Creation/Launch Job/button_Next'), 2)

Thread.sleep(2000)

WebUI.click(findTestObject('Job_Creation/Launch Job/button_Next'))

driver.findElement(By.cssSelector('.ng-scope > .ng-scope > .btn.btn-black.ng-scope')).click()

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(Input)

for (int a = 0; a <= 2; a++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'), 
    Input)

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()

