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
public class ProductVariantCount200ResponseResult {
  
  @SerializedName("variants_count")
  private String variantsCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVariantsCount() {
    return variantsCount;
  }
  public void setVariantsCount(String variantsCount) {
    this.variantsCount = variantsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariantCount200ResponseResult productVariantCount200ResponseResult = (ProductVariantCount200ResponseResult) o;
    return (this.variantsCount == null ? productVariantCount200ResponseResult.variantsCount == null : this.variantsCount.equals(productVariantCount200ResponseResult.variantsCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.variantsCount == null ? 0: this.variantsCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantCount200ResponseResult {\n");
    
    sb.append("  variantsCount: ").append(variantsCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
