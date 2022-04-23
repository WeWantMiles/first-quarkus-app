package org.mlv.infrastructure.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SelectedImages implements Serializable {

    private SelectedImage front;

    private SelectedImage ingredients;

    private SelectedImage nutrition;
}
