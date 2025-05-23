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
public class OrderRefundAddItemsInner {
  
  @SerializedName("order_product_id")
  private String orderProductId = null;
  @SerializedName("quantity")
  private Integer quantity = null;
  @SerializedName("price")
  private BigDecimal price = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderProductId() {
    return orderProductId;
  }
  public void setOrderProductId(String orderProductId) {
    this.orderProductId = orderProductId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRefundAddItemsInner orderRefundAddItemsInner = (OrderRefundAddItemsInner) o;
    return (this.orderProductId == null ? orderRefundAddItemsInner.orderProductId == null : this.orderProductId.equals(orderRefundAddItemsInner.orderProductId)) &&
        (this.quantity == null ? orderRefundAddItemsInner.quantity == null : this.quantity.equals(orderRefundAddItemsInner.quantity)) &&
        (this.price == null ? orderRefundAddItemsInner.price == null : this.price.equals(orderRefundAddItemsInner.price));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderProductId == null ? 0: this.orderProductId.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRefundAddItemsInner {\n");
    
    sb.append("  orderProductId: ").append(orderProductId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
