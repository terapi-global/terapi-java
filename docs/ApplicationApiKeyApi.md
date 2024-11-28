# ApplicationApiKeyApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationApikeyGeneratePost**](ApplicationApiKeyApi.md#applicationApikeyGeneratePost) | **POST** /application-apikey/generate | 16_999
[**applicationApikeyGetByApplicationIdGet**](ApplicationApiKeyApi.md#applicationApikeyGetByApplicationIdGet) | **GET** /application-apikey/get-by-application-id | 16_995
[**applicationApikeyRevokeDelete**](ApplicationApiKeyApi.md#applicationApikeyRevokeDelete) | **DELETE** /application-apikey/revoke | 16_998

<a name="applicationApikeyGeneratePost"></a>
# **applicationApikeyGeneratePost**
> CreateApplicationApiKeyResponse applicationApikeyGeneratePost(body)

16_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 16_999_101 | ApplicationNotFound | Application not found. |  | 16_999_102 | UnknownExceptionWhenCheckApplicationExistence | Unknown exception when checking if application exists. |  | 16_999_103 | UnknownExceptionWhenGenerateApplicationApiKey | Unknown exception when generating application API key. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApiKeyApi apiInstance = new ApplicationApiKeyApi();
ApplicationapikeyGenerateBody body = new ApplicationapikeyGenerateBody(); // ApplicationapikeyGenerateBody | 
try {
    CreateApplicationApiKeyResponse result = apiInstance.applicationApikeyGeneratePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApiKeyApi#applicationApikeyGeneratePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationapikeyGenerateBody**](ApplicationapikeyGenerateBody.md)|  | [optional]

### Return type

[**CreateApplicationApiKeyResponse**](CreateApplicationApiKeyResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="applicationApikeyGetByApplicationIdGet"></a>
# **applicationApikeyGetByApplicationIdGet**
> ApplicationApiKeyByApplicationIdResponse applicationApikeyGetByApplicationIdGet(applicationId)

16_995

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 16_995_101 | ApplicationApiKeyNotFound | Application API key not found. |  | 16_995_102 | UnknownExceptionWhenTryingFetchApplications | Unknown exception when trying to fetch applications. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApiKeyApi apiInstance = new ApplicationApiKeyApi();
UUID applicationId = new UUID(); // UUID | 
try {
    ApplicationApiKeyByApplicationIdResponse result = apiInstance.applicationApikeyGetByApplicationIdGet(applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApiKeyApi#applicationApikeyGetByApplicationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)|  | [optional]

### Return type

[**ApplicationApiKeyByApplicationIdResponse**](ApplicationApiKeyByApplicationIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="applicationApikeyRevokeDelete"></a>
# **applicationApikeyRevokeDelete**
> RevokeApplicationApiKeyResponse applicationApikeyRevokeDelete(id)

16_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 16_998_101 | ApplicationApiKeyNotFound | Application API key not found. |  | 16_998_102 | UnknownExceptionWhenCheckApplicationExistence | Unknown exception when checking if application exists. |  | 16_998_103 | UnknownExceptionWhenGenerateApplicationApiKey | Unknown exception when generating application API key. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApiKeyApi apiInstance = new ApplicationApiKeyApi();
UUID id = new UUID(); // UUID | 
try {
    RevokeApplicationApiKeyResponse result = apiInstance.applicationApikeyRevokeDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApiKeyApi#applicationApikeyRevokeDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  | [optional]

### Return type

[**RevokeApplicationApiKeyResponse**](RevokeApplicationApiKeyResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

