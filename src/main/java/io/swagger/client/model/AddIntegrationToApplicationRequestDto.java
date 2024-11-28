

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
 * AddIntegrationToApplicationRequestDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class AddIntegrationToApplicationRequestDto {
  @SerializedName("applicationId")
  private UUID applicationId = null;

  @SerializedName("integrationId")
  private UUID integrationId = null;

  @SerializedName("isPublicIntegration")
  private Boolean isPublicIntegration = null;

  public AddIntegrationToApplicationRequestDto applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @Schema(description = "")
  public UUID getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  public AddIntegrationToApplicationRequestDto integrationId(UUID integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Get integrationId
   * @return integrationId
  **/
  @Schema(description = "")
  public UUID getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(UUID integrationId) {
    this.integrationId = integrationId;
  }

  public AddIntegrationToApplicationRequestDto isPublicIntegration(Boolean isPublicIntegration) {
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
    AddIntegrationToApplicationRequestDto addIntegrationToApplicationRequestDto = (AddIntegrationToApplicationRequestDto) o;
    return Objects.equals(this.applicationId, addIntegrationToApplicationRequestDto.applicationId) &&
        Objects.equals(this.integrationId, addIntegrationToApplicationRequestDto.integrationId) &&
        Objects.equals(this.isPublicIntegration, addIntegrationToApplicationRequestDto.isPublicIntegration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, integrationId, isPublicIntegration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddIntegrationToApplicationRequestDto {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
