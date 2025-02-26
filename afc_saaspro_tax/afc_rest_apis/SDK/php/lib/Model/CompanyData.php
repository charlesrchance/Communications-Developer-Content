<?php
/**
 * CompanyData
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * CompanyData Class Doc Comment
 *
 * @category Class
 * @description Container class for json properties associated with v2.CalcTaxes company data
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class CompanyData implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CompanyData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'bscl' => 'int',
        'svcl' => 'int',
        'fclt' => 'bool',
        'frch' => 'bool',
        'reg' => 'bool',
        'excl' => '\OpenAPI\Client\Model\Exclusion[]',
        'idnt' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'bscl' => 'int32',
        'svcl' => 'int32',
        'fclt' => null,
        'frch' => null,
        'reg' => null,
        'excl' => null,
        'idnt' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'bscl' => 'bscl',
        'svcl' => 'svcl',
        'fclt' => 'fclt',
        'frch' => 'frch',
        'reg' => 'reg',
        'excl' => 'excl',
        'idnt' => 'idnt'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'bscl' => 'setBscl',
        'svcl' => 'setSvcl',
        'fclt' => 'setFclt',
        'frch' => 'setFrch',
        'reg' => 'setReg',
        'excl' => 'setExcl',
        'idnt' => 'setIdnt'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'bscl' => 'getBscl',
        'svcl' => 'getSvcl',
        'fclt' => 'getFclt',
        'frch' => 'getFrch',
        'reg' => 'getReg',
        'excl' => 'getExcl',
        'idnt' => 'getIdnt'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['bscl'] = isset($data['bscl']) ? $data['bscl'] : null;
        $this->container['svcl'] = isset($data['svcl']) ? $data['svcl'] : null;
        $this->container['fclt'] = isset($data['fclt']) ? $data['fclt'] : null;
        $this->container['frch'] = isset($data['frch']) ? $data['frch'] : null;
        $this->container['reg'] = isset($data['reg']) ? $data['reg'] : null;
        $this->container['excl'] = isset($data['excl']) ? $data['excl'] : null;
        $this->container['idnt'] = isset($data['idnt']) ? $data['idnt'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets bscl
     *
     * @return int|null
     */
    public function getBscl()
    {
        return $this->container['bscl'];
    }

    /**
     * Sets bscl
     *
     * @param int|null $bscl Business class. 0 = ILEC, 1 = CLEC.
     *
     * @return $this
     */
    public function setBscl($bscl)
    {
        $this->container['bscl'] = $bscl;

        return $this;
    }

    /**
     * Gets svcl
     *
     * @return int|null
     */
    public function getSvcl()
    {
        return $this->container['svcl'];
    }

    /**
     * Sets svcl
     *
     * @param int|null $svcl Service class. 0 = Primary Local, 1 = Primary Long Distance.
     *
     * @return $this
     */
    public function setSvcl($svcl)
    {
        $this->container['svcl'] = $svcl;

        return $this;
    }

    /**
     * Gets fclt
     *
     * @return bool|null
     */
    public function getFclt()
    {
        return $this->container['fclt'];
    }

    /**
     * Sets fclt
     *
     * @param bool|null $fclt Specifies if the carrier delivering the service has company owned facilities to provide the service.
     *
     * @return $this
     */
    public function setFclt($fclt)
    {
        $this->container['fclt'] = $fclt;

        return $this;
    }

    /**
     * Gets frch
     *
     * @return bool|null
     */
    public function getFrch()
    {
        return $this->container['frch'];
    }

    /**
     * Sets frch
     *
     * @param bool|null $frch Indicates if the company provides services sold pursuant to a franchise agreement between the carrier and jurisdiction.
     *
     * @return $this
     */
    public function setFrch($frch)
    {
        $this->container['frch'] = $frch;

        return $this;
    }

    /**
     * Gets reg
     *
     * @return bool|null
     */
    public function getReg()
    {
        return $this->container['reg'];
    }

    /**
     * Sets reg
     *
     * @param bool|null $reg Indicates if company is regulated.
     *
     * @return $this
     */
    public function setReg($reg)
    {
        $this->container['reg'] = $reg;

        return $this;
    }

    /**
     * Gets excl
     *
     * @return \OpenAPI\Client\Model\Exclusion[]|null
     */
    public function getExcl()
    {
        return $this->container['excl'];
    }

    /**
     * Sets excl
     *
     * @param \OpenAPI\Client\Model\Exclusion[]|null $excl Exclusion list.
     *
     * @return $this
     */
    public function setExcl($excl)
    {
        $this->container['excl'] = $excl;

        return $this;
    }

    /**
     * Gets idnt
     *
     * @return string|null
     */
    public function getIdnt()
    {
        return $this->container['idnt'];
    }

    /**
     * Sets idnt
     *
     * @param string|null $idnt An optional company identifier for reporting
     *
     * @return $this
     */
    public function setIdnt($idnt)
    {
        $this->container['idnt'] = $idnt;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


