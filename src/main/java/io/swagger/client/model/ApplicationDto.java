

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
 * ApplicationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class ApplicationDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("officialLandingUrl")
  private String officialLandingUrl = null;

  @SerializedName("redirectBaseUrl")
  private String redirectBaseUrl = null;

  @SerializedName("privacyPolicyUrl")
  private String privacyPolicyUrl = null;

  @SerializedName("endUserLicenseAgreementUrl")
  private String endUserLicenseAgreementUrl = null;

  @SerializedName("totalIntegrations")
  private Integer totalIntegrations = null;

  @SerializedName("totalTenants")
  private Integer totalTenants = null;

  @SerializedName("totalApiCalls")
  private Integer totalApiCalls = null;

  @SerializedName("id")
  private UUID id = null;

  public ApplicationDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationDto category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ApplicationDto officialLandingUrl(String officialLandingUrl) {
    this.officialLandingUrl = officialLandingUrl;
    return this;
  }

   /**
   * Get officialLandingUrl
   * @return officialLandingUrl
  **/
  @Schema(description = "")
  public String getOfficialLandingUrl() {
    return officialLandingUrl;
  }

  public void setOfficialLandingUrl(String officialLandingUrl) {
    this.officialLandingUrl = officialLandingUrl;
  }

  public ApplicationDto redirectBaseUrl(String redirectBaseUrl) {
    this.redirectBaseUrl = redirectBaseUrl;
    return this;
  }

   /**
   * Get redirectBaseUrl
   * @return redirectBaseUrl
  **/
  @Schema(description = "")
  public String getRedirectBaseUrl() {
    return redirectBaseUrl;
  }

  public void setRedirectBaseUrl(String redirectBaseUrl) {
    this.redirectBaseUrl = redirectBaseUrl;
  }

  public ApplicationDto privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @Schema(description = "")
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public ApplicationDto endUserLicenseAgreementUrl(String endUserLicenseAgreementUrl) {
    this.endUserLicenseAgreementUrl = endUserLicenseAgreementUrl;
    return this;
  }

   /**
   * Get endUserLicenseAgreementUrl
   * @return endUserLicenseAgreementUrl
  **/
  @Schema(description = "")
  public String getEndUserLicenseAgreementUrl() {
    return endUserLicenseAgreementUrl;
  }

  public void setEndUserLicenseAgreementUrl(String endUserLicenseAgreementUrl) {
    this.endUserLicenseAgreementUrl = endUserLicenseAgreementUrl;
  }

  public ApplicationDto totalIntegrations(Integer totalIntegrations) {
    this.totalIntegrations = totalIntegrations;
    return this;
  }

   /**
   * Get totalIntegrations
   * @return totalIntegrations
  **/
  @Schema(description = "")
  public Integer getTotalIntegrations() {
    return totalIntegrations;
  }

  public void setTotalIntegrations(Integer totalIntegrations) {
    this.totalIntegrations = totalIntegrations;
  }

  public ApplicationDto totalTenants(Integer totalTenants) {
    this.totalTenants = totalTenants;
    return this;
  }

   /**
   * Get totalTenants
   * @return totalTenants
  **/
  @Schema(description = "")
  public Integer getTotalTenants() {
    return totalTenants;
  }

  public void setTotalTenants(Integer totalTenants) {
    this.totalTenants = totalTenants;
  }

  public ApplicationDto totalApiCalls(Integer totalApiCalls) {
    this.totalApiCalls = totalApiCalls;
    return this;
  }

   /**
   * Get totalApiCalls
   * @return totalApiCalls
  **/
  @Schema(description = "")
  public Integer getTotalApiCalls() {
    return totalApiCalls;
  }

  public void setTotalApiCalls(Integer totalApiCalls) {
    this.totalApiCalls = totalApiCalls;
  }

  public ApplicationDto id(UUID id) {
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
    ApplicationDto applicationDto = (ApplicationDto) o;
    return Objects.equals(this.name, applicationDto.name) &&
        Objects.equals(this.description, applicationDto.description) &&
        Objects.equals(this.category, applicationDto.category) &&
        Objects.equals(this.officialLandingUrl, applicationDto.officialLandingUrl) &&
        Objects.equals(this.redirectBaseUrl, applicationDto.redirectBaseUrl) &&
        Objects.equals(this.privacyPolicyUrl, applicationDto.privacyPolicyUrl) &&
        Objects.equals(this.endUserLicenseAgreementUrl, applicationDto.endUserLicenseAgreementUrl) &&
        Objects.equals(this.totalIntegrations, applicationDto.totalIntegrations) &&
        Objects.equals(this.totalTenants, applicationDto.totalTenants) &&
        Objects.equals(this.totalApiCalls, applicationDto.totalApiCalls) &&
        Objects.equals(this.id, applicationDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, category, officialLandingUrl, redirectBaseUrl, privacyPolicyUrl, endUserLicenseAgreementUrl, totalIntegrations, totalTenants, totalApiCalls, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    officialLandingUrl: ").append(toIndentedString(officialLandingUrl)).append("\n");
    sb.append("    redirectBaseUrl: ").append(toIndentedString(redirectBaseUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    endUserLicenseAgreementUrl: ").append(toIndentedString(endUserLicenseAgreementUrl)).append("\n");
    sb.append("    totalIntegrations: ").append(toIndentedString(totalIntegrations)).append("\n");
    sb.append("    totalTenants: ").append(toIndentedString(totalTenants)).append("\n");
    sb.append("    totalApiCalls: ").append(toIndentedString(totalApiCalls)).append("\n");
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
