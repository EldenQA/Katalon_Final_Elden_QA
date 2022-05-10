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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://motzie-staging.mobile-recruit.com/')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Administration'))

//WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/b_Administration_caret'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Manage Accounts'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Create New Account'))

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__accountName'), 
    'katalon_5')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__email'), 'katalon@yopmail.com')

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/div__selected-flag'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_India ()'))

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input_United States_primaryPhoneNumber'), 
    '9623521252')

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- Advertising, Arts, Entert_612296'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.pri_503879'), 
    '9023')

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- GBARBRCACOMXPHPLUSIN'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.zip'), 
    '177107')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.city'), 
    'katalon')

WebUI.clickImage(findTestObject('vm.accountDetailsForm.attachment'))

WebUI.uploadFile(findTestObject('Account_Creation/Page_Mobile Talent  Mobile Recruitment/Page_Bebo Talent  Mobile Recruitment/input_Browse_vm.accountDetailsForm.attachment'), 
    variable)

WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- PunjabAndaman And nicobar_78b03e'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactFirstName'), 
    'katalon_3')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactLastName'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactEmail'), 
    'katalon@yopmail.com')

WebUI.scrollToElement(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/label_Use account address'), 
    5, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/div__iti-flag us'))
//WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_India ()'))
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input_United States_contactPhoneNumber'), 
    '3152779908')

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/label_Use account address'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/ul__multiselect-search-list'))

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__ng-pristine ng-untouched ng-valid ng_084d1e'), 
    'atish')

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/li_atish sharma'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Add User'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next_1'))

//WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Confirm'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/h3_Thank You for the confirmation. Account _7daf0d'))

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/h3_Thank You for the confirmation. Account _7daf0d'))

