package org.mlv.application;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mlv.domain.NutriscoreService;


@Path("/first")
public class FirstRessource {
    
    @Inject
    NutriscoreService nutriscoreService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String frist() {
        return "first";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{barCodeNumber}")
    public String first(String barCodeNumber) {
        return nutriscoreService.getNutriScore(barCodeNumber);
    }
}
