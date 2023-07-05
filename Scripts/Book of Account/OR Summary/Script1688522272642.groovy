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

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/a_Reports'))

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/a_Other Reports'))

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/a_Book of Accounts'))

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/a_OR Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---Head OfficeLuzon 1L_eb6cd5'), 
    '99', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---HEAD OFFICEIT liaison'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---HEAD OFFICE'), 
    '01', true)

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/div_End Date'))

WebUI.click(findTestObject('Object Repository/OR Summary/Page_CARD, Inc. Computerized Accounting System/input_End Date_btnPDFOR'))



