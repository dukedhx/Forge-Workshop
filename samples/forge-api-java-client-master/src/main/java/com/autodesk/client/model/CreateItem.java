/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
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

import com.autodesk.client.model.CreateItemData;
import com.autodesk.client.model.CreateItemIncluded;
import com.autodesk.client.model.JsonApiVersion;
import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CreateItem
 */

public class CreateItem   {
  @JsonProperty("jsonapi")
  private JsonApiVersionJsonapi jsonapi = null;

  @JsonProperty("data")
  private CreateItemData data = null;

  @JsonProperty("included")
  private List<CreateItemIncluded> included = new ArrayList<CreateItemIncluded>();

  public CreateItem jsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
    return this;
  }

   /**
   * Get jsonapi
   * @return jsonapi
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiVersionJsonapi getJsonapi() {
    return jsonapi;
  }

  public void setJsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
  }

  public CreateItem data(CreateItemData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public CreateItemData getData() {
    return data;
  }

  public void setData(CreateItemData data) {
    this.data = data;
  }

  public CreateItem included(List<CreateItemIncluded> included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<CreateItemIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<CreateItemIncluded> included) {
    this.included = included;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateItem createItem = (CreateItem) o;
    return Objects.equals(this.jsonapi, createItem.jsonapi) &&
        Objects.equals(this.data, createItem.data) &&
        Objects.equals(this.included, createItem.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonapi, data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateItem {\n");
    
    sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
