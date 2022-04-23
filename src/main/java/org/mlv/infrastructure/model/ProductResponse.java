package org.mlv.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductResponse implements Serializable {

    private Product product;

    private String code;

    private boolean status;

    @JsonProperty("status_verbose")
    private String statusVerbose;
}
