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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.transform.ThreadInterrupt as ThreadInterrupt
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import org.testng.Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.candidateAppUser)

WebUI.setEncryptedText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.candidateAppPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.sendKeys(findTestObject('candidate App/jobSearchLocator'), 'php developer')

WebUI.click(findTestObject('candidate App/searchLocator'))

List<WebElement> element = driver.findElements(By.cssSelector('div[class=\'mat-card-header-text\'] mat-card-title'))

int count = element.size()

for (WebElement al : element) {
    string = al.getText()

    System.out.println(string)
}

currentURL = driver.getCurrentUrl()

currentURL1= WebUI.getUrl()

System.out.println(currentURL)
System.out.println(currentURL1)
productionURL = "https://mobile-recruit.com/candidate/availableJobs/search"
stagingURL= "https://motzie-staging.mobile-recruit.com/candidate/availableJobs/search"
if (currentURL.equalsIgnoreCase(stagingURL)) {

	WebUI.takeScreenshot(('ScreenShots/CandidateApp/Staging/screenshot_' + System.currentTimeMillis()) + '.jpg')
    WebUI.click(findTestObject('candidate App/Page_/hambergerIconOnCandidateAppLocator'))
    List<WebElement> allListElements = driver.findElements(By.cssSelector('div[class=\'mat-list-text\']'))
    int listCount = allListElements.size()
    for (int i = 0; i < listCount; i++) {
        textOfALLOptions = allListElements.get(i).getText()

        if (textOfALLOptions.equalsIgnoreCase('Log Out')) {
            allListElements.get(i).click()
            break
        }
    }
}

else if (currentURL.equalsIgnoreCase(productionURL))
{
	WebUI.takeScreenshot(('ScreenShots/CandidateApp/Production/screenshot_' + System.currentTimeMillis()) + '.jpg')

    WebUI.click(findTestObject('candidate App/Page_/hambergerIconOnCandidateAppLocator'))

    List<WebElement> allListElements = driver.findElements(By.cssSelector('div[class=\'mat-list-text\']'))

    int listCount = allListElements.size()

    for (int i = 0; i < listCount; i++) {
        textOfALLOptions = allListElements.get(i).getText()

        if (textOfALLOptions.equalsIgnoreCase('Log Out')) {
            allListElements.get(i).click()

            break
        }
    }
}
else {
	Assert.assertEquals(currentURL, productionURL||stagingURL)
}
