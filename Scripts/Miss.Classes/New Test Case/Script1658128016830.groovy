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
import java.io.BufferedWriter

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

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys('Software Engineer_IP_Test_8787')

for (int a = 0; a <= 2; a++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'))
WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/micrositeLinkLocator'))

urlMicrosite = WebUI.getUrl()
System.out.println(urlMicrosite)
//Properties pro2 = new Properties()
File f = new File('Files/jg.txt')
FileWriter fw = new FileWriter(f)
BufferedWriter bw = new BufferedWriter(fw);
bw.write(urlMicrosite)
bw.newLine();
bw.close()
//pro2.setProperty('url',urlMicrosite)
//
//pro2.store(fw, 'comments')

