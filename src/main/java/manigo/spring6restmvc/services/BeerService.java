package manigo.spring6restmvc.services;

import java.util.List;
import java.util.UUID;

import manigo.spring6restmvc.model.Beer;

public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);

    void updateBeerById(UUID beerId, Beer beer);

    void deleteById(UUID beerId);
}
