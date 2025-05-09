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
import org.openapitools.client.model.CartShippingZone;
import org.openapitools.client.model.CartStoreInfo;
import org.openapitools.client.model.CartWarehouse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Cart {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("db_prefix")
  private String dbPrefix = null;
  @SerializedName("stores_info")
  private List<CartStoreInfo> storesInfo = null;
  @SerializedName("warehouses")
  private List<CartWarehouse> warehouses = null;
  @SerializedName("shipping_zones")
  private List<CartShippingZone> shippingZones = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

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
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDbPrefix() {
    return dbPrefix;
  }
  public void setDbPrefix(String dbPrefix) {
    this.dbPrefix = dbPrefix;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CartStoreInfo> getStoresInfo() {
    return storesInfo;
  }
  public void setStoresInfo(List<CartStoreInfo> storesInfo) {
    this.storesInfo = storesInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CartWarehouse> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<CartWarehouse> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CartShippingZone> getShippingZones() {
    return shippingZones;
  }
  public void setShippingZones(List<CartShippingZone> shippingZones) {
    this.shippingZones = shippingZones;
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
    Cart cart = (Cart) o;
    return (this.name == null ? cart.name == null : this.name.equals(cart.name)) &&
        (this.url == null ? cart.url == null : this.url.equals(cart.url)) &&
        (this.version == null ? cart.version == null : this.version.equals(cart.version)) &&
        (this.dbPrefix == null ? cart.dbPrefix == null : this.dbPrefix.equals(cart.dbPrefix)) &&
        (this.storesInfo == null ? cart.storesInfo == null : this.storesInfo.equals(cart.storesInfo)) &&
        (this.warehouses == null ? cart.warehouses == null : this.warehouses.equals(cart.warehouses)) &&
        (this.shippingZones == null ? cart.shippingZones == null : this.shippingZones.equals(cart.shippingZones)) &&
        (this.additionalFields == null ? cart.additionalFields == null : this.additionalFields.equals(cart.additionalFields)) &&
        (this.customFields == null ? cart.customFields == null : this.customFields.equals(cart.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    result = 31 * result + (this.dbPrefix == null ? 0: this.dbPrefix.hashCode());
    result = 31 * result + (this.storesInfo == null ? 0: this.storesInfo.hashCode());
    result = 31 * result + (this.warehouses == null ? 0: this.warehouses.hashCode());
    result = 31 * result + (this.shippingZones == null ? 0: this.shippingZones.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  dbPrefix: ").append(dbPrefix).append("\n");
    sb.append("  storesInfo: ").append(storesInfo).append("\n");
    sb.append("  warehouses: ").append(warehouses).append("\n");
    sb.append("  shippingZones: ").append(shippingZones).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
