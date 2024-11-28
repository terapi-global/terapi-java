package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ApiproxyEndpointBody;
import io.swagger.client.model.ApiproxyEndpointBody1;
import io.swagger.client.model.ApiproxyEndpointBody10;
import io.swagger.client.model.ApiproxyEndpointBody11;
import io.swagger.client.model.ApiproxyEndpointBody2;
import io.swagger.client.model.ApiproxyEndpointBody3;
import io.swagger.client.model.ApiproxyEndpointBody4;
import io.swagger.client.model.ApiproxyEndpointBody5;
import io.swagger.client.model.ApiproxyEndpointBody6;
import io.swagger.client.model.ApiproxyEndpointBody7;
import io.swagger.client.model.ApiproxyEndpointBody8;
import io.swagger.client.model.ApiproxyEndpointBody9;
import io.swagger.client.model.CallActionResponse;
import io.swagger.client.model.OAuth2ChallengeDtoResponse;
import java.util.UUID;
import io.swagger.client.model.UnifiedContactResponse;
import io.swagger.client.model.UnifiedContactsListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiProxyApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ApiProxyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiProxyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for apiProxyEndpointDelete
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointDeleteCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody6 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api-proxy/{endpoint}"
            .replaceAll("\\{" + "integrationName" + "\\}", apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "endpoint" + "\\}", apiClient.escapeString(endpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenantId != null)
        localVarHeaderParams.put("X-Tenant-Id", apiClient.parameterToString(xTenantId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyEndpointDeleteValidateBeforeCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody6 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenantId' is set
        if (xTenantId == null) {
            throw new ApiException("Missing the required parameter 'xTenantId' when calling apiProxyEndpointDelete(Async)");
        }
        // verify the required parameter 'integrationName' is set
        if (integrationName == null) {
            throw new ApiException("Missing the required parameter 'integrationName' when calling apiProxyEndpointDelete(Async)");
        }
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new ApiException("Missing the required parameter 'endpoint' when calling apiProxyEndpointDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyEndpointDeleteCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return CallActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallActionResponse apiProxyEndpointDelete(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody6 body) throws ApiException {
        ApiResponse<CallActionResponse> resp = apiProxyEndpointDeleteWithHttpInfo(xTenantId, integrationName, endpoint, body);
        return resp.getData();
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CallActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallActionResponse> apiProxyEndpointDeleteWithHttpInfo(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody6 body) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyEndpointDeleteValidateBeforeCall(xTenantId, integrationName, endpoint, body, null, null);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 21_997 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointDeleteAsync(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody6 body, final ApiCallback<CallActionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyEndpointDeleteValidateBeforeCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyEndpointGet
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param xTenantId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointGetCall(String integrationName, String endpoint, UUID xTenantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api-proxy/{endpoint}"
            .replaceAll("\\{" + "integrationName" + "\\}", apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "endpoint" + "\\}", apiClient.escapeString(endpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenantId != null)
        localVarHeaderParams.put("X-Tenant-Id", apiClient.parameterToString(xTenantId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyEndpointGetValidateBeforeCall(String integrationName, String endpoint, UUID xTenantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'integrationName' is set
        if (integrationName == null) {
            throw new ApiException("Missing the required parameter 'integrationName' when calling apiProxyEndpointGet(Async)");
        }
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new ApiException("Missing the required parameter 'endpoint' when calling apiProxyEndpointGet(Async)");
        }
        // verify the required parameter 'xTenantId' is set
        if (xTenantId == null) {
            throw new ApiException("Missing the required parameter 'xTenantId' when calling apiProxyEndpointGet(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyEndpointGetCall(integrationName, endpoint, xTenantId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param xTenantId  (required)
     * @return CallActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallActionResponse apiProxyEndpointGet(String integrationName, String endpoint, UUID xTenantId) throws ApiException {
        ApiResponse<CallActionResponse> resp = apiProxyEndpointGetWithHttpInfo(integrationName, endpoint, xTenantId);
        return resp.getData();
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param xTenantId  (required)
     * @return ApiResponse&lt;CallActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallActionResponse> apiProxyEndpointGetWithHttpInfo(String integrationName, String endpoint, UUID xTenantId) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyEndpointGetValidateBeforeCall(integrationName, endpoint, xTenantId, null, null);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 21_997 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param xTenantId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointGetAsync(String integrationName, String endpoint, UUID xTenantId, final ApiCallback<CallActionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyEndpointGetValidateBeforeCall(integrationName, endpoint, xTenantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyEndpointPatch
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPatchCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody9 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api-proxy/{endpoint}"
            .replaceAll("\\{" + "integrationName" + "\\}", apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "endpoint" + "\\}", apiClient.escapeString(endpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenantId != null)
        localVarHeaderParams.put("X-Tenant-Id", apiClient.parameterToString(xTenantId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyEndpointPatchValidateBeforeCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody9 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenantId' is set
        if (xTenantId == null) {
            throw new ApiException("Missing the required parameter 'xTenantId' when calling apiProxyEndpointPatch(Async)");
        }
        // verify the required parameter 'integrationName' is set
        if (integrationName == null) {
            throw new ApiException("Missing the required parameter 'integrationName' when calling apiProxyEndpointPatch(Async)");
        }
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new ApiException("Missing the required parameter 'endpoint' when calling apiProxyEndpointPatch(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyEndpointPatchCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return CallActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallActionResponse apiProxyEndpointPatch(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody9 body) throws ApiException {
        ApiResponse<CallActionResponse> resp = apiProxyEndpointPatchWithHttpInfo(xTenantId, integrationName, endpoint, body);
        return resp.getData();
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CallActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallActionResponse> apiProxyEndpointPatchWithHttpInfo(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody9 body) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyEndpointPatchValidateBeforeCall(xTenantId, integrationName, endpoint, body, null, null);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 21_997 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPatchAsync(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody9 body, final ApiCallback<CallActionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyEndpointPatchValidateBeforeCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyEndpointPost
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPostCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api-proxy/{endpoint}"
            .replaceAll("\\{" + "integrationName" + "\\}", apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "endpoint" + "\\}", apiClient.escapeString(endpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenantId != null)
        localVarHeaderParams.put("X-Tenant-Id", apiClient.parameterToString(xTenantId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyEndpointPostValidateBeforeCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenantId' is set
        if (xTenantId == null) {
            throw new ApiException("Missing the required parameter 'xTenantId' when calling apiProxyEndpointPost(Async)");
        }
        // verify the required parameter 'integrationName' is set
        if (integrationName == null) {
            throw new ApiException("Missing the required parameter 'integrationName' when calling apiProxyEndpointPost(Async)");
        }
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new ApiException("Missing the required parameter 'endpoint' when calling apiProxyEndpointPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyEndpointPostCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return CallActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallActionResponse apiProxyEndpointPost(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody3 body) throws ApiException {
        ApiResponse<CallActionResponse> resp = apiProxyEndpointPostWithHttpInfo(xTenantId, integrationName, endpoint, body);
        return resp.getData();
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CallActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallActionResponse> apiProxyEndpointPostWithHttpInfo(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody3 body) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyEndpointPostValidateBeforeCall(xTenantId, integrationName, endpoint, body, null, null);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 21_997 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPostAsync(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody3 body, final ApiCallback<CallActionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyEndpointPostValidateBeforeCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyEndpointPut
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPutCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api-proxy/{endpoint}"
            .replaceAll("\\{" + "integrationName" + "\\}", apiClient.escapeString(integrationName.toString()))
            .replaceAll("\\{" + "endpoint" + "\\}", apiClient.escapeString(endpoint.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenantId != null)
        localVarHeaderParams.put("X-Tenant-Id", apiClient.parameterToString(xTenantId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyEndpointPutValidateBeforeCall(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenantId' is set
        if (xTenantId == null) {
            throw new ApiException("Missing the required parameter 'xTenantId' when calling apiProxyEndpointPut(Async)");
        }
        // verify the required parameter 'integrationName' is set
        if (integrationName == null) {
            throw new ApiException("Missing the required parameter 'integrationName' when calling apiProxyEndpointPut(Async)");
        }
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new ApiException("Missing the required parameter 'endpoint' when calling apiProxyEndpointPut(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyEndpointPutCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return CallActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallActionResponse apiProxyEndpointPut(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody body) throws ApiException {
        ApiResponse<CallActionResponse> resp = apiProxyEndpointPutWithHttpInfo(xTenantId, integrationName, endpoint, body);
        return resp.getData();
    }

    /**
     * 21_997
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CallActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallActionResponse> apiProxyEndpointPutWithHttpInfo(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody body) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyEndpointPutValidateBeforeCall(xTenantId, integrationName, endpoint, body, null, null);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 21_997 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 21_997_101 | TenantNotFound |  |  | 21_997_102 | IntegrationNotFound |  |  | 21_997_103 | UnknownExceptionWhenCallingThirdPartyApi |  |  | 21_997_104 | UnknownExceptionWhenCallAction |  |  | 21_997_105 | IntegrationIsNotEnabled |  |
     * @param xTenantId  (required)
     * @param integrationName  (required)
     * @param endpoint  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyEndpointPutAsync(UUID xTenantId, String integrationName, String endpoint, ApiproxyEndpointBody body, final ApiCallback<CallActionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyEndpointPutValidateBeforeCall(xTenantId, integrationName, endpoint, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyOauth2ChallengeGet
     * @param tenantId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyOauth2ChallengeGetCall(UUID tenantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api-proxy/oauth2/challenge";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyOauth2ChallengeGetValidateBeforeCall(UUID tenantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiProxyOauth2ChallengeGetCall(tenantId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param tenantId  (optional)
     * @return OAuth2ChallengeDtoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OAuth2ChallengeDtoResponse apiProxyOauth2ChallengeGet(UUID tenantId) throws ApiException {
        ApiResponse<OAuth2ChallengeDtoResponse> resp = apiProxyOauth2ChallengeGetWithHttpInfo(tenantId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param tenantId  (optional)
     * @return ApiResponse&lt;OAuth2ChallengeDtoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OAuth2ChallengeDtoResponse> apiProxyOauth2ChallengeGetWithHttpInfo(UUID tenantId) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyOauth2ChallengeGetValidateBeforeCall(tenantId, null, null);
        Type localVarReturnType = new TypeToken<OAuth2ChallengeDtoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyOauth2ChallengeGetAsync(UUID tenantId, final ApiCallback<OAuth2ChallengeDtoResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyOauth2ChallengeGetValidateBeforeCall(tenantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OAuth2ChallengeDtoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyUnifiedContactsExternalIdGet
     * @param externalId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyUnifiedContactsExternalIdGetCall(String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api-proxy/unified/contacts/{externalId}"
            .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyUnifiedContactsExternalIdGetValidateBeforeCall(String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new ApiException("Missing the required parameter 'externalId' when calling apiProxyUnifiedContactsExternalIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = apiProxyUnifiedContactsExternalIdGetCall(externalId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param externalId  (required)
     * @return UnifiedContactResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UnifiedContactResponse apiProxyUnifiedContactsExternalIdGet(String externalId) throws ApiException {
        ApiResponse<UnifiedContactResponse> resp = apiProxyUnifiedContactsExternalIdGetWithHttpInfo(externalId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param externalId  (required)
     * @return ApiResponse&lt;UnifiedContactResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UnifiedContactResponse> apiProxyUnifiedContactsExternalIdGetWithHttpInfo(String externalId) throws ApiException {
        com.squareup.okhttp.Call call = apiProxyUnifiedContactsExternalIdGetValidateBeforeCall(externalId, null, null);
        Type localVarReturnType = new TypeToken<UnifiedContactResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param externalId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyUnifiedContactsExternalIdGetAsync(String externalId, final ApiCallback<UnifiedContactResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyUnifiedContactsExternalIdGetValidateBeforeCall(externalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UnifiedContactResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiProxyUnifiedContactsGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiProxyUnifiedContactsGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api-proxy/unified/contacts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiProxyUnifiedContactsGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiProxyUnifiedContactsGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @return UnifiedContactsListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UnifiedContactsListResponse apiProxyUnifiedContactsGet() throws ApiException {
        ApiResponse<UnifiedContactsListResponse> resp = apiProxyUnifiedContactsGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * 
     * @return ApiResponse&lt;UnifiedContactsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UnifiedContactsListResponse> apiProxyUnifiedContactsGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = apiProxyUnifiedContactsGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<UnifiedContactsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiProxyUnifiedContactsGetAsync(final ApiCallback<UnifiedContactsListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiProxyUnifiedContactsGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UnifiedContactsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
