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
public class ProductCount200ResponseResult {
  
  @SerializedName("products_count")
  private Integer productsCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProductsCount() {
    return productsCount;
  }
  public void setProductsCount(Integer productsCount) {
    this.productsCount = productsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCount200ResponseResult productCount200ResponseResult = (ProductCount200ResponseResult) o;
    return (this.productsCount == null ? productCount200ResponseResult.productsCount == null : this.productsCount.equals(productCount200ResponseResult.productsCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productsCount == null ? 0: this.productsCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCount200ResponseResult {\n");
    
    sb.append("  productsCount: ").append(productsCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
