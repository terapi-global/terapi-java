# ApplicationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationCreatePost**](ApplicationApi.md#applicationCreatePost) | **POST** /application/create | 15_999
[**applicationDeleteDelete**](ApplicationApi.md#applicationDeleteDelete) | **DELETE** /application/delete | 15_997
[**applicationListGet**](ApplicationApi.md#applicationListGet) | **GET** /application/list | 15_996
[**applicationUpdatePut**](ApplicationApi.md#applicationUpdatePut) | **PUT** /application/update | 15_998

<a name="applicationCreatePost"></a>
# **applicationCreatePost**
> CreateApplicationResponse applicationCreatePost(body)

15_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 15_999_101 | ApplicationNameAlreadyExist | Application name already exists. |  | 15_999_102 | UnknownExceptionWhenValidateApplicationNameUniqueness | Unknown exception when validating application name uniqueness. |  | 15_999_103 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |  | 15_999_104 | UserNotFound | User not found. |  | 15_999_105 | UnknownExceptionWhenCreateOrganization |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApi apiInstance = new ApplicationApi();
ApplicationCreateBody body = new ApplicationCreateBody(); // ApplicationCreateBody | 
try {
    CreateApplicationResponse result = apiInstance.applicationCreatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationCreateBody**](ApplicationCreateBody.md)|  | [optional]

### Return type

[**CreateApplicationResponse**](CreateApplicationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="applicationDeleteDelete"></a>
# **applicationDeleteDelete**
> DeleteApplicationResponse applicationDeleteDelete(id)

15_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 15_997_101 | ApplicationNotFound | Application not found. |  | 15_997_102 | UnknownExceptionWhenFetchApplicationExistence | Unknown exception when fetching application existence. |  | 15_997_103 | UnknownExceptionWhenDeleteApplication | Unknown exception when deleting application. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApi apiInstance = new ApplicationApi();
UUID id = new UUID(); // UUID | 
try {
    DeleteApplicationResponse result = apiInstance.applicationDeleteDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationDeleteDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  | [optional]

### Return type

[**DeleteApplicationResponse**](DeleteApplicationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="applicationListGet"></a>
# **applicationListGet**
> UserApplicationListResponse applicationListGet(page, perPage)

15_996

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 15_996_101 | UnknownExceptionWhenTryingFetchApplications | Unknown exception when trying to fetch applications. |  | 15_996_102 | UserNotFound | User not found. |  | 15_996_103 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApi apiInstance = new ApplicationApi();
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
try {
    UserApplicationListResponse result = apiInstance.applicationListGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]

### Return type

[**UserApplicationListResponse**](UserApplicationListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="applicationUpdatePut"></a>
# **applicationUpdatePut**
> UpdateApplicationResponse applicationUpdatePut(body)

15_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 15_998_101 | ApplicationNotFound | Application not found. |  | 15_998_102 | UnknownExceptionWhenFetchApplication | Unknown exception when fetching application. |  | 15_998_103 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApplicationApi apiInstance = new ApplicationApi();
ApplicationUpdateBody body = new ApplicationUpdateBody(); // ApplicationUpdateBody | 
try {
    UpdateApplicationResponse result = apiInstance.applicationUpdatePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationUpdatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationUpdateBody**](ApplicationUpdateBody.md)|  | [optional]

### Return type

[**UpdateApplicationResponse**](UpdateApplicationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

