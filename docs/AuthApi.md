# AuthApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authAuthenticatePost**](AuthApi.md#authAuthenticatePost) | **POST** /auth/authenticate | 23_999
[**authRefreshPost**](AuthApi.md#authRefreshPost) | **POST** /auth/refresh | 23_998

<a name="authAuthenticatePost"></a>
# **authAuthenticatePost**
> GetAuthenticationTokenResponse authAuthenticatePost(secretKey)

23_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 23_999_101 | UnknownExceptionWhenTryingFetchApplicationApiKey |  |  | 23_999_102 | FailedToFindApplicationApiKey |  |  | 23_999_103 | UnknownExceptionWhenTryingToGetUserAuthenticationToken |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthApi apiInstance = new AuthApi();
String secretKey = "secretKey_example"; // String | 
try {
    GetAuthenticationTokenResponse result = apiInstance.authAuthenticatePost(secretKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authAuthenticatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretKey** | **String**|  | [optional]

### Return type

[**GetAuthenticationTokenResponse**](GetAuthenticationTokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="authRefreshPost"></a>
# **authRefreshPost**
> RefreshAuthenticationTokenResponse authRefreshPost(refreshToken)

23_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 23_998_101 | UnknownExceptionWhenTryingToRefreshUserAuthenticationToken |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthApi apiInstance = new AuthApi();
String refreshToken = "refreshToken_example"; // String | 
try {
    RefreshAuthenticationTokenResponse result = apiInstance.authRefreshPost(refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authRefreshPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshToken** | **String**|  | [optional]

### Return type

[**RefreshAuthenticationTokenResponse**](RefreshAuthenticationTokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

