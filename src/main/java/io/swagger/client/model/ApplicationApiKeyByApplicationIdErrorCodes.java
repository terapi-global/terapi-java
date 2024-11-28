

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
 *   16995101 &#x3D; ApplicationApiKeyNotFound  16995102 &#x3D; UnknownExceptionWhenTryingFetchApplications
 */
@JsonAdapter(ApplicationApiKeyByApplicationIdErrorCodes.Adapter.class)
public enum ApplicationApiKeyByApplicationIdErrorCodes {
  @SerializedName("16995101")
  NUMBER_16995101(16995101),
  @SerializedName("16995102")
  NUMBER_16995102(16995102);

  private Integer value;

  ApplicationApiKeyByApplicationIdErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationApiKeyByApplicationIdErrorCodes fromValue(Integer input) {
    for (ApplicationApiKeyByApplicationIdErrorCodes b : ApplicationApiKeyByApplicationIdErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ApplicationApiKeyByApplicationIdErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationApiKeyByApplicationIdErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ApplicationApiKeyByApplicationIdErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return ApplicationApiKeyByApplicationIdErrorCodes.fromValue((Integer)(value));
    }
  }
}
