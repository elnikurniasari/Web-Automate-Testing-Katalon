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

'Step 1'
WebUI.selectOptionByValue(findTestObject('TC-02 Make Appointment/select_Facility'), Facility, true)

//WebUI.check(findTestObject('TC-02 Make Appointment/check_hospital readmission'))
'Step 2'
if (Readmission == true) {
    WebUI.check(findTestObject('TC-02 Make Appointment/check_hospital readmission'))
}

//WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))
'Step 3'
def select_radio = Healthcare_Program

switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))

        break
    default:
        println(select_radio)

        WebUI.click(findTestObject('TC-02 Make Appointment/radio_Medicare_programs'))}

'Step 4'
WebUI.setText(findTestObject('TC-02 Make Appointment/input_Visit Date'), Visite_Date)

'Step 5'
WebUI.setText(findTestObject('TC-02 Make Appointment/textarea_Comment'), Comment)

'Step 6'
WebUI.click(findTestObject('TC-02 Make Appointment/button_Book Appointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Appointment Confirmation/h2_Appointment Confirmation'))

WebUI.verifyElementVisible(findTestObject('Appointment Confirmation/p_Please be informed'))

WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_facility'), Facility)

//WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_HospitalReadmission'), Readmission)
if (Readmission == true) {
    WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_HospitalReadmission'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_HospitalReadmission'), 'No')
}

//WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), Healthcare_Program)
switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'Medicare')

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'Medicaid')

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'None')

        break
    default:
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'None')}

WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_VisiteDate'), Visite_Date)

WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Comment'), Comment)

