package com.springprojects.msscbrewery.web.mapper;

import com.springprojects.msscbrewery.domain.Beer;
import com.springprojects.msscbrewery.web.model.BeerDto;
import com.springprojects.msscbrewery.web.model.V2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
