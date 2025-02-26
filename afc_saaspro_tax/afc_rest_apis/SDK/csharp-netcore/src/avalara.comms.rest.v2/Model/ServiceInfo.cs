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
    /// Response body for service info API.
    /// </summary>
    [DataContract(Name = "ServiceInfo")]
    public partial class ServiceInfo : IEquatable<ServiceInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceInfo" /> class.
        /// </summary>
        /// <param name="serverTime">Server time..</param>
        /// <param name="versions">versions.</param>
        /// <param name="error">Error information..</param>
        public ServiceInfo(DateTime serverTime = default(DateTime), VersionInfo versions = default(VersionInfo), string error = default(string))
        {
            this.ServerTime = serverTime;
            this.Versions = versions;
            this.Error = error;
        }

        /// <summary>
        /// Server time.
        /// </summary>
        /// <value>Server time.</value>
        [DataMember(Name = "ServerTime", EmitDefaultValue = false)]
        public DateTime ServerTime { get; set; }

        /// <summary>
        /// Gets or Sets Versions
        /// </summary>
        [DataMember(Name = "Versions", EmitDefaultValue = false)]
        public VersionInfo Versions { get; set; }

        /// <summary>
        /// Error information.
        /// </summary>
        /// <value>Error information.</value>
        [DataMember(Name = "Error", EmitDefaultValue = true)]
        public string Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ServiceInfo {\n");
            sb.Append("  ServerTime: ").Append(ServerTime).Append("\n");
            sb.Append("  Versions: ").Append(Versions).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as ServiceInfo);
        }

        /// <summary>
        /// Returns true if ServiceInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ServiceInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServiceInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ServerTime == input.ServerTime ||
                    (this.ServerTime != null &&
                    this.ServerTime.Equals(input.ServerTime))
                ) && 
                (
                    this.Versions == input.Versions ||
                    (this.Versions != null &&
                    this.Versions.Equals(input.Versions))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                if (this.ServerTime != null)
                    hashCode = hashCode * 59 + this.ServerTime.GetHashCode();
                if (this.Versions != null)
                    hashCode = hashCode * 59 + this.Versions.GetHashCode();
                if (this.Error != null)
                    hashCode = hashCode * 59 + this.Error.GetHashCode();
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
