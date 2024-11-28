

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
 *   0 &#x3D; Released  1 &#x3D; Pending  2 &#x3D; NotPlanned
 */
@JsonAdapter(ReleaseStatus.Adapter.class)
public enum ReleaseStatus {
  @SerializedName("0")
  NUMBER_0(0),
  @SerializedName("1")
  NUMBER_1(1),
  @SerializedName("2")
  NUMBER_2(2);

  private Integer value;

  ReleaseStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReleaseStatus fromValue(Integer input) {
    for (ReleaseStatus b : ReleaseStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReleaseStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReleaseStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ReleaseStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return ReleaseStatus.fromValue((Integer)(value));
    }
  }
}
