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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderReturnAdd200ResponseResult {
  
  @SerializedName("return_id")
  private String returnId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReturnId() {
    return returnId;
  }
  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnAdd200ResponseResult orderReturnAdd200ResponseResult = (OrderReturnAdd200ResponseResult) o;
    return (this.returnId == null ? orderReturnAdd200ResponseResult.returnId == null : this.returnId.equals(orderReturnAdd200ResponseResult.returnId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.returnId == null ? 0: this.returnId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturnAdd200ResponseResult {\n");
    
    sb.append("  returnId: ").append(returnId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
