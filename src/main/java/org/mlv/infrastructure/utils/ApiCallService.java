package org.mlv.infrastructure.utils;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import org.mlv.infrastructure.model.ProductResponse;

@RegisterRestClient
public interface ApiCallService {
    
    @GET
    @Path("{barCodeNumber}")
    ProductResponse getById(@PathParam("barCodeNumber") String barCodeNumber);
}
