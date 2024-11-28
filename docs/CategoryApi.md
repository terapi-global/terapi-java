# CategoryApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoryListGet**](CategoryApi.md#categoryListGet) | **GET** /category/list | 19_999

<a name="categoryListGet"></a>
# **categoryListGet**
> CategoryListResponse categoryListGet(page, perPage)

19_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 19_999_101 | UnknownExceptionWhenTryingFetchCategories | Unknown exception when fetching category. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CategoryApi apiInstance = new CategoryApi();
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
try {
    CategoryListResponse result = apiInstance.categoryListGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]

### Return type

[**CategoryListResponse**](CategoryListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

