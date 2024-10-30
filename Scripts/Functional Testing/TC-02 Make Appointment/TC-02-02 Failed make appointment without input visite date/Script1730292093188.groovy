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

WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Login'), [('Username') : Username, ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

'Step 1'
WebUI.selectOptionByValue(findTestObject('TC-02 Make Appointment/select_Facility'), facility, true)

WebUI.check(findTestObject('TC-02 Make Appointment/check_hospital readmission'))

WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))

WebUI.click(findTestObject('TC-02 Make Appointment/input_Visit Date'))

WebUI.setText(findTestObject('TC-02 Make Appointment/textarea_Comment'), comment)

WebUI.click(findTestObject('TC-02 Make Appointment/button_Book Appointment'))

WebUI.verifyElementNotPresent(findTestObject('TC-02 Make Appointment/alert_Fill out visit date'), 0)

