

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * CategoryListError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class CategoryListError {
  @SerializedName("code")
  private AllOfCategoryListErrorCode code = null;

  @SerializedName("type")
  private AllOfCategoryListErrorType type = null;

  @SerializedName("values")
  private Map<String, String> values = null;

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public AllOfCategoryListErrorCode getCode() {
    return code;
  }

   /**
   *   1 &#x3D; BusinessLogic  2 &#x3D; InternalServerError
   * @return type
  **/
  @Schema(description = "  1 = BusinessLogic  2 = InternalServerError")
  public AllOfCategoryListErrorType getType() {
    return type;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public Map<String, String> getValues() {
    return values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryListError categoryListError = (CategoryListError) o;
    return Objects.equals(this.code, categoryListError.code) &&
        Objects.equals(this.type, categoryListError.type) &&
        Objects.equals(this.values, categoryListError.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryListError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
