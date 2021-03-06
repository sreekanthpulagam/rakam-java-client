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
import io.rakam.client.model.SchemaField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * MetadataResponse
 */

public class MetadataResponse   {
  @SerializedName("columns")
  private List<SchemaField> columns = new ArrayList<SchemaField>();

  @SerializedName("identifierColumn")
  private String identifierColumn = null;

  public MetadataResponse columns(List<SchemaField> columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SchemaField> getColumns() {
    return columns;
  }

  public void setColumns(List<SchemaField> columns) {
    this.columns = columns;
  }

  public MetadataResponse identifierColumn(String identifierColumn) {
    this.identifierColumn = identifierColumn;
    return this;
  }

   /**
   * Get identifierColumn
   * @return identifierColumn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdentifierColumn() {
    return identifierColumn;
  }

  public void setIdentifierColumn(String identifierColumn) {
    this.identifierColumn = identifierColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataResponse metadataResponse = (MetadataResponse) o;
    return Objects.equals(this.columns, metadataResponse.columns) &&
        Objects.equals(this.identifierColumn, metadataResponse.identifierColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, identifierColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataResponse {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    identifierColumn: ").append(toIndentedString(identifierColumn)).append("\n");
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

