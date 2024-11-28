

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
 *   16999101 &#x3D; ApplicationNotFound  16999102 &#x3D; UnknownExceptionWhenCheckApplicationExistence  16999103 &#x3D; UnknownExceptionWhenGenerateApplicationApiKey
 */
@JsonAdapter(CreateApplicationApiKeyRequestErrorCodes.Adapter.class)
public enum CreateApplicationApiKeyRequestErrorCodes {
  @SerializedName("16999101")
  NUMBER_16999101(16999101),
  @SerializedName("16999102")
  NUMBER_16999102(16999102),
  @SerializedName("16999103")
  NUMBER_16999103(16999103);

  private Integer value;

  CreateApplicationApiKeyRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateApplicationApiKeyRequestErrorCodes fromValue(Integer input) {
    for (CreateApplicationApiKeyRequestErrorCodes b : CreateApplicationApiKeyRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreateApplicationApiKeyRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateApplicationApiKeyRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CreateApplicationApiKeyRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return CreateApplicationApiKeyRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
