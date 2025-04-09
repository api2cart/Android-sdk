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
public class OrderTotals {
  
  @SerializedName("total")
  private BigDecimal total = null;
  @SerializedName("subtotal")
  private BigDecimal subtotal = null;
  @SerializedName("shipping")
  private BigDecimal shipping = null;
  @SerializedName("tax")
  private BigDecimal tax = null;
  @SerializedName("discount")
  private BigDecimal discount = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

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
  public BigDecimal getTax() {
    return tax;
  }
  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
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
    OrderTotals orderTotals = (OrderTotals) o;
    return (this.total == null ? orderTotals.total == null : this.total.equals(orderTotals.total)) &&
        (this.subtotal == null ? orderTotals.subtotal == null : this.subtotal.equals(orderTotals.subtotal)) &&
        (this.shipping == null ? orderTotals.shipping == null : this.shipping.equals(orderTotals.shipping)) &&
        (this.tax == null ? orderTotals.tax == null : this.tax.equals(orderTotals.tax)) &&
        (this.discount == null ? orderTotals.discount == null : this.discount.equals(orderTotals.discount)) &&
        (this.additionalFields == null ? orderTotals.additionalFields == null : this.additionalFields.equals(orderTotals.additionalFields)) &&
        (this.customFields == null ? orderTotals.customFields == null : this.customFields.equals(orderTotals.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.subtotal == null ? 0: this.subtotal.hashCode());
    result = 31 * result + (this.shipping == null ? 0: this.shipping.hashCode());
    result = 31 * result + (this.tax == null ? 0: this.tax.hashCode());
    result = 31 * result + (this.discount == null ? 0: this.discount.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTotals {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  subtotal: ").append(subtotal).append("\n");
    sb.append("  shipping: ").append(shipping).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
