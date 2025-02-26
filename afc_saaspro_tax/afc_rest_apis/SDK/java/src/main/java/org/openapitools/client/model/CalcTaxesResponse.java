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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InvoiceResult;

/**
 * Response body for tax calculation API.
 */
@ApiModel(description = "Response body for tax calculation API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-04T15:26:12.946-04:00[America/New_York]")
public class CalcTaxesResponse {
  public static final String SERIALIZED_NAME_INV = "inv";
  @SerializedName(SERIALIZED_NAME_INV)
  private List<InvoiceResult> inv = null;

  public static final String SERIALIZED_NAME_ERR = "err";
  @SerializedName(SERIALIZED_NAME_ERR)
  private List<Error> err = null;


  public CalcTaxesResponse inv(List<InvoiceResult> inv) {
    
    this.inv = inv;
    return this;
  }

  public CalcTaxesResponse addInvItem(InvoiceResult invItem) {
    if (this.inv == null) {
      this.inv = new ArrayList<InvoiceResult>();
    }
    this.inv.add(invItem);
    return this;
  }

   /**
   * Tax calculation results for each invoice submitted in request.
   * @return inv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax calculation results for each invoice submitted in request.")

  public List<InvoiceResult> getInv() {
    return inv;
  }


  public void setInv(List<InvoiceResult> inv) {
    this.inv = inv;
  }


  public CalcTaxesResponse err(List<Error> err) {
    
    this.err = err;
    return this;
  }

  public CalcTaxesResponse addErrItem(Error errItem) {
    if (this.err == null) {
      this.err = new ArrayList<Error>();
    }
    this.err.add(errItem);
    return this;
  }

   /**
   * Error description (as applicable).
   * @return err
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error description (as applicable).")

  public List<Error> getErr() {
    return err;
  }


  public void setErr(List<Error> err) {
    this.err = err;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalcTaxesResponse calcTaxesResponse = (CalcTaxesResponse) o;
    return Objects.equals(this.inv, calcTaxesResponse.inv) &&
        Objects.equals(this.err, calcTaxesResponse.err);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inv, err);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalcTaxesResponse {\n");
    sb.append("    inv: ").append(toIndentedString(inv)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
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

