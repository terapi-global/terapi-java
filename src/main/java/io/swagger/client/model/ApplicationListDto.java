

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ApplicationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApplicationListDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class ApplicationListDto {
  @SerializedName("dtos")
  private List<ApplicationDto> dtos = null;

  public ApplicationListDto dtos(List<ApplicationDto> dtos) {
    this.dtos = dtos;
    return this;
  }

  public ApplicationListDto addDtosItem(ApplicationDto dtosItem) {
    if (this.dtos == null) {
      this.dtos = new ArrayList<ApplicationDto>();
    }
    this.dtos.add(dtosItem);
    return this;
  }

   /**
   * Get dtos
   * @return dtos
  **/
  @Schema(description = "")
  public List<ApplicationDto> getDtos() {
    return dtos;
  }

  public void setDtos(List<ApplicationDto> dtos) {
    this.dtos = dtos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationListDto applicationListDto = (ApplicationListDto) o;
    return Objects.equals(this.dtos, applicationListDto.dtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationListDto {\n");
    
    sb.append("    dtos: ").append(toIndentedString(dtos)).append("\n");
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
