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
public class OrderShipmentAddTrackingNumbersInner {
  
  @SerializedName("carrier_id")
  private String carrierId = null;
  @SerializedName("tracking_number")
  private String trackingNumber = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderShipmentAddTrackingNumbersInner orderShipmentAddTrackingNumbersInner = (OrderShipmentAddTrackingNumbersInner) o;
    return (this.carrierId == null ? orderShipmentAddTrackingNumbersInner.carrierId == null : this.carrierId.equals(orderShipmentAddTrackingNumbersInner.carrierId)) &&
        (this.trackingNumber == null ? orderShipmentAddTrackingNumbersInner.trackingNumber == null : this.trackingNumber.equals(orderShipmentAddTrackingNumbersInner.trackingNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.carrierId == null ? 0: this.carrierId.hashCode());
    result = 31 * result + (this.trackingNumber == null ? 0: this.trackingNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShipmentAddTrackingNumbersInner {\n");
    
    sb.append("  carrierId: ").append(carrierId).append("\n");
    sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
