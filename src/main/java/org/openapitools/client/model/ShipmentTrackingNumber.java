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
public class ShipmentTrackingNumber {
  
  @SerializedName("carrier_id")
  private String carrierId = null;
  @SerializedName("tracking_number")
  private String trackingNumber = null;
  @SerializedName("additional_fields")
  private Object additionalFields = null;
  @SerializedName("custom_fields")
  private Object customFields = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCarrierId() {
    return carrierId;
  }
  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
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
    ShipmentTrackingNumber shipmentTrackingNumber = (ShipmentTrackingNumber) o;
    return (this.carrierId == null ? shipmentTrackingNumber.carrierId == null : this.carrierId.equals(shipmentTrackingNumber.carrierId)) &&
        (this.trackingNumber == null ? shipmentTrackingNumber.trackingNumber == null : this.trackingNumber.equals(shipmentTrackingNumber.trackingNumber)) &&
        (this.additionalFields == null ? shipmentTrackingNumber.additionalFields == null : this.additionalFields.equals(shipmentTrackingNumber.additionalFields)) &&
        (this.customFields == null ? shipmentTrackingNumber.customFields == null : this.customFields.equals(shipmentTrackingNumber.customFields));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.carrierId == null ? 0: this.carrierId.hashCode());
    result = 31 * result + (this.trackingNumber == null ? 0: this.trackingNumber.hashCode());
    result = 31 * result + (this.additionalFields == null ? 0: this.additionalFields.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentTrackingNumber {\n");
    
    sb.append("  carrierId: ").append(carrierId).append("\n");
    sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
    sb.append("  additionalFields: ").append(additionalFields).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
