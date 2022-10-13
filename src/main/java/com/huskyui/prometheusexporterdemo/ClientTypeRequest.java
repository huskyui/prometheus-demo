package com.huskyui.prometheusexporterdemo;

import java.io.Serializable;

public class ClientTypeRequest implements Serializable {

    private String clientType;


    public ClientTypeRequest() {
    }

    public ClientTypeRequest(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
