

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 *   20997101 &#x3D; TenantNotFound  20997102 &#x3D; UnknownExceptionWhenCheckTenantExistence  20997103 &#x3D; UnknownExceptionWhenUpdateTenantConnection
 */
@JsonAdapter(UpdateTenantConnectionRequestErrorCodes.Adapter.class)
public enum UpdateTenantConnectionRequestErrorCodes {
  @SerializedName("20997101")
  NUMBER_20997101(20997101),
  @SerializedName("20997102")
  NUMBER_20997102(20997102),
  @SerializedName("20997103")
  NUMBER_20997103(20997103);

  private Integer value;

  UpdateTenantConnectionRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateTenantConnectionRequestErrorCodes fromValue(Integer input) {
    for (UpdateTenantConnectionRequestErrorCodes b : UpdateTenantConnectionRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UpdateTenantConnectionRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateTenantConnectionRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UpdateTenantConnectionRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UpdateTenantConnectionRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
