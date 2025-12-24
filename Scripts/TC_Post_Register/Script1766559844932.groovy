import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

println("Register with email: " + GlobalVariable.email)

def response = WS.sendRequest(findTestObject('Object Repository/POST_Register'))
WS.verifyResponseStatusCode(response, 200)
