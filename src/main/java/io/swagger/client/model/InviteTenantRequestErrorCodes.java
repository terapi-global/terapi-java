

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
 *   20998101 &#x3D; ApplicationIntegrationNotFound  20998102 &#x3D; UnknownExceptionWhenCheckApplicationExistence  20998103 &#x3D; UnknownExceptionWhenCreateTenant  20998104 &#x3D; UnknownExceptionWhenSendingEmailToInvitedEmailAddress  20998105 &#x3D; UserNotFound  20998106 &#x3D; UnknownExceptionWhenInsertApplication  20998107 &#x3D; UnknownExceptionWhenCreateUserTenant  20998108 &#x3D; UnknownExceptionWhenCreatingEmailContent  20998109 &#x3D; UnknownExceptionWhenCreatingEmailAcceptInvitationUrl  20998110 &#x3D; UnknownExceptionWhenAddingTenantInKeycloak  20998111 &#x3D; UnknownExceptionWhenAddingTenantInOrganization
 */
@JsonAdapter(InviteTenantRequestErrorCodes.Adapter.class)
public enum InviteTenantRequestErrorCodes {
  @SerializedName("20998101")
  NUMBER_20998101(20998101),
  @SerializedName("20998102")
  NUMBER_20998102(20998102),
  @SerializedName("20998103")
  NUMBER_20998103(20998103),
  @SerializedName("20998104")
  NUMBER_20998104(20998104),
  @SerializedName("20998105")
  NUMBER_20998105(20998105),
  @SerializedName("20998106")
  NUMBER_20998106(20998106),
  @SerializedName("20998107")
  NUMBER_20998107(20998107),
  @SerializedName("20998108")
  NUMBER_20998108(20998108),
  @SerializedName("20998109")
  NUMBER_20998109(20998109),
  @SerializedName("20998110")
  NUMBER_20998110(20998110),
  @SerializedName("20998111")
  NUMBER_20998111(20998111);

  private Integer value;

  InviteTenantRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InviteTenantRequestErrorCodes fromValue(Integer input) {
    for (InviteTenantRequestErrorCodes b : InviteTenantRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InviteTenantRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final InviteTenantRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public InviteTenantRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return InviteTenantRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
