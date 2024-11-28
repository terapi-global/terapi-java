

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
 *   1 &#x3D; BusinessLogic  2 &#x3D; InternalServerError
 */
@JsonAdapter(ClientErrorType.Adapter.class)
public enum ClientErrorType {
  @SerializedName("1")
  NUMBER_1(1),
  @SerializedName("2")
  NUMBER_2(2);

  private Integer value;

  ClientErrorType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClientErrorType fromValue(Integer input) {
    for (ClientErrorType b : ClientErrorType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClientErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClientErrorType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ClientErrorType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return ClientErrorType.fromValue((Integer)(value));
    }
  }
}
