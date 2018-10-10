/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.18
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Confirmation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AppUserLink
 */

public class AppUserLink {
  @SerializedName("type")
  private String type = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("givenName")
  private String givenName = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("skipConfirmation")
  private String skipConfirmation = null;

  @SerializedName("confirmation")
  private Confirmation confirmation = null;

  public AppUserLink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the channel to link.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the channel to link.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AppUserLink phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A String of the appUser’s phone number. It must contain the + prefix and the country code. Required for *messenger*, *twilio* and *messagebird* linking. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "A String of the appUser’s phone number. It must contain the + prefix and the country code. Required for *messenger*, *twilio* and *messagebird* linking. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AppUserLink address(String address) {
    this.address = address;
    return this;
  }

   /**
   * A String of the appUser’s email address. Required for *mailgun* linking. 
   * @return address
  **/
  @ApiModelProperty(value = "A String of the appUser’s email address. Required for *mailgun* linking. ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AppUserLink givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * A String of the appUser’s given name. Used as additional criteria to increase the likelihood of a match. (Optional) Used for *messenger* linking. 
   * @return givenName
  **/
  @ApiModelProperty(value = "A String of the appUser’s given name. Used as additional criteria to increase the likelihood of a match. (Optional) Used for *messenger* linking. ")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public AppUserLink surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * A String of the appUser’s surname. Used as additional criteria to increase the likelihood of a match. (Optional) Used for *messenger* linking. 
   * @return surname
  **/
  @ApiModelProperty(value = "A String of the appUser’s surname. Used as additional criteria to increase the likelihood of a match. (Optional) Used for *messenger* linking. ")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AppUserLink subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject for the outgoing email. (Optional) Used for *mailgun* linking. 
   * @return subject
  **/
  @ApiModelProperty(value = "Subject for the outgoing email. (Optional) Used for *mailgun* linking. ")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public AppUserLink skipConfirmation(String skipConfirmation) {
    this.skipConfirmation = skipConfirmation;
    return this;
  }

   /**
   * (Deprecated, use confirmation instead) Flag indicating if the linking confirmation should be skipped.
   * @return skipConfirmation
  **/
  @ApiModelProperty(value = "(Deprecated, use confirmation instead) Flag indicating if the linking confirmation should be skipped.")
  public String getSkipConfirmation() {
    return skipConfirmation;
  }

  public void setSkipConfirmation(String skipConfirmation) {
    this.skipConfirmation = skipConfirmation;
  }

  public AppUserLink confirmation(Confirmation confirmation) {
    this.confirmation = confirmation;
    return this;
  }

   /**
   * Allows you to specify the strategy used to initiate a link with the target user.
   * @return confirmation
  **/
  @ApiModelProperty(required = true, value = "Allows you to specify the strategy used to initiate a link with the target user.")
  public Confirmation getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(Confirmation confirmation) {
    this.confirmation = confirmation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserLink appUserLink = (AppUserLink) o;
    return Objects.equals(this.type, appUserLink.type) &&
        Objects.equals(this.phoneNumber, appUserLink.phoneNumber) &&
        Objects.equals(this.address, appUserLink.address) &&
        Objects.equals(this.givenName, appUserLink.givenName) &&
        Objects.equals(this.surname, appUserLink.surname) &&
        Objects.equals(this.subject, appUserLink.subject) &&
        Objects.equals(this.skipConfirmation, appUserLink.skipConfirmation) &&
        Objects.equals(this.confirmation, appUserLink.confirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, phoneNumber, address, givenName, surname, subject, skipConfirmation, confirmation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserLink {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    skipConfirmation: ").append(toIndentedString(skipConfirmation)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

