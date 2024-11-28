# ApplicationIntegrationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationIntegrationAddIntegrationToApplicationPost**](ApplicationIntegrationApi.md#applicationIntegrationAddIntegrationToApplicationPost) | **POST** /application-integration/add-integration-to-application | 18_999
[**applicationIntegrationApplicationIntegrationListByApplicationIdGet**](ApplicationIntegrationApi.md#applicationIntegrationApplicationIntegrationListByApplicationIdGet) | **GET** /application-integration/application-integration-list-by-application-id | 18_997

<a name="applicationIntegrationAddIntegrationToApplicationPost"></a>
# **applicationIntegrationAddIntegrationToApplicationPost**
> AddIntegrationToApplicationResponse applicationIntegrationAddIntegrationToApplicationPost(body)

18_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 18_999_101 | ApplicationNotFound | Application not found. |  | 18_999_102 | UnknownExceptionWhenCheckApplicationExistence | Unknown exception when checking if application exists. |  | 18_999_103 | IntegrationNotFound | Integration not found. |  | 18_999_104 | UnknownExceptionWhenCheckIntegrationExistence | Unknown exception when checking if integration exists. |  | 18_999_105 | UnknownExceptionWhenAddIntegrationToApplication | Unknown exception when adding integration to application. |  | 18_999_106 | IntegrationAlreadyAddedToTheApplication | You already map this integration to your application. |  | 18_999_107 | UnknownExceptionWhenCheckApplicationIntegrationUniqueness |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationIntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationIntegrationApi apiInstance = new ApplicationIntegrationApi();
ApplicationintegrationAddintegrationtoapplicationBody body = new ApplicationintegrationAddintegrationtoapplicationBody(); // ApplicationintegrationAddintegrationtoapplicationBody | 
try {
    AddIntegrationToApplicationResponse result = apiInstance.applicationIntegrationAddIntegrationToApplicationPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationIntegrationApi#applicationIntegrationAddIntegrationToApplicationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationintegrationAddintegrationtoapplicationBody**](ApplicationintegrationAddintegrationtoapplicationBody.md)|  | [optional]

### Return type

[**AddIntegrationToApplicationResponse**](AddIntegrationToApplicationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="applicationIntegrationApplicationIntegrationListByApplicationIdGet"></a>
# **applicationIntegrationApplicationIntegrationListByApplicationIdGet**
> ApplicationIntegrationListByApplicationIdResponse applicationIntegrationApplicationIntegrationListByApplicationIdGet(applicationId, page, perPage)

18_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 18_998 | UnknownExceptionWhenTryingFetchApplicationIntegrations |  |  | 18_999 | ApplicationNotFound |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationIntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationIntegrationApi apiInstance = new ApplicationIntegrationApi();
UUID applicationId = new UUID(); // UUID | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
try {
    ApplicationIntegrationListByApplicationIdResponse result = apiInstance.applicationIntegrationApplicationIntegrationListByApplicationIdGet(applicationId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationIntegrationApi#applicationIntegrationApplicationIntegrationListByApplicationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]

### Return type

[**ApplicationIntegrationListByApplicationIdResponse**](ApplicationIntegrationListByApplicationIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

