/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Integration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListIntegrationsResponse
 */

public class ListIntegrationsResponse {
  @SerializedName("integrations")
  private List<Integration> integrations = null;

  public ListIntegrationsResponse integrations(List<Integration> integrations) {
    this.integrations = integrations;
    return this;
  }

  public ListIntegrationsResponse addIntegrationsItem(Integration integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<Integration>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * The list of integrations.
   * @return integrations
  **/
  @ApiModelProperty(value = "The list of integrations.")
  public List<Integration> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<Integration> integrations) {
    this.integrations = integrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListIntegrationsResponse listIntegrationsResponse = (ListIntegrationsResponse) o;
    return Objects.equals(this.integrations, listIntegrationsResponse.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListIntegrationsResponse {\n");
    
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
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

