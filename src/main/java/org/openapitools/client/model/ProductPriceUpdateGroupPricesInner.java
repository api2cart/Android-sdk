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
public class ProductPriceUpdateGroupPricesInner {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("group_id")
  private String groupId = null;
  @SerializedName("price")
  private BigDecimal price = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
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
    ProductPriceUpdateGroupPricesInner productPriceUpdateGroupPricesInner = (ProductPriceUpdateGroupPricesInner) o;
    return (this.id == null ? productPriceUpdateGroupPricesInner.id == null : this.id.equals(productPriceUpdateGroupPricesInner.id)) &&
        (this.groupId == null ? productPriceUpdateGroupPricesInner.groupId == null : this.groupId.equals(productPriceUpdateGroupPricesInner.groupId)) &&
        (this.price == null ? productPriceUpdateGroupPricesInner.price == null : this.price.equals(productPriceUpdateGroupPricesInner.price));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceUpdateGroupPricesInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
