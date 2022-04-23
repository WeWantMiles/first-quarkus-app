package org.mlv.infrastructure.repository;

import javax.enterprise.context.ApplicationScoped;
import org.mlv.domain.NutriscoreRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import io.smallrye.common.annotation.Blocking;
import org.mlv.infrastructure.utils.ApiCallService;
import org.mlv.infrastructure.model.ProductResponse;

@ApplicationScoped
public class NutriscoreApi implements NutriscoreRepository {
    
    @RestClient
    ApiCallService apiCallService;

    @Override
    @Blocking
    public String getNutriscore(String barCodeNumber) {

        ProductResponse productResponse = apiCallService.getById(barCodeNumber);
        return productResponse.getProduct().getNutritionGrades();
    }
}
