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
import groovy.inspect.swingui.BytecodeCollector as BytecodeCollector
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement


//To load the properties Files 
WebUI.openBrowser('')
WebUI.navigateToUrl('https://mobile-recruit.com/')
FileWriter fw = new FileWriter("console.properties");
Properties pro = new Properties()
pro.setProperty("Template" , 'Katalon_' + RandomStringUtils.randomAlphabetic(4))
pro.store(fw, "comments")
FileInputStream fis = new FileInputStream("console.properties");
Input = pro.getProperty("Template")
WebDriver driver = DriverFactory.getWebDriver()
driver.findElement(By.cssSelector('#username')).sendKeys(Input)


//To select the value form Administration dropdown

List<WebElement> dropdownValues = driver.findElements(By.cssSelector("ul[class='dropdown-menu'] li a"))
int dropdownValuesCount= dropdownValues.size()
for (int i =0; i<dropdownValuesCount;i++)
{
	dropdownText = dropdownValues.get(i).getText()
	 if(dropdownText.equalsIgnoreCase("Manage Career Page"))
	 {
		 dropdownValues.get(i).click()
		 break
	 }
}


//To select the status of the Candidate
List<WebElement> allStatus = driver.findElements(By.cssSelector('a span[class =\'value-text ng-scope\']'))

int count = allStatus.size()
System.out.println(count)

System.out.println(count)

for (int i = 0; i <= count; i++) {
	status = allStatus.get(i).getText()

	System.out.println(status)

	if (status.equalsIgnoreCase('Shortlisted')) {
		allStatus.get(i).click()

		break
	}	
}


//ScreenShots 

WebUI.takeScreenshot('ScreenShots/DownGrade/screenshot_'+ System.currentTimeMillis() + '.jpg')


//If user wants to click on any value of Administration Dropdown 
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))
List<WebElement> allTabsOnAdministration = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration.size()

for (int p = 0; p < count; p++) {
	tabNames = allTabsOnAdministration.get(p).getText()

	System.out.println(tabNames)

	if (tabNames == 'SMS - BOT') {
		allTabsOnAdministration.get(p).click()

		break
	}
}
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

	List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

	count = allTabsOnAdministration1.size()

	for (int l = 0; l < count; l++) {
		tabNames1 = allTabsOnAdministration1.get(l).getText()

		System.out.println(tabNames1)

		if (tabNames1 == 'Manage Accounts') {
			allTabsOnAdministration.get(l).click()

			break
		}
	}
	
	//If user want to select any account on Manage Account

	List<WebElement> accountNames = driver.findElements(By.cssSelector('td a[ng-click = "vm.getAccountDetails(account.id)"]'))

	count1 = accountNames.size()

	for (int i = 0; i < count; i++) {
		accountNamesText = accountNames.get(i).getText()

		System.out.println(accountNamesText)

		if (accountNamesText == 'Test Account') {
			driver.findElement(By.cssSelector('i[data-title=\'Account Settings\']')).click()

			break
		}
	}
	
	//If user want enable the toggle button on account settings 
	List<WebElement> toggleButtonNamesAccountSetting = driver.findElements(By.cssSelector('div[class=toggle-label]'))

	int countToggleButtons = toggleButtonNamesAccountSetting.size()

	for (int k = 0; k < countToggleButtons; k++) {
		countToggleButtonsText = toggleButtonNamesAccountSetting.get(k).getText()

		System.out.println(countToggleButtonsText)

		if (countToggleButtonsText == 'Enable Automated SMS') {
			WebUI.click(findTestObject('Toggle Button/Page_Mobile Talent  Mobile Recruitment/label_Yes'))
		}
	}

if (false) {
	driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()
}


//Robot class 
Robot rb = new Robot()

rb.delay(2000)

StringSelection ss = new StringSelection('C:\\Users\\atsharma\\Pictures\\photos.jpg')

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)


//logout from MT portla 
    WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

    WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))