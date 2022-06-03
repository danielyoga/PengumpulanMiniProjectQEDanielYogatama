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

WebUI.openBrowser('https://qa.alta.id')

WebUI.maximizeWindow()

for (int i = 0; i < 10; i++) {
    WebUI.navigateToUrl('https://qa.alta.id/auth/register')

    WebUI.sendKeys(findTestObject('Authentication_Register/input_Nama Lengkap_input-18'), fullname_arr[i])

    WebUI.sendKeys(findTestObject('Authentication_Register/input_Email_input-21'), email_arr[i])

    WebUI.sendKeys(findTestObject('Authentication_Register/input_Password_input-24'), password_arr[i])

    WebUI.click(findTestObject('Authentication_Register/button_Register'))

    if (i > 0) {
        WebUI.verifyElementPresent(findTestObject('Authentication_Register/div_Sudah memiliki akun Login'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('Homepage/h3_AltaShop'), 0)
    }
}

