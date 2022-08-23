import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.lang.model.element.VariableElement as VariableElement
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
import com.sun.org.apache.bcel.internal.classfile.LocalVariable as LocalVariable
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.eclipse.persistence.jpa.jpql.Assert as RandomStringUtils

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

WebUI.click(findTestObject('MTP Locators/MobileTalentPoolLocatorOnDashboardBar'))

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), GlobalVariable.hiredCandidate)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

//WebUI.scrollToElement(findTestObject('MTP Locators/tabLocators'), 1)
WebUI.scrollToElement(findTestObject('MTP Locators/statusOFTheCandidateOnMTP'), 2)

WebUI.click(findTestObject('MTP Locators/statusOFTheCandidateOnMTP'))
List < WebElement > allStatus = driver.findElements(By.cssSelector('a span[class ="value-text ng-scope"]'))
int count = allStatus.size()

System.out.println(count)

for (int i = 0; i <= count; i++) {
    status = allStatus.get(i).getText()
	System.out.println(status)
    if (status.equalsIgnoreCase('Shortlisted')) {
        System.out.println('Shortlisted is present')
    } else if (status.equalsIgnoreCase('Contacted')) {
        System.out.println('Contacted is present')
    } else if (status.equalsIgnoreCase('Interviewed')) {
        System.out.println('Interviewed is present')
    } else if (status.equalsIgnoreCase('Not Qualified')) {
        System.out.println('Not Qualified is present')
    } else if (status.equalsIgnoreCase('Not Interested')) {
        System.out.println('Not Interested is present')
    } else if (status.equalsIgnoreCase('On Hold')) {
        System.out.println('On Hold is present')
    } else if (status.equalsIgnoreCase('Reviewed ')) {
        System.out.println('Reviewed  is present')
    } else if (status.equalsIgnoreCase('Scheduled ')) {
        System.out.println('Scheduled  is present')
    } else if (status.equalsIgnoreCase('Awaiting Interview')) {
        System.out.println('Awaiting Interview is present')
    } else if (status.equalsIgnoreCase('Not Selected ')) {
        System.out.println('Not Selected  is present')
    } else if (status.equalsIgnoreCase('Joined')) {
        System.out.println('Joined is present')
    } else if (status.equalsIgnoreCase('Separated')) {
        System.out.println('Separated is present')
    } else if (status.equalsIgnoreCase('Not Contactable')) {
        System.out.println('Not Contactable is present')
    } else if (status.equalsIgnoreCase('Offer Accepted')) {
        System.out.println('Offer Accepted is present')
    } else if (status.equalsIgnoreCase('No Show')) {
        System.out.println('No Show is present')
    } else if (status.equalsIgnoreCase('Location Constraint')) {
        System.out.println('Location Constraint is present')
    } else if (status.equalsIgnoreCase('Pre-Onboarding ')) {
        System.out.println('Pre-Onboarding is present')
    } else if (status.equalsIgnoreCase('Salary Constraint')) {
        System.out.println('Salary Constraint is present')
		break
    }	
}

List < WebElement > allStatus2 = driver.findElements(By.cssSelector('a span[class ="value-text ng-scope"]'))
int count2 = allStatus2.size()

System.out.println(count2)

for (int i2 = 0; i2 <= count2; i2++) {
	status2 = allStatus2.get(i2).getText()
	System.out.println(status2)
	if (status2.equalsIgnoreCase('Offer Declined')) {
		System.out.println('Offer Declined is present')
	}
  else if (status2.equalsIgnoreCase('Already Available In Database')) {
	System.out.println('Already Available In Database is present')
} else if (status2.equalsIgnoreCase('Saved For Future Requirement')) {
	System.out.println('Saved For Future Requirement is present')
} else if (status2.equalsIgnoreCase('Stop')) {
	System.out.println('Stop is present')
} else if (status2.equalsIgnoreCase('Information Request')) {
	System.out.println('Information Request is present')
} else if (status2.equalsIgnoreCase('No Call')) {
	System.out.println('No Call is present')
} else if (status2.equalsIgnoreCase('Incomplete Application')) {
	System.out.println('Incomplete Application is present')
} else if (status2.equalsIgnoreCase('Qualified')) {
	System.out.println('Qualified is present')
} else if (status2.equalsIgnoreCase('Pending Review')) {
	System.out.println('Pending Review is present')
} else if (status2.equalsIgnoreCase('Pending Additional Information For Application')) {
	System.out.println('Pending Additional Information For Application is present')
} else if (status2.equalsIgnoreCase('Scheduled But Did Not Apply')) {
	System.out.println('Scheduled But Did Not Apply is present')
} else if (status2.equalsIgnoreCase('Hired As QA')) {
	System.out.println('Hired As QA is present')
} else if (status2.equalsIgnoreCase('Hired As DEV')) {
	System.out.println('Hired As DEV is present')
} else if (status2.equalsIgnoreCase('No Show Report')) {
	System.out.println('No Show Report is present')
} else if (status2.equalsIgnoreCase('Promoted To Trainee')) {
	System.out.println('Promoted To Trainee is present')
} else if (status2.equalsIgnoreCase('Separated With Dates')) {
	System.out.println('Separated With Dates is present')
	break
}
}
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()