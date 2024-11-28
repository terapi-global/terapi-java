# ApiProxyApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiProxyEndpointDelete**](ApiProxyApi.md#apiProxyEndpointDelete) | **DELETE** /api-proxy/{endpoint} | 21_997
[**apiProxyEndpointGet**](ApiProxyApi.md#apiProxyEndpointGet) | **GET** /api-proxy/{endpoint} | 21_997
[**apiProxyEndpointPatch**](ApiProxyApi.md#apiProxyEndpointPatch) | **PATCH** /api-proxy/{endpoint} | 21_997
[**apiProxyEndpointPost**](ApiProxyApi.md#apiProxyEndpointPost) | **POST** /api-proxy/{endpoint} | 21_997
[**apiProxyEndpointPut**](ApiProxyApi.md#apiProxyEndpointPut) | **PUT** /api-proxy/{endpoint} | 21_997
[**apiProxyOauth2ChallengeGet**](ApiProxyApi.md#apiProxyOauth2ChallengeGet) | **GET** /api-proxy/oauth2/challenge | 
[**apiProxyUnifiedContactsExternalIdGet**](ApiProxyApi.md#apiProxyUnifiedContactsExternalIdGet) | **GET** /api-proxy/unified/contacts/{externalId} | 
[**apiProxyUnifiedContactsGet**](ApiProxyApi.md#apiProxyUnifiedContactsGet) | **GET** /api-proxy/unified/contacts | 

<a name="apiProxyEndpointDelete"></a>
# **apiProxyEndpointDelete**
> CallActionResponse apiProxyEndpointDelete(xTenantId, integrationName, endpoint, body)

21_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |

### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
UUID xTenantId = new UUID(); // UUID | 
String integrationName = "integrationName_example"; // String | 
String endpoint = "endpoint_example"; // String | 
ApiproxyEndpointBody6 body = new ApiproxyEndpointBody6(); // ApiproxyEndpointBody6 | 
try {
    CallActionResponse result = apiInstance.apiProxyEndpointDelete(xTenantId, integrationName, endpoint, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenantId** | [**UUID**](.md)|  |
 **integrationName** | **String**|  |
 **endpoint** | **String**|  |
 **body** | [**ApiproxyEndpointBody6**](ApiproxyEndpointBody6.md)|  | [optional]

### Return type

[**CallActionResponse**](CallActionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyEndpointGet"></a>
# **apiProxyEndpointGet**
> CallActionResponse apiProxyEndpointGet(integrationName, endpoint, xTenantId)

21_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |

### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
String integrationName = "integrationName_example"; // String | 
String endpoint = "endpoint_example"; // String | 
UUID xTenantId = new UUID(); // UUID | 
try {
    CallActionResponse result = apiInstance.apiProxyEndpointGet(integrationName, endpoint, xTenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationName** | **String**|  |
 **endpoint** | **String**|  |
 **xTenantId** | [**UUID**](.md)|  |

### Return type

[**CallActionResponse**](CallActionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyEndpointPatch"></a>
# **apiProxyEndpointPatch**
> CallActionResponse apiProxyEndpointPatch(xTenantId, integrationName, endpoint, body)

21_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |

### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
UUID xTenantId = new UUID(); // UUID | 
String integrationName = "integrationName_example"; // String | 
String endpoint = "endpoint_example"; // String | 
ApiproxyEndpointBody9 body = new ApiproxyEndpointBody9(); // ApiproxyEndpointBody9 | 
try {
    CallActionResponse result = apiInstance.apiProxyEndpointPatch(xTenantId, integrationName, endpoint, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenantId** | [**UUID**](.md)|  |
 **integrationName** | **String**|  |
 **endpoint** | **String**|  |
 **body** | [**ApiproxyEndpointBody9**](ApiproxyEndpointBody9.md)|  | [optional]

### Return type

[**CallActionResponse**](CallActionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyEndpointPost"></a>
# **apiProxyEndpointPost**
> CallActionResponse apiProxyEndpointPost(xTenantId, integrationName, endpoint, body)

21_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |

### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
UUID xTenantId = new UUID(); // UUID | 
String integrationName = "integrationName_example"; // String | 
String endpoint = "endpoint_example"; // String | 
ApiproxyEndpointBody3 body = new ApiproxyEndpointBody3(); // ApiproxyEndpointBody3 | 
try {
    CallActionResponse result = apiInstance.apiProxyEndpointPost(xTenantId, integrationName, endpoint, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenantId** | [**UUID**](.md)|  |
 **integrationName** | **String**|  |
 **endpoint** | **String**|  |
 **body** | [**ApiproxyEndpointBody3**](ApiproxyEndpointBody3.md)|  | [optional]

### Return type

[**CallActionResponse**](CallActionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyEndpointPut"></a>
# **apiProxyEndpointPut**
> CallActionResponse apiProxyEndpointPut(xTenantId, integrationName, endpoint, body)

21_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |

### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
UUID xTenantId = new UUID(); // UUID | 
String integrationName = "integrationName_example"; // String | 
String endpoint = "endpoint_example"; // String | 
ApiproxyEndpointBody body = new ApiproxyEndpointBody(); // ApiproxyEndpointBody | 
try {
    CallActionResponse result = apiInstance.apiProxyEndpointPut(xTenantId, integrationName, endpoint, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenantId** | [**UUID**](.md)|  |
 **integrationName** | **String**|  |
 **endpoint** | **String**|  |
 **body** | [**ApiproxyEndpointBody**](ApiproxyEndpointBody.md)|  | [optional]

### Return type

[**CallActionResponse**](CallActionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyOauth2ChallengeGet"></a>
# **apiProxyOauth2ChallengeGet**
> OAuth2ChallengeDtoResponse apiProxyOauth2ChallengeGet(tenantId)



### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
UUID tenantId = new UUID(); // UUID | 
try {
    OAuth2ChallengeDtoResponse result = apiInstance.apiProxyOauth2ChallengeGet(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyOauth2ChallengeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**UUID**](.md)|  | [optional]

### Return type

[**OAuth2ChallengeDtoResponse**](OAuth2ChallengeDtoResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyUnifiedContactsExternalIdGet"></a>
# **apiProxyUnifiedContactsExternalIdGet**
> UnifiedContactResponse apiProxyUnifiedContactsExternalIdGet(externalId)



### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
String externalId = "externalId_example"; // String | 
try {
    UnifiedContactResponse result = apiInstance.apiProxyUnifiedContactsExternalIdGet(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyUnifiedContactsExternalIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**|  |

### Return type

[**UnifiedContactResponse**](UnifiedContactResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiProxyUnifiedContactsGet"></a>
# **apiProxyUnifiedContactsGet**
> UnifiedContactsListResponse apiProxyUnifiedContactsGet()



### Example
```java


ApiClient defaultClient = Configuration.getDefaultApiClient();


ApiProxyApi apiInstance = new ApiProxyApi();
try {
    UnifiedContactsListResponse result = apiInstance.apiProxyUnifiedContactsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiProxyApi#apiProxyUnifiedContactsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnifiedContactsListResponse**](UnifiedContactsListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

