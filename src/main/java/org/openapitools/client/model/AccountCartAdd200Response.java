/**
 * API2Cart OpenAPI
 * API2Cart
 *
 * The version of the OpenAPI document: 1.1
 * Contact: contact@api2cart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.AccountCartAdd200ResponseResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AccountCartAdd200Response {
  
  @SerializedName("return_code")
  private Integer returnCode = null;
  @SerializedName("return_message")
  private String returnMessage = null;
  @SerializedName("result")
  private AccountCartAdd200ResponseResult result = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReturnCode() {
    return returnCode;
  }
  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReturnMessage() {
    return returnMessage;
  }
  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AccountCartAdd200ResponseResult getResult() {
    return result;
  }
  public void setResult(AccountCartAdd200ResponseResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCartAdd200Response accountCartAdd200Response = (AccountCartAdd200Response) o;
    return (this.returnCode == null ? accountCartAdd200Response.returnCode == null : this.returnCode.equals(accountCartAdd200Response.returnCode)) &&
        (this.returnMessage == null ? accountCartAdd200Response.returnMessage == null : this.returnMessage.equals(accountCartAdd200Response.returnMessage)) &&
        (this.result == null ? accountCartAdd200Response.result == null : this.result.equals(accountCartAdd200Response.result));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.returnCode == null ? 0: this.returnCode.hashCode());
    result = 31 * result + (this.returnMessage == null ? 0: this.returnMessage.hashCode());
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCartAdd200Response {\n");
    
    sb.append("  returnCode: ").append(returnCode).append("\n");
    sb.append("  returnMessage: ").append(returnMessage).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
