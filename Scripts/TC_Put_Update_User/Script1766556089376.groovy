import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('Object Repository/PUT_Update_User'))
WS.verifyResponseStatusCode(response, 200)
