package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.services.v2.BeerServiceV2;
import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().uid(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto)
    {return BeerDto.builder().uid(UUID.randomUUID()).build();}

    @Override
    public void updateBeerbyID(UUID beerId, BeerDto beerdto)
    {
        /* Todo */
    }
    @Override
    public void deleteBeerbyID(UUID beerId)
    {
        log.debug("Deleteing beer by Id"+beerId);
    }
}