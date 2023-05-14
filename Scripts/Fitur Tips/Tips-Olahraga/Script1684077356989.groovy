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

Mobile.startApplication('C:\\Users\\Fachry Ramadhan\\Katalon Studio\\HealthyMomsTest\\mobileapp\\HealthyMoms_v2.0.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/TestTipsOlahraga/android.widget.EditText - Email'), 'putri@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/TestTipsOlahraga/android.widget.EditText - Password'), 'putri123', 0)

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.widget.FrameLayout (1)'), 0)

Mobile.scrollToText('Yoga')

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.view.ViewGroup (1)'), 0)

Mobile.scrollToText('rileks')

Mobile.pressBack()

Mobile.scrollToText('Squat')

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.view.ViewGroup (2)'), 0)

Mobile.scrollToText('prosesnya')

Mobile.tap(findTestObject('Object Repository/TestTipsOlahraga/android.widget.Button - VIDEO PERAGAAN OLAHRAGA'), 0)

Mobile.closeApplication()

