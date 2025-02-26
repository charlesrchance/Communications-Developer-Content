/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import org.openapitools.client.model.GeoBatchLog;
import org.openapitools.client.model.GeoBatchStatus;
import org.openapitools.client.model.GeoBatchSubmitFileResponse;
import org.openapitools.client.model.GeocodeRequest;
import org.openapitools.client.model.GeocodeResult;
import org.openapitools.client.model.PCodeLookupRequest;
import org.openapitools.client.model.PCodeLookupResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JurisdictionDeterminationApi {
    private ApiClient localVarApiClient;

    public JurisdictionDeterminationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JurisdictionDeterminationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for apiV2AfcPCodePost
     * @param pcodeLookupRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcPCodePostCall(PCodeLookupRequest pcodeLookupRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = pcodeLookupRequest;

        // create path and map variables
        String localVarPath = "/api/v2/afc/PCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AfcPCodePostValidateBeforeCall(PCodeLookupRequest pcodeLookupRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2AfcPCodePostCall(pcodeLookupRequest, _callback);
        return localVarCall;

    }

    /**
     * Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips.
     * Requests supports using best match or exact match as well as limiting the number of matches returned. Use a * on the end of Fips/Npanxx Codes to find a range of values.
     * @param pcodeLookupRequest  (optional)
     * @return PCodeLookupResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PCodeLookupResult apiV2AfcPCodePost(PCodeLookupRequest pcodeLookupRequest) throws ApiException {
        ApiResponse<PCodeLookupResult> localVarResp = apiV2AfcPCodePostWithHttpInfo(pcodeLookupRequest);
        return localVarResp.getData();
    }

    /**
     * Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips.
     * Requests supports using best match or exact match as well as limiting the number of matches returned. Use a * on the end of Fips/Npanxx Codes to find a range of values.
     * @param pcodeLookupRequest  (optional)
     * @return ApiResponse&lt;PCodeLookupResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PCodeLookupResult> apiV2AfcPCodePostWithHttpInfo(PCodeLookupRequest pcodeLookupRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2AfcPCodePostValidateBeforeCall(pcodeLookupRequest, null);
        Type localVarReturnType = new TypeToken<PCodeLookupResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips. (asynchronously)
     * Requests supports using best match or exact match as well as limiting the number of matches returned. Use a * on the end of Fips/Npanxx Codes to find a range of values.
     * @param pcodeLookupRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcPCodePostAsync(PCodeLookupRequest pcodeLookupRequest, final ApiCallback<PCodeLookupResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AfcPCodePostValidateBeforeCall(pcodeLookupRequest, _callback);
        Type localVarReturnType = new TypeToken<PCodeLookupResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2GeoBatchLogProcessIdGet
     * @param processId Process Id for Geo Batch File. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchLogProcessIdGetCall(String processId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/geo/batch/log/{processId}"
            .replaceAll("\\{" + "processId" + "\\}", localVarApiClient.escapeString(processId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2GeoBatchLogProcessIdGetValidateBeforeCall(String processId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling apiV2GeoBatchLogProcessIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = apiV2GeoBatchLogProcessIdGetCall(processId, _callback);
        return localVarCall;

    }

    /**
     * Retrieves log on Geo Batch file
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @return GeoBatchLog
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GeoBatchLog apiV2GeoBatchLogProcessIdGet(String processId) throws ApiException {
        ApiResponse<GeoBatchLog> localVarResp = apiV2GeoBatchLogProcessIdGetWithHttpInfo(processId);
        return localVarResp.getData();
    }

    /**
     * Retrieves log on Geo Batch file
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @return ApiResponse&lt;GeoBatchLog&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeoBatchLog> apiV2GeoBatchLogProcessIdGetWithHttpInfo(String processId) throws ApiException {
        okhttp3.Call localVarCall = apiV2GeoBatchLogProcessIdGetValidateBeforeCall(processId, null);
        Type localVarReturnType = new TypeToken<GeoBatchLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves log on Geo Batch file (asynchronously)
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchLogProcessIdGetAsync(String processId, final ApiCallback<GeoBatchLog> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2GeoBatchLogProcessIdGetValidateBeforeCall(processId, _callback);
        Type localVarReturnType = new TypeToken<GeoBatchLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2GeoBatchStatusProcessIdGet
     * @param processId Process Id for Geo Batch File. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchStatusProcessIdGetCall(String processId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/geo/batch/status/{processId}"
            .replaceAll("\\{" + "processId" + "\\}", localVarApiClient.escapeString(processId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2GeoBatchStatusProcessIdGetValidateBeforeCall(String processId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling apiV2GeoBatchStatusProcessIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = apiV2GeoBatchStatusProcessIdGetCall(processId, _callback);
        return localVarCall;

    }

    /**
     * Retrieves information on Geo Batch file status
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @return GeoBatchStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GeoBatchStatus apiV2GeoBatchStatusProcessIdGet(String processId) throws ApiException {
        ApiResponse<GeoBatchStatus> localVarResp = apiV2GeoBatchStatusProcessIdGetWithHttpInfo(processId);
        return localVarResp.getData();
    }

    /**
     * Retrieves information on Geo Batch file status
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @return ApiResponse&lt;GeoBatchStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeoBatchStatus> apiV2GeoBatchStatusProcessIdGetWithHttpInfo(String processId) throws ApiException {
        okhttp3.Call localVarCall = apiV2GeoBatchStatusProcessIdGetValidateBeforeCall(processId, null);
        Type localVarReturnType = new TypeToken<GeoBatchStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves information on Geo Batch file status (asynchronously)
     * 
     * @param processId Process Id for Geo Batch File. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchStatusProcessIdGetAsync(String processId, final ApiCallback<GeoBatchStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2GeoBatchStatusProcessIdGetValidateBeforeCall(processId, _callback);
        Type localVarReturnType = new TypeToken<GeoBatchStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2GeoBatchUploadPost
     * @param geoBatchFile  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchUploadPostCall(File geoBatchFile, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/geo/batch/Upload";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (geoBatchFile != null) {
            localVarFormParams.put("geoBatchFile", geoBatchFile);
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2GeoBatchUploadPostValidateBeforeCall(File geoBatchFile, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2GeoBatchUploadPostCall(geoBatchFile, _callback);
        return localVarCall;

    }

    /**
     * Uploads file to Geo Batch.
     * 
     * @param geoBatchFile  (optional)
     * @return GeoBatchSubmitFileResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GeoBatchSubmitFileResponse apiV2GeoBatchUploadPost(File geoBatchFile) throws ApiException {
        ApiResponse<GeoBatchSubmitFileResponse> localVarResp = apiV2GeoBatchUploadPostWithHttpInfo(geoBatchFile);
        return localVarResp.getData();
    }

    /**
     * Uploads file to Geo Batch.
     * 
     * @param geoBatchFile  (optional)
     * @return ApiResponse&lt;GeoBatchSubmitFileResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeoBatchSubmitFileResponse> apiV2GeoBatchUploadPostWithHttpInfo(File geoBatchFile) throws ApiException {
        okhttp3.Call localVarCall = apiV2GeoBatchUploadPostValidateBeforeCall(geoBatchFile, null);
        Type localVarReturnType = new TypeToken<GeoBatchSubmitFileResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Uploads file to Geo Batch. (asynchronously)
     * 
     * @param geoBatchFile  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoBatchUploadPostAsync(File geoBatchFile, final ApiCallback<GeoBatchSubmitFileResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2GeoBatchUploadPostValidateBeforeCall(geoBatchFile, _callback);
        Type localVarReturnType = new TypeToken<GeoBatchSubmitFileResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2GeoGeocodePost
     * @param geocodeRequest List of street addresses and/or lat/long coordinate pairs to geocode. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoGeocodePostCall(List<GeocodeRequest> geocodeRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = geocodeRequest;

        // create path and map variables
        String localVarPath = "/api/v2/geo/Geocode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2GeoGeocodePostValidateBeforeCall(List<GeocodeRequest> geocodeRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2GeoGeocodePostCall(geocodeRequest, _callback);
        return localVarCall;

    }

    /**
     * Geocodes one or multiple street addresses and/or lat/long coordinate pairs.
     * 
     * @param geocodeRequest List of street addresses and/or lat/long coordinate pairs to geocode. (optional)
     * @return List&lt;GeocodeResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<GeocodeResult> apiV2GeoGeocodePost(List<GeocodeRequest> geocodeRequest) throws ApiException {
        ApiResponse<List<GeocodeResult>> localVarResp = apiV2GeoGeocodePostWithHttpInfo(geocodeRequest);
        return localVarResp.getData();
    }

    /**
     * Geocodes one or multiple street addresses and/or lat/long coordinate pairs.
     * 
     * @param geocodeRequest List of street addresses and/or lat/long coordinate pairs to geocode. (optional)
     * @return ApiResponse&lt;List&lt;GeocodeResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GeocodeResult>> apiV2GeoGeocodePostWithHttpInfo(List<GeocodeRequest> geocodeRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2GeoGeocodePostValidateBeforeCall(geocodeRequest, null);
        Type localVarReturnType = new TypeToken<List<GeocodeResult>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Geocodes one or multiple street addresses and/or lat/long coordinate pairs. (asynchronously)
     * 
     * @param geocodeRequest List of street addresses and/or lat/long coordinate pairs to geocode. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2GeoGeocodePostAsync(List<GeocodeRequest> geocodeRequest, final ApiCallback<List<GeocodeResult>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2GeoGeocodePostValidateBeforeCall(geocodeRequest, _callback);
        Type localVarReturnType = new TypeToken<List<GeocodeResult>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
