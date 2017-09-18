/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Conversation;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MessageResponse
 */

public class MessageResponse {
  @SerializedName("message")
  private Message message = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  public MessageResponse message(Message message) {
    this.message = message;
    return this;
  }

   /**
   * The message.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The message.")
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public MessageResponse conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation.
   * @return conversation
  **/
  @ApiModelProperty(required = true, value = "The conversation.")
  public Conversation getConversation() {
    return conversation;
  }

  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.message, messageResponse.message) &&
        Objects.equals(this.conversation, messageResponse.conversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, conversation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

