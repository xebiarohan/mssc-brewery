package com.springprojects.msscbrewery.services.v2;

import com.springprojects.msscbrewery.web.model.BeerDto;
import com.springprojects.msscbrewery.web.model.V2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBearById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
