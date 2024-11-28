

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OAuth2ChallengeDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-28T09:10:22.741330016Z[GMT]")

public class OAuth2ChallengeDto {
  @SerializedName("redirectUrl")
  private String redirectUrl = null;

  @SerializedName("tokens")
  private AllOfOAuth2ChallengeDtoTokens tokens = null;

  public OAuth2ChallengeDto redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @Schema(description = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public OAuth2ChallengeDto tokens(AllOfOAuth2ChallengeDtoTokens tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @Schema(description = "")
  public AllOfOAuth2ChallengeDtoTokens getTokens() {
    return tokens;
  }

  public void setTokens(AllOfOAuth2ChallengeDtoTokens tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ChallengeDto oauth2ChallengeDto = (OAuth2ChallengeDto) o;
    return Objects.equals(this.redirectUrl, oauth2ChallengeDto.redirectUrl) &&
        Objects.equals(this.tokens, oauth2ChallengeDto.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ChallengeDto {\n");
    
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
