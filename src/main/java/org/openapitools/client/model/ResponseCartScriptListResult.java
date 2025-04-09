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
import org.openapitools.client.model.Script;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResponseCartScriptListResult {
  
  @SerializedName("total_count")
  private Integer totalCount = null;
  @SerializedName("scripts")
  private List<Script> scripts = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Script> getScripts() {
    return scripts;
  }
  public void setScripts(List<Script> scripts) {
    this.scripts = scripts;
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
    ResponseCartScriptListResult responseCartScriptListResult = (ResponseCartScriptListResult) o;
    return (this.totalCount == null ? responseCartScriptListResult.totalCount == null : this.totalCount.equals(responseCartScriptListResult.totalCount)) &&
        (this.scripts == null ? responseCartScriptListResult.scripts == null : this.scripts.equals(responseCartScriptListResult.scripts)) &&
        (this.additionalFields == null ? responseCartScriptListResult.additionalFields == null : this.additionalFields.equals(responseCartScriptListResult.additionalFields)) &&
        (this.customFields == null ? responseCartScriptListResult.customFields == null : this.customFields.equals(responseCartScriptListResult.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalCount == null ? 0: this.totalCount.hashCode());
    result = 31 * result + (this.scripts == null ? 0: this.scripts.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCartScriptListResult {\n");
    
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("  scripts: ").append(scripts).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
