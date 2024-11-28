

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
 *   16998101 &#x3D; ApplicationApiKeyNotFound  16998102 &#x3D; UnknownExceptionWhenCheckApplicationExistence  16998103 &#x3D; UnknownExceptionWhenGenerateApplicationApiKey
 */
@JsonAdapter(RevokeApplicationApiKeyRequestErrorCodes.Adapter.class)
public enum RevokeApplicationApiKeyRequestErrorCodes {
  @SerializedName("16998101")
  NUMBER_16998101(16998101),
  @SerializedName("16998102")
  NUMBER_16998102(16998102),
  @SerializedName("16998103")
  NUMBER_16998103(16998103);

  private Integer value;

  RevokeApplicationApiKeyRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RevokeApplicationApiKeyRequestErrorCodes fromValue(Integer input) {
    for (RevokeApplicationApiKeyRequestErrorCodes b : RevokeApplicationApiKeyRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RevokeApplicationApiKeyRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final RevokeApplicationApiKeyRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RevokeApplicationApiKeyRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return RevokeApplicationApiKeyRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
