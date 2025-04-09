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
public class ReturnCount200ResponseResult {
  
  @SerializedName("returns_count")
  private Integer returnsCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReturnsCount() {
    return returnsCount;
  }
  public void setReturnsCount(Integer returnsCount) {
    this.returnsCount = returnsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnCount200ResponseResult returnCount200ResponseResult = (ReturnCount200ResponseResult) o;
    return (this.returnsCount == null ? returnCount200ResponseResult.returnsCount == null : this.returnsCount.equals(returnCount200ResponseResult.returnsCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.returnsCount == null ? 0: this.returnsCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnCount200ResponseResult {\n");
    
    sb.append("  returnsCount: ").append(returnsCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
