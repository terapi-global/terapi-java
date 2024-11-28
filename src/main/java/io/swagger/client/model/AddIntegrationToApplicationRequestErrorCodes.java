

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
 *   18999101 &#x3D; ApplicationNotFound  18999102 &#x3D; UnknownExceptionWhenCheckApplicationExistence  18999103 &#x3D; IntegrationNotFound  18999104 &#x3D; UnknownExceptionWhenCheckIntegrationExistence  18999105 &#x3D; UnknownExceptionWhenAddIntegrationToApplication  18999106 &#x3D; IntegrationAlreadyAddedToTheApplication  18999107 &#x3D; UnknownExceptionWhenCheckApplicationIntegrationUniqueness
 */
@JsonAdapter(AddIntegrationToApplicationRequestErrorCodes.Adapter.class)
public enum AddIntegrationToApplicationRequestErrorCodes {
  @SerializedName("18999101")
  NUMBER_18999101(18999101),
  @SerializedName("18999102")
  NUMBER_18999102(18999102),
  @SerializedName("18999103")
  NUMBER_18999103(18999103),
  @SerializedName("18999104")
  NUMBER_18999104(18999104),
  @SerializedName("18999105")
  NUMBER_18999105(18999105),
  @SerializedName("18999106")
  NUMBER_18999106(18999106),
  @SerializedName("18999107")
  NUMBER_18999107(18999107);

  private Integer value;

  AddIntegrationToApplicationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddIntegrationToApplicationRequestErrorCodes fromValue(Integer input) {
    for (AddIntegrationToApplicationRequestErrorCodes b : AddIntegrationToApplicationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AddIntegrationToApplicationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddIntegrationToApplicationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AddIntegrationToApplicationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return AddIntegrationToApplicationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
