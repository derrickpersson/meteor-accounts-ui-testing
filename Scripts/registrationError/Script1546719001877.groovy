import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.homeURL)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Registration Page/register-username'), findTestData('User').getValue(1, 2))

WebUI.setText(findTestObject('Registration Page/register-email'), findTestData('User').getValue(2, 2))

WebUI.setText(findTestObject('Registration Page/register-password'), findTestData('User').getValue(3, 2))

WebUI.setText(findTestObject('Registration Page/register-password2'), findTestData('User').getValue(4, 2))

WebUI.submit(findTestObject('Registration Page/submit'))

assert WebUI.verifyElementPresent(findTestObject('Registration Page/register-username-error'), 5)
assert WebUI.verifyElementPresent(findTestObject('Registration Page/register-email-error'), 5)
assert WebUI.verifyElementPresent(findTestObject('Registration Page/register-password-error'), 5)
assert WebUI.verifyElementPresent(findTestObject('Registration Page/register-password2-error'), 5)

WebUI.closeBrowser()