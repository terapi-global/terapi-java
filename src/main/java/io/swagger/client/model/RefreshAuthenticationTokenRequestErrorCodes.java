

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
 *   23998101 &#x3D; UnknownExceptionWhenTryingToRefreshUserAuthenticationToken
 */
@JsonAdapter(RefreshAuthenticationTokenRequestErrorCodes.Adapter.class)
public enum RefreshAuthenticationTokenRequestErrorCodes {
  @SerializedName("23998101")
  NUMBER_23998101(23998101);

  private Integer value;

  RefreshAuthenticationTokenRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RefreshAuthenticationTokenRequestErrorCodes fromValue(Integer input) {
    for (RefreshAuthenticationTokenRequestErrorCodes b : RefreshAuthenticationTokenRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RefreshAuthenticationTokenRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final RefreshAuthenticationTokenRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RefreshAuthenticationTokenRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return RefreshAuthenticationTokenRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
