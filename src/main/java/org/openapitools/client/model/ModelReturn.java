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

import java.util.*;
import org.openapitools.client.model.ReturnOrderProduct;
import org.openapitools.client.model.ReturnStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelReturn {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("order_id")
  private String orderId = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("modified_at")
  private String modifiedAt = null;
  @SerializedName("status")
  private ReturnStatus status = null;
  @SerializedName("order_products")
  private List<ReturnOrderProduct> orderProducts = null;
  @SerializedName("comment")
  private String comment = null;
  @SerializedName("staff_note")
  private String staffNote = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ReturnStatus getStatus() {
    return status;
  }
  public void setStatus(ReturnStatus status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ReturnOrderProduct> getOrderProducts() {
    return orderProducts;
  }
  public void setOrderProducts(List<ReturnOrderProduct> orderProducts) {
    this.orderProducts = orderProducts;
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
  public String getStaffNote() {
    return staffNote;
  }
  public void setStaffNote(String staffNote) {
    this.staffNote = staffNote;
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
    ModelReturn _return = (ModelReturn) o;
    return (this.id == null ? _return.id == null : this.id.equals(_return.id)) &&
        (this.name == null ? _return.name == null : this.name.equals(_return.name)) &&
        (this.orderId == null ? _return.orderId == null : this.orderId.equals(_return.orderId)) &&
        (this.customerId == null ? _return.customerId == null : this.customerId.equals(_return.customerId)) &&
        (this.storeId == null ? _return.storeId == null : this.storeId.equals(_return.storeId)) &&
        (this.createdAt == null ? _return.createdAt == null : this.createdAt.equals(_return.createdAt)) &&
        (this.modifiedAt == null ? _return.modifiedAt == null : this.modifiedAt.equals(_return.modifiedAt)) &&
        (this.status == null ? _return.status == null : this.status.equals(_return.status)) &&
        (this.orderProducts == null ? _return.orderProducts == null : this.orderProducts.equals(_return.orderProducts)) &&
        (this.comment == null ? _return.comment == null : this.comment.equals(_return.comment)) &&
        (this.staffNote == null ? _return.staffNote == null : this.staffNote.equals(_return.staffNote)) &&
        (this.additionalFields == null ? _return.additionalFields == null : this.additionalFields.equals(_return.additionalFields)) &&
        (this.customFields == null ? _return.customFields == null : this.customFields.equals(_return.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.customerId == null ? 0: this.customerId.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.modifiedAt == null ? 0: this.modifiedAt.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.orderProducts == null ? 0: this.orderProducts.hashCode());
    result = 31 * result + (this.comment == null ? 0: this.comment.hashCode());
    result = 31 * result + (this.staffNote == null ? 0: this.staffNote.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReturn {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  orderProducts: ").append(orderProducts).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  staffNote: ").append(staffNote).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
