package org.mlv.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Source implements Serializable {

    private String[] fields;

    private String id;

    private String[] images;

    @JsonProperty("import_t")
    private long importT;

    private String manufacturer;

    private String name;

    private String url;
}
