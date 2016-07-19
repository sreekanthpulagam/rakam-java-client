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
import io.rakam.client.model.CollectionDefinition;
import io.rakam.client.model.ContinuousQuery;
import io.rakam.client.model.MaterializedView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Recipe
 */

public class Recipe   {
  /**
   * Gets or Sets strategy
   */
  public enum StrategyEnum {
    @SerializedName("DEFAULT")
    DEFAULT("DEFAULT"),
    
    @SerializedName("SPECIFIC")
    SPECIFIC("SPECIFIC");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("strategy")
  private StrategyEnum strategy = null;

  @SerializedName("collections")
  private Map<String, CollectionDefinition> collections = new HashMap<String, CollectionDefinition>();

  @SerializedName("materialized_views")
  private List<MaterializedView> materializedViews = new ArrayList<MaterializedView>();

  @SerializedName("continuous_queries")
  private List<ContinuousQuery> continuousQueries = new ArrayList<ContinuousQuery>();

  public Recipe strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(example = "null", value = "")
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }

  public Recipe collections(Map<String, CollectionDefinition> collections) {
    this.collections = collections;
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, CollectionDefinition> getCollections() {
    return collections;
  }

  public void setCollections(Map<String, CollectionDefinition> collections) {
    this.collections = collections;
  }

  public Recipe materializedViews(List<MaterializedView> materializedViews) {
    this.materializedViews = materializedViews;
    return this;
  }

   /**
   * Get materializedViews
   * @return materializedViews
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MaterializedView> getMaterializedViews() {
    return materializedViews;
  }

  public void setMaterializedViews(List<MaterializedView> materializedViews) {
    this.materializedViews = materializedViews;
  }

  public Recipe continuousQueries(List<ContinuousQuery> continuousQueries) {
    this.continuousQueries = continuousQueries;
    return this;
  }

   /**
   * Get continuousQueries
   * @return continuousQueries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContinuousQuery> getContinuousQueries() {
    return continuousQueries;
  }

  public void setContinuousQueries(List<ContinuousQuery> continuousQueries) {
    this.continuousQueries = continuousQueries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipe recipe = (Recipe) o;
    return Objects.equals(this.strategy, recipe.strategy) &&
        Objects.equals(this.collections, recipe.collections) &&
        Objects.equals(this.materializedViews, recipe.materializedViews) &&
        Objects.equals(this.continuousQueries, recipe.continuousQueries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, collections, materializedViews, continuousQueries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    materializedViews: ").append(toIndentedString(materializedViews)).append("\n");
    sb.append("    continuousQueries: ").append(toIndentedString(continuousQueries)).append("\n");
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
