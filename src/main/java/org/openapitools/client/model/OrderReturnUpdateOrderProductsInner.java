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
public class OrderReturnUpdateOrderProductsInner {
  
  @SerializedName("order_product_id")
  private String orderProductId = null;
  @SerializedName("order_product_quantity")
  private Integer orderProductQuantity = null;
  @SerializedName("order_product_status")
  private String orderProductStatus = null;
  @SerializedName("order_product_action_id")
  private String orderProductActionId = null;

  /**
   * Defines which products from the order should be returned
   **/
  @ApiModelProperty(required = true, value = "Defines which products from the order should be returned")
  public String getOrderProductId() {
    return orderProductId;
  }
  public void setOrderProductId(String orderProductId) {
    this.orderProductId = orderProductId;
  }

  /**
   * Defines how many product units from the order should be returned
   **/
  @ApiModelProperty(required = true, value = "Defines how many product units from the order should be returned")
  public Integer getOrderProductQuantity() {
    return orderProductQuantity;
  }
  public void setOrderProductQuantity(Integer orderProductQuantity) {
    this.orderProductQuantity = orderProductQuantity;
  }

  /**
   * Defines product return status
   **/
  @ApiModelProperty(value = "Defines product return status")
  public String getOrderProductStatus() {
    return orderProductStatus;
  }
  public void setOrderProductStatus(String orderProductStatus) {
    this.orderProductStatus = orderProductStatus;
  }

  /**
   * Defines the ID of the return action
   **/
  @ApiModelProperty(required = true, value = "Defines the ID of the return action")
  public String getOrderProductActionId() {
    return orderProductActionId;
  }
  public void setOrderProductActionId(String orderProductActionId) {
    this.orderProductActionId = orderProductActionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnUpdateOrderProductsInner orderReturnUpdateOrderProductsInner = (OrderReturnUpdateOrderProductsInner) o;
    return (this.orderProductId == null ? orderReturnUpdateOrderProductsInner.orderProductId == null : this.orderProductId.equals(orderReturnUpdateOrderProductsInner.orderProductId)) &&
        (this.orderProductQuantity == null ? orderReturnUpdateOrderProductsInner.orderProductQuantity == null : this.orderProductQuantity.equals(orderReturnUpdateOrderProductsInner.orderProductQuantity)) &&
        (this.orderProductStatus == null ? orderReturnUpdateOrderProductsInner.orderProductStatus == null : this.orderProductStatus.equals(orderReturnUpdateOrderProductsInner.orderProductStatus)) &&
        (this.orderProductActionId == null ? orderReturnUpdateOrderProductsInner.orderProductActionId == null : this.orderProductActionId.equals(orderReturnUpdateOrderProductsInner.orderProductActionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderProductId == null ? 0: this.orderProductId.hashCode());
    result = 31 * result + (this.orderProductQuantity == null ? 0: this.orderProductQuantity.hashCode());
    result = 31 * result + (this.orderProductStatus == null ? 0: this.orderProductStatus.hashCode());
    result = 31 * result + (this.orderProductActionId == null ? 0: this.orderProductActionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturnUpdateOrderProductsInner {\n");
    
    sb.append("  orderProductId: ").append(orderProductId).append("\n");
    sb.append("  orderProductQuantity: ").append(orderProductQuantity).append("\n");
    sb.append("  orderProductStatus: ").append(orderProductStatus).append("\n");
    sb.append("  orderProductActionId: ").append(orderProductActionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
