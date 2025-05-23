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
import java.util.*;
import org.openapitools.client.model.OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderPreestimateShippingListOrderItemInner {
  
  @SerializedName("order_item_id")
  private String orderItemId = null;
  @SerializedName("order_item_model")
  private String orderItemModel = null;
  @SerializedName("order_item_quantity")
  private Integer orderItemQuantity = null;
  @SerializedName("order_item_weight")
  private BigDecimal orderItemWeight = null;
  @SerializedName("order_item_variant_id")
  private String orderItemVariantId = null;
  @SerializedName("order_item_option")
  private List<OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner> orderItemOption = null;

  /**
   * Defines orders specified by order item id
   **/
  @ApiModelProperty(required = true, value = "Defines orders specified by order item id")
  public String getOrderItemId() {
    return orderItemId;
  }
  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  /**
   * Defines orders specified by order item model
   **/
  @ApiModelProperty(value = "Defines orders specified by order item model")
  public String getOrderItemModel() {
    return orderItemModel;
  }
  public void setOrderItemModel(String orderItemModel) {
    this.orderItemModel = orderItemModel;
  }

  /**
   * Defines orders specified by order item quantity
   **/
  @ApiModelProperty(required = true, value = "Defines orders specified by order item quantity")
  public Integer getOrderItemQuantity() {
    return orderItemQuantity;
  }
  public void setOrderItemQuantity(Integer orderItemQuantity) {
    this.orderItemQuantity = orderItemQuantity;
  }

  /**
   * Defines orders specified by order item weight
   **/
  @ApiModelProperty(value = "Defines orders specified by order item weight")
  public BigDecimal getOrderItemWeight() {
    return orderItemWeight;
  }
  public void setOrderItemWeight(BigDecimal orderItemWeight) {
    this.orderItemWeight = orderItemWeight;
  }

  /**
   * Ordered product variant. Where x is order item ID
   **/
  @ApiModelProperty(value = "Ordered product variant. Where x is order item ID")
  public String getOrderItemVariantId() {
    return orderItemVariantId;
  }
  public void setOrderItemVariantId(String orderItemVariantId) {
    this.orderItemVariantId = orderItemVariantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner> getOrderItemOption() {
    return orderItemOption;
  }
  public void setOrderItemOption(List<OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner> orderItemOption) {
    this.orderItemOption = orderItemOption;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPreestimateShippingListOrderItemInner orderPreestimateShippingListOrderItemInner = (OrderPreestimateShippingListOrderItemInner) o;
    return (this.orderItemId == null ? orderPreestimateShippingListOrderItemInner.orderItemId == null : this.orderItemId.equals(orderPreestimateShippingListOrderItemInner.orderItemId)) &&
        (this.orderItemModel == null ? orderPreestimateShippingListOrderItemInner.orderItemModel == null : this.orderItemModel.equals(orderPreestimateShippingListOrderItemInner.orderItemModel)) &&
        (this.orderItemQuantity == null ? orderPreestimateShippingListOrderItemInner.orderItemQuantity == null : this.orderItemQuantity.equals(orderPreestimateShippingListOrderItemInner.orderItemQuantity)) &&
        (this.orderItemWeight == null ? orderPreestimateShippingListOrderItemInner.orderItemWeight == null : this.orderItemWeight.equals(orderPreestimateShippingListOrderItemInner.orderItemWeight)) &&
        (this.orderItemVariantId == null ? orderPreestimateShippingListOrderItemInner.orderItemVariantId == null : this.orderItemVariantId.equals(orderPreestimateShippingListOrderItemInner.orderItemVariantId)) &&
        (this.orderItemOption == null ? orderPreestimateShippingListOrderItemInner.orderItemOption == null : this.orderItemOption.equals(orderPreestimateShippingListOrderItemInner.orderItemOption));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderItemId == null ? 0: this.orderItemId.hashCode());
    result = 31 * result + (this.orderItemModel == null ? 0: this.orderItemModel.hashCode());
    result = 31 * result + (this.orderItemQuantity == null ? 0: this.orderItemQuantity.hashCode());
    result = 31 * result + (this.orderItemWeight == null ? 0: this.orderItemWeight.hashCode());
    result = 31 * result + (this.orderItemVariantId == null ? 0: this.orderItemVariantId.hashCode());
    result = 31 * result + (this.orderItemOption == null ? 0: this.orderItemOption.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPreestimateShippingListOrderItemInner {\n");
    
    sb.append("  orderItemId: ").append(orderItemId).append("\n");
    sb.append("  orderItemModel: ").append(orderItemModel).append("\n");
    sb.append("  orderItemQuantity: ").append(orderItemQuantity).append("\n");
    sb.append("  orderItemWeight: ").append(orderItemWeight).append("\n");
    sb.append("  orderItemVariantId: ").append(orderItemVariantId).append("\n");
    sb.append("  orderItemOption: ").append(orderItemOption).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
