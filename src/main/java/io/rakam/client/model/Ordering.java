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
 * Ordering
 */

public class Ordering   {
  /**
   * Gets or Sets ordering
   */
  public enum OrderingEnum {
    @SerializedName("ASCENDING")
    ASCENDING("ASCENDING"),
    
    @SerializedName("DESCENDING")
    DESCENDING("DESCENDING");

    private String value;

    OrderingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ordering")
  private OrderingEnum ordering = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("expression")
  private String expression = null;

  public Ordering ordering(OrderingEnum ordering) {
    this.ordering = ordering;
    return this;
  }

   /**
   * Get ordering
   * @return ordering
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderingEnum getOrdering() {
    return ordering;
  }

  public void setOrdering(OrderingEnum ordering) {
    this.ordering = ordering;
  }

  public Ordering index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Ordering expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ordering ordering = (Ordering) o;
    return Objects.equals(this.ordering, ordering.ordering) &&
        Objects.equals(this.index, ordering.index) &&
        Objects.equals(this.expression, ordering.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordering, index, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ordering {\n");
    
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
