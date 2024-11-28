

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
 *   15998101 &#x3D; ApplicationNotFound  15998102 &#x3D; UnknownExceptionWhenFetchApplication  15998103 &#x3D; UnknownExceptionWhenInsertApplication
 */
@JsonAdapter(UpdateApplicationRequestErrorCodes.Adapter.class)
public enum UpdateApplicationRequestErrorCodes {
  @SerializedName("15998101")
  NUMBER_15998101(15998101),
  @SerializedName("15998102")
  NUMBER_15998102(15998102),
  @SerializedName("15998103")
  NUMBER_15998103(15998103);

  private Integer value;

  UpdateApplicationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateApplicationRequestErrorCodes fromValue(Integer input) {
    for (UpdateApplicationRequestErrorCodes b : UpdateApplicationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UpdateApplicationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateApplicationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UpdateApplicationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UpdateApplicationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
