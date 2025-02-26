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

import ApiClient from '../ApiClient';

/**
 * The ExclusionConfig model module.
 * @module model/ExclusionConfig
 * @version v2
 */
class ExclusionConfig {
    /**
     * Constructs a new <code>ExclusionConfig</code>.
     * Settings associated with a client profile exclusions  Maybe associated with 0 to many profiles
     * @alias module:model/ExclusionConfig
     */
    constructor() { 
        
        ExclusionConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ExclusionConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ExclusionConfig} obj Optional instance to populate.
     * @return {module:model/ExclusionConfig} The populated <code>ExclusionConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ExclusionConfig();

            if (data.hasOwnProperty('CountryIso')) {
                obj['CountryIso'] = ApiClient.convertToType(data['CountryIso'], 'String');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = ApiClient.convertToType(data['State'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Country ISO value
 * @member {String} CountryIso
 */
ExclusionConfig.prototype['CountryIso'] = undefined;

/**
 * State abbreviation
 * @member {String} State
 */
ExclusionConfig.prototype['State'] = undefined;






export default ExclusionConfig;

