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

WebUI.click(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/a_Reports'))

WebUI.click(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/a_Other Reports'))

WebUI.click(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/a_Adjusting Entries'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---Per RegionPer AreaPer Unit'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---Head OfficeLuzon 1L_eb6cd5'), 
    '02', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---La Union 1AbraIloco_046ef5'), 
    'B6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---JanuaryFebruaryMarc_7b8eaa'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/select_---Select Item---2019 2020 2021 2022 2023'), 
    '2022', true)

WebUI.click(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/input_Year_btnPDFAdj'))

WebUI.click(findTestObject('Object Repository/Adjusting Entries/Page_CARD, Inc. Computerized Accounting System/b_HEAD OFFICE'))



