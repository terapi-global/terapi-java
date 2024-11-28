# StatisticsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statisticsUserProfileGet**](StatisticsApi.md#statisticsUserProfileGet) | **GET** /statistics/user-profile | 14_997

<a name="statisticsUserProfileGet"></a>
# **statisticsUserProfileGet**
> UserProfileStatisticsResponse statisticsUserProfileGet()

14_997

### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 14_997_101 | UserNotFound | User not found. |  | 14_997_102 | UserDoesNotHaveActiveSubscription | User does not have an active subscription. |  | 14_997_103 | UnknownExceptionWhenFetchUserProfileStatistics | Unknown exception when fetching user profile statistics. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


StatisticsApi apiInstance = new StatisticsApi();
try {
    UserProfileStatisticsResponse result = apiInstance.statisticsUserProfileGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#statisticsUserProfileGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfileStatisticsResponse**](UserProfileStatisticsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

