

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
 * DeleteApplicationResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class DeleteApplicationResponse {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("error")
  private AllOfDeleteApplicationResponseError error = null;

  public DeleteApplicationResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public DeleteApplicationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public AllOfDeleteApplicationResponseError getError() {
    return error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteApplicationResponse deleteApplicationResponse = (DeleteApplicationResponse) o;
    return Objects.equals(this.data, deleteApplicationResponse.data) &&
        Objects.equals(this.success, deleteApplicationResponse.success) &&
        Objects.equals(this.error, deleteApplicationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, success, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteApplicationResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
