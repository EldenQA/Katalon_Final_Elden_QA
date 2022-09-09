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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import org.openqa.selenium.support.ui.Select as Select
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Properties pro = new Properties()

WebUI.setText(findTestObject('Object Repository/Account_Creation/input_Username_username'),
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/input_Password_password'),
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Account_Creation/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List < WebElement > allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration1.size()

for (int l = 0; l < count; l++) {
    tabNames1 = allTabsOnAdministration1.get(l).getText()

    System.out.println(tabNames1)

    if (tabNames1 == 'Manage Users') {
        allTabsOnAdministration1.get(l).click()

        break
    }
}

WebUI.click(findTestObject('Administration/Manage User/createUserButton'))

userName = ('AccountAdmin' + RandomStringUtils.randomNumeric(6))

TestObject testObj = findTestObject('Administration/Manage User/allInputFieldsOnManageUser')




List<WebElement> elements = WebUI.findWebElements(testObj, 2)

for (WebElement ele : elements) {
    text = ele.getAttribute('name')

    System.out.println(text)

    if (text.equalsIgnoreCase('firstName')) {
        ele.sendKeys(userName)
    } else if (text.equalsIgnoreCase('lastName')) {
        ele.sendKeys(userName)
    } else if (text.equalsIgnoreCase('userName')) {
        ele.sendKeys(userName + '@yopmail.com')

        break
    }
}

WebUI.click(findTestObject('Administration/Manage User/countryFlagManageUser'))

Thread.sleep(500)

WebUI.click(findTestObject('Administration/Manage User/countryFlagManageUser'))


TestObject testObj6 = findTestObject('Administration/Manage User/allCountryCodes')

List < WebElement > elements6 = WebUI.findWebElements(testObj6, 2)

for (WebElement ele6: elements6) {
    text6 = ele6.getAttribute('data-country-code')
    System.out.println(text6)
    if (text6.equalsIgnoreCase('ar')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('br')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('ca')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('co')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('fr')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('de')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('in')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('it')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('mx')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('nl')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('ph')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('pl')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('gb')) {
        KeywordUtil.logInfo(text6 + 'is present')
    } else if (text6.equalsIgnoreCase('us')) {
        KeywordUtil.logInfo(text6 + 'is present')
		break
    }
}

phoneNumber = ('112' + RandomStringUtils.randomNumeric(7))

TestObject testObj2 = findTestObject('Administration/Manage User/allCountryCodes')

List<WebElement> elements2 = WebUI.findWebElements(testObj2, 2)

for (WebElement ele2 : elements2) {
    text2 = ele2.getAttribute('data-country-code')

    System.out.println(text2)

    if (text2.equalsIgnoreCase('in')) {
        ele2.click()

        break
    }
}

WebUI.sendKeys(findTestObject('Administration/Manage User/phoneInputField'), phoneNumber)

WebUI.selectOptionByValue(findTestObject('Administration/Manage User/selectUserLicence'), '2', false)

WebUI.click(findTestObject('Administration/Manage User/createUserbuttonOnPopup'))

TestObject testObj3 = findTestObject('Administration/Manage User/allUserTitle')

List<WebElement> elements3 = WebUI.findWebElements(testObj3, 2)

for (WebElement ele3 : elements3) {
    text3 = ele3.getText()

    System.out.println(text3)

    if (text3.equalsIgnoreCase(userName + userName)) {
        Assert.assertEquals(text3, userName + userName)

        break
    }
}

WebUI.click(findTestObject('All_Jobs/searchJobIcon'))

WebUI.sendKeys(findTestObject('Administration/Manage User/searchByName'), (userName + ' ') + userName)

WebUI.click(findTestObject('Administration/Manage_Microsite/searchButton'))

TestObject testObj4 = findTestObject('Administration/Manage User/actionIconsOnManageUser')

List<WebElement> elements4 = WebUI.findWebElements(testObj4, 2)

for (WebElement ele4 : elements4) {
    text4 = ele4.getAttribute('data-title')

    System.out.println(text4)

    if (text4.equalsIgnoreCase('Edit User')) {
        ele4.click()

        break
    }
}

TestObject testObj5 = findTestObject('Administration/Manage User/allInputFieldsOnManageUser')

List<WebElement> elements5 = WebUI.findWebElements(testObj5, 2)

for (WebElement ele5 : elements5) {
    text5 = ele5.getAttribute('name')

    System.out.println(text5)

    if (text5.equalsIgnoreCase('lastName')) {
        ele5.clear()

        ele5.sendKeys('edited')
    }
}

WebUI.click(findTestObject('Registration/Page_Mobile Talent  Mobile Recruitment/createSourceButton'))

WebUI.click(findTestObject('All_Jobs/searchJobIcon'))

WebUI.clearText(findTestObject('Administration/Manage User/searchByName'))

WebUI.sendKeys(findTestObject('Administration/Manage User/searchByName'), (userName + ' ') + 'edited')

WebUI.click(findTestObject('Administration/Manage_Microsite/searchButton'))

WebUI.verifyElementText(findTestObject('Administration/Manage User/allUserTitle'), (userName + ' ') + 'edited')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()