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
import org.openapitools.client.model.AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AccountSupportedPlatforms200ResponseResult {
  
  @SerializedName("supported_platforms")
  private List<AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner> supportedPlatforms = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner> getSupportedPlatforms() {
    return supportedPlatforms;
  }
  public void setSupportedPlatforms(List<AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner> supportedPlatforms) {
    this.supportedPlatforms = supportedPlatforms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSupportedPlatforms200ResponseResult accountSupportedPlatforms200ResponseResult = (AccountSupportedPlatforms200ResponseResult) o;
    return (this.supportedPlatforms == null ? accountSupportedPlatforms200ResponseResult.supportedPlatforms == null : this.supportedPlatforms.equals(accountSupportedPlatforms200ResponseResult.supportedPlatforms));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.supportedPlatforms == null ? 0: this.supportedPlatforms.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSupportedPlatforms200ResponseResult {\n");
    
    sb.append("  supportedPlatforms: ").append(supportedPlatforms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
