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

import org.openapitools.client.model.A2CDateTime;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomerWishListItem {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("product_id")
  private String productId = null;
  @SerializedName("child_id")
  private String childId = null;
  @SerializedName("created_time")
  private A2CDateTime createdTime = null;
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
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getChildId() {
    return childId;
  }
  public void setChildId(String childId) {
    this.childId = childId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(A2CDateTime createdTime) {
    this.createdTime = createdTime;
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
    CustomerWishListItem customerWishListItem = (CustomerWishListItem) o;
    return (this.id == null ? customerWishListItem.id == null : this.id.equals(customerWishListItem.id)) &&
        (this.productId == null ? customerWishListItem.productId == null : this.productId.equals(customerWishListItem.productId)) &&
        (this.childId == null ? customerWishListItem.childId == null : this.childId.equals(customerWishListItem.childId)) &&
        (this.createdTime == null ? customerWishListItem.createdTime == null : this.createdTime.equals(customerWishListItem.createdTime)) &&
        (this.additionalFields == null ? customerWishListItem.additionalFields == null : this.additionalFields.equals(customerWishListItem.additionalFields)) &&
        (this.customFields == null ? customerWishListItem.customFields == null : this.customFields.equals(customerWishListItem.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.childId == null ? 0: this.childId.hashCode());
    result = 31 * result + (this.createdTime == null ? 0: this.createdTime.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerWishListItem {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  childId: ").append(childId).append("\n");
    sb.append("  createdTime: ").append(createdTime).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
