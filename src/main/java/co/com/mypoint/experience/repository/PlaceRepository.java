package co.com.mypoint.experience.repository;

import co.com.mypoint.experience.domain.Place;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PlaceRepository extends Neo4jRepository<Place, Long> {

    @Override
    Place save(Place entity);

    @Override
    Iterable<Place> findAll();
}
