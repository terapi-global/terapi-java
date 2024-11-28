## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        ApiProxyApi apiInstance = new ApiProxyApi();
        String integrationName = "integrationName_example"; // String | 
        String endpoint = "endpoint_example"; // String | 
        UUID xTenantId = new UUID(); // UUID | 
        ApiproxyEndpointBody6 body = new ApiproxyEndpointBody6(); // ApiproxyEndpointBody6 | 
        try {
            CallActionResponse result = apiInstance.apiProxyEndpointDelete(integrationName, endpoint, xTenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointDelete");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        ApiProxyApi apiInstance = new ApiProxyApi();
        String integrationName = "integrationName_example"; // String | 
        String endpoint = "endpoint_example"; // String | 
        UUID xTenantId = new UUID(); // UUID | 
        ApiproxyEndpointBody9 body = new ApiproxyEndpointBody9(); // ApiproxyEndpointBody9 | 
        try {
            CallActionResponse result = apiInstance.apiProxyEndpointPatch(integrationName, endpoint, xTenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPatch");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        ApiProxyApi apiInstance = new ApiProxyApi();
        String integrationName = "integrationName_example"; // String | 
        String endpoint = "endpoint_example"; // String | 
        UUID xTenantId = new UUID(); // UUID | 
        ApiproxyEndpointBody3 body = new ApiproxyEndpointBody3(); // ApiproxyEndpointBody3 | 
        try {
            CallActionResponse result = apiInstance.apiProxyEndpointPost(integrationName, endpoint, xTenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPost");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        ApiProxyApi apiInstance = new ApiProxyApi();
        String integrationName = "integrationName_example"; // String | 
        String endpoint = "endpoint_example"; // String | 
        UUID xTenantId = new UUID(); // UUID | 
        ApiproxyEndpointBody body = new ApiproxyEndpointBody(); // ApiproxyEndpointBody | 
        try {
            CallActionResponse result = apiInstance.apiProxyEndpointPut(integrationName, endpoint, xTenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiProxyApi#apiProxyEndpointPut");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiProxyApi;

import java.io.File;
import java.util.*;

public class ApiProxyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        ApiProxyApi apiInstance = new ApiProxyApi();
        try {
            UnifiedContactsListResponse result = apiInstance.apiProxyUnifiedContactsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiProxyApi#apiProxyUnifiedContactsGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiProxyApi* | [**apiProxyEndpointDelete**](docs/ApiProxyApi.md#apiProxyEndpointDelete) | **DELETE** /api-proxy/{endpoint} | 21_997
*ApiProxyApi* | [**apiProxyEndpointGet**](docs/ApiProxyApi.md#apiProxyEndpointGet) | **GET** /api-proxy/{endpoint} | 21_997
*ApiProxyApi* | [**apiProxyEndpointPatch**](docs/ApiProxyApi.md#apiProxyEndpointPatch) | **PATCH** /api-proxy/{endpoint} | 21_997
*ApiProxyApi* | [**apiProxyEndpointPost**](docs/ApiProxyApi.md#apiProxyEndpointPost) | **POST** /api-proxy/{endpoint} | 21_997
*ApiProxyApi* | [**apiProxyEndpointPut**](docs/ApiProxyApi.md#apiProxyEndpointPut) | **PUT** /api-proxy/{endpoint} | 21_997
*ApiProxyApi* | [**apiProxyOauth2ChallengeGet**](docs/ApiProxyApi.md#apiProxyOauth2ChallengeGet) | **GET** /api-proxy/oauth2/challenge | 
*ApiProxyApi* | [**apiProxyUnifiedContactsExternalIdGet**](docs/ApiProxyApi.md#apiProxyUnifiedContactsExternalIdGet) | **GET** /api-proxy/unified/contacts/{externalId} | 
*ApiProxyApi* | [**apiProxyUnifiedContactsGet**](docs/ApiProxyApi.md#apiProxyUnifiedContactsGet) | **GET** /api-proxy/unified/contacts | 
*ApplicationApi* | [**applicationCreatePost**](docs/ApplicationApi.md#applicationCreatePost) | **POST** /application/create | 15_999
*ApplicationApi* | [**applicationDeleteDelete**](docs/ApplicationApi.md#applicationDeleteDelete) | **DELETE** /application/delete | 15_997
*ApplicationApi* | [**applicationListGet**](docs/ApplicationApi.md#applicationListGet) | **GET** /application/list | 15_996
*ApplicationApi* | [**applicationUpdatePut**](docs/ApplicationApi.md#applicationUpdatePut) | **PUT** /application/update | 15_998
*ApplicationApiKeyApi* | [**applicationApikeyGeneratePost**](docs/ApplicationApiKeyApi.md#applicationApikeyGeneratePost) | **POST** /application-apikey/generate | 16_999
*ApplicationApiKeyApi* | [**applicationApikeyGetByApplicationIdGet**](docs/ApplicationApiKeyApi.md#applicationApikeyGetByApplicationIdGet) | **GET** /application-apikey/get-by-application-id | 16_995
*ApplicationApiKeyApi* | [**applicationApikeyRevokeDelete**](docs/ApplicationApiKeyApi.md#applicationApikeyRevokeDelete) | **DELETE** /application-apikey/revoke | 16_998
*ApplicationIntegrationApi* | [**applicationIntegrationAddIntegrationToApplicationPost**](docs/ApplicationIntegrationApi.md#applicationIntegrationAddIntegrationToApplicationPost) | **POST** /application-integration/add-integration-to-application | 18_999
*ApplicationIntegrationApi* | [**applicationIntegrationApplicationIntegrationListByApplicationIdGet**](docs/ApplicationIntegrationApi.md#applicationIntegrationApplicationIntegrationListByApplicationIdGet) | **GET** /application-integration/application-integration-list-by-application-id | 18_997
*AuthApi* | [**authAuthenticatePost**](docs/AuthApi.md#authAuthenticatePost) | **POST** /auth/authenticate | 23_999
*AuthApi* | [**authRefreshPost**](docs/AuthApi.md#authRefreshPost) | **POST** /auth/refresh | 23_998
*CategoryApi* | [**categoryListGet**](docs/CategoryApi.md#categoryListGet) | **GET** /category/list | 19_999
*IntegrationApi* | [**integrationGetGet**](docs/IntegrationApi.md#integrationGetGet) | **GET** /integration/get | 17_997
*IntegrationApi* | [**integrationListGet**](docs/IntegrationApi.md#integrationListGet) | **GET** /integration/list | 17_999
*StatisticsApi* | [**statisticsUserProfileGet**](docs/StatisticsApi.md#statisticsUserProfileGet) | **GET** /statistics/user-profile | 14_997
*TenantApi* | [**tenantDeclineTenantIdGet**](docs/TenantApi.md#tenantDeclineTenantIdGet) | **GET** /tenant/decline-tenant/{id} | 20_996
*TenantApi* | [**tenantInviteTenantByApplicationIntegrationIdPost**](docs/TenantApi.md#tenantInviteTenantByApplicationIntegrationIdPost) | **POST** /tenant/invite-tenant-by-application-integration-id | 20_998
*TenantApi* | [**tenantInviteTenantPost**](docs/TenantApi.md#tenantInviteTenantPost) | **POST** /tenant/invite-tenant | 20_998
*TenantApi* | [**tenantUpdateTenantConnectionPost**](docs/TenantApi.md#tenantUpdateTenantConnectionPost) | **POST** /tenant/update-tenant-connection | 20_997
*TenantApi* | [**tenantUserTenantListGet**](docs/TenantApi.md#tenantUserTenantListGet) | **GET** /tenant/user-tenant-list | 20_999
*UserApi* | [**userCreateOrGetUserProfilePost**](docs/UserApi.md#userCreateOrGetUserProfilePost) | **POST** /user/create-or-get-user-profile | 14_998

## Documentation for Models

 - [AddIntegrationToApplicationError](docs/AddIntegrationToApplicationError.md)
 - [AddIntegrationToApplicationRequest](docs/AddIntegrationToApplicationRequest.md)
 - [AddIntegrationToApplicationRequestDto](docs/AddIntegrationToApplicationRequestDto.md)
 - [AddIntegrationToApplicationRequestErrorCodes](docs/AddIntegrationToApplicationRequestErrorCodes.md)
 - [AddIntegrationToApplicationResponse](docs/AddIntegrationToApplicationResponse.md)
 - [AllOfAddIntegrationToApplicationErrorCode](docs/AllOfAddIntegrationToApplicationErrorCode.md)
 - [AllOfAddIntegrationToApplicationErrorType](docs/AllOfAddIntegrationToApplicationErrorType.md)
 - [AllOfAddIntegrationToApplicationRequestDto](docs/AllOfAddIntegrationToApplicationRequestDto.md)
 - [AllOfAddIntegrationToApplicationResponseError](docs/AllOfAddIntegrationToApplicationResponseError.md)
 - [AllOfApplicationApiKeyByApplicationIdErrorCode](docs/AllOfApplicationApiKeyByApplicationIdErrorCode.md)
 - [AllOfApplicationApiKeyByApplicationIdErrorType](docs/AllOfApplicationApiKeyByApplicationIdErrorType.md)
 - [AllOfApplicationApiKeyByApplicationIdResponseData](docs/AllOfApplicationApiKeyByApplicationIdResponseData.md)
 - [AllOfApplicationApiKeyByApplicationIdResponseError](docs/AllOfApplicationApiKeyByApplicationIdResponseError.md)
 - [AllOfApplicationIntegrationDtoApplication](docs/AllOfApplicationIntegrationDtoApplication.md)
 - [AllOfApplicationIntegrationDtoIntegration](docs/AllOfApplicationIntegrationDtoIntegration.md)
 - [AllOfApplicationIntegrationListByApplicationIdErrorCode](docs/AllOfApplicationIntegrationListByApplicationIdErrorCode.md)
 - [AllOfApplicationIntegrationListByApplicationIdErrorType](docs/AllOfApplicationIntegrationListByApplicationIdErrorType.md)
 - [AllOfApplicationIntegrationListByApplicationIdResponseData](docs/AllOfApplicationIntegrationListByApplicationIdResponseData.md)
 - [AllOfApplicationIntegrationListByApplicationIdResponseError](docs/AllOfApplicationIntegrationListByApplicationIdResponseError.md)
 - [AllOfCallActionErrorCode](docs/AllOfCallActionErrorCode.md)
 - [AllOfCallActionErrorType](docs/AllOfCallActionErrorType.md)
 - [AllOfCallActionResponseData](docs/AllOfCallActionResponseData.md)
 - [AllOfCallActionResponseError](docs/AllOfCallActionResponseError.md)
 - [AllOfCategoryListErrorCode](docs/AllOfCategoryListErrorCode.md)
 - [AllOfCategoryListErrorType](docs/AllOfCategoryListErrorType.md)
 - [AllOfCategoryListResponseData](docs/AllOfCategoryListResponseData.md)
 - [AllOfCategoryListResponseError](docs/AllOfCategoryListResponseError.md)
 - [AllOfCreateApplicationApiKeyErrorCode](docs/AllOfCreateApplicationApiKeyErrorCode.md)
 - [AllOfCreateApplicationApiKeyErrorType](docs/AllOfCreateApplicationApiKeyErrorType.md)
 - [AllOfCreateApplicationApiKeyRequestDto](docs/AllOfCreateApplicationApiKeyRequestDto.md)
 - [AllOfCreateApplicationApiKeyResponseData](docs/AllOfCreateApplicationApiKeyResponseData.md)
 - [AllOfCreateApplicationApiKeyResponseError](docs/AllOfCreateApplicationApiKeyResponseError.md)
 - [AllOfCreateApplicationErrorCode](docs/AllOfCreateApplicationErrorCode.md)
 - [AllOfCreateApplicationErrorType](docs/AllOfCreateApplicationErrorType.md)
 - [AllOfCreateApplicationRequestDto](docs/AllOfCreateApplicationRequestDto.md)
 - [AllOfCreateApplicationResponseData](docs/AllOfCreateApplicationResponseData.md)
 - [AllOfCreateApplicationResponseError](docs/AllOfCreateApplicationResponseError.md)
 - [AllOfCreateUserProfileErrorCode](docs/AllOfCreateUserProfileErrorCode.md)
 - [AllOfCreateUserProfileErrorType](docs/AllOfCreateUserProfileErrorType.md)
 - [AllOfCreateUserProfileResponseData](docs/AllOfCreateUserProfileResponseData.md)
 - [AllOfCreateUserProfileResponseError](docs/AllOfCreateUserProfileResponseError.md)
 - [AllOfDeclineTenantInvitationErrorCode](docs/AllOfDeclineTenantInvitationErrorCode.md)
 - [AllOfDeclineTenantInvitationErrorType](docs/AllOfDeclineTenantInvitationErrorType.md)
 - [AllOfDeclineTenantInvitationResponseError](docs/AllOfDeclineTenantInvitationResponseError.md)
 - [AllOfDeleteApplicationErrorCode](docs/AllOfDeleteApplicationErrorCode.md)
 - [AllOfDeleteApplicationErrorType](docs/AllOfDeleteApplicationErrorType.md)
 - [AllOfDeleteApplicationResponseError](docs/AllOfDeleteApplicationResponseError.md)
 - [AllOfErrorType](docs/AllOfErrorType.md)
 - [AllOfGetAuthenticationTokenErrorCode](docs/AllOfGetAuthenticationTokenErrorCode.md)
 - [AllOfGetAuthenticationTokenErrorType](docs/AllOfGetAuthenticationTokenErrorType.md)
 - [AllOfGetAuthenticationTokenResponseData](docs/AllOfGetAuthenticationTokenResponseData.md)
 - [AllOfGetAuthenticationTokenResponseError](docs/AllOfGetAuthenticationTokenResponseError.md)
 - [AllOfGetOneIntegrationErrorCode](docs/AllOfGetOneIntegrationErrorCode.md)
 - [AllOfGetOneIntegrationErrorType](docs/AllOfGetOneIntegrationErrorType.md)
 - [AllOfGetOneIntegrationResponseData](docs/AllOfGetOneIntegrationResponseData.md)
 - [AllOfGetOneIntegrationResponseError](docs/AllOfGetOneIntegrationResponseError.md)
 - [AllOfIntegrationDtoReleaseStatus](docs/AllOfIntegrationDtoReleaseStatus.md)
 - [AllOfIntegrationListErrorCode](docs/AllOfIntegrationListErrorCode.md)
 - [AllOfIntegrationListErrorType](docs/AllOfIntegrationListErrorType.md)
 - [AllOfIntegrationListResponseData](docs/AllOfIntegrationListResponseData.md)
 - [AllOfIntegrationListResponseError](docs/AllOfIntegrationListResponseError.md)
 - [AllOfInviteTenantByApplicationIntegrationIdErrorCode](docs/AllOfInviteTenantByApplicationIntegrationIdErrorCode.md)
 - [AllOfInviteTenantByApplicationIntegrationIdErrorType](docs/AllOfInviteTenantByApplicationIntegrationIdErrorType.md)
 - [AllOfInviteTenantByApplicationIntegrationIdRequestDto](docs/AllOfInviteTenantByApplicationIntegrationIdRequestDto.md)
 - [AllOfInviteTenantByApplicationIntegrationIdResponseData](docs/AllOfInviteTenantByApplicationIntegrationIdResponseData.md)
 - [AllOfInviteTenantByApplicationIntegrationIdResponseError](docs/AllOfInviteTenantByApplicationIntegrationIdResponseError.md)
 - [AllOfInviteTenantErrorCode](docs/AllOfInviteTenantErrorCode.md)
 - [AllOfInviteTenantErrorType](docs/AllOfInviteTenantErrorType.md)
 - [AllOfInviteTenantRequestDto](docs/AllOfInviteTenantRequestDto.md)
 - [AllOfInviteTenantResponseData](docs/AllOfInviteTenantResponseData.md)
 - [AllOfInviteTenantResponseError](docs/AllOfInviteTenantResponseError.md)
 - [AllOfOAuth2ChallengeDtoResponseData](docs/AllOfOAuth2ChallengeDtoResponseData.md)
 - [AllOfOAuth2ChallengeDtoResponseError](docs/AllOfOAuth2ChallengeDtoResponseError.md)
 - [AllOfOAuth2ChallengeDtoTokens](docs/AllOfOAuth2ChallengeDtoTokens.md)
 - [AllOfRefreshAuthenticationTokenErrorCode](docs/AllOfRefreshAuthenticationTokenErrorCode.md)
 - [AllOfRefreshAuthenticationTokenErrorType](docs/AllOfRefreshAuthenticationTokenErrorType.md)
 - [AllOfRefreshAuthenticationTokenResponseData](docs/AllOfRefreshAuthenticationTokenResponseData.md)
 - [AllOfRefreshAuthenticationTokenResponseError](docs/AllOfRefreshAuthenticationTokenResponseError.md)
 - [AllOfResponseError](docs/AllOfResponseError.md)
 - [AllOfRevokeApplicationApiKeyErrorCode](docs/AllOfRevokeApplicationApiKeyErrorCode.md)
 - [AllOfRevokeApplicationApiKeyErrorType](docs/AllOfRevokeApplicationApiKeyErrorType.md)
 - [AllOfRevokeApplicationApiKeyResponseError](docs/AllOfRevokeApplicationApiKeyResponseError.md)
 - [AllOfTenantDtoApplicationIntegration](docs/AllOfTenantDtoApplicationIntegration.md)
 - [AllOfTenantDtoInvitationStatus](docs/AllOfTenantDtoInvitationStatus.md)
 - [AllOfUnifiedContactResponseData](docs/AllOfUnifiedContactResponseData.md)
 - [AllOfUnifiedContactResponseError](docs/AllOfUnifiedContactResponseError.md)
 - [AllOfUnifiedContactsListResponseData](docs/AllOfUnifiedContactsListResponseData.md)
 - [AllOfUnifiedContactsListResponseError](docs/AllOfUnifiedContactsListResponseError.md)
 - [AllOfUpdateApplicationErrorCode](docs/AllOfUpdateApplicationErrorCode.md)
 - [AllOfUpdateApplicationErrorType](docs/AllOfUpdateApplicationErrorType.md)
 - [AllOfUpdateApplicationRequestDto](docs/AllOfUpdateApplicationRequestDto.md)
 - [AllOfUpdateApplicationResponseData](docs/AllOfUpdateApplicationResponseData.md)
 - [AllOfUpdateApplicationResponseError](docs/AllOfUpdateApplicationResponseError.md)
 - [AllOfUpdateTenantConnectionErrorCode](docs/AllOfUpdateTenantConnectionErrorCode.md)
 - [AllOfUpdateTenantConnectionErrorType](docs/AllOfUpdateTenantConnectionErrorType.md)
 - [AllOfUpdateTenantConnectionRequestDto](docs/AllOfUpdateTenantConnectionRequestDto.md)
 - [AllOfUpdateTenantConnectionResponseError](docs/AllOfUpdateTenantConnectionResponseError.md)
 - [AllOfUserApplicationListErrorCode](docs/AllOfUserApplicationListErrorCode.md)
 - [AllOfUserApplicationListErrorType](docs/AllOfUserApplicationListErrorType.md)
 - [AllOfUserApplicationListResponseData](docs/AllOfUserApplicationListResponseData.md)
 - [AllOfUserApplicationListResponseError](docs/AllOfUserApplicationListResponseError.md)
 - [AllOfUserProfileStatisticsErrorCode](docs/AllOfUserProfileStatisticsErrorCode.md)
 - [AllOfUserProfileStatisticsErrorType](docs/AllOfUserProfileStatisticsErrorType.md)
 - [AllOfUserProfileStatisticsResponseData](docs/AllOfUserProfileStatisticsResponseData.md)
 - [AllOfUserProfileStatisticsResponseError](docs/AllOfUserProfileStatisticsResponseError.md)
 - [AllOfUserTenantListErrorCode](docs/AllOfUserTenantListErrorCode.md)
 - [AllOfUserTenantListErrorType](docs/AllOfUserTenantListErrorType.md)
 - [AllOfUserTenantListResponseData](docs/AllOfUserTenantListResponseData.md)
 - [AllOfUserTenantListResponseError](docs/AllOfUserTenantListResponseError.md)
 - [ApiproxyEndpointBody](docs/ApiproxyEndpointBody.md)
 - [ApiproxyEndpointBody1](docs/ApiproxyEndpointBody1.md)
 - [ApiproxyEndpointBody10](docs/ApiproxyEndpointBody10.md)
 - [ApiproxyEndpointBody11](docs/ApiproxyEndpointBody11.md)
 - [ApiproxyEndpointBody2](docs/ApiproxyEndpointBody2.md)
 - [ApiproxyEndpointBody3](docs/ApiproxyEndpointBody3.md)
 - [ApiproxyEndpointBody4](docs/ApiproxyEndpointBody4.md)
 - [ApiproxyEndpointBody5](docs/ApiproxyEndpointBody5.md)
 - [ApiproxyEndpointBody6](docs/ApiproxyEndpointBody6.md)
 - [ApiproxyEndpointBody7](docs/ApiproxyEndpointBody7.md)
 - [ApiproxyEndpointBody8](docs/ApiproxyEndpointBody8.md)
 - [ApiproxyEndpointBody9](docs/ApiproxyEndpointBody9.md)
 - [ApplicationApiKeyByApplicationIdError](docs/ApplicationApiKeyByApplicationIdError.md)
 - [ApplicationApiKeyByApplicationIdErrorCodes](docs/ApplicationApiKeyByApplicationIdErrorCodes.md)
 - [ApplicationApiKeyByApplicationIdResponse](docs/ApplicationApiKeyByApplicationIdResponse.md)
 - [ApplicationApiKeyDto](docs/ApplicationApiKeyDto.md)
 - [ApplicationCreateBody](docs/ApplicationCreateBody.md)
 - [ApplicationCreateBody1](docs/ApplicationCreateBody1.md)
 - [ApplicationCreateBody2](docs/ApplicationCreateBody2.md)
 - [ApplicationDto](docs/ApplicationDto.md)
 - [ApplicationIntegrationDto](docs/ApplicationIntegrationDto.md)
 - [ApplicationIntegrationListByApplicationIdError](docs/ApplicationIntegrationListByApplicationIdError.md)
 - [ApplicationIntegrationListByApplicationIdRequestErrorCodes](docs/ApplicationIntegrationListByApplicationIdRequestErrorCodes.md)
 - [ApplicationIntegrationListByApplicationIdResponse](docs/ApplicationIntegrationListByApplicationIdResponse.md)
 - [ApplicationIntegrationListDto](docs/ApplicationIntegrationListDto.md)
 - [ApplicationListDto](docs/ApplicationListDto.md)
 - [ApplicationUpdateBody](docs/ApplicationUpdateBody.md)
 - [ApplicationUpdateBody1](docs/ApplicationUpdateBody1.md)
 - [ApplicationUpdateBody2](docs/ApplicationUpdateBody2.md)
 - [ApplicationapikeyGenerateBody](docs/ApplicationapikeyGenerateBody.md)
 - [ApplicationapikeyGenerateBody1](docs/ApplicationapikeyGenerateBody1.md)
 - [ApplicationapikeyGenerateBody2](docs/ApplicationapikeyGenerateBody2.md)
 - [ApplicationintegrationAddintegrationtoapplicationBody](docs/ApplicationintegrationAddintegrationtoapplicationBody.md)
 - [ApplicationintegrationAddintegrationtoapplicationBody1](docs/ApplicationintegrationAddintegrationtoapplicationBody1.md)
 - [ApplicationintegrationAddintegrationtoapplicationBody2](docs/ApplicationintegrationAddintegrationtoapplicationBody2.md)
 - [CallActionBodyDto](docs/CallActionBodyDto.md)
 - [CallActionDto](docs/CallActionDto.md)
 - [CallActionError](docs/CallActionError.md)
 - [CallActionErrorCodes](docs/CallActionErrorCodes.md)
 - [CallActionResponse](docs/CallActionResponse.md)
 - [CategoryDto](docs/CategoryDto.md)
 - [CategoryListDto](docs/CategoryListDto.md)
 - [CategoryListError](docs/CategoryListError.md)
 - [CategoryListRequestErrorCodes](docs/CategoryListRequestErrorCodes.md)
 - [CategoryListResponse](docs/CategoryListResponse.md)
 - [ClientErrorType](docs/ClientErrorType.md)
 - [CreateApplicationApiKeyError](docs/CreateApplicationApiKeyError.md)
 - [CreateApplicationApiKeyRequest](docs/CreateApplicationApiKeyRequest.md)
 - [CreateApplicationApiKeyRequestDto](docs/CreateApplicationApiKeyRequestDto.md)
 - [CreateApplicationApiKeyRequestErrorCodes](docs/CreateApplicationApiKeyRequestErrorCodes.md)
 - [CreateApplicationApiKeyResponse](docs/CreateApplicationApiKeyResponse.md)
 - [CreateApplicationError](docs/CreateApplicationError.md)
 - [CreateApplicationRequest](docs/CreateApplicationRequest.md)
 - [CreateApplicationRequestDto](docs/CreateApplicationRequestDto.md)
 - [CreateApplicationRequestErrorCodes](docs/CreateApplicationRequestErrorCodes.md)
 - [CreateApplicationResponse](docs/CreateApplicationResponse.md)
 - [CreateUserProfileError](docs/CreateUserProfileError.md)
 - [CreateUserProfileRequestErrorCodes](docs/CreateUserProfileRequestErrorCodes.md)
 - [CreateUserProfileResponse](docs/CreateUserProfileResponse.md)
 - [DeclineTenantInvitationError](docs/DeclineTenantInvitationError.md)
 - [DeclineTenantInvitationRequestErrorCodes](docs/DeclineTenantInvitationRequestErrorCodes.md)
 - [DeclineTenantInvitationResponse](docs/DeclineTenantInvitationResponse.md)
 - [DeleteApplicationError](docs/DeleteApplicationError.md)
 - [DeleteApplicationRequestErrorCodes](docs/DeleteApplicationRequestErrorCodes.md)
 - [DeleteApplicationResponse](docs/DeleteApplicationResponse.md)
 - [Error](docs/Error.md)
 - [GetAuthenticationTokenDto](docs/GetAuthenticationTokenDto.md)
 - [GetAuthenticationTokenError](docs/GetAuthenticationTokenError.md)
 - [GetAuthenticationTokenRequestErrorCodes](docs/GetAuthenticationTokenRequestErrorCodes.md)
 - [GetAuthenticationTokenResponse](docs/GetAuthenticationTokenResponse.md)
 - [GetOneIntegrationError](docs/GetOneIntegrationError.md)
 - [GetOneIntegrationRequestErrorCodes](docs/GetOneIntegrationRequestErrorCodes.md)
 - [GetOneIntegrationResponse](docs/GetOneIntegrationResponse.md)
 - [IntegrationDto](docs/IntegrationDto.md)
 - [IntegrationEndpointDto](docs/IntegrationEndpointDto.md)
 - [IntegrationEventDto](docs/IntegrationEventDto.md)
 - [IntegrationFieldDto](docs/IntegrationFieldDto.md)
 - [IntegrationListDto](docs/IntegrationListDto.md)
 - [IntegrationListError](docs/IntegrationListError.md)
 - [IntegrationListRequestErrorCodes](docs/IntegrationListRequestErrorCodes.md)
 - [IntegrationListResponse](docs/IntegrationListResponse.md)
 - [InvitationStatus](docs/InvitationStatus.md)
 - [InvitationStatus1](docs/InvitationStatus1.md)
 - [InviteTenantByApplicationIntegrationIdError](docs/InviteTenantByApplicationIntegrationIdError.md)
 - [InviteTenantByApplicationIntegrationIdRequest](docs/InviteTenantByApplicationIntegrationIdRequest.md)
 - [InviteTenantByApplicationIntegrationIdRequestDto](docs/InviteTenantByApplicationIntegrationIdRequestDto.md)
 - [InviteTenantByApplicationIntegrationIdResponse](docs/InviteTenantByApplicationIntegrationIdResponse.md)
 - [InviteTenantError](docs/InviteTenantError.md)
 - [InviteTenantRequest](docs/InviteTenantRequest.md)
 - [InviteTenantRequestDto](docs/InviteTenantRequestDto.md)
 - [InviteTenantRequestErrorCodes](docs/InviteTenantRequestErrorCodes.md)
 - [InviteTenantResponse](docs/InviteTenantResponse.md)
 - [OAuth2ChallengeDto](docs/OAuth2ChallengeDto.md)
 - [OAuth2ChallengeDtoResponse](docs/OAuth2ChallengeDtoResponse.md)
 - [OAuth2ChallengeTokenDto](docs/OAuth2ChallengeTokenDto.md)
 - [RefreshAuthenticationTokenDto](docs/RefreshAuthenticationTokenDto.md)
 - [RefreshAuthenticationTokenError](docs/RefreshAuthenticationTokenError.md)
 - [RefreshAuthenticationTokenRequestErrorCodes](docs/RefreshAuthenticationTokenRequestErrorCodes.md)
 - [RefreshAuthenticationTokenResponse](docs/RefreshAuthenticationTokenResponse.md)
 - [ReleaseStatus](docs/ReleaseStatus.md)
 - [Response](docs/Response.md)
 - [RevokeApplicationApiKeyError](docs/RevokeApplicationApiKeyError.md)
 - [RevokeApplicationApiKeyRequestErrorCodes](docs/RevokeApplicationApiKeyRequestErrorCodes.md)
 - [RevokeApplicationApiKeyResponse](docs/RevokeApplicationApiKeyResponse.md)
 - [TenantDto](docs/TenantDto.md)
 - [TenantInvitetenantBody](docs/TenantInvitetenantBody.md)
 - [TenantInvitetenantBody1](docs/TenantInvitetenantBody1.md)
 - [TenantInvitetenantBody2](docs/TenantInvitetenantBody2.md)
 - [TenantInvitetenantbyapplicationintegrationidBody](docs/TenantInvitetenantbyapplicationintegrationidBody.md)
 - [TenantInvitetenantbyapplicationintegrationidBody1](docs/TenantInvitetenantbyapplicationintegrationidBody1.md)
 - [TenantInvitetenantbyapplicationintegrationidBody2](docs/TenantInvitetenantbyapplicationintegrationidBody2.md)
 - [TenantListDto](docs/TenantListDto.md)
 - [TenantUpdatetenantconnectionBody](docs/TenantUpdatetenantconnectionBody.md)
 - [TenantUpdatetenantconnectionBody1](docs/TenantUpdatetenantconnectionBody1.md)
 - [TenantUpdatetenantconnectionBody2](docs/TenantUpdatetenantconnectionBody2.md)
 - [UnifiedContact](docs/UnifiedContact.md)
 - [UnifiedContactResponse](docs/UnifiedContactResponse.md)
 - [UnifiedContactsList](docs/UnifiedContactsList.md)
 - [UnifiedContactsListResponse](docs/UnifiedContactsListResponse.md)
 - [UpdateApplicationError](docs/UpdateApplicationError.md)
 - [UpdateApplicationRequest](docs/UpdateApplicationRequest.md)
 - [UpdateApplicationRequestDto](docs/UpdateApplicationRequestDto.md)
 - [UpdateApplicationRequestErrorCodes](docs/UpdateApplicationRequestErrorCodes.md)
 - [UpdateApplicationResponse](docs/UpdateApplicationResponse.md)
 - [UpdateTenantConnectionError](docs/UpdateTenantConnectionError.md)
 - [UpdateTenantConnectionRequest](docs/UpdateTenantConnectionRequest.md)
 - [UpdateTenantConnectionRequestDto](docs/UpdateTenantConnectionRequestDto.md)
 - [UpdateTenantConnectionRequestErrorCodes](docs/UpdateTenantConnectionRequestErrorCodes.md)
 - [UpdateTenantConnectionResponse](docs/UpdateTenantConnectionResponse.md)
 - [UserApplicationListError](docs/UserApplicationListError.md)
 - [UserApplicationListRequestErrorCodes](docs/UserApplicationListRequestErrorCodes.md)
 - [UserApplicationListResponse](docs/UserApplicationListResponse.md)
 - [UserDto](docs/UserDto.md)
 - [UserProfileStatisticsDto](docs/UserProfileStatisticsDto.md)
 - [UserProfileStatisticsError](docs/UserProfileStatisticsError.md)
 - [UserProfileStatisticsErrorCodes](docs/UserProfileStatisticsErrorCodes.md)
 - [UserProfileStatisticsResponse](docs/UserProfileStatisticsResponse.md)
 - [UserTenantListError](docs/UserTenantListError.md)
 - [UserTenantListRequestErrorCodes](docs/UserTenantListRequestErrorCodes.md)
 - [UserTenantListResponse](docs/UserTenantListResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


