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
import org.openapitools.client.model.ProductAddGroupPricesInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductPriceAdd {
  
  @SerializedName("product_id")
  private String productId = null;
  @SerializedName("group_prices")
  private List<ProductAddGroupPricesInner> groupPrices = null;
  @SerializedName("store_id")
  private String storeId = null;

  /**
   * Defines the product to which the price has to be added
   **/
  @ApiModelProperty(value = "Defines the product to which the price has to be added")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Defines product's group prices
   **/
  @ApiModelProperty(value = "Defines product's group prices")
  public List<ProductAddGroupPricesInner> getGroupPrices() {
    return groupPrices;
  }
  public void setGroupPrices(List<ProductAddGroupPricesInner> groupPrices) {
    this.groupPrices = groupPrices;
  }

  /**
   * Store Id
   **/
  @ApiModelProperty(value = "Store Id")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPriceAdd productPriceAdd = (ProductPriceAdd) o;
    return (this.productId == null ? productPriceAdd.productId == null : this.productId.equals(productPriceAdd.productId)) &&
        (this.groupPrices == null ? productPriceAdd.groupPrices == null : this.groupPrices.equals(productPriceAdd.groupPrices)) &&
        (this.storeId == null ? productPriceAdd.storeId == null : this.storeId.equals(productPriceAdd.storeId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.groupPrices == null ? 0: this.groupPrices.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceAdd {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  groupPrices: ").append(groupPrices).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
