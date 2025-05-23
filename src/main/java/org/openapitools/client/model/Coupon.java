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
import org.openapitools.client.model.A2CDateTime;
import org.openapitools.client.model.CouponAction;
import org.openapitools.client.model.CouponCode;
import org.openapitools.client.model.CouponCondition;
import org.openapitools.client.model.CouponHistory;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Coupon {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("codes")
  private List<CouponCode> codes = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("actions")
  private List<CouponAction> actions = null;
  @SerializedName("date_start")
  private A2CDateTime dateStart = null;
  @SerializedName("date_end")
  private A2CDateTime dateEnd = null;
  @SerializedName("avail")
  private Boolean avail = null;
  @SerializedName("priority")
  private Integer priority = null;
  @SerializedName("used_times")
  private Integer usedTimes = null;
  @SerializedName("usage_limit")
  private Integer usageLimit = null;
  @SerializedName("usage_limit_per_customer")
  private Integer usageLimitPerCustomer = null;
  @SerializedName("logic_operator")
  private String logicOperator = null;
  @SerializedName("conditions")
  private List<CouponCondition> conditions = null;
  @SerializedName("usage_history")
  private List<CouponHistory> usageHistory = null;
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
  public List<CouponCode> getCodes() {
    return codes;
  }
  public void setCodes(List<CouponCode> codes) {
    this.codes = codes;
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
  public List<CouponAction> getActions() {
    return actions;
  }
  public void setActions(List<CouponAction> actions) {
    this.actions = actions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getDateStart() {
    return dateStart;
  }
  public void setDateStart(A2CDateTime dateStart) {
    this.dateStart = dateStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public A2CDateTime getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(A2CDateTime dateEnd) {
    this.dateEnd = dateEnd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAvail() {
    return avail;
  }
  public void setAvail(Boolean avail) {
    this.avail = avail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsedTimes() {
    return usedTimes;
  }
  public void setUsedTimes(Integer usedTimes) {
    this.usedTimes = usedTimes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsageLimit() {
    return usageLimit;
  }
  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsageLimitPerCustomer() {
    return usageLimitPerCustomer;
  }
  public void setUsageLimitPerCustomer(Integer usageLimitPerCustomer) {
    this.usageLimitPerCustomer = usageLimitPerCustomer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLogicOperator() {
    return logicOperator;
  }
  public void setLogicOperator(String logicOperator) {
    this.logicOperator = logicOperator;
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
  public List<CouponHistory> getUsageHistory() {
    return usageHistory;
  }
  public void setUsageHistory(List<CouponHistory> usageHistory) {
    this.usageHistory = usageHistory;
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
    Coupon coupon = (Coupon) o;
    return (this.id == null ? coupon.id == null : this.id.equals(coupon.id)) &&
        (this.code == null ? coupon.code == null : this.code.equals(coupon.code)) &&
        (this.codes == null ? coupon.codes == null : this.codes.equals(coupon.codes)) &&
        (this.name == null ? coupon.name == null : this.name.equals(coupon.name)) &&
        (this.description == null ? coupon.description == null : this.description.equals(coupon.description)) &&
        (this.actions == null ? coupon.actions == null : this.actions.equals(coupon.actions)) &&
        (this.dateStart == null ? coupon.dateStart == null : this.dateStart.equals(coupon.dateStart)) &&
        (this.dateEnd == null ? coupon.dateEnd == null : this.dateEnd.equals(coupon.dateEnd)) &&
        (this.avail == null ? coupon.avail == null : this.avail.equals(coupon.avail)) &&
        (this.priority == null ? coupon.priority == null : this.priority.equals(coupon.priority)) &&
        (this.usedTimes == null ? coupon.usedTimes == null : this.usedTimes.equals(coupon.usedTimes)) &&
        (this.usageLimit == null ? coupon.usageLimit == null : this.usageLimit.equals(coupon.usageLimit)) &&
        (this.usageLimitPerCustomer == null ? coupon.usageLimitPerCustomer == null : this.usageLimitPerCustomer.equals(coupon.usageLimitPerCustomer)) &&
        (this.logicOperator == null ? coupon.logicOperator == null : this.logicOperator.equals(coupon.logicOperator)) &&
        (this.conditions == null ? coupon.conditions == null : this.conditions.equals(coupon.conditions)) &&
        (this.usageHistory == null ? coupon.usageHistory == null : this.usageHistory.equals(coupon.usageHistory)) &&
        (this.additionalFields == null ? coupon.additionalFields == null : this.additionalFields.equals(coupon.additionalFields)) &&
        (this.customFields == null ? coupon.customFields == null : this.customFields.equals(coupon.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.codes == null ? 0: this.codes.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.actions == null ? 0: this.actions.hashCode());
    result = 31 * result + (this.dateStart == null ? 0: this.dateStart.hashCode());
    result = 31 * result + (this.dateEnd == null ? 0: this.dateEnd.hashCode());
    result = 31 * result + (this.avail == null ? 0: this.avail.hashCode());
    result = 31 * result + (this.priority == null ? 0: this.priority.hashCode());
    result = 31 * result + (this.usedTimes == null ? 0: this.usedTimes.hashCode());
    result = 31 * result + (this.usageLimit == null ? 0: this.usageLimit.hashCode());
    result = 31 * result + (this.usageLimitPerCustomer == null ? 0: this.usageLimitPerCustomer.hashCode());
    result = 31 * result + (this.logicOperator == null ? 0: this.logicOperator.hashCode());
    result = 31 * result + (this.conditions == null ? 0: this.conditions.hashCode());
    result = 31 * result + (this.usageHistory == null ? 0: this.usageHistory.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coupon {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  codes: ").append(codes).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  dateStart: ").append(dateStart).append("\n");
    sb.append("  dateEnd: ").append(dateEnd).append("\n");
    sb.append("  avail: ").append(avail).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  usedTimes: ").append(usedTimes).append("\n");
    sb.append("  usageLimit: ").append(usageLimit).append("\n");
    sb.append("  usageLimitPerCustomer: ").append(usageLimitPerCustomer).append("\n");
    sb.append("  logicOperator: ").append(logicOperator).append("\n");
    sb.append("  conditions: ").append(conditions).append("\n");
    sb.append("  usageHistory: ").append(usageHistory).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
