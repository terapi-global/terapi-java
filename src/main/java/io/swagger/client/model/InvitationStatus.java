

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
 *   0 &#x3D; Invited  1 &#x3D; Accepted  2 &#x3D; Declined
 */
@JsonAdapter(InvitationStatus.Adapter.class)
public enum InvitationStatus {
  @SerializedName("0")
  NUMBER_0(0),
  @SerializedName("1")
  NUMBER_1(1),
  @SerializedName("2")
  NUMBER_2(2);

  private Integer value;

  InvitationStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvitationStatus fromValue(Integer input) {
    for (InvitationStatus b : InvitationStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InvitationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvitationStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public InvitationStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return InvitationStatus.fromValue((Integer)(value));
    }
  }
}
