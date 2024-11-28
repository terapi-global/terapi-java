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


import io.swagger.client.model.CategoryListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public CategoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoryApi(ApiClient apiClient) {
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
     * Build call for categoryListGet
     * @param page  (optional)
     * @param perPage  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call categoryListGetCall(Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/category/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PerPage", perPage));

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
    private com.squareup.okhttp.Call categoryListGetValidateBeforeCall(Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = categoryListGetCall(page, perPage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 19_999
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 19_999_101 | UnknownExceptionWhenTryingFetchCategories | Unknown exception when fetching category. |
     * @param page  (optional)
     * @param perPage  (optional)
     * @return CategoryListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryListResponse categoryListGet(Integer page, Integer perPage) throws ApiException {
        ApiResponse<CategoryListResponse> resp = categoryListGetWithHttpInfo(page, perPage);
        return resp.getData();
    }

    /**
     * 19_999
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 19_999_101 | UnknownExceptionWhenTryingFetchCategories | Unknown exception when fetching category. |
     * @param page  (optional)
     * @param perPage  (optional)
     * @return ApiResponse&lt;CategoryListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryListResponse> categoryListGetWithHttpInfo(Integer page, Integer perPage) throws ApiException {
        com.squareup.okhttp.Call call = categoryListGetValidateBeforeCall(page, perPage, null, null);
        Type localVarReturnType = new TypeToken<CategoryListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 19_999 (asynchronously)
     * ### Error Codes  | Code | Name | Message |  | :--- | :--- | :--- |  | 19_999_101 | UnknownExceptionWhenTryingFetchCategories | Unknown exception when fetching category. |
     * @param page  (optional)
     * @param perPage  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call categoryListGetAsync(Integer page, Integer perPage, final ApiCallback<CategoryListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = categoryListGetValidateBeforeCall(page, perPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
