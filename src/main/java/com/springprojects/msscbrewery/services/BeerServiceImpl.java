package com.springprojects.msscbrewery.services;

import com.springprojects.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBearById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("Beera")
                .beerStyle("Pale ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // Todo - would add a proper impl for updating beer object
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer....");
    }
}
