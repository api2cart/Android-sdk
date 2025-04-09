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
import org.openapitools.client.model.A2CDateTime;
import org.openapitools.client.model.OrderStatusRefundItem;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderStatusRefund {
  
  @SerializedName("shipping")
  private BigDecimal shipping = null;
  @SerializedName("fee")
  private BigDecimal fee = null;
  @SerializedName("tax")
  private BigDecimal tax = null;
  @SerializedName("total_refunded")
  private BigDecimal totalRefunded = null;
  @SerializedName("time")
  private A2CDateTime time = null;
  @SerializedName("comment")
  private String comment = null;
  @SerializedName("refunded_items")
  private List<OrderStatusRefundItem> refundedItems = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getShipping() {
    return shipping;
  }
  public void setShipping(BigDecimal shipping) {
    this.shipping = shipping;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTax() {
    return tax;
  }
  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalRefunded() {
    return totalRefunded;
  }
  public void setTotalRefunded(BigDecimal totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getTime() {
    return time;
  }
  public void setTime(A2CDateTime time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OrderStatusRefundItem> getRefundedItems() {
    return refundedItems;
  }
  public void setRefundedItems(List<OrderStatusRefundItem> refundedItems) {
    this.refundedItems = refundedItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getAdditionalFields() {
    return additionalFields;
  }
  public void setAdditionalFields(Object additionalFields) {
    this.additionalFields = additionalFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusRefund orderStatusRefund = (OrderStatusRefund) o;
    return (this.shipping == null ? orderStatusRefund.shipping == null : this.shipping.equals(orderStatusRefund.shipping)) &&
        (this.fee == null ? orderStatusRefund.fee == null : this.fee.equals(orderStatusRefund.fee)) &&
        (this.tax == null ? orderStatusRefund.tax == null : this.tax.equals(orderStatusRefund.tax)) &&
        (this.totalRefunded == null ? orderStatusRefund.totalRefunded == null : this.totalRefunded.equals(orderStatusRefund.totalRefunded)) &&
        (this.time == null ? orderStatusRefund.time == null : this.time.equals(orderStatusRefund.time)) &&
        (this.comment == null ? orderStatusRefund.comment == null : this.comment.equals(orderStatusRefund.comment)) &&
        (this.refundedItems == null ? orderStatusRefund.refundedItems == null : this.refundedItems.equals(orderStatusRefund.refundedItems)) &&
        (this.additionalFields == null ? orderStatusRefund.additionalFields == null : this.additionalFields.equals(orderStatusRefund.additionalFields)) &&
        (this.customFields == null ? orderStatusRefund.customFields == null : this.customFields.equals(orderStatusRefund.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.shipping == null ? 0: this.shipping.hashCode());
    result = 31 * result + (this.fee == null ? 0: this.fee.hashCode());
    result = 31 * result + (this.tax == null ? 0: this.tax.hashCode());
    result = 31 * result + (this.totalRefunded == null ? 0: this.totalRefunded.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.comment == null ? 0: this.comment.hashCode());
    result = 31 * result + (this.refundedItems == null ? 0: this.refundedItems.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusRefund {\n");
    
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  fee: ").append(fee).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  totalRefunded: ").append(totalRefunded).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  refundedItems: ").append(refundedItems).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
