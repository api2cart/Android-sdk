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
public class ProductVariantUpdateOptionsInner {
  
  @SerializedName("option_name")
  private String optionName = null;
  @SerializedName("option_value")
  private String optionValue = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOptionName() {
    return optionName;
  }
  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOptionValue() {
    return optionValue;
  }
  public void setOptionValue(String optionValue) {
    this.optionValue = optionValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariantUpdateOptionsInner productVariantUpdateOptionsInner = (ProductVariantUpdateOptionsInner) o;
    return (this.optionName == null ? productVariantUpdateOptionsInner.optionName == null : this.optionName.equals(productVariantUpdateOptionsInner.optionName)) &&
        (this.optionValue == null ? productVariantUpdateOptionsInner.optionValue == null : this.optionValue.equals(productVariantUpdateOptionsInner.optionValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.optionName == null ? 0: this.optionName.hashCode());
    result = 31 * result + (this.optionValue == null ? 0: this.optionValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantUpdateOptionsInner {\n");
    
    sb.append("  optionName: ").append(optionName).append("\n");
    sb.append("  optionValue: ").append(optionValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
