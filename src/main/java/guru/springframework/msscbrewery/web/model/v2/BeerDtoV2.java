package guru.springframework.msscbrewery.web.model.v2;

import java.util.UUID;

public class BeerDtoV2 {
    private UUID uid;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
