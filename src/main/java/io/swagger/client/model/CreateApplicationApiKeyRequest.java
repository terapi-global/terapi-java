

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
 * CreateApplicationApiKeyRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class CreateApplicationApiKeyRequest {
  @SerializedName("dto")
  private AllOfCreateApplicationApiKeyRequestDto dto = null;

  public CreateApplicationApiKeyRequest dto(AllOfCreateApplicationApiKeyRequestDto dto) {
    this.dto = dto;
    return this;
  }

   /**
   * Get dto
   * @return dto
  **/
  @Schema(description = "")
  public AllOfCreateApplicationApiKeyRequestDto getDto() {
    return dto;
  }

  public void setDto(AllOfCreateApplicationApiKeyRequestDto dto) {
    this.dto = dto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationApiKeyRequest createApplicationApiKeyRequest = (CreateApplicationApiKeyRequest) o;
    return Objects.equals(this.dto, createApplicationApiKeyRequest.dto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationApiKeyRequest {\n");
    
    sb.append("    dto: ").append(toIndentedString(dto)).append("\n");
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
