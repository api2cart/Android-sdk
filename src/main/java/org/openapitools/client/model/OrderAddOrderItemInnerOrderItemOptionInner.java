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
public class OrderAddOrderItemInnerOrderItemOptionInner {
  
  @SerializedName("order_item_option_name")
  private String orderItemOptionName = null;
  @SerializedName("order_item_option_value")
  private String orderItemOptionValue = null;
  @SerializedName("order_item_option_price")
  private BigDecimal orderItemOptionPrice = null;

  /**
   * Ordered Product Option Name. Where x is order item ID, y is order item option ID
   **/
  @ApiModelProperty(value = "Ordered Product Option Name. Where x is order item ID, y is order item option ID")
  public String getOrderItemOptionName() {
    return orderItemOptionName;
  }
  public void setOrderItemOptionName(String orderItemOptionName) {
    this.orderItemOptionName = orderItemOptionName;
  }

  /**
   * Ordered product option value Where x is order item ID, y - order item option ID
   **/
  @ApiModelProperty(value = "Ordered product option value Where x is order item ID, y - order item option ID")
  public String getOrderItemOptionValue() {
    return orderItemOptionValue;
  }
  public void setOrderItemOptionValue(String orderItemOptionValue) {
    this.orderItemOptionValue = orderItemOptionValue;
  }

  /**
   * Ordered product option price Where x is order item ID, y - order item option ID
   **/
  @ApiModelProperty(value = "Ordered product option price Where x is order item ID, y - order item option ID")
  public BigDecimal getOrderItemOptionPrice() {
    return orderItemOptionPrice;
  }
  public void setOrderItemOptionPrice(BigDecimal orderItemOptionPrice) {
    this.orderItemOptionPrice = orderItemOptionPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddOrderItemInnerOrderItemOptionInner orderAddOrderItemInnerOrderItemOptionInner = (OrderAddOrderItemInnerOrderItemOptionInner) o;
    return (this.orderItemOptionName == null ? orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionName == null : this.orderItemOptionName.equals(orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionName)) &&
        (this.orderItemOptionValue == null ? orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionValue == null : this.orderItemOptionValue.equals(orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionValue)) &&
        (this.orderItemOptionPrice == null ? orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionPrice == null : this.orderItemOptionPrice.equals(orderAddOrderItemInnerOrderItemOptionInner.orderItemOptionPrice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderItemOptionName == null ? 0: this.orderItemOptionName.hashCode());
    result = 31 * result + (this.orderItemOptionValue == null ? 0: this.orderItemOptionValue.hashCode());
    result = 31 * result + (this.orderItemOptionPrice == null ? 0: this.orderItemOptionPrice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddOrderItemInnerOrderItemOptionInner {\n");
    
    sb.append("  orderItemOptionName: ").append(orderItemOptionName).append("\n");
    sb.append("  orderItemOptionValue: ").append(orderItemOptionValue).append("\n");
    sb.append("  orderItemOptionPrice: ").append(orderItemOptionPrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
