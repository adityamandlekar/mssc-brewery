package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerdto);
    void updateBeerbyID(UUID beerId, BeerDtoV2 beerdto);
    void deleteBeerbyID(UUID beerId);
}
