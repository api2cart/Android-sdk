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
public class AccountCartList200ResponseResultCartsInner {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("store_key")
  private String storeKey = null;
  @SerializedName("cart_id")
  private String cartId = null;
  @SerializedName("total_calls")
  private String totalCalls = null;

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
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreKey() {
    return storeKey;
  }
  public void setStoreKey(String storeKey) {
    this.storeKey = storeKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCartId() {
    return cartId;
  }
  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalCalls() {
    return totalCalls;
  }
  public void setTotalCalls(String totalCalls) {
    this.totalCalls = totalCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCartList200ResponseResultCartsInner accountCartList200ResponseResultCartsInner = (AccountCartList200ResponseResultCartsInner) o;
    return (this.id == null ? accountCartList200ResponseResultCartsInner.id == null : this.id.equals(accountCartList200ResponseResultCartsInner.id)) &&
        (this.url == null ? accountCartList200ResponseResultCartsInner.url == null : this.url.equals(accountCartList200ResponseResultCartsInner.url)) &&
        (this.storeKey == null ? accountCartList200ResponseResultCartsInner.storeKey == null : this.storeKey.equals(accountCartList200ResponseResultCartsInner.storeKey)) &&
        (this.cartId == null ? accountCartList200ResponseResultCartsInner.cartId == null : this.cartId.equals(accountCartList200ResponseResultCartsInner.cartId)) &&
        (this.totalCalls == null ? accountCartList200ResponseResultCartsInner.totalCalls == null : this.totalCalls.equals(accountCartList200ResponseResultCartsInner.totalCalls));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.storeKey == null ? 0: this.storeKey.hashCode());
    result = 31 * result + (this.cartId == null ? 0: this.cartId.hashCode());
    result = 31 * result + (this.totalCalls == null ? 0: this.totalCalls.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCartList200ResponseResultCartsInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  storeKey: ").append(storeKey).append("\n");
    sb.append("  cartId: ").append(cartId).append("\n");
    sb.append("  totalCalls: ").append(totalCalls).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
