

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.client.model.ReleaseStatus;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 *   0 &#x3D; Released  1 &#x3D; Pending  2 &#x3D; NotPlanned
 */
@Schema(description = "  0 = Released  1 = Pending  2 = NotPlanned")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class AllOfIntegrationDtoReleaseStatus extends ReleaseStatus {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfIntegrationDtoReleaseStatus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
