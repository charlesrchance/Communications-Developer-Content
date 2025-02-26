/**
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import GeoBatchLog from '../model/GeoBatchLog';
import GeoBatchStatus from '../model/GeoBatchStatus';
import GeoBatchSubmitFileResponse from '../model/GeoBatchSubmitFileResponse';
import GeocodeRequest from '../model/GeocodeRequest';
import GeocodeResult from '../model/GeocodeResult';
import PCodeLookupRequest from '../model/PCodeLookupRequest';
import PCodeLookupResult from '../model/PCodeLookupResult';

/**
* JurisdictionDetermination service.
* @module api/JurisdictionDeterminationApi
* @version v2
*/
export default class JurisdictionDeterminationApi {

    /**
    * Constructs a new JurisdictionDeterminationApi. 
    * @alias module:api/JurisdictionDeterminationApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the apiV2AfcPCodePost operation.
     * @callback module:api/JurisdictionDeterminationApi~apiV2AfcPCodePostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PCodeLookupResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips.
     * Requests supports using best match or exact match as well as limiting the number of matches returned. Use a * on the end of Fips/Npanxx Codes to find a range of values.
     * @param {Object} opts Optional parameters
     * @param {module:model/PCodeLookupRequest} opts.pCodeLookupRequest 
     * @param {module:api/JurisdictionDeterminationApi~apiV2AfcPCodePostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PCodeLookupResult}
     */
    apiV2AfcPCodePost(opts, callback) {
      opts = opts || {};
      let postBody = opts['pCodeLookupRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Basic'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = PCodeLookupResult;
      return this.apiClient.callApi(
        '/api/v2/afc/PCode', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiV2GeoBatchLogProcessIdGet operation.
     * @callback module:api/JurisdictionDeterminationApi~apiV2GeoBatchLogProcessIdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GeoBatchLog} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves log on Geo Batch file
     * @param {String} processId Process Id for Geo Batch File.
     * @param {module:api/JurisdictionDeterminationApi~apiV2GeoBatchLogProcessIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GeoBatchLog}
     */
    apiV2GeoBatchLogProcessIdGet(processId, callback) {
      let postBody = null;
      // verify the required parameter 'processId' is set
      if (processId === undefined || processId === null) {
        throw new Error("Missing the required parameter 'processId' when calling apiV2GeoBatchLogProcessIdGet");
      }

      let pathParams = {
        'processId': processId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Basic'];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = GeoBatchLog;
      return this.apiClient.callApi(
        '/api/v2/geo/batch/log/{processId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiV2GeoBatchStatusProcessIdGet operation.
     * @callback module:api/JurisdictionDeterminationApi~apiV2GeoBatchStatusProcessIdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GeoBatchStatus} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves information on Geo Batch file status
     * @param {String} processId Process Id for Geo Batch File.
     * @param {module:api/JurisdictionDeterminationApi~apiV2GeoBatchStatusProcessIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GeoBatchStatus}
     */
    apiV2GeoBatchStatusProcessIdGet(processId, callback) {
      let postBody = null;
      // verify the required parameter 'processId' is set
      if (processId === undefined || processId === null) {
        throw new Error("Missing the required parameter 'processId' when calling apiV2GeoBatchStatusProcessIdGet");
      }

      let pathParams = {
        'processId': processId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Basic'];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = GeoBatchStatus;
      return this.apiClient.callApi(
        '/api/v2/geo/batch/status/{processId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiV2GeoBatchUploadPost operation.
     * @callback module:api/JurisdictionDeterminationApi~apiV2GeoBatchUploadPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GeoBatchSubmitFileResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads file to Geo Batch.
     * @param {Object} opts Optional parameters
     * @param {File} opts.geoBatchFile 
     * @param {module:api/JurisdictionDeterminationApi~apiV2GeoBatchUploadPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GeoBatchSubmitFileResponse}
     */
    apiV2GeoBatchUploadPost(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'geoBatchFile': opts['geoBatchFile']
      };

      let authNames = ['Basic'];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = GeoBatchSubmitFileResponse;
      return this.apiClient.callApi(
        '/api/v2/geo/batch/Upload', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiV2GeoGeocodePost operation.
     * @callback module:api/JurisdictionDeterminationApi~apiV2GeoGeocodePostCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/GeocodeResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Geocodes one or multiple street addresses and/or lat/long coordinate pairs.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/GeocodeRequest>} opts.geocodeRequest List of street addresses and/or lat/long coordinate pairs to geocode.
     * @param {module:api/JurisdictionDeterminationApi~apiV2GeoGeocodePostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/GeocodeResult>}
     */
    apiV2GeoGeocodePost(opts, callback) {
      opts = opts || {};
      let postBody = opts['geocodeRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Basic'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [GeocodeResult];
      return this.apiClient.callApi(
        '/api/v2/geo/Geocode', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
