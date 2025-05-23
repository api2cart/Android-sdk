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
import org.openapitools.client.model.CustomerAddConsentsInner;
import org.openapitools.client.model.CustomerUpdateAddressInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomerUpdate {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("group_id")
  private String groupId = null;
  @SerializedName("group_ids")
  private String groupIds = null;
  @SerializedName("group")
  private String group = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("birth_day")
  private String birthDay = null;
  @SerializedName("news_letter_subscription")
  private Boolean newsLetterSubscription = null;
  @SerializedName("consents")
  private List<CustomerAddConsentsInner> consents = null;
  @SerializedName("tags")
  private String tags = null;
  @SerializedName("gender")
  private String gender = null;
  @SerializedName("note")
  private String note = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("address")
  private List<CustomerUpdateAddressInner> address = null;

  /**
   * Entity id
   **/
  @ApiModelProperty(value = "Entity id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Customer group_id
   **/
  @ApiModelProperty(value = "Customer group_id")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   * Groups that will be assigned to a customer
   **/
  @ApiModelProperty(value = "Groups that will be assigned to a customer")
  public String getGroupIds() {
    return groupIds;
  }
  public void setGroupIds(String groupIds) {
    this.groupIds = groupIds;
  }

  /**
   * Defines the group where the customer
   **/
  @ApiModelProperty(value = "Defines the group where the customer")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * Defines customer's email
   **/
  @ApiModelProperty(value = "Defines customer's email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Defines customer's phone number
   **/
  @ApiModelProperty(value = "Defines customer's phone number")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Defines customer's first name
   **/
  @ApiModelProperty(value = "Defines customer's first name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Defines customer's last name
   **/
  @ApiModelProperty(value = "Defines customer's last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Defines customer's birthday
   **/
  @ApiModelProperty(value = "Defines customer's birthday")
  public String getBirthDay() {
    return birthDay;
  }
  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  /**
   * Defines whether the newsletter subscription is available for the user
   **/
  @ApiModelProperty(value = "Defines whether the newsletter subscription is available for the user")
  public Boolean getNewsLetterSubscription() {
    return newsLetterSubscription;
  }
  public void setNewsLetterSubscription(Boolean newsLetterSubscription) {
    this.newsLetterSubscription = newsLetterSubscription;
  }

  /**
   * Defines consents to notifications
   **/
  @ApiModelProperty(value = "Defines consents to notifications")
  public List<CustomerAddConsentsInner> getConsents() {
    return consents;
  }
  public void setConsents(List<CustomerAddConsentsInner> consents) {
    this.consents = consents;
  }

  /**
   * Customer tags
   **/
  @ApiModelProperty(value = "Customer tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   * Defines customer's gender
   **/
  @ApiModelProperty(value = "Defines customer's gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * The customer note.
   **/
  @ApiModelProperty(value = "The customer note.")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Defines customer's status
   **/
  @ApiModelProperty(value = "Defines customer's status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Store Id
   **/
  @ApiModelProperty(value = "Store Id")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomerUpdateAddressInner> getAddress() {
    return address;
  }
  public void setAddress(List<CustomerUpdateAddressInner> address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdate customerUpdate = (CustomerUpdate) o;
    return (this.id == null ? customerUpdate.id == null : this.id.equals(customerUpdate.id)) &&
        (this.groupId == null ? customerUpdate.groupId == null : this.groupId.equals(customerUpdate.groupId)) &&
        (this.groupIds == null ? customerUpdate.groupIds == null : this.groupIds.equals(customerUpdate.groupIds)) &&
        (this.group == null ? customerUpdate.group == null : this.group.equals(customerUpdate.group)) &&
        (this.email == null ? customerUpdate.email == null : this.email.equals(customerUpdate.email)) &&
        (this.phone == null ? customerUpdate.phone == null : this.phone.equals(customerUpdate.phone)) &&
        (this.firstName == null ? customerUpdate.firstName == null : this.firstName.equals(customerUpdate.firstName)) &&
        (this.lastName == null ? customerUpdate.lastName == null : this.lastName.equals(customerUpdate.lastName)) &&
        (this.birthDay == null ? customerUpdate.birthDay == null : this.birthDay.equals(customerUpdate.birthDay)) &&
        (this.newsLetterSubscription == null ? customerUpdate.newsLetterSubscription == null : this.newsLetterSubscription.equals(customerUpdate.newsLetterSubscription)) &&
        (this.consents == null ? customerUpdate.consents == null : this.consents.equals(customerUpdate.consents)) &&
        (this.tags == null ? customerUpdate.tags == null : this.tags.equals(customerUpdate.tags)) &&
        (this.gender == null ? customerUpdate.gender == null : this.gender.equals(customerUpdate.gender)) &&
        (this.note == null ? customerUpdate.note == null : this.note.equals(customerUpdate.note)) &&
        (this.status == null ? customerUpdate.status == null : this.status.equals(customerUpdate.status)) &&
        (this.storeId == null ? customerUpdate.storeId == null : this.storeId.equals(customerUpdate.storeId)) &&
        (this.address == null ? customerUpdate.address == null : this.address.equals(customerUpdate.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.groupIds == null ? 0: this.groupIds.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.birthDay == null ? 0: this.birthDay.hashCode());
    result = 31 * result + (this.newsLetterSubscription == null ? 0: this.newsLetterSubscription.hashCode());
    result = 31 * result + (this.consents == null ? 0: this.consents.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.gender == null ? 0: this.gender.hashCode());
    result = 31 * result + (this.note == null ? 0: this.note.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.storeId == null ? 0: this.storeId.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  groupIds: ").append(groupIds).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  birthDay: ").append(birthDay).append("\n");
    sb.append("  newsLetterSubscription: ").append(newsLetterSubscription).append("\n");
    sb.append("  consents: ").append(consents).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  note: ").append(note).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
