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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.inspect.swingui.BytecodeCollector as BytecodeCollector
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

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

//This will load the property file and take the value of Created Template and then store it in keyValue 
manageJob = ('JobTest_' + RandomStringUtils.randomNumeric(6))

pro.load(new FileInputStream('console.properties'))

keyValue = pro.getProperty('Template')

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

WebUI.setText(findTestObject('Job_Creation/Launch Job/jobNameInput'), manageJob //keyValue is the Created Template value "Template"
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

ac.sendKeys(Keys.PAGE_DOWN).perform()

pro.load(new FileInputStream('console.properties'))

keyValue = pro.getProperty('Template')

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

element2.sendKeys(manageJob)

for (int a = 0; a <= 2; a++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.verifyElementText(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'), 
    manageJob)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> dropdownValues = driver.findElements(By.cssSelector('ul[class=\'dropdown-menu\'] li a'))

int dropdownValuesCount = dropdownValues.size()

for (int i = 0; i < dropdownValuesCount; i++) {
    dropdownText = dropdownValues.get(i).getText()

    if (dropdownText.equalsIgnoreCase('Manage Jobs')) {
        dropdownValues.get(i).click()

        break
    }
}

//TestCase_2-ELD-TC-46177
TestObject testCase_1 = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> testCase_1elements = WebUI.findWebElements(testCase_1, 2)

for (WebElement testCase_1Element : testCase_1elements) {
    testCase_1elementText = testCase_1Element.getText()

    System.out.println(testCase_1elementText)

    if (testCase_1elementText.equalsIgnoreCase(manageJob)) {
        testCase_1Element.click()

        WebUI.verifyElementPresent(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/micrositeLinkLocator'), 
            2)

        WebUI.click(findTestObject('All_Jobs/closeJobDetailDialogPopup'))
    }
}

//p1-TestCase-3-ELD-TC-46272
TestObject jobTitles = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> jobTitleselements = WebUI.findWebElements(jobTitles, 2)

for (WebElement jobTitlesSingle : jobTitleselements) {
    jobTitlesText = jobTitlesSingle.getText()

    System.out.println(jobTitlesText)

    if (jobTitlesText.equalsIgnoreCase(manageJob)) {
        TestObject actionIcons2 = findTestObject('Administration/Manage_Jobs/manageJobsActionIcons')

        List<WebElement> actionIconselements2 = WebUI.findWebElements(actionIcons2, 2)

        for (WebElement ele22 : actionIconselements2) {
            attribute2 = ele22.getAttribute('data-title')

            System.out.println(attribute2)

            if (attribute2.equalsIgnoreCase('Edit Campaign')) {
                KeywordUtil.logInfo('button is present')
            } else if (attribute2.equalsIgnoreCase('Complete Campaign')) {
                KeywordUtil.logInfo('button is present')
            } else if (attribute2.equalsIgnoreCase('Manage Candidate Source')) {
                KeywordUtil.logInfo('button is present')

                break
            }
        }
    }
    
    break
}

//Test_Case_4_ELD-TC-46337-Verify that user is able to complete the Job from manage Job
TestObject jobTitles2 = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> jobTitleselements2 = WebUI.findWebElements(jobTitles2, 2)

for (WebElement jobTitlesSingle2 : jobTitleselements2) {
    jobTitlesText2 = jobTitlesSingle2.getText()

    System.out.println(jobTitlesText2)

    if (jobTitlesText2.equalsIgnoreCase(manageJob)) {
        TestObject actionIcons22 = findTestObject('Administration/Manage_Jobs/manageJobsActionIcons')

        List<WebElement> actionIconselements2 = WebUI.findWebElements(actionIcons22, 2)

        for (WebElement ele222 : actionIconselements2) {
            attribute22 = ele222.getAttribute('data-title')

            System.out.println(attribute22)

            if (attribute22.equalsIgnoreCase('Complete Campaign')) {
                ele222.click()
                WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'Campaign has been completed successfully.')
				break
            }
        }
        
        break
    }
}


//Test_Case_5_ELD-TC-46347-Verify that user is able to launch the Job from manage Job

TestObject launchJob = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> launchJobelements2 = WebUI.findWebElements(launchJob, 2)

for (WebElement launchJobSingle2 : launchJobelements2) {
	launchJobText2 = launchJobSingle2.getText()

	System.out.println(launchJobText2)

	if (launchJobText2.equalsIgnoreCase(manageJob)) {
		TestObject launchJobIcons22 = findTestObject('Administration/Manage_Jobs/manageJobsActionIcons')

		List<WebElement> launchJobselements2 = WebUI.findWebElements(launchJobIcons22, 2)

		for (WebElement launchJob222 : launchJobselements2) {
			launchJobAttribute = launchJob222.getAttribute('data-title')

			System.out.println(launchJobAttribute)

			if (launchJobAttribute.equalsIgnoreCase('Launch Campaign')) {
				launchJob222.click()
				WebUI.verifyElementText(findTestObject('MTP Locators/successMessageLocator'), 'Campaign has been launched successfully.')
				break
			}
		}
		
		break
	}
}
//Test_Case_3-ELD-TC-46272
pro.load(new FileInputStream('README.md'))

editedDescription = pro.getProperty('Message(Edited)')

TestObject testObj = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> elements = WebUI.findWebElements(testObj, 2)

for (WebElement ele : elements) {
    elementText = ele.getText()

    System.out.println(elementText)

    if (elementText.equalsIgnoreCase(manageJob)) {
        TestObject actionIcons = findTestObject('Administration/Manage_Jobs/manageJobsActionIcons')

        List<WebElement> actionIconselements = WebUI.findWebElements(actionIcons, 2)

        for (WebElement ele2 : actionIconselements) {
            attribute = ele2.getAttribute('data-title')

            System.out.println(attribute)

            if (attribute.equalsIgnoreCase('Edit Campaign')) {
                ele2.click()

                break
            }
        }
    }
    
    break
}

WebUI.scrollToElement(findTestObject('Administration/Manage_Jobs/descriptionInputBox'), 2)

WebUI.clearText(findTestObject('Administration/Manage_Jobs/descriptionInputBox'))

WebUI.sendKeys(findTestObject('Administration/Manage_Jobs/descriptionInputBox'), editedDescription)

WebUI.click(findTestObject('Administration/Manage_Jobs/submitCampaignButton'))

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Confirm'))

WebUI.verifyElementText(findTestObject('Administration/Manage_Jobs/thanksPageEditMicrosite'), 'Your campaign has been updated successfully')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()

