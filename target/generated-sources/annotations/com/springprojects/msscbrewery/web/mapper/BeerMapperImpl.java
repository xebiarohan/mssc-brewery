package com.springprojects.msscbrewery.web.mapper;

import com.springprojects.msscbrewery.domain.Beer;
import com.springprojects.msscbrewery.web.model.BeerDto;
import com.springprojects.msscbrewery.web.model.V2.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-18T13:46:05+0400",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        beerDto.setId( beer.getId() );
        beerDto.setBeerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.setBeerStyle( beer.getBeerStyle().name() );
        }
        beerDto.setUpc( beer.getUpc() );
        beerDto.setCreatedDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.setLastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setId( beerDto.getId() );
        beer.setBeerName( beerDto.getBeerName() );
        if ( beerDto.getBeerStyle() != null ) {
            beer.setBeerStyle( Enum.valueOf( BeerStyleEnum.class, beerDto.getBeerStyle() ) );
        }
        beer.setUpc( beerDto.getUpc() );
        beer.setCreatedDate( dateMapper.asTimestamp( beerDto.getCreatedDate() ) );
        beer.setLastUpdatedDate( dateMapper.asTimestamp( beerDto.getLastUpdatedDate() ) );

        return beer;
    }
}
