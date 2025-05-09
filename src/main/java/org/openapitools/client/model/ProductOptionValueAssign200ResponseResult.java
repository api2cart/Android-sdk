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
public class ProductOptionValueAssign200ResponseResult {
  
  @SerializedName("product_option_value_id")
  private String productOptionValueId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProductOptionValueId() {
    return productOptionValueId;
  }
  public void setProductOptionValueId(String productOptionValueId) {
    this.productOptionValueId = productOptionValueId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOptionValueAssign200ResponseResult productOptionValueAssign200ResponseResult = (ProductOptionValueAssign200ResponseResult) o;
    return (this.productOptionValueId == null ? productOptionValueAssign200ResponseResult.productOptionValueId == null : this.productOptionValueId.equals(productOptionValueAssign200ResponseResult.productOptionValueId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productOptionValueId == null ? 0: this.productOptionValueId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionValueAssign200ResponseResult {\n");
    
    sb.append("  productOptionValueId: ").append(productOptionValueId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
