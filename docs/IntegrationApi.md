# IntegrationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationGetGet**](IntegrationApi.md#integrationGetGet) | **GET** /integration/get | 17_997
[**integrationListGet**](IntegrationApi.md#integrationListGet) | **GET** /integration/list | 17_999

<a name="integrationGetGet"></a>
# **integrationGetGet**
> GetOneIntegrationResponse integrationGetGet(id)

17_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 17_997_101 | UnknownExceptionWhenTryingFetchOneIntegration |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationApi apiInstance = new IntegrationApi();
UUID id = new UUID(); // UUID | 
try {
    GetOneIntegrationResponse result = apiInstance.integrationGetGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#integrationGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  | [optional]

### Return type

[**GetOneIntegrationResponse**](GetOneIntegrationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="integrationListGet"></a>
# **integrationListGet**
> IntegrationListResponse integrationListGet(page, perPage, searchKeyword, categoryId)

17_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 17_999_101 | UnknownExceptionWhenTryingFetchIntegrations | Unknown exception when trying to fetch integrations. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


IntegrationApi apiInstance = new IntegrationApi();
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String searchKeyword = "searchKeyword_example"; // String | 
UUID categoryId = new UUID(); // UUID | 
try {
    IntegrationListResponse result = apiInstance.integrationListGet(page, perPage, searchKeyword, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#integrationListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **searchKeyword** | **String**|  | [optional]
 **categoryId** | [**UUID**](.md)|  | [optional]

### Return type

[**IntegrationListResponse**](IntegrationListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

