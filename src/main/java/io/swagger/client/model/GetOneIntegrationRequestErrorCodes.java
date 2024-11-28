

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
 *   17997101 &#x3D; UnknownExceptionWhenTryingFetchOneIntegration
 */
@JsonAdapter(GetOneIntegrationRequestErrorCodes.Adapter.class)
public enum GetOneIntegrationRequestErrorCodes {
  @SerializedName("17997101")
  NUMBER_17997101(17997101);

  private Integer value;

  GetOneIntegrationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GetOneIntegrationRequestErrorCodes fromValue(Integer input) {
    for (GetOneIntegrationRequestErrorCodes b : GetOneIntegrationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GetOneIntegrationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final GetOneIntegrationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public GetOneIntegrationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return GetOneIntegrationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
