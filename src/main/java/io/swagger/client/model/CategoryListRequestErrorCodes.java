

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
 *   19999101 &#x3D; UnknownExceptionWhenTryingFetchCategories
 */
@JsonAdapter(CategoryListRequestErrorCodes.Adapter.class)
public enum CategoryListRequestErrorCodes {
  @SerializedName("19999101")
  NUMBER_19999101(19999101);

  private Integer value;

  CategoryListRequestErrorCodes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CategoryListRequestErrorCodes fromValue(Integer input) {
    for (CategoryListRequestErrorCodes b : CategoryListRequestErrorCodes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CategoryListRequestErrorCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CategoryListRequestErrorCodes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CategoryListRequestErrorCodes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return CategoryListRequestErrorCodes.fromValue((Integer)(value));
    }
  }
}
