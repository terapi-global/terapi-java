

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
 *   14998101 &#x3D; UnknownExceptionWhenFetchJwtUserProfile  14998102 &#x3D; UnknownExceptionWhenCreateUserProfile  14998103 &#x3D; IncorrectDataInUserJwtPayload  14998104 &#x3D; UnknownExceptionWhenSubscribeUserToFreePlan  14998105 &#x3D; UserAlreadyExistInDataStorage  14998106 &#x3D; UnknownExceptionWhenCheckUserExistence
 */
@JsonAdapter(CreateUserProfileRequestErrorCodes.Adapter.class)
public enum CreateUserProfileRequestErrorCodes {
  @SerializedName("14998101")
  NUMBER_14998101(14998101),
  @SerializedName("14998102")
  NUMBER_14998102(14998102),
  @SerializedName("14998103")
  NUMBER_14998103(14998103),
  @SerializedName("14998104")
  NUMBER_14998104(14998104),
  @SerializedName("14998105")
  NUMBER_14998105(14998105),
  @SerializedName("14998106")
  NUMBER_14998106(14998106);

  private Integer value;

  CreateUserProfileRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateUserProfileRequestErrorCodes fromValue(Integer input) {
    for (CreateUserProfileRequestErrorCodes b : CreateUserProfileRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreateUserProfileRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateUserProfileRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CreateUserProfileRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return CreateUserProfileRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
