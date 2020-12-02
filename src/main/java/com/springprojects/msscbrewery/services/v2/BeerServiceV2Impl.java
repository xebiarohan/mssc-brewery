package com.springprojects.msscbrewery.services.v2;

import com.springprojects.msscbrewery.web.model.BeerDto;
import com.springprojects.msscbrewery.web.model.V2.BeerDtoV2;
import com.springprojects.msscbrewery.web.model.V2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBearById(UUID beerId) {
        return BeerDtoV2.builder().id(beerId)
                .beerName("Beera")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // Todo - would add a proper impl for updating beer object
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer....");
    }
}
