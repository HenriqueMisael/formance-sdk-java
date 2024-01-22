/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class UninstallConnectorV1Request {
    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    public com.formance.formance_sdk.models.shared.Connector connector;

    public UninstallConnectorV1Request withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        this.connector = connector;
        return this;
    }
    
    /**
     * The connector ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectorId")
    public String connectorId;

    public UninstallConnectorV1Request withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    
    public UninstallConnectorV1Request(@JsonProperty("connector") com.formance.formance_sdk.models.shared.Connector connector, @JsonProperty("connectorId") String connectorId) {
        this.connector = connector;
        this.connectorId = connectorId;
  }
}