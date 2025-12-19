import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable
import groovy.json.JsonSlurper

// GET LIST USERS
WS.sendRequest(findTestObject('GET_List_Users'))

// GET SINGLE USER
def response = WS.sendRequest(findTestObject('GET_Single_User'))

def json = new JsonSlurper().parseText(response.getResponseText())
GlobalVariable.userId = json.data.id
GlobalVariable.email = json.data.email

// PUT UPDATE
WS.sendRequest(findTestObject('PUT_Update_User'))

// POST REGISTER SUCCESS
WS.sendRequest(findTestObject('POST_Register_Success'))
