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

//WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Verify that New Interview Panelist is able to register in the System'), 
//    [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Verify that Candidate is able to schedule the Talent Meet Interview'), 
//    [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Verify that InterviewPanelist is able to add the feedback for the Candidate'), 
//    [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that user is able to scedule the Second Round with same Interview Panelist for same candidate'), 
//    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that InterviewPanelist is able to add the feedback for the Candidate for Second Round'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that user is able to scedule the Third Round with same Interview Panelist for same candidate'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Interview Portal/Dependent TestCases/Verify that InterviewPanelist is able to add the feedback for the Candidate for third round'), 
    [:], FailureHandling.STOP_ON_FAILURE)

