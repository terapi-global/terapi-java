

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
 *   21997101 &#x3D; TenantNotFound  21997102 &#x3D; IntegrationNotFound  21997103 &#x3D; UnknownExceptionWhenCallingThirdPartyApi  21997104 &#x3D; UnknownExceptionWhenCallAction  21997105 &#x3D; IntegrationIsNotEnabled
 */
@JsonAdapter(CallActionErrorCodes.Adapter.class)
public enum CallActionErrorCodes {
  @SerializedName("21997101")
  NUMBER_21997101(21997101),
  @SerializedName("21997102")
  NUMBER_21997102(21997102),
  @SerializedName("21997103")
  NUMBER_21997103(21997103),
  @SerializedName("21997104")
  NUMBER_21997104(21997104),
  @SerializedName("21997105")
  NUMBER_21997105(21997105);

  private Integer value;

  CallActionErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CallActionErrorCodes fromValue(Integer input) {
    for (CallActionErrorCodes b : CallActionErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CallActionErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CallActionErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CallActionErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return CallActionErrorCodes.fromValue((Integer)(value));
    }
  }
}
