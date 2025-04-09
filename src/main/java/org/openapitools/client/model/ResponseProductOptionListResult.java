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
import org.openapitools.client.model.ProductOption;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResponseProductOptionListResult {
  
  @SerializedName("option")
  private List<ProductOption> option = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductOption> getOption() {
    return option;
  }
  public void setOption(List<ProductOption> option) {
    this.option = option;
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
    ResponseProductOptionListResult responseProductOptionListResult = (ResponseProductOptionListResult) o;
    return (this.option == null ? responseProductOptionListResult.option == null : this.option.equals(responseProductOptionListResult.option)) &&
        (this.additionalFields == null ? responseProductOptionListResult.additionalFields == null : this.additionalFields.equals(responseProductOptionListResult.additionalFields)) &&
        (this.customFields == null ? responseProductOptionListResult.customFields == null : this.customFields.equals(responseProductOptionListResult.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.option == null ? 0: this.option.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProductOptionListResult {\n");
    
    sb.append("  option: ").append(option).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
