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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductUpdateBatchPayloadInnerAdvancedPricesInner {
  
  @SerializedName("value")
  private BigDecimal value = null;
  @SerializedName("group_id")
  private Integer groupId = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGroupId() {
    return groupId;
  }
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUpdateBatchPayloadInnerAdvancedPricesInner productUpdateBatchPayloadInnerAdvancedPricesInner = (ProductUpdateBatchPayloadInnerAdvancedPricesInner) o;
    return (this.value == null ? productUpdateBatchPayloadInnerAdvancedPricesInner.value == null : this.value.equals(productUpdateBatchPayloadInnerAdvancedPricesInner.value)) &&
        (this.groupId == null ? productUpdateBatchPayloadInnerAdvancedPricesInner.groupId == null : this.groupId.equals(productUpdateBatchPayloadInnerAdvancedPricesInner.groupId)) &&
        (this.quantity == null ? productUpdateBatchPayloadInnerAdvancedPricesInner.quantity == null : this.quantity.equals(productUpdateBatchPayloadInnerAdvancedPricesInner.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdateBatchPayloadInnerAdvancedPricesInner {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
