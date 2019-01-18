/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * TaskError
 */

public class TaskError   {
  @JsonProperty("error_id")
  private String errorId = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("code")
  private BigDecimal code = null;

  public TaskError errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * Error ID
   * @return errorId
  **/
  @ApiModelProperty(example = "null", value = "Error ID")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public TaskError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskError code(BigDecimal code) {
    this.code = code;
    return this;
  }

   /**
   * Error code number
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Error code number")
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskError taskError = (TaskError) o;
    return Objects.equals(this.errorId, taskError.errorId) &&
        Objects.equals(this.message, taskError.message) &&
        Objects.equals(this.code, taskError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskError {\n");
    
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
