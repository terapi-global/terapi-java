

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
 *   20996101 &#x3D; TenantNotFound  20996102 &#x3D; UnknownExceptionWhileFetchingTenant  20996103 &#x3D; UnknownExceptionWhileDecliningTenant  20996104 &#x3D; TenantIsNotInInvitedStatus  20996105 &#x3D; UnknownExceptionWhileCheckingIfTenantIsInCorrectStatus
 */
@JsonAdapter(DeclineTenantInvitationRequestErrorCodes.Adapter.class)
public enum DeclineTenantInvitationRequestErrorCodes {
  @SerializedName("20996101")
  NUMBER_20996101(20996101),
  @SerializedName("20996102")
  NUMBER_20996102(20996102),
  @SerializedName("20996103")
  NUMBER_20996103(20996103),
  @SerializedName("20996104")
  NUMBER_20996104(20996104),
  @SerializedName("20996105")
  NUMBER_20996105(20996105);

  private Integer value;

  DeclineTenantInvitationRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeclineTenantInvitationRequestErrorCodes fromValue(Integer input) {
    for (DeclineTenantInvitationRequestErrorCodes b : DeclineTenantInvitationRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeclineTenantInvitationRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeclineTenantInvitationRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DeclineTenantInvitationRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return DeclineTenantInvitationRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
