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
import org.openapitools.client.model.A2CDateTime;
import org.openapitools.client.model.BaseCustomer;
import org.openapitools.client.model.BasketItem;
import org.openapitools.client.model.Currency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Basket {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("customer")
  private BaseCustomer customer = null;
  @SerializedName("basket_url")
  private String basketUrl = null;
  @SerializedName("created_at")
  private A2CDateTime createdAt = null;
  @SerializedName("modified_at")
  private A2CDateTime modifiedAt = null;
  @SerializedName("currency")
  private Currency currency = null;
  @SerializedName("basket_products")
  private List<BasketItem> basketProducts = null;
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
  public BaseCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(BaseCustomer customer) {
    this.customer = customer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBasketUrl() {
    return basketUrl;
  }
  public void setBasketUrl(String basketUrl) {
    this.basketUrl = basketUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(A2CDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(A2CDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BasketItem> getBasketProducts() {
    return basketProducts;
  }
  public void setBasketProducts(List<BasketItem> basketProducts) {
    this.basketProducts = basketProducts;
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
    Basket basket = (Basket) o;
    return (this.id == null ? basket.id == null : this.id.equals(basket.id)) &&
        (this.customer == null ? basket.customer == null : this.customer.equals(basket.customer)) &&
        (this.basketUrl == null ? basket.basketUrl == null : this.basketUrl.equals(basket.basketUrl)) &&
        (this.createdAt == null ? basket.createdAt == null : this.createdAt.equals(basket.createdAt)) &&
        (this.modifiedAt == null ? basket.modifiedAt == null : this.modifiedAt.equals(basket.modifiedAt)) &&
        (this.currency == null ? basket.currency == null : this.currency.equals(basket.currency)) &&
        (this.basketProducts == null ? basket.basketProducts == null : this.basketProducts.equals(basket.basketProducts)) &&
        (this.additionalFields == null ? basket.additionalFields == null : this.additionalFields.equals(basket.additionalFields)) &&
        (this.customFields == null ? basket.customFields == null : this.customFields.equals(basket.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.customer == null ? 0: this.customer.hashCode());
    result = 31 * result + (this.basketUrl == null ? 0: this.basketUrl.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.modifiedAt == null ? 0: this.modifiedAt.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.basketProducts == null ? 0: this.basketProducts.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basket {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  basketUrl: ").append(basketUrl).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  basketProducts: ").append(basketProducts).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
