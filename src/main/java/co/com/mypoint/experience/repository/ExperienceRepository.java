package co.com.mypoint.experience.repository;

import co.com.mypoint.experience.domain.Experience;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ExperienceRepository extends Neo4jRepository<Experience, Long> {

    @Override
    Experience save(Experience entity);

    @Override
    Iterable<Experience> findAll();
}
