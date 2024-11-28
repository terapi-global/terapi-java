

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
 *   14997101 &#x3D; UserNotFound  14997102 &#x3D; UserDoesNotHaveActiveSubscription  14997103 &#x3D; UnknownExceptionWhenFetchUserProfileStatistics
 */
@JsonAdapter(UserProfileStatisticsErrorCodes.Adapter.class)
public enum UserProfileStatisticsErrorCodes {
  @SerializedName("14997101")
  NUMBER_14997101(14997101),
  @SerializedName("14997102")
  NUMBER_14997102(14997102),
  @SerializedName("14997103")
  NUMBER_14997103(14997103);

  private Integer value;

  UserProfileStatisticsErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserProfileStatisticsErrorCodes fromValue(Integer input) {
    for (UserProfileStatisticsErrorCodes b : UserProfileStatisticsErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserProfileStatisticsErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserProfileStatisticsErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UserProfileStatisticsErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UserProfileStatisticsErrorCodes.fromValue((Integer)(value));
    }
  }
}
