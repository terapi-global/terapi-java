

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
 *   15997101 &#x3D; ApplicationNotFound  15997102 &#x3D; UnknownExceptionWhenFetchApplicationExistence  15997103 &#x3D; UnknownExceptionWhenDeleteApplication
 */
@JsonAdapter(DeleteApplicationRequestErrorCodes.Adapter.class)
public enum DeleteApplicationRequestErrorCodes {
  @SerializedName("15997101")
  NUMBER_15997101(15997101),
  @SerializedName("15997102")
  NUMBER_15997102(15997102),
  @SerializedName("15997103")
  NUMBER_15997103(15997103);

  private Integer value;

  DeleteApplicationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeleteApplicationRequestErrorCodes fromValue(Integer input) {
    for (DeleteApplicationRequestErrorCodes b : DeleteApplicationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeleteApplicationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeleteApplicationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DeleteApplicationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return DeleteApplicationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
