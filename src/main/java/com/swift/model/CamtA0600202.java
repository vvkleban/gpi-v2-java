/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.CancelTransactionResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema CancelTransactionResponse (camt.a06.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema CancelTransactionResponse (camt.a06.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CamtA0600202 {
  @SerializedName("cancel_transaction_response")
  private CancelTransactionResponse cancelTransactionResponse = null;

  public CamtA0600202 cancelTransactionResponse(CancelTransactionResponse cancelTransactionResponse) {
    this.cancelTransactionResponse = cancelTransactionResponse;
    return this;
  }

   /**
   * Get cancelTransactionResponse
   * @return cancelTransactionResponse
  **/
  @ApiModelProperty(value = "")
  public CancelTransactionResponse getCancelTransactionResponse() {
    return cancelTransactionResponse;
  }

  public void setCancelTransactionResponse(CancelTransactionResponse cancelTransactionResponse) {
    this.cancelTransactionResponse = cancelTransactionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0600202 camtA0600202 = (CamtA0600202) o;
    return Objects.equals(this.cancelTransactionResponse, camtA0600202.cancelTransactionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelTransactionResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0600202 {\n");

    sb.append("    cancelTransactionResponse: ").append(toIndentedString(cancelTransactionResponse)).append("\n");
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
