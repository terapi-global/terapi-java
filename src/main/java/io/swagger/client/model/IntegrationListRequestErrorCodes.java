

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
 *   17999101 &#x3D; UnknownExceptionWhenTryingFetchIntegrations
 */
@JsonAdapter(IntegrationListRequestErrorCodes.Adapter.class)
public enum IntegrationListRequestErrorCodes {
  @SerializedName("17999101")
  NUMBER_17999101(17999101);

  private Integer value;

  IntegrationListRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntegrationListRequestErrorCodes fromValue(Integer input) {
    for (IntegrationListRequestErrorCodes b : IntegrationListRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IntegrationListRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final IntegrationListRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public IntegrationListRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return IntegrationListRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
