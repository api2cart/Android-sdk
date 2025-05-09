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
import org.openapitools.client.model.ProductAddTierPricesInner;
import org.openapitools.client.model.ProductVariantAddAttributesInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductVariantAdd {
  
  @SerializedName("product_id")
  private String productId = null;
  @SerializedName("attributes")
  private List<ProductVariantAddAttributesInner> attributes = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("available_for_view")
  private Boolean availableForView = true;
  @SerializedName("available_for_sale")
  private Boolean availableForSale = true;
  @SerializedName("is_virtual")
  private Boolean isVirtual = false;
  @SerializedName("is_default")
  private Boolean isDefault = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("stores_ids")
  private String storesIds = null;
  @SerializedName("lang_id")
  private String langId = null;
  @SerializedName("price")
  private BigDecimal price = null;
  @SerializedName("old_price")
  private BigDecimal oldPrice = null;
  @SerializedName("cost_price")
  private BigDecimal costPrice = null;
  @SerializedName("special_price")
  private BigDecimal specialPrice = null;
  @SerializedName("sprice_create")
  private String spriceCreate = null;
  @SerializedName("sprice_modified")
  private String spriceModified = null;
  @SerializedName("sprice_expire")
  private String spriceExpire = null;
  @SerializedName("tier_prices")
  private List<ProductAddTierPricesInner> tierPrices = null;
  @SerializedName("quantity")
  private BigDecimal quantity = 0;
  @SerializedName("warehouse_id")
  private String warehouseId = null;
  @SerializedName("in_stock")
  private Boolean inStock = null;
  @SerializedName("backorder_status")
  private String backorderStatus = null;
  @SerializedName("manage_stock")
  private Boolean manageStock = null;
  @SerializedName("weight")
  private BigDecimal weight = 0;
  @SerializedName("width")
  private BigDecimal width = null;
  @SerializedName("height")
  private BigDecimal height = null;
  @SerializedName("length")
  private BigDecimal length = null;
  @SerializedName("weight_unit")
  private String weightUnit = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("barcode")
  private String barcode = null;
  @SerializedName("gtin")
  private String gtin = null;
  @SerializedName("upc")
  private String upc = null;
  @SerializedName("ean")
  private String ean = null;
  @SerializedName("mpn")
  private String mpn = null;
  @SerializedName("isbn")
  private String isbn = null;
  @SerializedName("manufacturer")
  private String manufacturer = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("meta_title")
  private String metaTitle = null;
  @SerializedName("meta_keywords")
  private String metaKeywords = null;
  @SerializedName("meta_description")
  private String metaDescription = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("tax_class_id")
  private String taxClassId = null;
  @SerializedName("taxable")
  private Boolean taxable = true;
  @SerializedName("fixed_cost_shipping_price")
  private BigDecimal fixedCostShippingPrice = null;
  @SerializedName("is_free_shipping")
  private Boolean isFreeShipping = null;
  @SerializedName("country_of_origin")
  private String countryOfOrigin = null;
  @SerializedName("harmonized_system_code")
  private String harmonizedSystemCode = null;
  @SerializedName("marketplace_item_properties")
  private String marketplaceItemProperties = null;
  @SerializedName("clear_cache")
  private Boolean clearCache = true;

  /**
   * Defines product's id where the variant has to be added
   **/
  @ApiModelProperty(value = "Defines product's id where the variant has to be added")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Defines variant's attributes list
   **/
  @ApiModelProperty(value = "Defines variant's attributes list")
  public List<ProductVariantAddAttributesInner> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ProductVariantAddAttributesInner> attributes) {
    this.attributes = attributes;
  }

  /**
   * Defines variant's name that has to be added
   **/
  @ApiModelProperty(value = "Defines variant's name that has to be added")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Specifies variant's model that has to be added
   **/
  @ApiModelProperty(required = true, value = "Specifies variant's model that has to be added")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Specifies variant's description
   **/
  @ApiModelProperty(value = "Specifies variant's description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Defines short description
   **/
  @ApiModelProperty(value = "Defines short description")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * Specifies the set of visible/invisible product's variants for users
   **/
  @ApiModelProperty(value = "Specifies the set of visible/invisible product's variants for users")
  public Boolean getAvailableForView() {
    return availableForView;
  }
  public void setAvailableForView(Boolean availableForView) {
    this.availableForView = availableForView;
  }

  /**
   * Specifies the set of visible/invisible product's variants for sale
   **/
  @ApiModelProperty(value = "Specifies the set of visible/invisible product's variants for sale")
  public Boolean getAvailableForSale() {
    return availableForSale;
  }
  public void setAvailableForSale(Boolean availableForSale) {
    this.availableForSale = availableForSale;
  }

  /**
   * Defines whether the product is virtual
   **/
  @ApiModelProperty(value = "Defines whether the product is virtual")
  public Boolean getIsVirtual() {
    return isVirtual;
  }
  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  /**
   * Defines as a default variant
   **/
  @ApiModelProperty(value = "Defines as a default variant")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Add variants specified by store id
   **/
  @ApiModelProperty(value = "Add variants specified by store id")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   * Assign variant to the stores that is specified by comma-separated stores' id
   **/
  @ApiModelProperty(value = "Assign variant to the stores that is specified by comma-separated stores' id")
  public String getStoresIds() {
    return storesIds;
  }
  public void setStoresIds(String storesIds) {
    this.storesIds = storesIds;
  }

  /**
   * Language id
   **/
  @ApiModelProperty(value = "Language id")
  public String getLangId() {
    return langId;
  }
  public void setLangId(String langId) {
    this.langId = langId;
  }

  /**
   * Defines new product's variant price
   **/
  @ApiModelProperty(value = "Defines new product's variant price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Defines product's old price
   **/
  @ApiModelProperty(value = "Defines product's old price")
  public BigDecimal getOldPrice() {
    return oldPrice;
  }
  public void setOldPrice(BigDecimal oldPrice) {
    this.oldPrice = oldPrice;
  }

  /**
   * Defines new product's cost price
   **/
  @ApiModelProperty(value = "Defines new product's cost price")
  public BigDecimal getCostPrice() {
    return costPrice;
  }
  public void setCostPrice(BigDecimal costPrice) {
    this.costPrice = costPrice;
  }

  /**
   * Specifies variant's model that has to be added
   **/
  @ApiModelProperty(value = "Specifies variant's model that has to be added")
  public BigDecimal getSpecialPrice() {
    return specialPrice;
  }
  public void setSpecialPrice(BigDecimal specialPrice) {
    this.specialPrice = specialPrice;
  }

  /**
   * Defines the date of special price creation
   **/
  @ApiModelProperty(value = "Defines the date of special price creation")
  public String getSpriceCreate() {
    return spriceCreate;
  }
  public void setSpriceCreate(String spriceCreate) {
    this.spriceCreate = spriceCreate;
  }

  /**
   * Defines the date of special price modification
   **/
  @ApiModelProperty(value = "Defines the date of special price modification")
  public String getSpriceModified() {
    return spriceModified;
  }
  public void setSpriceModified(String spriceModified) {
    this.spriceModified = spriceModified;
  }

  /**
   * Defines the term of special price offer duration
   **/
  @ApiModelProperty(value = "Defines the term of special price offer duration")
  public String getSpriceExpire() {
    return spriceExpire;
  }
  public void setSpriceExpire(String spriceExpire) {
    this.spriceExpire = spriceExpire;
  }

  /**
   * Defines product's tier prices
   **/
  @ApiModelProperty(value = "Defines product's tier prices")
  public List<ProductAddTierPricesInner> getTierPrices() {
    return tierPrices;
  }
  public void setTierPrices(List<ProductAddTierPricesInner> tierPrices) {
    this.tierPrices = tierPrices;
  }

  /**
   * Defines product variant's quantity that has to be added
   **/
  @ApiModelProperty(value = "Defines product variant's quantity that has to be added")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   * This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
   **/
  @ApiModelProperty(value = "This parameter is used for selecting a warehouse where you need to set/modify a product quantity.")
  public String getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
  }

  /**
   * Set stock status
   **/
  @ApiModelProperty(value = "Set stock status")
  public Boolean getInStock() {
    return inStock;
  }
  public void setInStock(Boolean inStock) {
    this.inStock = inStock;
  }

  /**
   * Set backorder status
   **/
  @ApiModelProperty(value = "Set backorder status")
  public String getBackorderStatus() {
    return backorderStatus;
  }
  public void setBackorderStatus(String backorderStatus) {
    this.backorderStatus = backorderStatus;
  }

  /**
   * Defines inventory tracking for product variant
   **/
  @ApiModelProperty(value = "Defines inventory tracking for product variant")
  public Boolean getManageStock() {
    return manageStock;
  }
  public void setManageStock(Boolean manageStock) {
    this.manageStock = manageStock;
  }

  /**
   * Weight
   **/
  @ApiModelProperty(value = "Weight")
  public BigDecimal getWeight() {
    return weight;
  }
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  /**
   * Defines product's width
   **/
  @ApiModelProperty(value = "Defines product's width")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   * Defines product's height
   **/
  @ApiModelProperty(value = "Defines product's height")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   * Defines product's length
   **/
  @ApiModelProperty(value = "Defines product's length")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   * Weight Unit
   **/
  @ApiModelProperty(value = "Weight Unit")
  public String getWeightUnit() {
    return weightUnit;
  }
  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

  /**
   * Defines variant's sku that has to be added
   **/
  @ApiModelProperty(value = "Defines variant's sku that has to be added")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * A barcode is a unique code composed of numbers used as a product identifier.
   **/
  @ApiModelProperty(value = "A barcode is a unique code composed of numbers used as a product identifier.")
  public String getBarcode() {
    return barcode;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * Global Trade Item Number. An GTIN is an identifier for trade items.
   **/
  @ApiModelProperty(value = "Global Trade Item Number. An GTIN is an identifier for trade items.")
  public String getGtin() {
    return gtin;
  }
  public void setGtin(String gtin) {
    this.gtin = gtin;
  }

  /**
   * Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
   **/
  @ApiModelProperty(value = "Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  /**
   * European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
   **/
  @ApiModelProperty(value = "European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.")
  public String getEan() {
    return ean;
  }
  public void setEan(String ean) {
    this.ean = ean;
  }

  /**
   * Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
   **/
  @ApiModelProperty(value = "Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.")
  public String getMpn() {
    return mpn;
  }
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  /**
   * International Standard Book Number. An ISBN is a unique identifier for books.
   **/
  @ApiModelProperty(value = "International Standard Book Number. An ISBN is a unique identifier for books.")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   * Specifies the product variant's manufacturer
   **/
  @ApiModelProperty(value = "Specifies the product variant's manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Defines the date of entity creation
   **/
  @ApiModelProperty(value = "Defines the date of entity creation")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Defines unique meta title for each entity
   **/
  @ApiModelProperty(value = "Defines unique meta title for each entity")
  public String getMetaTitle() {
    return metaTitle;
  }
  public void setMetaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
  }

  /**
   * Defines unique meta keywords for each entity
   **/
  @ApiModelProperty(value = "Defines unique meta keywords for each entity")
  public String getMetaKeywords() {
    return metaKeywords;
  }
  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  /**
   * Defines unique meta description of a entity
   **/
  @ApiModelProperty(value = "Defines unique meta description of a entity")
  public String getMetaDescription() {
    return metaDescription;
  }
  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  /**
   * Defines unique product variant's URL
   **/
  @ApiModelProperty(value = "Defines unique product variant's URL")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Defines tax classes where entity has to be added
   **/
  @ApiModelProperty(value = "Defines tax classes where entity has to be added")
  public String getTaxClassId() {
    return taxClassId;
  }
  public void setTaxClassId(String taxClassId) {
    this.taxClassId = taxClassId;
  }

  /**
   * Specifies whether a tax is charged
   **/
  @ApiModelProperty(value = "Specifies whether a tax is charged")
  public Boolean getTaxable() {
    return taxable;
  }
  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * Specifies fixed cost shipping price
   **/
  @ApiModelProperty(value = "Specifies fixed cost shipping price")
  public BigDecimal getFixedCostShippingPrice() {
    return fixedCostShippingPrice;
  }
  public void setFixedCostShippingPrice(BigDecimal fixedCostShippingPrice) {
    this.fixedCostShippingPrice = fixedCostShippingPrice;
  }

  /**
   * Specifies variant's free shipping flag that has to be added
   **/
  @ApiModelProperty(value = "Specifies variant's free shipping flag that has to be added")
  public Boolean getIsFreeShipping() {
    return isFreeShipping;
  }
  public void setIsFreeShipping(Boolean isFreeShipping) {
    this.isFreeShipping = isFreeShipping;
  }

  /**
   * The country where the inventory item was made
   **/
  @ApiModelProperty(value = "The country where the inventory item was made")
  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }
  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  /**
   * Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes
   **/
  @ApiModelProperty(value = "Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes")
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }
  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * String containing the JSON representation of the supplied data
   **/
  @ApiModelProperty(value = "String containing the JSON representation of the supplied data")
  public String getMarketplaceItemProperties() {
    return marketplaceItemProperties;
  }
  public void setMarketplaceItemProperties(String marketplaceItemProperties) {
    this.marketplaceItemProperties = marketplaceItemProperties;
  }

  /**
   * Is cache clear required
   **/
  @ApiModelProperty(value = "Is cache clear required")
  public Boolean getClearCache() {
    return clearCache;
  }
  public void setClearCache(Boolean clearCache) {
    this.clearCache = clearCache;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariantAdd productVariantAdd = (ProductVariantAdd) o;
    return (this.productId == null ? productVariantAdd.productId == null : this.productId.equals(productVariantAdd.productId)) &&
        (this.attributes == null ? productVariantAdd.attributes == null : this.attributes.equals(productVariantAdd.attributes)) &&
        (this.name == null ? productVariantAdd.name == null : this.name.equals(productVariantAdd.name)) &&
        (this.model == null ? productVariantAdd.model == null : this.model.equals(productVariantAdd.model)) &&
        (this.description == null ? productVariantAdd.description == null : this.description.equals(productVariantAdd.description)) &&
        (this.shortDescription == null ? productVariantAdd.shortDescription == null : this.shortDescription.equals(productVariantAdd.shortDescription)) &&
        (this.availableForView == null ? productVariantAdd.availableForView == null : this.availableForView.equals(productVariantAdd.availableForView)) &&
        (this.availableForSale == null ? productVariantAdd.availableForSale == null : this.availableForSale.equals(productVariantAdd.availableForSale)) &&
        (this.isVirtual == null ? productVariantAdd.isVirtual == null : this.isVirtual.equals(productVariantAdd.isVirtual)) &&
        (this.isDefault == null ? productVariantAdd.isDefault == null : this.isDefault.equals(productVariantAdd.isDefault)) &&
        (this.storeId == null ? productVariantAdd.storeId == null : this.storeId.equals(productVariantAdd.storeId)) &&
        (this.storesIds == null ? productVariantAdd.storesIds == null : this.storesIds.equals(productVariantAdd.storesIds)) &&
        (this.langId == null ? productVariantAdd.langId == null : this.langId.equals(productVariantAdd.langId)) &&
        (this.price == null ? productVariantAdd.price == null : this.price.equals(productVariantAdd.price)) &&
        (this.oldPrice == null ? productVariantAdd.oldPrice == null : this.oldPrice.equals(productVariantAdd.oldPrice)) &&
        (this.costPrice == null ? productVariantAdd.costPrice == null : this.costPrice.equals(productVariantAdd.costPrice)) &&
        (this.specialPrice == null ? productVariantAdd.specialPrice == null : this.specialPrice.equals(productVariantAdd.specialPrice)) &&
        (this.spriceCreate == null ? productVariantAdd.spriceCreate == null : this.spriceCreate.equals(productVariantAdd.spriceCreate)) &&
        (this.spriceModified == null ? productVariantAdd.spriceModified == null : this.spriceModified.equals(productVariantAdd.spriceModified)) &&
        (this.spriceExpire == null ? productVariantAdd.spriceExpire == null : this.spriceExpire.equals(productVariantAdd.spriceExpire)) &&
        (this.tierPrices == null ? productVariantAdd.tierPrices == null : this.tierPrices.equals(productVariantAdd.tierPrices)) &&
        (this.quantity == null ? productVariantAdd.quantity == null : this.quantity.equals(productVariantAdd.quantity)) &&
        (this.warehouseId == null ? productVariantAdd.warehouseId == null : this.warehouseId.equals(productVariantAdd.warehouseId)) &&
        (this.inStock == null ? productVariantAdd.inStock == null : this.inStock.equals(productVariantAdd.inStock)) &&
        (this.backorderStatus == null ? productVariantAdd.backorderStatus == null : this.backorderStatus.equals(productVariantAdd.backorderStatus)) &&
        (this.manageStock == null ? productVariantAdd.manageStock == null : this.manageStock.equals(productVariantAdd.manageStock)) &&
        (this.weight == null ? productVariantAdd.weight == null : this.weight.equals(productVariantAdd.weight)) &&
        (this.width == null ? productVariantAdd.width == null : this.width.equals(productVariantAdd.width)) &&
        (this.height == null ? productVariantAdd.height == null : this.height.equals(productVariantAdd.height)) &&
        (this.length == null ? productVariantAdd.length == null : this.length.equals(productVariantAdd.length)) &&
        (this.weightUnit == null ? productVariantAdd.weightUnit == null : this.weightUnit.equals(productVariantAdd.weightUnit)) &&
        (this.sku == null ? productVariantAdd.sku == null : this.sku.equals(productVariantAdd.sku)) &&
        (this.barcode == null ? productVariantAdd.barcode == null : this.barcode.equals(productVariantAdd.barcode)) &&
        (this.gtin == null ? productVariantAdd.gtin == null : this.gtin.equals(productVariantAdd.gtin)) &&
        (this.upc == null ? productVariantAdd.upc == null : this.upc.equals(productVariantAdd.upc)) &&
        (this.ean == null ? productVariantAdd.ean == null : this.ean.equals(productVariantAdd.ean)) &&
        (this.mpn == null ? productVariantAdd.mpn == null : this.mpn.equals(productVariantAdd.mpn)) &&
        (this.isbn == null ? productVariantAdd.isbn == null : this.isbn.equals(productVariantAdd.isbn)) &&
        (this.manufacturer == null ? productVariantAdd.manufacturer == null : this.manufacturer.equals(productVariantAdd.manufacturer)) &&
        (this.createdAt == null ? productVariantAdd.createdAt == null : this.createdAt.equals(productVariantAdd.createdAt)) &&
        (this.metaTitle == null ? productVariantAdd.metaTitle == null : this.metaTitle.equals(productVariantAdd.metaTitle)) &&
        (this.metaKeywords == null ? productVariantAdd.metaKeywords == null : this.metaKeywords.equals(productVariantAdd.metaKeywords)) &&
        (this.metaDescription == null ? productVariantAdd.metaDescription == null : this.metaDescription.equals(productVariantAdd.metaDescription)) &&
        (this.url == null ? productVariantAdd.url == null : this.url.equals(productVariantAdd.url)) &&
        (this.taxClassId == null ? productVariantAdd.taxClassId == null : this.taxClassId.equals(productVariantAdd.taxClassId)) &&
        (this.taxable == null ? productVariantAdd.taxable == null : this.taxable.equals(productVariantAdd.taxable)) &&
        (this.fixedCostShippingPrice == null ? productVariantAdd.fixedCostShippingPrice == null : this.fixedCostShippingPrice.equals(productVariantAdd.fixedCostShippingPrice)) &&
        (this.isFreeShipping == null ? productVariantAdd.isFreeShipping == null : this.isFreeShipping.equals(productVariantAdd.isFreeShipping)) &&
        (this.countryOfOrigin == null ? productVariantAdd.countryOfOrigin == null : this.countryOfOrigin.equals(productVariantAdd.countryOfOrigin)) &&
        (this.harmonizedSystemCode == null ? productVariantAdd.harmonizedSystemCode == null : this.harmonizedSystemCode.equals(productVariantAdd.harmonizedSystemCode)) &&
        (this.marketplaceItemProperties == null ? productVariantAdd.marketplaceItemProperties == null : this.marketplaceItemProperties.equals(productVariantAdd.marketplaceItemProperties)) &&
        (this.clearCache == null ? productVariantAdd.clearCache == null : this.clearCache.equals(productVariantAdd.clearCache));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.availableForView == null ? 0: this.availableForView.hashCode());
    result = 31 * result + (this.availableForSale == null ? 0: this.availableForSale.hashCode());
    result = 31 * result + (this.isVirtual == null ? 0: this.isVirtual.hashCode());
    result = 31 * result + (this.isDefault == null ? 0: this.isDefault.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    result = 31 * result + (this.storesIds == null ? 0: this.storesIds.hashCode());
    result = 31 * result + (this.langId == null ? 0: this.langId.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.oldPrice == null ? 0: this.oldPrice.hashCode());
    result = 31 * result + (this.costPrice == null ? 0: this.costPrice.hashCode());
    result = 31 * result + (this.specialPrice == null ? 0: this.specialPrice.hashCode());
    result = 31 * result + (this.spriceCreate == null ? 0: this.spriceCreate.hashCode());
    result = 31 * result + (this.spriceModified == null ? 0: this.spriceModified.hashCode());
    result = 31 * result + (this.spriceExpire == null ? 0: this.spriceExpire.hashCode());
    result = 31 * result + (this.tierPrices == null ? 0: this.tierPrices.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.warehouseId == null ? 0: this.warehouseId.hashCode());
    result = 31 * result + (this.inStock == null ? 0: this.inStock.hashCode());
    result = 31 * result + (this.backorderStatus == null ? 0: this.backorderStatus.hashCode());
    result = 31 * result + (this.manageStock == null ? 0: this.manageStock.hashCode());
    result = 31 * result + (this.weight == null ? 0: this.weight.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.length == null ? 0: this.length.hashCode());
    result = 31 * result + (this.weightUnit == null ? 0: this.weightUnit.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.barcode == null ? 0: this.barcode.hashCode());
    result = 31 * result + (this.gtin == null ? 0: this.gtin.hashCode());
    result = 31 * result + (this.upc == null ? 0: this.upc.hashCode());
    result = 31 * result + (this.ean == null ? 0: this.ean.hashCode());
    result = 31 * result + (this.mpn == null ? 0: this.mpn.hashCode());
    result = 31 * result + (this.isbn == null ? 0: this.isbn.hashCode());
    result = 31 * result + (this.manufacturer == null ? 0: this.manufacturer.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.metaTitle == null ? 0: this.metaTitle.hashCode());
    result = 31 * result + (this.metaKeywords == null ? 0: this.metaKeywords.hashCode());
    result = 31 * result + (this.metaDescription == null ? 0: this.metaDescription.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.taxClassId == null ? 0: this.taxClassId.hashCode());
    result = 31 * result + (this.taxable == null ? 0: this.taxable.hashCode());
    result = 31 * result + (this.fixedCostShippingPrice == null ? 0: this.fixedCostShippingPrice.hashCode());
    result = 31 * result + (this.isFreeShipping == null ? 0: this.isFreeShipping.hashCode());
    result = 31 * result + (this.countryOfOrigin == null ? 0: this.countryOfOrigin.hashCode());
    result = 31 * result + (this.harmonizedSystemCode == null ? 0: this.harmonizedSystemCode.hashCode());
    result = 31 * result + (this.marketplaceItemProperties == null ? 0: this.marketplaceItemProperties.hashCode());
    result = 31 * result + (this.clearCache == null ? 0: this.clearCache.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantAdd {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  availableForView: ").append(availableForView).append("\n");
    sb.append("  availableForSale: ").append(availableForSale).append("\n");
    sb.append("  isVirtual: ").append(isVirtual).append("\n");
    sb.append("  isDefault: ").append(isDefault).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  storesIds: ").append(storesIds).append("\n");
    sb.append("  langId: ").append(langId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  oldPrice: ").append(oldPrice).append("\n");
    sb.append("  costPrice: ").append(costPrice).append("\n");
    sb.append("  specialPrice: ").append(specialPrice).append("\n");
    sb.append("  spriceCreate: ").append(spriceCreate).append("\n");
    sb.append("  spriceModified: ").append(spriceModified).append("\n");
    sb.append("  spriceExpire: ").append(spriceExpire).append("\n");
    sb.append("  tierPrices: ").append(tierPrices).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  warehouseId: ").append(warehouseId).append("\n");
    sb.append("  inStock: ").append(inStock).append("\n");
    sb.append("  backorderStatus: ").append(backorderStatus).append("\n");
    sb.append("  manageStock: ").append(manageStock).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  length: ").append(length).append("\n");
    sb.append("  weightUnit: ").append(weightUnit).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  barcode: ").append(barcode).append("\n");
    sb.append("  gtin: ").append(gtin).append("\n");
    sb.append("  upc: ").append(upc).append("\n");
    sb.append("  ean: ").append(ean).append("\n");
    sb.append("  mpn: ").append(mpn).append("\n");
    sb.append("  isbn: ").append(isbn).append("\n");
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  metaTitle: ").append(metaTitle).append("\n");
    sb.append("  metaKeywords: ").append(metaKeywords).append("\n");
    sb.append("  metaDescription: ").append(metaDescription).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  taxClassId: ").append(taxClassId).append("\n");
    sb.append("  taxable: ").append(taxable).append("\n");
    sb.append("  fixedCostShippingPrice: ").append(fixedCostShippingPrice).append("\n");
    sb.append("  isFreeShipping: ").append(isFreeShipping).append("\n");
    sb.append("  countryOfOrigin: ").append(countryOfOrigin).append("\n");
    sb.append("  harmonizedSystemCode: ").append(harmonizedSystemCode).append("\n");
    sb.append("  marketplaceItemProperties: ").append(marketplaceItemProperties).append("\n");
    sb.append("  clearCache: ").append(clearCache).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
