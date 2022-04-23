package org.mlv.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Ingredient implements Serializable {

    @JsonProperty("from_palm_oil")
    private String fromPalmOil;

    private String id;

    private String origin;

    private String percent;

    private int rank;

    private String text;

    private String vegan;

    private String vegetarian;
}
