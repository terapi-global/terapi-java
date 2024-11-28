

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
/**
 * UserProfileStatisticsDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class UserProfileStatisticsDto {
  @SerializedName("availableIntegrations")
  private Integer availableIntegrations = null;

  @SerializedName("availableApiCalls")
  private Integer availableApiCalls = null;

  @SerializedName("applicationsCount")
  private Integer applicationsCount = null;

  public UserProfileStatisticsDto availableIntegrations(Integer availableIntegrations) {
    this.availableIntegrations = availableIntegrations;
    return this;
  }

   /**
   * Get availableIntegrations
   * @return availableIntegrations
  **/
  @Schema(description = "")
  public Integer getAvailableIntegrations() {
    return availableIntegrations;
  }

  public void setAvailableIntegrations(Integer availableIntegrations) {
    this.availableIntegrations = availableIntegrations;
  }

  public UserProfileStatisticsDto availableApiCalls(Integer availableApiCalls) {
    this.availableApiCalls = availableApiCalls;
    return this;
  }

   /**
   * Get availableApiCalls
   * @return availableApiCalls
  **/
  @Schema(description = "")
  public Integer getAvailableApiCalls() {
    return availableApiCalls;
  }

  public void setAvailableApiCalls(Integer availableApiCalls) {
    this.availableApiCalls = availableApiCalls;
  }

  public UserProfileStatisticsDto applicationsCount(Integer applicationsCount) {
    this.applicationsCount = applicationsCount;
    return this;
  }

   /**
   * Get applicationsCount
   * @return applicationsCount
  **/
  @Schema(description = "")
  public Integer getApplicationsCount() {
    return applicationsCount;
  }

  public void setApplicationsCount(Integer applicationsCount) {
    this.applicationsCount = applicationsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileStatisticsDto userProfileStatisticsDto = (UserProfileStatisticsDto) o;
    return Objects.equals(this.availableIntegrations, userProfileStatisticsDto.availableIntegrations) &&
        Objects.equals(this.availableApiCalls, userProfileStatisticsDto.availableApiCalls) &&
        Objects.equals(this.applicationsCount, userProfileStatisticsDto.applicationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableIntegrations, availableApiCalls, applicationsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileStatisticsDto {\n");
    
    sb.append("    availableIntegrations: ").append(toIndentedString(availableIntegrations)).append("\n");
    sb.append("    availableApiCalls: ").append(toIndentedString(availableApiCalls)).append("\n");
    sb.append("    applicationsCount: ").append(toIndentedString(applicationsCount)).append("\n");
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
