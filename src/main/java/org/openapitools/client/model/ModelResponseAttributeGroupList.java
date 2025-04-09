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

import org.openapitools.client.model.Pagination;
import org.openapitools.client.model.ResponseAttributeGroupListResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelResponseAttributeGroupList {
  
  @SerializedName("return_code")
  private Integer returnCode = null;
  @SerializedName("return_message")
  private String returnMessage = null;
  @SerializedName("pagination")
  private Pagination pagination = null;
  @SerializedName("result")
  private ResponseAttributeGroupListResult result = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReturnCode() {
    return returnCode;
  }
  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReturnMessage() {
    return returnMessage;
  }
  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ResponseAttributeGroupListResult getResult() {
    return result;
  }
  public void setResult(ResponseAttributeGroupListResult result) {
    this.result = result;
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
    ModelResponseAttributeGroupList modelResponseAttributeGroupList = (ModelResponseAttributeGroupList) o;
    return (this.returnCode == null ? modelResponseAttributeGroupList.returnCode == null : this.returnCode.equals(modelResponseAttributeGroupList.returnCode)) &&
        (this.returnMessage == null ? modelResponseAttributeGroupList.returnMessage == null : this.returnMessage.equals(modelResponseAttributeGroupList.returnMessage)) &&
        (this.pagination == null ? modelResponseAttributeGroupList.pagination == null : this.pagination.equals(modelResponseAttributeGroupList.pagination)) &&
        (this.result == null ? modelResponseAttributeGroupList.result == null : this.result.equals(modelResponseAttributeGroupList.result)) &&
        (this.additionalFields == null ? modelResponseAttributeGroupList.additionalFields == null : this.additionalFields.equals(modelResponseAttributeGroupList.additionalFields)) &&
        (this.customFields == null ? modelResponseAttributeGroupList.customFields == null : this.customFields.equals(modelResponseAttributeGroupList.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.returnCode == null ? 0: this.returnCode.hashCode());
    result = 31 * result + (this.returnMessage == null ? 0: this.returnMessage.hashCode());
    result = 31 * result + (this.pagination == null ? 0: this.pagination.hashCode());
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelResponseAttributeGroupList {\n");
    
    sb.append("  returnCode: ").append(returnCode).append("\n");
    sb.append("  returnMessage: ").append(returnMessage).append("\n");
    sb.append("  pagination: ").append(pagination).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
