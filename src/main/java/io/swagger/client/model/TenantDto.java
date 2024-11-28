

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
 * TenantDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class TenantDto {
  @SerializedName("providedName")
  private String providedName = null;

  @SerializedName("invitedEmailAddress")
  private String invitedEmailAddress = null;

  @SerializedName("invitationStatus")
  private AllOfTenantDtoInvitationStatus invitationStatus = null;

  @SerializedName("applicationIntegration")
  private AllOfTenantDtoApplicationIntegration applicationIntegration = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("webhookUrl")
  private String webhookUrl = null;

  @SerializedName("authorizedOriginUrl")
  private String authorizedOriginUrl = null;

  @SerializedName("id")
  private UUID id = null;

  public TenantDto providedName(String providedName) {
    this.providedName = providedName;
    return this;
  }

   /**
   * Get providedName
   * @return providedName
  **/
  @Schema(description = "")
  public String getProvidedName() {
    return providedName;
  }

  public void setProvidedName(String providedName) {
    this.providedName = providedName;
  }

  public TenantDto invitedEmailAddress(String invitedEmailAddress) {
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

  public TenantDto invitationStatus(AllOfTenantDtoInvitationStatus invitationStatus) {
    this.invitationStatus = invitationStatus;
    return this;
  }

   /**
   *   0 &#x3D; Invited  1 &#x3D; Accepted  2 &#x3D; Declined
   * @return invitationStatus
  **/
  @Schema(description = "  0 = Invited  1 = Accepted  2 = Declined")
  public AllOfTenantDtoInvitationStatus getInvitationStatus() {
    return invitationStatus;
  }

  public void setInvitationStatus(AllOfTenantDtoInvitationStatus invitationStatus) {
    this.invitationStatus = invitationStatus;
  }

  public TenantDto applicationIntegration(AllOfTenantDtoApplicationIntegration applicationIntegration) {
    this.applicationIntegration = applicationIntegration;
    return this;
  }

   /**
   * Get applicationIntegration
   * @return applicationIntegration
  **/
  @Schema(description = "")
  public AllOfTenantDtoApplicationIntegration getApplicationIntegration() {
    return applicationIntegration;
  }

  public void setApplicationIntegration(AllOfTenantDtoApplicationIntegration applicationIntegration) {
    this.applicationIntegration = applicationIntegration;
  }

  public TenantDto clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public TenantDto clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public TenantDto webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @Schema(description = "")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public TenantDto authorizedOriginUrl(String authorizedOriginUrl) {
    this.authorizedOriginUrl = authorizedOriginUrl;
    return this;
  }

   /**
   * Get authorizedOriginUrl
   * @return authorizedOriginUrl
  **/
  @Schema(description = "")
  public String getAuthorizedOriginUrl() {
    return authorizedOriginUrl;
  }

  public void setAuthorizedOriginUrl(String authorizedOriginUrl) {
    this.authorizedOriginUrl = authorizedOriginUrl;
  }

  public TenantDto id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantDto tenantDto = (TenantDto) o;
    return Objects.equals(this.providedName, tenantDto.providedName) &&
        Objects.equals(this.invitedEmailAddress, tenantDto.invitedEmailAddress) &&
        Objects.equals(this.invitationStatus, tenantDto.invitationStatus) &&
        Objects.equals(this.applicationIntegration, tenantDto.applicationIntegration) &&
        Objects.equals(this.clientSecret, tenantDto.clientSecret) &&
        Objects.equals(this.clientId, tenantDto.clientId) &&
        Objects.equals(this.webhookUrl, tenantDto.webhookUrl) &&
        Objects.equals(this.authorizedOriginUrl, tenantDto.authorizedOriginUrl) &&
        Objects.equals(this.id, tenantDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providedName, invitedEmailAddress, invitationStatus, applicationIntegration, clientSecret, clientId, webhookUrl, authorizedOriginUrl, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDto {\n");
    
    sb.append("    providedName: ").append(toIndentedString(providedName)).append("\n");
    sb.append("    invitedEmailAddress: ").append(toIndentedString(invitedEmailAddress)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
    sb.append("    applicationIntegration: ").append(toIndentedString(applicationIntegration)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    authorizedOriginUrl: ").append(toIndentedString(authorizedOriginUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
