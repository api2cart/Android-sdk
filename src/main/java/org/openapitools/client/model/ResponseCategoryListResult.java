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
import org.openapitools.client.model.Category;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResponseCategoryListResult {
  
  @SerializedName("categories_count")
  private Integer categoriesCount = null;
  @SerializedName("category")
  private List<Category> category = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCategoriesCount() {
    return categoriesCount;
  }
  public void setCategoriesCount(Integer categoriesCount) {
    this.categoriesCount = categoriesCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Category> getCategory() {
    return category;
  }
  public void setCategory(List<Category> category) {
    this.category = category;
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
    ResponseCategoryListResult responseCategoryListResult = (ResponseCategoryListResult) o;
    return (this.categoriesCount == null ? responseCategoryListResult.categoriesCount == null : this.categoriesCount.equals(responseCategoryListResult.categoriesCount)) &&
        (this.category == null ? responseCategoryListResult.category == null : this.category.equals(responseCategoryListResult.category)) &&
        (this.additionalFields == null ? responseCategoryListResult.additionalFields == null : this.additionalFields.equals(responseCategoryListResult.additionalFields)) &&
        (this.customFields == null ? responseCategoryListResult.customFields == null : this.customFields.equals(responseCategoryListResult.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.categoriesCount == null ? 0: this.categoriesCount.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCategoryListResult {\n");
    
    sb.append("  categoriesCount: ").append(categoriesCount).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
