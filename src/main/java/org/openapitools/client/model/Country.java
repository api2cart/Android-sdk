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
public class Country {
  
  @SerializedName("code2")
  private String code2 = null;
  @SerializedName("code3")
  private String code3 = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode2() {
    return code2;
  }
  public void setCode2(String code2) {
    this.code2 = code2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode3() {
    return code3;
  }
  public void setCode3(String code3) {
    this.code3 = code3;
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
    Country country = (Country) o;
    return (this.code2 == null ? country.code2 == null : this.code2.equals(country.code2)) &&
        (this.code3 == null ? country.code3 == null : this.code3.equals(country.code3)) &&
        (this.name == null ? country.name == null : this.name.equals(country.name)) &&
        (this.additionalFields == null ? country.additionalFields == null : this.additionalFields.equals(country.additionalFields)) &&
        (this.customFields == null ? country.customFields == null : this.customFields.equals(country.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code2 == null ? 0: this.code2.hashCode());
    result = 31 * result + (this.code3 == null ? 0: this.code3.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("  code2: ").append(code2).append("\n");
    sb.append("  code3: ").append(code3).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
