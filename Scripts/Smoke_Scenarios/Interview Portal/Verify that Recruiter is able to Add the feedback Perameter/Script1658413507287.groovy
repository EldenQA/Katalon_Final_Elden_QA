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
import org.apache.commons.lang3.RandomUtils as RandomUtils
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.navigateToUrl(GlobalVariable.url)


WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('MTP Locators/applicationNavigatorDropdown'))

WebUI.click(findTestObject('MTP Locators/interviewPortalSelector'))

List<WebElement> tabsOnInterviewPortal = driver.findElements(By.cssSelector('li[class="nav-item submenu "]'))

int tabsOnInterviewPortalCount = tabsOnInterviewPortal.size()

for (int o = 0; o <= tabsOnInterviewPortalCount; o++) {
    tabsOnInterviewPortaltext = tabsOnInterviewPortal.get(o).getText()

    if (tabsOnInterviewPortaltext.equalsIgnoreCase('Administration')) {
        tabsOnInterviewPortal.get(o).click()
    } else if (tabsOnInterviewPortaltext.equalsIgnoreCase('Feedback Parameters')) {
        tabsOnInterviewPortal.get(o).click()

        break
    }
}

List<WebElement> deletePerameter = driver.findElements(By.cssSelector('.page-scroller [class="mt-2 row"]:nth-of-type(1) div:nth-of-type(1) [placeholder="Enter Description"]'))

int deletePerametercount = deletePerameter.size()

for (int g = 0; g <= deletePerametercount; g++) {
	deleteValue = deletePerameter.get(g).getAttribute('value')

	if (deleteValue.equalsIgnoreCase('Automate')) {
		Thread.sleep(3000)
		WebUI.click(findTestObject('InterviewPortal/deleteFeedbackPerameter'))
		Thread.sleep(3000)
		WebUI.click(findTestObject('InterviewPortal/deleteFeedbackPerameterPopup'))
		break
	}
}

WebUI.click(findTestObject('InterviewPortal/feedbackPerameterLocator'))

List<WebElement> perameterOptions = driver.findElements(By.cssSelector('.dropdown-menu.show > a'))

int perameterOptionsCount = perameterOptions.size()

System.out.println(perameterOptionsCount)

for (int q = 0; q <= perameterOptionsCount; q++) {
    perameterOptionstext = perameterOptions.get(q).getText()

    System.out.println(perameterOptionstext)

    if (perameterOptionstext.equalsIgnoreCase('Textarea')) {
        perameterOptions.get(q).click()

        break
    }
}

Date date = new Date()

SimpleDateFormat df = new SimpleDateFormat('MM/dd/yyyy')

currentDate = df.format(date)

System.out.println(currentDate)

perameterName = (currentDate + 'Automate')

List < WebElement > dd = driver.findElements(By.cssSelector('.page-scroller [class="mt-2 row"]:nth-of-type(1) div:nth-of-type(1) [placeholder="Enter Name"]'))
List < WebElement > description = driver.findElements(By.cssSelector('.page-scroller [class="mt-2 row"]:nth-of-type(1) div:nth-of-type(1) [placeholder="Enter Description"]'))
int ddcount = dd.size()
int descriptioncount = description.size()
for (int h = 0; h <ddcount; h++) {
  attributeValue = dd.get(h).getAttribute('value')
  System.out.println(attributeValue)
  for (int t = h; t <descriptioncount; t++) {
    descriptioncountValue = description.get(t).getAttribute('value')
    System.out.println(descriptioncountValue)
    if (attributeValue.equalsIgnoreCase('') && (descriptioncountValue.equalsIgnoreCase(''))) {
      dd.get(h).sendKeys(perameterName)
      description.get(t).sendKeys('Automate')
      WebUI.click(findTestObject('InterviewPortal/saveFeedBackPerameter'))
      WebUI.takeScreenshot(('ScreenShots/InterviewPortalBookingEmail/FeedBackPerameter/screenshot_' + System.currentTimeMillis()) +
        '.jpg')
      break
    } 
	break
	}
}
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/h4_Atish Sharma'))
WebUI.click(findTestObject('Object Repository/Yopmail.com/InterviewPortal/Page_Mobile Talent  Interview Portal/a_Logout'))
WebUI.closeBrowser()
