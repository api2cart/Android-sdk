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
public class ProductVariantImageAdd {
  
  @SerializedName("product_id")
  private String productId = null;
  @SerializedName("product_variant_id")
  private String productVariantId = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("image_name")
  private String imageName = null;
  public enum TypeEnum {
     small,  base,  additional,  thumbnail, 
  };
  @SerializedName("type")
  private TypeEnum type = base;
  @SerializedName("url")
  private String url = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("mime")
  private String mime = null;
  @SerializedName("position")
  private Integer position = 0;
  @SerializedName("option_id")
  private String optionId = null;

  /**
   * Defines product id where the variant image has to be added
   **/
  @ApiModelProperty(value = "Defines product id where the variant image has to be added")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Defines product's variants specified by variant id
   **/
  @ApiModelProperty(required = true, value = "Defines product's variants specified by variant id")
  public String getProductVariantId() {
    return productVariantId;
  }
  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
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

  /**
   * Defines image's name
   **/
  @ApiModelProperty(required = true, value = "Defines image's name")
  public String getImageName() {
    return imageName;
  }
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  /**
   * Defines image's types that are specified by comma-separated list
   **/
  @ApiModelProperty(required = true, value = "Defines image's types that are specified by comma-separated list")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Defines URL of the image that has to be added
   **/
  @ApiModelProperty(value = "Defines URL of the image that has to be added")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Content(body) encoded in base64 of image file
   **/
  @ApiModelProperty(value = "Content(body) encoded in base64 of image file")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Defines alternative text that has to be attached to the picture
   **/
  @ApiModelProperty(value = "Defines alternative text that has to be attached to the picture")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.
   **/
  @ApiModelProperty(value = "Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }

  /**
   * Defines image’s position in the list
   **/
  @ApiModelProperty(value = "Defines image’s position in the list")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * Defines option id of the product variant for which the image will be added
   **/
  @ApiModelProperty(value = "Defines option id of the product variant for which the image will be added")
  public String getOptionId() {
    return optionId;
  }
  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariantImageAdd productVariantImageAdd = (ProductVariantImageAdd) o;
    return (this.productId == null ? productVariantImageAdd.productId == null : this.productId.equals(productVariantImageAdd.productId)) &&
        (this.productVariantId == null ? productVariantImageAdd.productVariantId == null : this.productVariantId.equals(productVariantImageAdd.productVariantId)) &&
        (this.storeId == null ? productVariantImageAdd.storeId == null : this.storeId.equals(productVariantImageAdd.storeId)) &&
        (this.imageName == null ? productVariantImageAdd.imageName == null : this.imageName.equals(productVariantImageAdd.imageName)) &&
        (this.type == null ? productVariantImageAdd.type == null : this.type.equals(productVariantImageAdd.type)) &&
        (this.url == null ? productVariantImageAdd.url == null : this.url.equals(productVariantImageAdd.url)) &&
        (this.content == null ? productVariantImageAdd.content == null : this.content.equals(productVariantImageAdd.content)) &&
        (this.label == null ? productVariantImageAdd.label == null : this.label.equals(productVariantImageAdd.label)) &&
        (this.mime == null ? productVariantImageAdd.mime == null : this.mime.equals(productVariantImageAdd.mime)) &&
        (this.position == null ? productVariantImageAdd.position == null : this.position.equals(productVariantImageAdd.position)) &&
        (this.optionId == null ? productVariantImageAdd.optionId == null : this.optionId.equals(productVariantImageAdd.optionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.productVariantId == null ? 0: this.productVariantId.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    result = 31 * result + (this.imageName == null ? 0: this.imageName.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.label == null ? 0: this.label.hashCode());
    result = 31 * result + (this.mime == null ? 0: this.mime.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.optionId == null ? 0: this.optionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantImageAdd {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  productVariantId: ").append(productVariantId).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  imageName: ").append(imageName).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  mime: ").append(mime).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  optionId: ").append(optionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
