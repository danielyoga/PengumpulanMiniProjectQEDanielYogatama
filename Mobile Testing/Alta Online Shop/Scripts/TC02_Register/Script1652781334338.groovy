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

Mobile.startApplication('D:\\Dev\\Kuliah Semester 6\\Studi Independen\\mini project\\alta-online-shop.apk', true)

Mobile.tap(findTestObject('Object Repository/Authentication Register/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Authentication Register/Register Button'), 0)

Mobile.tap(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Alex Under, Fullname'), 0)

Mobile.clearText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Alex Under, Fullname (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Fullname'), 'agung pratama', 
    0)

Mobile.clearText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - alexemail.com, Email'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Email'), 0)

Mobile.clearText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - alexemail.com, Email (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Email (1)'), 'agung@gmail.com60', 
    0)

Mobile.clearText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - 123123123, Password'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Password'), 0)

Mobile.clearText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - 123123123, Password (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication Register/android.widget.EditText - Password (1)'), 'agung123', 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication Register/Register Button (1)'), 0)

Mobile.closeApplication()

