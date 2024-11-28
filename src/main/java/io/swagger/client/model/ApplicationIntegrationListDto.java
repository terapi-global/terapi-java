

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ApplicationIntegrationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApplicationIntegrationListDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class ApplicationIntegrationListDto {
  @SerializedName("totalRecords")
  private Integer totalRecords = null;

  @SerializedName("currentPage")
  private Integer currentPage = null;

  @SerializedName("perPage")
  private Integer perPage = null;

  @SerializedName("items")
  private List<ApplicationIntegrationDto> items = new ArrayList<ApplicationIntegrationDto>();

  public ApplicationIntegrationListDto totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Get totalRecords
   * @return totalRecords
  **/
  @Schema(required = true, description = "")
  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public ApplicationIntegrationListDto currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @Schema(required = true, description = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public ApplicationIntegrationListDto perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @Schema(required = true, description = "")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public ApplicationIntegrationListDto items(List<ApplicationIntegrationDto> items) {
    this.items = items;
    return this;
  }

  public ApplicationIntegrationListDto addItemsItem(ApplicationIntegrationDto itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<ApplicationIntegrationDto> getItems() {
    return items;
  }

  public void setItems(List<ApplicationIntegrationDto> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationIntegrationListDto applicationIntegrationListDto = (ApplicationIntegrationListDto) o;
    return Objects.equals(this.totalRecords, applicationIntegrationListDto.totalRecords) &&
        Objects.equals(this.currentPage, applicationIntegrationListDto.currentPage) &&
        Objects.equals(this.perPage, applicationIntegrationListDto.perPage) &&
        Objects.equals(this.items, applicationIntegrationListDto.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecords, currentPage, perPage, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationIntegrationListDto {\n");
    
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
