

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
 *   15999101 &#x3D; ApplicationNameAlreadyExist  15999102 &#x3D; UnknownExceptionWhenValidateApplicationNameUniqueness  15999103 &#x3D; UnknownExceptionWhenInsertApplication  15999104 &#x3D; UserNotFound  15999105 &#x3D; UnknownExceptionWhenCreateOrganization
 */
@JsonAdapter(CreateApplicationRequestErrorCodes.Adapter.class)
public enum CreateApplicationRequestErrorCodes {
  @SerializedName("15999101")
  NUMBER_15999101(15999101),
  @SerializedName("15999102")
  NUMBER_15999102(15999102),
  @SerializedName("15999103")
  NUMBER_15999103(15999103),
  @SerializedName("15999104")
  NUMBER_15999104(15999104),
  @SerializedName("15999105")
  NUMBER_15999105(15999105);

  private Integer value;

  CreateApplicationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateApplicationRequestErrorCodes fromValue(Integer input) {
    for (CreateApplicationRequestErrorCodes b : CreateApplicationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreateApplicationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateApplicationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CreateApplicationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return CreateApplicationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
