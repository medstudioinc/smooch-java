/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Webhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListWebhooksResponse
 */

public class ListWebhooksResponse {
  @SerializedName("webhooks")
  private List<Webhook> webhooks = new ArrayList<Webhook>();

  public ListWebhooksResponse webhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public ListWebhooksResponse addWebhooksItem(Webhook webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * The list of webhooks.
   * @return webhooks
  **/
  @ApiModelProperty(required = true, value = "The list of webhooks.")
  public List<Webhook> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWebhooksResponse listWebhooksResponse = (ListWebhooksResponse) o;
    return Objects.equals(this.webhooks, listWebhooksResponse.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWebhooksResponse {\n");
    
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

