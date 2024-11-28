

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
 *   20999101 &#x3D; UnknownExceptionWhenTryingFetchTenants  20999102 &#x3D; UserNotFound  20999103 &#x3D; UnknownExceptionWhenInsertApplication
 */
@JsonAdapter(UserTenantListRequestErrorCodes.Adapter.class)
public enum UserTenantListRequestErrorCodes {
  @SerializedName("20999101")
  NUMBER_20999101(20999101),
  @SerializedName("20999102")
  NUMBER_20999102(20999102),
  @SerializedName("20999103")
  NUMBER_20999103(20999103);

  private Integer value;

  UserTenantListRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserTenantListRequestErrorCodes fromValue(Integer input) {
    for (UserTenantListRequestErrorCodes b : UserTenantListRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserTenantListRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserTenantListRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UserTenantListRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UserTenantListRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
