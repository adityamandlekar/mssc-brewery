package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.services.v2.BeerServiceV2;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static guru.springframework.msscbrewery.web.model.BeerDto.*;

/**
 * Created by jt on 2019-04-20.
 */
@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto)
    {return null;}

    @Override
    public void updateBeerbyID(UUID beerId, BeerDtoV2 beerdto)
    {
        /* Todo */
    }
    @Override
    public void deleteBeerbyID(UUID beerId)
    {
        log.debug("Deleteing beer by Id"+beerId);
    }
}