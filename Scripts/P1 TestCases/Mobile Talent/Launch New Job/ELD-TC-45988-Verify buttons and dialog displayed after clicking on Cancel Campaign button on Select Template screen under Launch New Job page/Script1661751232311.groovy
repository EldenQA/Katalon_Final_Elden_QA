import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.swing.ListSelectionModel as ListSelectionModel
import javax.swing.text.html.CSS as CSS
import javax.swing.text.html.FormView as FormView
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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.DriverCommand as DriverCommand
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.testng.Assert as Assert
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.List as List
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import java.io.BufferedReader as BufferedReader
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

Properties pro = new Properties()

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

WebUI.click(findTestObject('Job_Creation/Launch Job/a_Launch New Job'))

//This will load the property file and take the value of Created Template and then store it in keyValue 
FileWriter fw = new FileWriter('job.properties')

FileWriter fw2 = new FileWriter('job.properties')

Properties pro2 = new Properties()

pro2.setProperty('JobName', ((((('Auto' + '_') + 'Software') + '_') + 'Enggineer') + '_') + RandomStringUtils.randomNumeric(
        5))

pro2.store(fw, 'comments')

FileInputStream fis = new FileInputStream('job.properties')

Input = pro2.getProperty('JobName')

pro.load(new FileInputStream('console.properties'))

keyValue = pro.getProperty('Template')

//WebUI.click(findTestObject('MTP Locators/metaDataLocator'))
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

WebUI.setText(findTestObject('Job_Creation/Launch Job/jobNameInput'), Input //keyValue is the Created Template value "Template"
    )

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

WebUI.click(findTestObject('Job_Creation/Launch Job/button_Next'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.END))

WebUI.click(findTestObject('Job_Creation/Launch Job/cancelCampaignButton'))

TestObject testObj = findTestObject('Job_Creation/Launch Job/buttonsOnCancelCampaignPopup')

List<WebElement> elements = WebUI.findWebElements(testObj, 2)

for (WebElement ele : elements) {
    text = ele.getText()
System.out.println(text)
    if (text.equalsIgnoreCase('')) {
        KeywordUtil.logInfo('button is present')
    } else if (text.equalsIgnoreCase('Cancel ')) {
        KeywordUtil.logInfo('button is present')
    } else if (text.equalsIgnoreCase('Confirm')) {
        KeywordUtil.logInfo('button is present')
		break
    } else {
        throw new com.kms.katalon.core.exception.StepFailedException()
    }
}

WebUI.click(findTestObject('Job_Creation/Launch Job/closePopuponLauchJobCancelCampaign'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()

