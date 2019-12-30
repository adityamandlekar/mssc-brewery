package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by AM on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        System.out.println("LiveReloadDemo");
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerdto)
    {
            BeerDto savedDto= beerService.saveNewBeer(beerdto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","http://localhost:8081/api/v1/beer/"+savedDto.getUid().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerdto)
    {
        beerService.updateBeerbyID(beerId,beerdto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void DeleteBeerbyID(@PathVariable("beerId") UUID beerId)
    {
        beerService.deleteBeerbyID(beerId);
    }
}
