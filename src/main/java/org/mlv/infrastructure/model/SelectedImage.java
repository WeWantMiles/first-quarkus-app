package org.mlv.infrastructure.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SelectedImage implements Serializable {

    private SelectedImageItem display;

    private SelectedImageItem small;

    private SelectedImageItem thumb;
}
