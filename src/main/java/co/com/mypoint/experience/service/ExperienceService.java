package co.com.mypoint.experience.service;

import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.repository.ExperienceRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience addExperience(Experience experience) {

        return experienceRepository.save(experience);
    }

    public Experience updateExperience(Experience experience) {

        return experienceRepository.save(experience);
    }

    public List<Experience> findAll() {
        Iterable<Experience> list = experienceRepository.findAll();
        List<Experience> result = StreamSupport.stream(list.spliterator(), false)
                .collect(Collectors.toList());
        return result;
    }

    public Experience findById(Integer id) {
        Experience experience = experienceRepository.findById((long)id).get();

        return experience;
    }

    public List<Experience> findAll(Pageable pageable) {
        Iterable<Experience> list = experienceRepository.findAll(pageable);
        List<Experience> result = StreamSupport.stream(list.spliterator(), false)
                .collect(Collectors.toList());
        return result;
    }

}
