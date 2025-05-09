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
import org.openapitools.client.model.PluginList;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CartPluginList200ResponseResult {
  
  @SerializedName("all_plugins")
  private Integer allPlugins = null;
  @SerializedName("plugins")
  private List<PluginList> plugins = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAllPlugins() {
    return allPlugins;
  }
  public void setAllPlugins(Integer allPlugins) {
    this.allPlugins = allPlugins;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PluginList> getPlugins() {
    return plugins;
  }
  public void setPlugins(List<PluginList> plugins) {
    this.plugins = plugins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartPluginList200ResponseResult cartPluginList200ResponseResult = (CartPluginList200ResponseResult) o;
    return (this.allPlugins == null ? cartPluginList200ResponseResult.allPlugins == null : this.allPlugins.equals(cartPluginList200ResponseResult.allPlugins)) &&
        (this.plugins == null ? cartPluginList200ResponseResult.plugins == null : this.plugins.equals(cartPluginList200ResponseResult.plugins));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allPlugins == null ? 0: this.allPlugins.hashCode());
    result = 31 * result + (this.plugins == null ? 0: this.plugins.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartPluginList200ResponseResult {\n");
    
    sb.append("  allPlugins: ").append(allPlugins).append("\n");
    sb.append("  plugins: ").append(plugins).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
