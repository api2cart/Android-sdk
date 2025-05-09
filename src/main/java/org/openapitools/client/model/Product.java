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
import org.openapitools.client.model.Discount;
import org.openapitools.client.model.Image;
import org.openapitools.client.model.ProductAdvancedPrice;
import org.openapitools.client.model.ProductGroupItem;
import org.openapitools.client.model.ProductGroupPrice;
import org.openapitools.client.model.ProductInventory;
import org.openapitools.client.model.ProductOption;
import org.openapitools.client.model.ProductTierPrice;
import org.openapitools.client.model.SpecialPrice;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Product {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("u_model")
  private String uModel = null;
  @SerializedName("u_sku")
  private String uSku = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("short_description")
  private String shortDescription = null;
  @SerializedName("price")
  private BigDecimal price = null;
  @SerializedName("advanced_price")
  private List<ProductAdvancedPrice> advancedPrice = null;
  @SerializedName("cost_price")
  private BigDecimal costPrice = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("inventory")
  private List<ProductInventory> inventory = null;
  @SerializedName("group_items")
  private List<ProductGroupItem> groupItems = null;
  @SerializedName("u_brand_id")
  private String uBrandId = null;
  @SerializedName("u_brand")
  private String uBrand = null;
  @SerializedName("categories_ids")
  private List<String> categoriesIds = null;
  @SerializedName("stores_ids")
  private List<String> storesIds = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("seo_url")
  private String seoUrl = null;
  @SerializedName("meta_title")
  private String metaTitle = null;
  @SerializedName("meta_keywords")
  private String metaKeywords = null;
  @SerializedName("meta_description")
  private String metaDescription = null;
  @SerializedName("avail_sale")
  private Boolean availSale = null;
  @SerializedName("avail_view")
  private Boolean availView = null;
  @SerializedName("is_virtual")
  private Boolean isVirtual = null;
  @SerializedName("is_downloadable")
  private Boolean isDownloadable = null;
  @SerializedName("weight")
  private BigDecimal weight = null;
  @SerializedName("weight_unit")
  private String weightUnit = null;
  @SerializedName("sort_order")
  private Integer sortOrder = null;
  @SerializedName("in_stock")
  private Boolean inStock = null;
  @SerializedName("on_sale")
  private Boolean onSale = null;
  @SerializedName("backorders")
  private String backorders = null;
  @SerializedName("manage_stock")
  private String manageStock = null;
  @SerializedName("is_stock_managed")
  private Boolean isStockManaged = null;
  @SerializedName("create_at")
  private A2CDateTime createAt = null;
  @SerializedName("modified_at")
  private A2CDateTime modifiedAt = null;
  @SerializedName("tax_class_id")
  private String taxClassId = null;
  @SerializedName("special_price")
  private SpecialPrice specialPrice = null;
  @SerializedName("tier_price")
  private List<ProductTierPrice> tierPrice = null;
  @SerializedName("group_price")
  private List<ProductGroupPrice> groupPrice = null;
  @SerializedName("images")
  private List<Image> images = null;
  @SerializedName("product_options")
  private List<ProductOption> productOptions = null;
  @SerializedName("u_upc")
  private String uUpc = null;
  @SerializedName("u_mpn")
  private String uMpn = null;
  @SerializedName("u_gtin")
  private String uGtin = null;
  @SerializedName("u_isbn")
  private String uIsbn = null;
  @SerializedName("u_ean")
  private String uEan = null;
  @SerializedName("related_products_ids")
  private List<String> relatedProductsIds = null;
  @SerializedName("up_sell_products_ids")
  private List<String> upSellProductsIds = null;
  @SerializedName("cross_sell_products_ids")
  private List<String> crossSellProductsIds = null;
  @SerializedName("dimensions_unit")
  private String dimensionsUnit = null;
  @SerializedName("width")
  private BigDecimal width = null;
  @SerializedName("height")
  private BigDecimal height = null;
  @SerializedName("length")
  private BigDecimal length = null;
  @SerializedName("discounts")
  private List<Discount> discounts = null;
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
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUModel() {
    return uModel;
  }
  public void setUModel(String uModel) {
    this.uModel = uModel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUSku() {
    return uSku;
  }
  public void setUSku(String uSku) {
    this.uSku = uSku;
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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductAdvancedPrice> getAdvancedPrice() {
    return advancedPrice;
  }
  public void setAdvancedPrice(List<ProductAdvancedPrice> advancedPrice) {
    this.advancedPrice = advancedPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCostPrice() {
    return costPrice;
  }
  public void setCostPrice(BigDecimal costPrice) {
    this.costPrice = costPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductInventory> getInventory() {
    return inventory;
  }
  public void setInventory(List<ProductInventory> inventory) {
    this.inventory = inventory;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductGroupItem> getGroupItems() {
    return groupItems;
  }
  public void setGroupItems(List<ProductGroupItem> groupItems) {
    this.groupItems = groupItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUBrandId() {
    return uBrandId;
  }
  public void setUBrandId(String uBrandId) {
    this.uBrandId = uBrandId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUBrand() {
    return uBrand;
  }
  public void setUBrand(String uBrand) {
    this.uBrand = uBrand;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCategoriesIds() {
    return categoriesIds;
  }
  public void setCategoriesIds(List<String> categoriesIds) {
    this.categoriesIds = categoriesIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getStoresIds() {
    return storesIds;
  }
  public void setStoresIds(List<String> storesIds) {
    this.storesIds = storesIds;
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
  public String getSeoUrl() {
    return seoUrl;
  }
  public void setSeoUrl(String seoUrl) {
    this.seoUrl = seoUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMetaTitle() {
    return metaTitle;
  }
  public void setMetaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMetaKeywords() {
    return metaKeywords;
  }
  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMetaDescription() {
    return metaDescription;
  }
  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAvailSale() {
    return availSale;
  }
  public void setAvailSale(Boolean availSale) {
    this.availSale = availSale;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAvailView() {
    return availView;
  }
  public void setAvailView(Boolean availView) {
    this.availView = availView;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsVirtual() {
    return isVirtual;
  }
  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsDownloadable() {
    return isDownloadable;
  }
  public void setIsDownloadable(Boolean isDownloadable) {
    this.isDownloadable = isDownloadable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeight() {
    return weight;
  }
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWeightUnit() {
    return weightUnit;
  }
  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getInStock() {
    return inStock;
  }
  public void setInStock(Boolean inStock) {
    this.inStock = inStock;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getOnSale() {
    return onSale;
  }
  public void setOnSale(Boolean onSale) {
    this.onSale = onSale;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBackorders() {
    return backorders;
  }
  public void setBackorders(String backorders) {
    this.backorders = backorders;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getManageStock() {
    return manageStock;
  }
  public void setManageStock(String manageStock) {
    this.manageStock = manageStock;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsStockManaged() {
    return isStockManaged;
  }
  public void setIsStockManaged(Boolean isStockManaged) {
    this.isStockManaged = isStockManaged;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getCreateAt() {
    return createAt;
  }
  public void setCreateAt(A2CDateTime createAt) {
    this.createAt = createAt;
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
  public String getTaxClassId() {
    return taxClassId;
  }
  public void setTaxClassId(String taxClassId) {
    this.taxClassId = taxClassId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SpecialPrice getSpecialPrice() {
    return specialPrice;
  }
  public void setSpecialPrice(SpecialPrice specialPrice) {
    this.specialPrice = specialPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductTierPrice> getTierPrice() {
    return tierPrice;
  }
  public void setTierPrice(List<ProductTierPrice> tierPrice) {
    this.tierPrice = tierPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductGroupPrice> getGroupPrice() {
    return groupPrice;
  }
  public void setGroupPrice(List<ProductGroupPrice> groupPrice) {
    this.groupPrice = groupPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductOption> getProductOptions() {
    return productOptions;
  }
  public void setProductOptions(List<ProductOption> productOptions) {
    this.productOptions = productOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUUpc() {
    return uUpc;
  }
  public void setUUpc(String uUpc) {
    this.uUpc = uUpc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUMpn() {
    return uMpn;
  }
  public void setUMpn(String uMpn) {
    this.uMpn = uMpn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUGtin() {
    return uGtin;
  }
  public void setUGtin(String uGtin) {
    this.uGtin = uGtin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUIsbn() {
    return uIsbn;
  }
  public void setUIsbn(String uIsbn) {
    this.uIsbn = uIsbn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUEan() {
    return uEan;
  }
  public void setUEan(String uEan) {
    this.uEan = uEan;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRelatedProductsIds() {
    return relatedProductsIds;
  }
  public void setRelatedProductsIds(List<String> relatedProductsIds) {
    this.relatedProductsIds = relatedProductsIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getUpSellProductsIds() {
    return upSellProductsIds;
  }
  public void setUpSellProductsIds(List<String> upSellProductsIds) {
    this.upSellProductsIds = upSellProductsIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCrossSellProductsIds() {
    return crossSellProductsIds;
  }
  public void setCrossSellProductsIds(List<String> crossSellProductsIds) {
    this.crossSellProductsIds = crossSellProductsIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDimensionsUnit() {
    return dimensionsUnit;
  }
  public void setDimensionsUnit(String dimensionsUnit) {
    this.dimensionsUnit = dimensionsUnit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Discount> getDiscounts() {
    return discounts;
  }
  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
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
    Product product = (Product) o;
    return (this.id == null ? product.id == null : this.id.equals(product.id)) &&
        (this.type == null ? product.type == null : this.type.equals(product.type)) &&
        (this.uModel == null ? product.uModel == null : this.uModel.equals(product.uModel)) &&
        (this.uSku == null ? product.uSku == null : this.uSku.equals(product.uSku)) &&
        (this.name == null ? product.name == null : this.name.equals(product.name)) &&
        (this.description == null ? product.description == null : this.description.equals(product.description)) &&
        (this.shortDescription == null ? product.shortDescription == null : this.shortDescription.equals(product.shortDescription)) &&
        (this.price == null ? product.price == null : this.price.equals(product.price)) &&
        (this.advancedPrice == null ? product.advancedPrice == null : this.advancedPrice.equals(product.advancedPrice)) &&
        (this.costPrice == null ? product.costPrice == null : this.costPrice.equals(product.costPrice)) &&
        (this.quantity == null ? product.quantity == null : this.quantity.equals(product.quantity)) &&
        (this.inventory == null ? product.inventory == null : this.inventory.equals(product.inventory)) &&
        (this.groupItems == null ? product.groupItems == null : this.groupItems.equals(product.groupItems)) &&
        (this.uBrandId == null ? product.uBrandId == null : this.uBrandId.equals(product.uBrandId)) &&
        (this.uBrand == null ? product.uBrand == null : this.uBrand.equals(product.uBrand)) &&
        (this.categoriesIds == null ? product.categoriesIds == null : this.categoriesIds.equals(product.categoriesIds)) &&
        (this.storesIds == null ? product.storesIds == null : this.storesIds.equals(product.storesIds)) &&
        (this.url == null ? product.url == null : this.url.equals(product.url)) &&
        (this.seoUrl == null ? product.seoUrl == null : this.seoUrl.equals(product.seoUrl)) &&
        (this.metaTitle == null ? product.metaTitle == null : this.metaTitle.equals(product.metaTitle)) &&
        (this.metaKeywords == null ? product.metaKeywords == null : this.metaKeywords.equals(product.metaKeywords)) &&
        (this.metaDescription == null ? product.metaDescription == null : this.metaDescription.equals(product.metaDescription)) &&
        (this.availSale == null ? product.availSale == null : this.availSale.equals(product.availSale)) &&
        (this.availView == null ? product.availView == null : this.availView.equals(product.availView)) &&
        (this.isVirtual == null ? product.isVirtual == null : this.isVirtual.equals(product.isVirtual)) &&
        (this.isDownloadable == null ? product.isDownloadable == null : this.isDownloadable.equals(product.isDownloadable)) &&
        (this.weight == null ? product.weight == null : this.weight.equals(product.weight)) &&
        (this.weightUnit == null ? product.weightUnit == null : this.weightUnit.equals(product.weightUnit)) &&
        (this.sortOrder == null ? product.sortOrder == null : this.sortOrder.equals(product.sortOrder)) &&
        (this.inStock == null ? product.inStock == null : this.inStock.equals(product.inStock)) &&
        (this.onSale == null ? product.onSale == null : this.onSale.equals(product.onSale)) &&
        (this.backorders == null ? product.backorders == null : this.backorders.equals(product.backorders)) &&
        (this.manageStock == null ? product.manageStock == null : this.manageStock.equals(product.manageStock)) &&
        (this.isStockManaged == null ? product.isStockManaged == null : this.isStockManaged.equals(product.isStockManaged)) &&
        (this.createAt == null ? product.createAt == null : this.createAt.equals(product.createAt)) &&
        (this.modifiedAt == null ? product.modifiedAt == null : this.modifiedAt.equals(product.modifiedAt)) &&
        (this.taxClassId == null ? product.taxClassId == null : this.taxClassId.equals(product.taxClassId)) &&
        (this.specialPrice == null ? product.specialPrice == null : this.specialPrice.equals(product.specialPrice)) &&
        (this.tierPrice == null ? product.tierPrice == null : this.tierPrice.equals(product.tierPrice)) &&
        (this.groupPrice == null ? product.groupPrice == null : this.groupPrice.equals(product.groupPrice)) &&
        (this.images == null ? product.images == null : this.images.equals(product.images)) &&
        (this.productOptions == null ? product.productOptions == null : this.productOptions.equals(product.productOptions)) &&
        (this.uUpc == null ? product.uUpc == null : this.uUpc.equals(product.uUpc)) &&
        (this.uMpn == null ? product.uMpn == null : this.uMpn.equals(product.uMpn)) &&
        (this.uGtin == null ? product.uGtin == null : this.uGtin.equals(product.uGtin)) &&
        (this.uIsbn == null ? product.uIsbn == null : this.uIsbn.equals(product.uIsbn)) &&
        (this.uEan == null ? product.uEan == null : this.uEan.equals(product.uEan)) &&
        (this.relatedProductsIds == null ? product.relatedProductsIds == null : this.relatedProductsIds.equals(product.relatedProductsIds)) &&
        (this.upSellProductsIds == null ? product.upSellProductsIds == null : this.upSellProductsIds.equals(product.upSellProductsIds)) &&
        (this.crossSellProductsIds == null ? product.crossSellProductsIds == null : this.crossSellProductsIds.equals(product.crossSellProductsIds)) &&
        (this.dimensionsUnit == null ? product.dimensionsUnit == null : this.dimensionsUnit.equals(product.dimensionsUnit)) &&
        (this.width == null ? product.width == null : this.width.equals(product.width)) &&
        (this.height == null ? product.height == null : this.height.equals(product.height)) &&
        (this.length == null ? product.length == null : this.length.equals(product.length)) &&
        (this.discounts == null ? product.discounts == null : this.discounts.equals(product.discounts)) &&
        (this.additionalFields == null ? product.additionalFields == null : this.additionalFields.equals(product.additionalFields)) &&
        (this.customFields == null ? product.customFields == null : this.customFields.equals(product.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.uModel == null ? 0: this.uModel.hashCode());
    result = 31 * result + (this.uSku == null ? 0: this.uSku.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.shortDescription == null ? 0: this.shortDescription.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.advancedPrice == null ? 0: this.advancedPrice.hashCode());
    result = 31 * result + (this.costPrice == null ? 0: this.costPrice.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.inventory == null ? 0: this.inventory.hashCode());
    result = 31 * result + (this.groupItems == null ? 0: this.groupItems.hashCode());
    result = 31 * result + (this.uBrandId == null ? 0: this.uBrandId.hashCode());
    result = 31 * result + (this.uBrand == null ? 0: this.uBrand.hashCode());
    result = 31 * result + (this.categoriesIds == null ? 0: this.categoriesIds.hashCode());
    result = 31 * result + (this.storesIds == null ? 0: this.storesIds.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.seoUrl == null ? 0: this.seoUrl.hashCode());
    result = 31 * result + (this.metaTitle == null ? 0: this.metaTitle.hashCode());
    result = 31 * result + (this.metaKeywords == null ? 0: this.metaKeywords.hashCode());
    result = 31 * result + (this.metaDescription == null ? 0: this.metaDescription.hashCode());
    result = 31 * result + (this.availSale == null ? 0: this.availSale.hashCode());
    result = 31 * result + (this.availView == null ? 0: this.availView.hashCode());
    result = 31 * result + (this.isVirtual == null ? 0: this.isVirtual.hashCode());
    result = 31 * result + (this.isDownloadable == null ? 0: this.isDownloadable.hashCode());
    result = 31 * result + (this.weight == null ? 0: this.weight.hashCode());
    result = 31 * result + (this.weightUnit == null ? 0: this.weightUnit.hashCode());
    result = 31 * result + (this.sortOrder == null ? 0: this.sortOrder.hashCode());
    result = 31 * result + (this.inStock == null ? 0: this.inStock.hashCode());
    result = 31 * result + (this.onSale == null ? 0: this.onSale.hashCode());
    result = 31 * result + (this.backorders == null ? 0: this.backorders.hashCode());
    result = 31 * result + (this.manageStock == null ? 0: this.manageStock.hashCode());
    result = 31 * result + (this.isStockManaged == null ? 0: this.isStockManaged.hashCode());
    result = 31 * result + (this.createAt == null ? 0: this.createAt.hashCode());
    result = 31 * result + (this.modifiedAt == null ? 0: this.modifiedAt.hashCode());
    result = 31 * result + (this.taxClassId == null ? 0: this.taxClassId.hashCode());
    result = 31 * result + (this.specialPrice == null ? 0: this.specialPrice.hashCode());
    result = 31 * result + (this.tierPrice == null ? 0: this.tierPrice.hashCode());
    result = 31 * result + (this.groupPrice == null ? 0: this.groupPrice.hashCode());
    result = 31 * result + (this.images == null ? 0: this.images.hashCode());
    result = 31 * result + (this.productOptions == null ? 0: this.productOptions.hashCode());
    result = 31 * result + (this.uUpc == null ? 0: this.uUpc.hashCode());
    result = 31 * result + (this.uMpn == null ? 0: this.uMpn.hashCode());
    result = 31 * result + (this.uGtin == null ? 0: this.uGtin.hashCode());
    result = 31 * result + (this.uIsbn == null ? 0: this.uIsbn.hashCode());
    result = 31 * result + (this.uEan == null ? 0: this.uEan.hashCode());
    result = 31 * result + (this.relatedProductsIds == null ? 0: this.relatedProductsIds.hashCode());
    result = 31 * result + (this.upSellProductsIds == null ? 0: this.upSellProductsIds.hashCode());
    result = 31 * result + (this.crossSellProductsIds == null ? 0: this.crossSellProductsIds.hashCode());
    result = 31 * result + (this.dimensionsUnit == null ? 0: this.dimensionsUnit.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.length == null ? 0: this.length.hashCode());
    result = 31 * result + (this.discounts == null ? 0: this.discounts.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  uModel: ").append(uModel).append("\n");
    sb.append("  uSku: ").append(uSku).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  shortDescription: ").append(shortDescription).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  advancedPrice: ").append(advancedPrice).append("\n");
    sb.append("  costPrice: ").append(costPrice).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  inventory: ").append(inventory).append("\n");
    sb.append("  groupItems: ").append(groupItems).append("\n");
    sb.append("  uBrandId: ").append(uBrandId).append("\n");
    sb.append("  uBrand: ").append(uBrand).append("\n");
    sb.append("  categoriesIds: ").append(categoriesIds).append("\n");
    sb.append("  storesIds: ").append(storesIds).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  seoUrl: ").append(seoUrl).append("\n");
    sb.append("  metaTitle: ").append(metaTitle).append("\n");
    sb.append("  metaKeywords: ").append(metaKeywords).append("\n");
    sb.append("  metaDescription: ").append(metaDescription).append("\n");
    sb.append("  availSale: ").append(availSale).append("\n");
    sb.append("  availView: ").append(availView).append("\n");
    sb.append("  isVirtual: ").append(isVirtual).append("\n");
    sb.append("  isDownloadable: ").append(isDownloadable).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  weightUnit: ").append(weightUnit).append("\n");
    sb.append("  sortOrder: ").append(sortOrder).append("\n");
    sb.append("  inStock: ").append(inStock).append("\n");
    sb.append("  onSale: ").append(onSale).append("\n");
    sb.append("  backorders: ").append(backorders).append("\n");
    sb.append("  manageStock: ").append(manageStock).append("\n");
    sb.append("  isStockManaged: ").append(isStockManaged).append("\n");
    sb.append("  createAt: ").append(createAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("  taxClassId: ").append(taxClassId).append("\n");
    sb.append("  specialPrice: ").append(specialPrice).append("\n");
    sb.append("  tierPrice: ").append(tierPrice).append("\n");
    sb.append("  groupPrice: ").append(groupPrice).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  productOptions: ").append(productOptions).append("\n");
    sb.append("  uUpc: ").append(uUpc).append("\n");
    sb.append("  uMpn: ").append(uMpn).append("\n");
    sb.append("  uGtin: ").append(uGtin).append("\n");
    sb.append("  uIsbn: ").append(uIsbn).append("\n");
    sb.append("  uEan: ").append(uEan).append("\n");
    sb.append("  relatedProductsIds: ").append(relatedProductsIds).append("\n");
    sb.append("  upSellProductsIds: ").append(upSellProductsIds).append("\n");
    sb.append("  crossSellProductsIds: ").append(crossSellProductsIds).append("\n");
    sb.append("  dimensionsUnit: ").append(dimensionsUnit).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  length: ").append(length).append("\n");
    sb.append("  discounts: ").append(discounts).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
