/**
 * Rakam API Documentation
 * An analytics platform API that lets you create your own analytics services.
 *
 * OpenAPI spec version: 0.5
 * Contact: contact@rakam.io
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


package io.rakam.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ProjectAddCustomFieldsToSchema
 */

public class ProjectAddCustomFieldsToSchema   {
  @SerializedName("collection")
  private String collection = null;

  /**
   * Gets or Sets schemaType
   */
  public enum SchemaTypeEnum {
    @SerializedName("AVRO")
    AVRO("AVRO");

    private String value;

    SchemaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("schema_type")
  private SchemaTypeEnum schemaType = null;

  @SerializedName("schema")
  private String schema = null;

  public ProjectAddCustomFieldsToSchema collection(String collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCollection() {
    return collection;
  }

  public void setCollection(String collection) {
    this.collection = collection;
  }

  public ProjectAddCustomFieldsToSchema schemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
    return this;
  }

   /**
   * Get schemaType
   * @return schemaType
  **/
  @ApiModelProperty(example = "null", value = "")
  public SchemaTypeEnum getSchemaType() {
    return schemaType;
  }

  public void setSchemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
  }

  public ProjectAddCustomFieldsToSchema schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectAddCustomFieldsToSchema projectAddCustomFieldsToSchema = (ProjectAddCustomFieldsToSchema) o;
    return Objects.equals(this.collection, projectAddCustomFieldsToSchema.collection) &&
        Objects.equals(this.schemaType, projectAddCustomFieldsToSchema.schemaType) &&
        Objects.equals(this.schema, projectAddCustomFieldsToSchema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, schemaType, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectAddCustomFieldsToSchema {\n");
    
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
