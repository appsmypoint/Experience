package co.com.mypoint.experience.service;

import co.com.mypoint.experience.domain.Place;
import co.com.mypoint.experience.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Place addPlace(Place place) {

        return placeRepository.save(place);
    }

    public List<Place> findAll() {
        Iterable<Place> list = placeRepository.findAll();
        List<Place> result = StreamSupport.stream(list.spliterator(), false)
                .collect(Collectors.toList());
        return result;
    }
}
