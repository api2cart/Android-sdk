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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AttributeTypeList200ResponseResult {
  
  @SerializedName("attribute_type")
  private List<String> attributeType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAttributeType() {
    return attributeType;
  }
  public void setAttributeType(List<String> attributeType) {
    this.attributeType = attributeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeTypeList200ResponseResult attributeTypeList200ResponseResult = (AttributeTypeList200ResponseResult) o;
    return (this.attributeType == null ? attributeTypeList200ResponseResult.attributeType == null : this.attributeType.equals(attributeTypeList200ResponseResult.attributeType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.attributeType == null ? 0: this.attributeType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeTypeList200ResponseResult {\n");
    
    sb.append("  attributeType: ").append(attributeType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
