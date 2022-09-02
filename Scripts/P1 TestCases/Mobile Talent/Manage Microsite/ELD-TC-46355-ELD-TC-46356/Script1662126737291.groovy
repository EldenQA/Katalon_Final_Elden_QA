import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select as Select
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang.math.RandomUtils as RandomUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

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

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration1.size()

for (int l = 0; l < count; l++) {
    tabNames1 = allTabsOnAdministration1.get(l).getText()

    System.out.println(tabNames1)

    if (tabNames1 == 'Manage Microsites') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

WebUI.click(findTestObject('Administration/Manage_Microsite/create_Button'))

micrositeName = ('Standelone' + RandomStringUtils.randomNumeric(6))

micrositePageTitle = ('PageTitle' + RandomStringUtils.randomNumeric(6))

WebUI.sendKeys(findTestObject('Administration/Manage_Microsite/micrositeName'), micrositeName)

WebUI.click(findTestObject('Administration/Manage_Microsite/addPageInStandeloneMicrosite'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Enter Page Name_form-control ng-prist_3b5161'), 
    micrositePageTitle)

WebUI.click(findTestObject('Administration/Manage_Microsite/addLandingPage'))

WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration12 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count2 = allTabsOnAdministration12.size()

for (int l2 = 0; l2 < count2; l2++) {
    tabNames12 = allTabsOnAdministration12.get(l2).getText()

    System.out.println(tabNames12)

    if (tabNames12 == 'Manage Microsites') {
        allTabsOnAdministration1.get(l2).click()

        break
    }
}
//Test Case-ELD-TC-46355-Verify that user is able to see the Action Icons 
TestObject jobTitles = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> jobTitleselements = WebUI.findWebElements(jobTitles, 2)

for (WebElement jobTitlesSingle : jobTitleselements) {
    jobTitlesText = jobTitlesSingle.getText()

    System.out.println(jobTitlesText)

    Assert.assertEquals(micrositeName, jobTitlesText)

    if (jobTitlesText.equalsIgnoreCase(micrositeName)) {
        WebUI.verifyElementAttributeValue(findTestObject('Administration/Manage_Microsite/editIconManageMicrosite'), 'data-title', 
            'Edit Microsite', 2)

        WebUI.verifyElementAttributeValue(findTestObject('Administration/Manage_Microsite/copyMicrosite'), 'data-title', 
            'Copy Microsite', 2)

        WebUI.verifyElementAttributeValue(findTestObject('Administration/Manage_Microsite/deleteMicrosite'), 'data-title', 
            'Delete Microsite', 2)

        break
    }
}
//Test Case-ELD-TC-46356-Edit the microsite 
TestObject jobTitles2 = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> jobTitleselements2 = WebUI.findWebElements(jobTitles2, 2)

for (WebElement jobTitlesSingle2 : jobTitleselements2) {
    jobTitlesText2 = jobTitlesSingle2.getText()

    System.out.println(jobTitlesText2)

    Assert.assertEquals(micrositeName, jobTitlesText2)

    if (jobTitlesText2.equalsIgnoreCase(micrositeName)) {
        WebUI.click(findTestObject('Administration/Manage_Microsite/editIconManageMicrosite'))

        WebUI.clearText(findTestObject('Administration/Manage_Microsite/micrositeName'))

        break
    }
}

WebUI.sendKeys(findTestObject('Administration/Manage_Microsite/micrositeName'), micrositeName + 'edited')
WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'),
	3)
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'))

TestObject jobTitles3 = findTestObject('Administration/Manage_Jobs/jobsTitle')

List<WebElement> jobTitleselements3 = WebUI.findWebElements(jobTitles3, 2)

for (WebElement jobTitlesSingle3 : jobTitleselements3) {
	jobTitlesText3 = jobTitlesSingle3.getText()
	System.out.println(jobTitlesText3)
	Assert.assertEquals(micrositeName, jobTitlesText3)
	break
	}

