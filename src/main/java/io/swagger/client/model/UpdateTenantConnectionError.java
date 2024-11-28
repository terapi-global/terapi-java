

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
 * UpdateTenantConnectionError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class UpdateTenantConnectionError {
  @SerializedName("code")
  private AllOfUpdateTenantConnectionErrorCode code = null;

  @SerializedName("type")
  private AllOfUpdateTenantConnectionErrorType type = null;

  @SerializedName("values")
  private Map<String, String> values = null;

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public AllOfUpdateTenantConnectionErrorCode getCode() {
    return code;
  }

   /**
   *   1 &#x3D; BusinessLogic  2 &#x3D; InternalServerError
   * @return type
  **/
  @Schema(description = "  1 = BusinessLogic  2 = InternalServerError")
  public AllOfUpdateTenantConnectionErrorType getType() {
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
    UpdateTenantConnectionError updateTenantConnectionError = (UpdateTenantConnectionError) o;
    return Objects.equals(this.code, updateTenantConnectionError.code) &&
        Objects.equals(this.type, updateTenantConnectionError.type) &&
        Objects.equals(this.values, updateTenantConnectionError.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTenantConnectionError {\n");
    
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
