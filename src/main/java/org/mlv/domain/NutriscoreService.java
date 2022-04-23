package org.mlv.domain;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class NutriscoreService {

    @Inject
    NutriscoreRepository nutriscoreRepository;

    public String getNutriScore(String barCodeNumber) {
      
        return nutriscoreRepository.getNutriscore(barCodeNumber);
    }
}
