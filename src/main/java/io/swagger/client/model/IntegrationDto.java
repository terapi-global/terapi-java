

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.IntegrationEndpointDto;
import io.swagger.client.model.IntegrationEventDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * IntegrationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class IntegrationDto {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("nameIdentifier")
  private String nameIdentifier = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("releaseStatus")
  private AllOfIntegrationDtoReleaseStatus releaseStatus = null;

  @SerializedName("launchDate")
  private OffsetDateTime launchDate = null;

  @SerializedName("documentationUrl")
  private String documentationUrl = null;

  @SerializedName("swaggerUrl")
  private String swaggerUrl = null;

  @SerializedName("integrationEndpoints")
  private List<IntegrationEndpointDto> integrationEndpoints = null;

  @SerializedName("integrationEvents")
  private List<IntegrationEventDto> integrationEvents = null;

  public IntegrationDto id(UUID id) {
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

  public IntegrationDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IntegrationDto nameIdentifier(String nameIdentifier) {
    this.nameIdentifier = nameIdentifier;
    return this;
  }

   /**
   * Get nameIdentifier
   * @return nameIdentifier
  **/
  @Schema(description = "")
  public String getNameIdentifier() {
    return nameIdentifier;
  }

  public void setNameIdentifier(String nameIdentifier) {
    this.nameIdentifier = nameIdentifier;
  }

  public IntegrationDto shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @Schema(description = "")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public IntegrationDto icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @Schema(description = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public IntegrationDto releaseStatus(AllOfIntegrationDtoReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   *   0 &#x3D; Released  1 &#x3D; Pending  2 &#x3D; NotPlanned
   * @return releaseStatus
  **/
  @Schema(description = "  0 = Released  1 = Pending  2 = NotPlanned")
  public AllOfIntegrationDtoReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }

  public void setReleaseStatus(AllOfIntegrationDtoReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }

  public IntegrationDto launchDate(OffsetDateTime launchDate) {
    this.launchDate = launchDate;
    return this;
  }

   /**
   * Get launchDate
   * @return launchDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(OffsetDateTime launchDate) {
    this.launchDate = launchDate;
  }

  public IntegrationDto documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

   /**
   * Get documentationUrl
   * @return documentationUrl
  **/
  @Schema(description = "")
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  public IntegrationDto swaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
    return this;
  }

   /**
   * Get swaggerUrl
   * @return swaggerUrl
  **/
  @Schema(description = "")
  public String getSwaggerUrl() {
    return swaggerUrl;
  }

  public void setSwaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
  }

  public IntegrationDto integrationEndpoints(List<IntegrationEndpointDto> integrationEndpoints) {
    this.integrationEndpoints = integrationEndpoints;
    return this;
  }

  public IntegrationDto addIntegrationEndpointsItem(IntegrationEndpointDto integrationEndpointsItem) {
    if (this.integrationEndpoints == null) {
      this.integrationEndpoints = new ArrayList<IntegrationEndpointDto>();
    }
    this.integrationEndpoints.add(integrationEndpointsItem);
    return this;
  }

   /**
   * Get integrationEndpoints
   * @return integrationEndpoints
  **/
  @Schema(description = "")
  public List<IntegrationEndpointDto> getIntegrationEndpoints() {
    return integrationEndpoints;
  }

  public void setIntegrationEndpoints(List<IntegrationEndpointDto> integrationEndpoints) {
    this.integrationEndpoints = integrationEndpoints;
  }

  public IntegrationDto integrationEvents(List<IntegrationEventDto> integrationEvents) {
    this.integrationEvents = integrationEvents;
    return this;
  }

  public IntegrationDto addIntegrationEventsItem(IntegrationEventDto integrationEventsItem) {
    if (this.integrationEvents == null) {
      this.integrationEvents = new ArrayList<IntegrationEventDto>();
    }
    this.integrationEvents.add(integrationEventsItem);
    return this;
  }

   /**
   * Get integrationEvents
   * @return integrationEvents
  **/
  @Schema(description = "")
  public List<IntegrationEventDto> getIntegrationEvents() {
    return integrationEvents;
  }

  public void setIntegrationEvents(List<IntegrationEventDto> integrationEvents) {
    this.integrationEvents = integrationEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationDto integrationDto = (IntegrationDto) o;
    return Objects.equals(this.id, integrationDto.id) &&
        Objects.equals(this.title, integrationDto.title) &&
        Objects.equals(this.nameIdentifier, integrationDto.nameIdentifier) &&
        Objects.equals(this.shortDescription, integrationDto.shortDescription) &&
        Objects.equals(this.icon, integrationDto.icon) &&
        Objects.equals(this.releaseStatus, integrationDto.releaseStatus) &&
        Objects.equals(this.launchDate, integrationDto.launchDate) &&
        Objects.equals(this.documentationUrl, integrationDto.documentationUrl) &&
        Objects.equals(this.swaggerUrl, integrationDto.swaggerUrl) &&
        Objects.equals(this.integrationEndpoints, integrationDto.integrationEndpoints) &&
        Objects.equals(this.integrationEvents, integrationDto.integrationEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, nameIdentifier, shortDescription, icon, releaseStatus, launchDate, documentationUrl, swaggerUrl, integrationEndpoints, integrationEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    launchDate: ").append(toIndentedString(launchDate)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
    sb.append("    integrationEndpoints: ").append(toIndentedString(integrationEndpoints)).append("\n");
    sb.append("    integrationEvents: ").append(toIndentedString(integrationEvents)).append("\n");
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
