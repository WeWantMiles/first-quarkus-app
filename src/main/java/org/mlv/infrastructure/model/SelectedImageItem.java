package org.mlv.infrastructure.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SelectedImageItem implements Serializable {

    private String en;

    private String fr;

    private String pl;

    public String getUrl() {
        return null;
    }
}
