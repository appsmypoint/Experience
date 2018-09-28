package co.com.mypoint.experience.repository;

import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.domain.Tag;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TagRepository extends Neo4jRepository<Tag, Long> {

    @Override
    Tag save(Tag entity);

    @Override
    Iterable<Tag> findAll();
}
