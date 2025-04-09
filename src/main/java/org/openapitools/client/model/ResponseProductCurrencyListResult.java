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
import org.openapitools.client.model.Currency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResponseProductCurrencyListResult {
  
  @SerializedName("total_count")
  private Integer totalCount = null;
  @SerializedName("currency")
  private List<Currency> currency = null;
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
  public List<Currency> getCurrency() {
    return currency;
  }
  public void setCurrency(List<Currency> currency) {
    this.currency = currency;
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
    ResponseProductCurrencyListResult responseProductCurrencyListResult = (ResponseProductCurrencyListResult) o;
    return (this.totalCount == null ? responseProductCurrencyListResult.totalCount == null : this.totalCount.equals(responseProductCurrencyListResult.totalCount)) &&
        (this.currency == null ? responseProductCurrencyListResult.currency == null : this.currency.equals(responseProductCurrencyListResult.currency)) &&
        (this.additionalFields == null ? responseProductCurrencyListResult.additionalFields == null : this.additionalFields.equals(responseProductCurrencyListResult.additionalFields)) &&
        (this.customFields == null ? responseProductCurrencyListResult.customFields == null : this.customFields.equals(responseProductCurrencyListResult.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalCount == null ? 0: this.totalCount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProductCurrencyListResult {\n");
    
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
