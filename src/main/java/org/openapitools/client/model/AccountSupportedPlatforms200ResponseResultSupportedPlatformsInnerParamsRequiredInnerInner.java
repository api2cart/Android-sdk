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
public class AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner accountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner = (AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner) o;
    return (this.name == null ? accountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner.name == null : this.name.equals(accountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner.name)) &&
        (this.description == null ? accountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner.description == null : this.description.equals(accountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
