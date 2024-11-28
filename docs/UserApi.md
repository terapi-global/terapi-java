# UserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateOrGetUserProfilePost**](UserApi.md#userCreateOrGetUserProfilePost) | **POST** /user/create-or-get-user-profile | 14_998

<a name="userCreateOrGetUserProfilePost"></a>
# **userCreateOrGetUserProfilePost**
> CreateUserProfileResponse userCreateOrGetUserProfilePost()

14_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 14_998_101 | UnknownExceptionWhenFetchJwtUserProfile | Unknown exception when fetching JWT user profile. |  | 14_998_102 | UnknownExceptionWhenCreateUserProfile | Unknown exception when creating user profile. |  | 14_998_103 | IncorrectDataInUserJwtPayload | Incorrect data in user JWT payload. |  | 14_998_104 | UnknownExceptionWhenSubscribeUserToFreePlan | Unknown exception when subscribing user to free plan. |  | 14_998_105 | UserAlreadyExistInDataStorage | Logged user not found in data storage. |  | 14_998_106 | UnknownExceptionWhenCheckUserExistence | Unknown exception when fetching logged user profile. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
try {
    CreateUserProfileResponse result = apiInstance.userCreateOrGetUserProfilePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCreateOrGetUserProfilePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateUserProfileResponse**](CreateUserProfileResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

