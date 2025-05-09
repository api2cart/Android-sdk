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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class StoreAttribute {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("default_values")
  private List<String> defaultValues = null;
  @SerializedName("position")
  private Integer position = null;
  @SerializedName("visible")
  private Boolean visible = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("system")
  private Boolean system = null;
  @SerializedName("values")
  private List<String> values = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("lang_id")
  private String langId = null;
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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getDefaultValues() {
    return defaultValues;
  }
  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSystem() {
    return system;
  }
  public void setSystem(Boolean system) {
    this.system = system;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLangId() {
    return langId;
  }
  public void setLangId(String langId) {
    this.langId = langId;
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
    StoreAttribute storeAttribute = (StoreAttribute) o;
    return (this.id == null ? storeAttribute.id == null : this.id.equals(storeAttribute.id)) &&
        (this.code == null ? storeAttribute.code == null : this.code.equals(storeAttribute.code)) &&
        (this.type == null ? storeAttribute.type == null : this.type.equals(storeAttribute.type)) &&
        (this.name == null ? storeAttribute.name == null : this.name.equals(storeAttribute.name)) &&
        (this.defaultValues == null ? storeAttribute.defaultValues == null : this.defaultValues.equals(storeAttribute.defaultValues)) &&
        (this.position == null ? storeAttribute.position == null : this.position.equals(storeAttribute.position)) &&
        (this.visible == null ? storeAttribute.visible == null : this.visible.equals(storeAttribute.visible)) &&
        (this.required == null ? storeAttribute.required == null : this.required.equals(storeAttribute.required)) &&
        (this.system == null ? storeAttribute.system == null : this.system.equals(storeAttribute.system)) &&
        (this.values == null ? storeAttribute.values == null : this.values.equals(storeAttribute.values)) &&
        (this.storeId == null ? storeAttribute.storeId == null : this.storeId.equals(storeAttribute.storeId)) &&
        (this.langId == null ? storeAttribute.langId == null : this.langId.equals(storeAttribute.langId)) &&
        (this.additionalFields == null ? storeAttribute.additionalFields == null : this.additionalFields.equals(storeAttribute.additionalFields)) &&
        (this.customFields == null ? storeAttribute.customFields == null : this.customFields.equals(storeAttribute.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.defaultValues == null ? 0: this.defaultValues.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.visible == null ? 0: this.visible.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.system == null ? 0: this.system.hashCode());
    result = 31 * result + (this.values == null ? 0: this.values.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    result = 31 * result + (this.langId == null ? 0: this.langId.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAttribute {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  defaultValues: ").append(defaultValues).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  visible: ").append(visible).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  system: ").append(system).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  langId: ").append(langId).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
