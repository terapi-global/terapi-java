

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
 *   15996101 &#x3D; UnknownExceptionWhenTryingFetchApplications  15996102 &#x3D; UserNotFound  15996103 &#x3D; UnknownExceptionWhenInsertApplication
 */
@JsonAdapter(UserApplicationListRequestErrorCodes.Adapter.class)
public enum UserApplicationListRequestErrorCodes {
  @SerializedName("15996101")
  NUMBER_15996101(15996101),
  @SerializedName("15996102")
  NUMBER_15996102(15996102),
  @SerializedName("15996103")
  NUMBER_15996103(15996103);

  private Integer value;

  UserApplicationListRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserApplicationListRequestErrorCodes fromValue(Integer input) {
    for (UserApplicationListRequestErrorCodes b : UserApplicationListRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserApplicationListRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserApplicationListRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UserApplicationListRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UserApplicationListRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
