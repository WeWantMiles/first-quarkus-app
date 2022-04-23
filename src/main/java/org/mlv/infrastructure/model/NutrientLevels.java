package org.mlv.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class NutrientLevels implements Serializable {

    private String fat;

    private String salt;

    @JsonProperty("saturated-fat")
    private String saturatedFat;

    private String sugars;
}
