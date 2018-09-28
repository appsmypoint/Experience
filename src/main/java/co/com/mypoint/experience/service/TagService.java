package co.com.mypoint.experience.service;

import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.domain.Tag;
import co.com.mypoint.experience.repository.ExperienceRepository;
import co.com.mypoint.experience.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TagService {

    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }


    public Tag addTag(Tag tag) {

        return tagRepository.save(tag);
    }

    public List<Tag> findAll() {
        Iterable<Tag> list = tagRepository.findAll();
        List<Tag> result = StreamSupport.stream(list.spliterator(), false)
                .collect(Collectors.toList());
        return result;
    }
}
