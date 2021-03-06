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


package io.rakam.client.api;

import io.rakam.ApiException;
import io.rakam.client.model.SuccessMessage;
import io.rakam.client.model.RealTimeReport;
import io.rakam.client.model.ErrorMessage;
import io.rakam.client.model.RealtimeDeleteTable;
import io.rakam.client.model.ContinuousQuery;
import io.rakam.client.model.RealtimeQueryTable;
import io.rakam.client.model.RealTimeQueryResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RealtimeApi
 */
public class RealtimeApiTest {

    private final RealtimeApi api = new RealtimeApi();

    
    /**
     * Create report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTableTest() throws ApiException {
        RealTimeReport realTimeReport = null;
        // SuccessMessage response = api.createTable(realTimeReport);

        // TODO: test validations
    }
    
    /**
     * Delete report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTableTest() throws ApiException {
        RealtimeDeleteTable realtimeDeleteTable = null;
        // SuccessMessage response = api.deleteTable(realtimeDeleteTable);

        // TODO: test validations
    }
    
    /**
     * List queries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTablesTest() throws ApiException {
        // List<ContinuousQuery> response = api.listTables();

        // TODO: test validations
    }
    
    /**
     * Get report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTableTest() throws ApiException {
        RealtimeQueryTable realtimeQueryTable = null;
        // RealTimeQueryResult response = api.queryTable(realtimeQueryTable);

        // TODO: test validations
    }
    
}
