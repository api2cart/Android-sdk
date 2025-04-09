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
import org.openapitools.client.model.CouponCondition;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogPriceRuleAction {
  
  @SerializedName("scope")
  private String scope = null;
  @SerializedName("apply_to")
  private String applyTo = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("value")
  private BigDecimal value = null;
  @SerializedName("currency_code")
  private String currencyCode = null;
  @SerializedName("include_tax")
  private Boolean includeTax = null;
  @SerializedName("conditions")
  private List<CouponCondition> conditions = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApplyTo() {
    return applyTo;
  }
  public void setApplyTo(String applyTo) {
    this.applyTo = applyTo;
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
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeTax() {
    return includeTax;
  }
  public void setIncludeTax(Boolean includeTax) {
    this.includeTax = includeTax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CouponCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<CouponCondition> conditions) {
    this.conditions = conditions;
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
    CatalogPriceRuleAction catalogPriceRuleAction = (CatalogPriceRuleAction) o;
    return (this.scope == null ? catalogPriceRuleAction.scope == null : this.scope.equals(catalogPriceRuleAction.scope)) &&
        (this.applyTo == null ? catalogPriceRuleAction.applyTo == null : this.applyTo.equals(catalogPriceRuleAction.applyTo)) &&
        (this.type == null ? catalogPriceRuleAction.type == null : this.type.equals(catalogPriceRuleAction.type)) &&
        (this.quantity == null ? catalogPriceRuleAction.quantity == null : this.quantity.equals(catalogPriceRuleAction.quantity)) &&
        (this.value == null ? catalogPriceRuleAction.value == null : this.value.equals(catalogPriceRuleAction.value)) &&
        (this.currencyCode == null ? catalogPriceRuleAction.currencyCode == null : this.currencyCode.equals(catalogPriceRuleAction.currencyCode)) &&
        (this.includeTax == null ? catalogPriceRuleAction.includeTax == null : this.includeTax.equals(catalogPriceRuleAction.includeTax)) &&
        (this.conditions == null ? catalogPriceRuleAction.conditions == null : this.conditions.equals(catalogPriceRuleAction.conditions)) &&
        (this.additionalFields == null ? catalogPriceRuleAction.additionalFields == null : this.additionalFields.equals(catalogPriceRuleAction.additionalFields)) &&
        (this.customFields == null ? catalogPriceRuleAction.customFields == null : this.customFields.equals(catalogPriceRuleAction.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.scope == null ? 0: this.scope.hashCode());
    result = 31 * result + (this.applyTo == null ? 0: this.applyTo.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.currencyCode == null ? 0: this.currencyCode.hashCode());
    result = 31 * result + (this.includeTax == null ? 0: this.includeTax.hashCode());
    result = 31 * result + (this.conditions == null ? 0: this.conditions.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogPriceRuleAction {\n");
    
    sb.append("  scope: ").append(scope).append("\n");
    sb.append("  applyTo: ").append(applyTo).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  includeTax: ").append(includeTax).append("\n");
    sb.append("  conditions: ").append(conditions).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
