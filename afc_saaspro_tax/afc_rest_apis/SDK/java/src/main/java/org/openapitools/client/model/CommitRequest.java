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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.KeyValuePair;

/**
 * Parameter for CommitTransactions API.
 */
@ApiModel(description = "Parameter for CommitTransactions API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-04T15:26:12.946-04:00[America/New_York]")
public class CommitRequest {
  public static final String SERIALIZED_NAME_DOC = "doc";
  @SerializedName(SERIALIZED_NAME_DOC)
  private String doc;

  public static final String SERIALIZED_NAME_CMMT = "cmmt";
  @SerializedName(SERIALIZED_NAME_CMMT)
  private Boolean cmmt;

  public static final String SERIALIZED_NAME_OPT = "opt";
  @SerializedName(SERIALIZED_NAME_OPT)
  private List<KeyValuePair> opt = null;


  public CommitRequest doc(String doc) {
    
    this.doc = doc;
    return this;
  }

   /**
   * Document code.
   * @return doc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document code.")

  public String getDoc() {
    return doc;
  }


  public void setDoc(String doc) {
    this.doc = doc;
  }


  public CommitRequest cmmt(Boolean cmmt) {
    
    this.cmmt = cmmt;
    return this;
  }

   /**
   * Indicates if transactions for the specified document code should be committed.
   * @return cmmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if transactions for the specified document code should be committed.")

  public Boolean getCmmt() {
    return cmmt;
  }


  public void setCmmt(Boolean cmmt) {
    this.cmmt = cmmt;
  }


  public CommitRequest opt(List<KeyValuePair> opt) {
    
    this.opt = opt;
    return this;
  }

  public CommitRequest addOptItem(KeyValuePair optItem) {
    if (this.opt == null) {
      this.opt = new ArrayList<KeyValuePair>();
    }
    this.opt.add(optItem);
    return this;
  }

   /**
   * Overrides value for OptionalFields field in reports.
   * @return opt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides value for OptionalFields field in reports.")

  public List<KeyValuePair> getOpt() {
    return opt;
  }


  public void setOpt(List<KeyValuePair> opt) {
    this.opt = opt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitRequest commitRequest = (CommitRequest) o;
    return Objects.equals(this.doc, commitRequest.doc) &&
        Objects.equals(this.cmmt, commitRequest.cmmt) &&
        Objects.equals(this.opt, commitRequest.opt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doc, cmmt, opt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitRequest {\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    cmmt: ").append(toIndentedString(cmmt)).append("\n");
    sb.append("    opt: ").append(toIndentedString(opt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

