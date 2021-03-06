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

import com.autodesk.client.model.MetadataCollection;
import com.autodesk.client.model.MetadataMetadata;
import com.autodesk.client.model.MetadataObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@ApiModel(description = "")

public class MetadataData   {
  @JsonProperty("type")
  private String type = "metadata";

  @JsonProperty("metadata")
  private List<MetadataMetadata> metadata = new ArrayList<MetadataMetadata>();

  @JsonProperty("objects")
  private List<MetadataObject> objects = new ArrayList<MetadataObject>();

  @JsonProperty("collection")
  private List<MetadataCollection> collection = new ArrayList<MetadataCollection>();

  public MetadataData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MetadataData metadata(List<MetadataMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MetadataMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<MetadataMetadata> metadata) {
    this.metadata = metadata;
  }

  public MetadataData objects(List<MetadataObject> objects) {
    this.objects = objects;
    return this;
  }

   /**
   * Collection of “objects”
   * @return objects
  **/
  @ApiModelProperty(example = "null", value = "Collection of “objects”")
  public List<MetadataObject> getObjects() {
    return objects;
  }

  public void setObjects(List<MetadataObject> objects) {
    this.objects = objects;
  }

  public MetadataData collection(List<MetadataCollection> collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Array of objects with their “properties” as a non-hierarchical list.
   * @return collection
  **/
  @ApiModelProperty(example = "null", value = "Array of objects with their “properties” as a non-hierarchical list.")
  public List<MetadataCollection> getCollection() {
    return collection;
  }

  public void setCollection(List<MetadataCollection> collection) {
    this.collection = collection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataData metadataData = (MetadataData) o;
    return Objects.equals(this.type, metadataData.type) &&
        Objects.equals(this.metadata, metadataData.metadata) &&
        Objects.equals(this.objects, metadataData.objects) &&
        Objects.equals(this.collection, metadataData.collection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadata, objects, collection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
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

