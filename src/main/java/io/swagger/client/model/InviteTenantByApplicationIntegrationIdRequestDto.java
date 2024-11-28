

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * InviteTenantByApplicationIntegrationIdRequestDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class InviteTenantByApplicationIntegrationIdRequestDto {
  @SerializedName("invitedEmailAddress")
  private String invitedEmailAddress = null;

  @SerializedName("applicationIntegrationId")
  private UUID applicationIntegrationId = null;

  @SerializedName("isPublicIntegration")
  private Boolean isPublicIntegration = null;

  public InviteTenantByApplicationIntegrationIdRequestDto invitedEmailAddress(String invitedEmailAddress) {
    this.invitedEmailAddress = invitedEmailAddress;
    return this;
  }

   /**
   * Get invitedEmailAddress
   * @return invitedEmailAddress
  **/
  @Schema(description = "")
  public String getInvitedEmailAddress() {
    return invitedEmailAddress;
  }

  public void setInvitedEmailAddress(String invitedEmailAddress) {
    this.invitedEmailAddress = invitedEmailAddress;
  }

  public InviteTenantByApplicationIntegrationIdRequestDto applicationIntegrationId(UUID applicationIntegrationId) {
    this.applicationIntegrationId = applicationIntegrationId;
    return this;
  }

   /**
   * Get applicationIntegrationId
   * @return applicationIntegrationId
  **/
  @Schema(description = "")
  public UUID getApplicationIntegrationId() {
    return applicationIntegrationId;
  }

  public void setApplicationIntegrationId(UUID applicationIntegrationId) {
    this.applicationIntegrationId = applicationIntegrationId;
  }

  public InviteTenantByApplicationIntegrationIdRequestDto isPublicIntegration(Boolean isPublicIntegration) {
    this.isPublicIntegration = isPublicIntegration;
    return this;
  }

   /**
   * Get isPublicIntegration
   * @return isPublicIntegration
  **/
  @Schema(description = "")
  public Boolean isIsPublicIntegration() {
    return isPublicIntegration;
  }

  public void setIsPublicIntegration(Boolean isPublicIntegration) {
    this.isPublicIntegration = isPublicIntegration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteTenantByApplicationIntegrationIdRequestDto inviteTenantByApplicationIntegrationIdRequestDto = (InviteTenantByApplicationIntegrationIdRequestDto) o;
    return Objects.equals(this.invitedEmailAddress, inviteTenantByApplicationIntegrationIdRequestDto.invitedEmailAddress) &&
        Objects.equals(this.applicationIntegrationId, inviteTenantByApplicationIntegrationIdRequestDto.applicationIntegrationId) &&
        Objects.equals(this.isPublicIntegration, inviteTenantByApplicationIntegrationIdRequestDto.isPublicIntegration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitedEmailAddress, applicationIntegrationId, isPublicIntegration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteTenantByApplicationIntegrationIdRequestDto {\n");
    
    sb.append("    invitedEmailAddress: ").append(toIndentedString(invitedEmailAddress)).append("\n");
    sb.append("    applicationIntegrationId: ").append(toIndentedString(applicationIntegrationId)).append("\n");
    sb.append("    isPublicIntegration: ").append(toIndentedString(isPublicIntegration)).append("\n");
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
