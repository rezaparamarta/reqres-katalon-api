import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable
import groovy.json.JsonSlurper

def response = WS.sendRequest(findTestObject('Object Repository/GET_Single_User'))
WS.verifyResponseStatusCode(response, 200)

// Parse response
def json = new JsonSlurper().parseText(response.getResponseText())

// Ambil email
GlobalVariable.email = json.data.email

println("Email saved to Global Variable: " + GlobalVariable.email)

