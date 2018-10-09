package co.com.mypoint.experience.repository;

import co.com.mypoint.experience.domain.Experience;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface ExperienceRepository extends Neo4jRepository<Experience, Long> {

    @Override
    Experience save(Experience entity);

    @Override
    Iterable<Experience> findAll();

    @Override
    Page<Experience> findAll(Pageable pageable);

    @Override
    Optional<Experience> findById(Long aLong);
}
