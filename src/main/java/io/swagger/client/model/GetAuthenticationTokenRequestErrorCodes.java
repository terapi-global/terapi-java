

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
 *   23999101 &#x3D; UnknownExceptionWhenTryingFetchApplicationApiKey  23999102 &#x3D; FailedToFindApplicationApiKey  23999103 &#x3D; UnknownExceptionWhenTryingToGetUserAuthenticationToken
 */
@JsonAdapter(GetAuthenticationTokenRequestErrorCodes.Adapter.class)
public enum GetAuthenticationTokenRequestErrorCodes {
  @SerializedName("23999101")
  NUMBER_23999101(23999101),
  @SerializedName("23999102")
  NUMBER_23999102(23999102),
  @SerializedName("23999103")
  NUMBER_23999103(23999103);

  private Integer value;

  GetAuthenticationTokenRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GetAuthenticationTokenRequestErrorCodes fromValue(Integer input) {
    for (GetAuthenticationTokenRequestErrorCodes b : GetAuthenticationTokenRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GetAuthenticationTokenRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final GetAuthenticationTokenRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public GetAuthenticationTokenRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return GetAuthenticationTokenRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
