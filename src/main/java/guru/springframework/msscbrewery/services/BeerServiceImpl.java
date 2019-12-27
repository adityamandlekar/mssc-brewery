package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerbByID(UUID beerid) {
        return BeerDto.builder().build();
    }
}
