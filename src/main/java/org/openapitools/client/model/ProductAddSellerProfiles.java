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

/**
 * If the seller is subscribed to \&quot;Business Policies\&quot;, use the seller_profiles instead of the shipping_details, payment_methods and return_accepted params.&lt;hr&gt;&lt;div style&#x3D;\&quot;font-style:normal\&quot;&gt;Param structure:&lt;div style&#x3D;\&quot;margin-left: 2%;\&quot;&gt;&lt;code style&#x3D;\&quot;padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\&quot;&gt;seller_profiles[&lt;b&gt;shipping_profile_id&lt;/b&gt;] &#x3D; string&lt;/br&gt;seller_profiles[&lt;b&gt;payment_profile_id&lt;/b&gt;] &#x3D; string&lt;/br&gt;seller_profiles[&lt;b&gt;return_profile_id&lt;/b&gt;] &#x3D; string&lt;/br&gt;&lt;/code&gt;&lt;/div&gt;&lt;/div&gt;
 **/
@ApiModel(description = "If the seller is subscribed to \"Business Policies\", use the seller_profiles instead of the shipping_details, payment_methods and return_accepted params.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">seller_profiles[<b>shipping_profile_id</b>] = string</br>seller_profiles[<b>payment_profile_id</b>] = string</br>seller_profiles[<b>return_profile_id</b>] = string</br></code></div></div>")
public class ProductAddSellerProfiles {
  
  @SerializedName("shipping_profile_id")
  private String shippingProfileId = null;
  @SerializedName("payment_profile_id")
  private String paymentProfileId = null;
  @SerializedName("return_profile_id")
  private String returnProfileId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShippingProfileId() {
    return shippingProfileId;
  }
  public void setShippingProfileId(String shippingProfileId) {
    this.shippingProfileId = shippingProfileId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPaymentProfileId() {
    return paymentProfileId;
  }
  public void setPaymentProfileId(String paymentProfileId) {
    this.paymentProfileId = paymentProfileId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReturnProfileId() {
    return returnProfileId;
  }
  public void setReturnProfileId(String returnProfileId) {
    this.returnProfileId = returnProfileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAddSellerProfiles productAddSellerProfiles = (ProductAddSellerProfiles) o;
    return (this.shippingProfileId == null ? productAddSellerProfiles.shippingProfileId == null : this.shippingProfileId.equals(productAddSellerProfiles.shippingProfileId)) &&
        (this.paymentProfileId == null ? productAddSellerProfiles.paymentProfileId == null : this.paymentProfileId.equals(productAddSellerProfiles.paymentProfileId)) &&
        (this.returnProfileId == null ? productAddSellerProfiles.returnProfileId == null : this.returnProfileId.equals(productAddSellerProfiles.returnProfileId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.shippingProfileId == null ? 0: this.shippingProfileId.hashCode());
    result = 31 * result + (this.paymentProfileId == null ? 0: this.paymentProfileId.hashCode());
    result = 31 * result + (this.returnProfileId == null ? 0: this.returnProfileId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAddSellerProfiles {\n");
    
    sb.append("  shippingProfileId: ").append(shippingProfileId).append("\n");
    sb.append("  paymentProfileId: ").append(paymentProfileId).append("\n");
    sb.append("  returnProfileId: ").append(returnProfileId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
