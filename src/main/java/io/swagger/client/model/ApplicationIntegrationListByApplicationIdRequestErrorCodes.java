

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
 *   18998 &#x3D; UnknownExceptionWhenTryingFetchApplicationIntegrations  18999 &#x3D; ApplicationNotFound
 */
@JsonAdapter(ApplicationIntegrationListByApplicationIdRequestErrorCodes.Adapter.class)
public enum ApplicationIntegrationListByApplicationIdRequestErrorCodes {
  @SerializedName("18998")
  NUMBER_18998(18998),
  @SerializedName("18999")
  NUMBER_18999(18999);

  private Integer value;

  ApplicationIntegrationListByApplicationIdRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationIntegrationListByApplicationIdRequestErrorCodes fromValue(Integer input) {
    for (ApplicationIntegrationListByApplicationIdRequestErrorCodes b : ApplicationIntegrationListByApplicationIdRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ApplicationIntegrationListByApplicationIdRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationIntegrationListByApplicationIdRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ApplicationIntegrationListByApplicationIdRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return ApplicationIntegrationListByApplicationIdRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
