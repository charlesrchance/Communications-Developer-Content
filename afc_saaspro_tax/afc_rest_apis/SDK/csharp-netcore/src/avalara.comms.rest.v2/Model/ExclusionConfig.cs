/*
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.<br /><br />Effective January 1st, 2022 all Avalara products will be enforcing TLS 1.2 server-side. Please ensure that your implementation sets a minimal of TLS 1.2 encryption when making web requests to Avalara APIs.
 *
 * The version of the OpenAPI document: v2
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = avalara.comms.rest.v2.Client.OpenAPIDateConverter;

namespace avalara.comms.rest.v2.Model
{
    /// <summary>
    /// Settings associated with a client profile exclusions  Maybe associated with 0 to many profiles
    /// </summary>
    [DataContract(Name = "ExclusionConfig")]
    public partial class ExclusionConfig : IEquatable<ExclusionConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExclusionConfig" /> class.
        /// </summary>
        /// <param name="countryIso">Country ISO value.</param>
        /// <param name="state">State abbreviation.</param>
        public ExclusionConfig(string countryIso = default(string), string state = default(string))
        {
            this.CountryIso = countryIso;
            this.State = state;
        }

        /// <summary>
        /// Country ISO value
        /// </summary>
        /// <value>Country ISO value</value>
        [DataMember(Name = "CountryIso", EmitDefaultValue = true)]
        public string CountryIso { get; set; }

        /// <summary>
        /// State abbreviation
        /// </summary>
        /// <value>State abbreviation</value>
        [DataMember(Name = "State", EmitDefaultValue = true)]
        public string State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ExclusionConfig {\n");
            sb.Append("  CountryIso: ").Append(CountryIso).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ExclusionConfig);
        }

        /// <summary>
        /// Returns true if ExclusionConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of ExclusionConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExclusionConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CountryIso == input.CountryIso ||
                    (this.CountryIso != null &&
                    this.CountryIso.Equals(input.CountryIso))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CountryIso != null)
                    hashCode = hashCode * 59 + this.CountryIso.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
