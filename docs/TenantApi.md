# TenantApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantDeclineTenantIdGet**](TenantApi.md#tenantDeclineTenantIdGet) | **GET** /tenant/decline-tenant/{id} | 20_996
[**tenantInviteTenantByApplicationIntegrationIdPost**](TenantApi.md#tenantInviteTenantByApplicationIntegrationIdPost) | **POST** /tenant/invite-tenant-by-application-integration-id | 20_998
[**tenantInviteTenantPost**](TenantApi.md#tenantInviteTenantPost) | **POST** /tenant/invite-tenant | 20_998
[**tenantUpdateTenantConnectionPost**](TenantApi.md#tenantUpdateTenantConnectionPost) | **POST** /tenant/update-tenant-connection | 20_997
[**tenantUserTenantListGet**](TenantApi.md#tenantUserTenantListGet) | **GET** /tenant/user-tenant-list | 20_999

<a name="tenantDeclineTenantIdGet"></a>
# **tenantDeclineTenantIdGet**
> DeclineTenantInvitationResponse tenantDeclineTenantIdGet(id)

20_996

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 20_996_101 | TenantNotFound | Tenant Not Found |  | 20_996_102 | UnknownExceptionWhileFetchingTenant | Unknown exception when checking tenant existence. |  | 20_996_103 | UnknownExceptionWhileDecliningTenant | Unknown exception when declining tenant. |  | 20_996_104 | TenantIsNotInInvitedStatus |  |  | 20_996_105 | UnknownExceptionWhileCheckingIfTenantIsInCorrectStatus |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TenantApi apiInstance = new TenantApi();
UUID id = new UUID(); // UUID | 
try {
    DeclineTenantInvitationResponse result = apiInstance.tenantDeclineTenantIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#tenantDeclineTenantIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**DeclineTenantInvitationResponse**](DeclineTenantInvitationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="tenantInviteTenantByApplicationIntegrationIdPost"></a>
# **tenantInviteTenantByApplicationIntegrationIdPost**
> InviteTenantByApplicationIntegrationIdResponse tenantInviteTenantByApplicationIntegrationIdPost(body)

20_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 20_998_101 | ApplicationIntegrationNotFound | Application integration not found. |  | 20_998_102 | UnknownExceptionWhenCheckApplicationExistence | Unknown exception when checking application existence. |  | 20_998_103 | UnknownExceptionWhenCreateTenant | Unknown exception when createing tenant. |  | 20_998_104 | UnknownExceptionWhenSendingEmailToInvitedEmailAddress | Unknown exception when sending email to invited email address. |  | 20_998_105 | UserNotFound | User not found. |  | 20_998_106 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |  | 20_998_107 | UnknownExceptionWhenCreateUserTenant | Unknown exception when creating user tenant. |  | 20_998_108 | UnknownExceptionWhenCreatingEmailContent | Unknown exception when creating email content. |  | 20_998_109 | UnknownExceptionWhenCreatingEmailAcceptInvitationUrl |  |  | 20_998_110 | UnknownExceptionWhenAddingTenantInKeycloak |  |  | 20_998_111 | UnknownExceptionWhenAddingTenantInOrganization |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TenantApi apiInstance = new TenantApi();
TenantInvitetenantbyapplicationintegrationidBody body = new TenantInvitetenantbyapplicationintegrationidBody(); // TenantInvitetenantbyapplicationintegrationidBody | 
try {
    InviteTenantByApplicationIntegrationIdResponse result = apiInstance.tenantInviteTenantByApplicationIntegrationIdPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#tenantInviteTenantByApplicationIntegrationIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TenantInvitetenantbyapplicationintegrationidBody**](TenantInvitetenantbyapplicationintegrationidBody.md)|  | [optional]

### Return type

[**InviteTenantByApplicationIntegrationIdResponse**](InviteTenantByApplicationIntegrationIdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="tenantInviteTenantPost"></a>
# **tenantInviteTenantPost**
> InviteTenantResponse tenantInviteTenantPost(body)

20_998

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 20_998_101 | ApplicationIntegrationNotFound | Application integration not found. |  | 20_998_102 | UnknownExceptionWhenCheckApplicationExistence | Unknown exception when checking application existence. |  | 20_998_103 | UnknownExceptionWhenCreateTenant | Unknown exception when createing tenant. |  | 20_998_104 | UnknownExceptionWhenSendingEmailToInvitedEmailAddress | Unknown exception when sending email to invited email address. |  | 20_998_105 | UserNotFound | User not found. |  | 20_998_106 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |  | 20_998_107 | UnknownExceptionWhenCreateUserTenant | Unknown exception when creating user tenant. |  | 20_998_108 | UnknownExceptionWhenCreatingEmailContent | Unknown exception when creating email content. |  | 20_998_109 | UnknownExceptionWhenCreatingEmailAcceptInvitationUrl |  |  | 20_998_110 | UnknownExceptionWhenAddingTenantInKeycloak |  |  | 20_998_111 | UnknownExceptionWhenAddingTenantInOrganization |  |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TenantApi apiInstance = new TenantApi();
TenantInvitetenantBody body = new TenantInvitetenantBody(); // TenantInvitetenantBody | 
try {
    InviteTenantResponse result = apiInstance.tenantInviteTenantPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#tenantInviteTenantPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TenantInvitetenantBody**](TenantInvitetenantBody.md)|  | [optional]

### Return type

[**InviteTenantResponse**](InviteTenantResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="tenantUpdateTenantConnectionPost"></a>
# **tenantUpdateTenantConnectionPost**
> UpdateTenantConnectionResponse tenantUpdateTenantConnectionPost(body)

20_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 20_997_101 | TenantNotFound | Tenant not found. |  | 20_997_102 | UnknownExceptionWhenCheckTenantExistence | Unknown exception when checking tenant existence. |  | 20_997_103 | UnknownExceptionWhenUpdateTenantConnection | Unknown exception when updating tenant connection. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TenantApi apiInstance = new TenantApi();
TenantUpdatetenantconnectionBody body = new TenantUpdatetenantconnectionBody(); // TenantUpdatetenantconnectionBody | 
try {
    UpdateTenantConnectionResponse result = apiInstance.tenantUpdateTenantConnectionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#tenantUpdateTenantConnectionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TenantUpdatetenantconnectionBody**](TenantUpdatetenantconnectionBody.md)|  | [optional]

### Return type

[**UpdateTenantConnectionResponse**](UpdateTenantConnectionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="tenantUserTenantListGet"></a>
# **tenantUserTenantListGet**
> UserTenantListResponse tenantUserTenantListGet(invitationStatus, page, perPage)

20_999

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 20_999_101 | UnknownExceptionWhenTryingFetchTenants | Unknown exception when trying to fetch tenants. |  | 20_999_102 | UserNotFound | User not found. |  | 20_999_103 | UnknownExceptionWhenInsertApplication | Unknown exception when inserting application. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TenantApi apiInstance = new TenantApi();
InvitationStatus1 invitationStatus = new InvitationStatus1(); // InvitationStatus1 |   0 = Invited  1 = Accepted  2 = Declined
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
try {
    UserTenantListResponse result = apiInstance.tenantUserTenantListGet(invitationStatus, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#tenantUserTenantListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationStatus** | [**InvitationStatus1**](.md)|   0 &#x3D; Invited  1 &#x3D; Accepted  2 &#x3D; Declined | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]

### Return type

[**UserTenantListResponse**](UserTenantListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

