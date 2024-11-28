

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
 * ApplicationIntegrationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class ApplicationIntegrationDto {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("application")
  private AllOfApplicationIntegrationDtoApplication application = null;

  @SerializedName("integration")
  private AllOfApplicationIntegrationDtoIntegration integration = null;

  public ApplicationIntegrationDto id(UUID id) {
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

  public ApplicationIntegrationDto application(AllOfApplicationIntegrationDtoApplication application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public AllOfApplicationIntegrationDtoApplication getApplication() {
    return application;
  }

  public void setApplication(AllOfApplicationIntegrationDtoApplication application) {
    this.application = application;
  }

  public ApplicationIntegrationDto integration(AllOfApplicationIntegrationDtoIntegration integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @Schema(description = "")
  public AllOfApplicationIntegrationDtoIntegration getIntegration() {
    return integration;
  }

  public void setIntegration(AllOfApplicationIntegrationDtoIntegration integration) {
    this.integration = integration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationIntegrationDto applicationIntegrationDto = (ApplicationIntegrationDto) o;
    return Objects.equals(this.id, applicationIntegrationDto.id) &&
        Objects.equals(this.application, applicationIntegrationDto.application) &&
        Objects.equals(this.integration, applicationIntegrationDto.integration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, application, integration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationIntegrationDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
