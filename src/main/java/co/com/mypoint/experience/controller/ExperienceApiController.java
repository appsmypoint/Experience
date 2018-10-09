package co.com.mypoint.experience.controller;

import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.domain.Page;
import co.com.mypoint.experience.domain.PaginationMetadata;
import co.com.mypoint.experience.domain.Section;
import co.com.mypoint.experience.service.ExperienceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-04T04:07:12.369Z")

@CrossOrigin(origins = "*")
@Controller
public class ExperienceApiController implements ExperienceApi {

    private static final Logger log = LoggerFactory.getLogger(ExperienceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ExperienceService experienceService;

    @org.springframework.beans.factory.annotation.Autowired
    public ExperienceApiController(ObjectMapper objectMapper, HttpServletRequest request, ExperienceService experienceService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.experienceService = experienceService;
    }

    public ResponseEntity<Void> addExperience(@ApiParam(value = "Objecto experiencia que será agregado" ,required=true )  @Valid @RequestBody Experience body) {
        log.debug("--addExperience");
        String accept = request.getHeader("Accept");
        Experience experience = experienceService.addExperience(body);
        log.debug("--experience created: " + experience);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> experienceById(@ApiParam(value = "Nombre", required = true) @PathVariable("id") Integer id) {
        try {
            Experience experience = experienceService.findById(id);


            return new ResponseEntity<Object>(experience, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
            return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Experience>> listExperience(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Lugar") @Valid @RequestParam(value = "place", required = false) String place, @ApiParam(value = "Etiqueta") @Valid @RequestParam(value = "tag", required = false) String tag, @ApiParam(value = "page to be returned") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @ApiParam(value = "number of items to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "offset to be taken according to the underlying page and page size") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        try {
            List<Experience> experienceList = new ArrayList<>();
            if (pageNumber != null && pageSize != null ) {
                experienceList = experienceService.findAll(PageRequest.of(pageNumber, pageSize, Sort.by("name")));
            } else {
                experienceList = experienceService.findAll();
            }

            return new ResponseEntity<List<Experience>>(experienceList, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
            return new ResponseEntity<List<Experience>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Page> listExperienceTabs(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Lugar") @Valid @RequestParam(value = "place", required = false) String place, @ApiParam(value = "Etiqueta") @Valid @RequestParam(value = "tag", required = false) String tag, @ApiParam(value = "page to be returned") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @ApiParam(value = "number of items to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "offset to be taken according to the underlying page and page size") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        try {
            Page page = new Page();
            PaginationMetadata paginationMetadata = new PaginationMetadata();
            List<Experience> experienceList = new ArrayList<>();
            if (pageNumber != null && pageSize != null ) {
                experienceList = experienceService.findAll(PageRequest.of(pageNumber, pageSize, Sort.by("name")));
            } else {
                experienceList = experienceService.findAll();
            }
            log.debug("--experienceList " + experienceList.size());
            paginationMetadata.setSectionOffset(1);
            paginationMetadata.setItemsOffset(experienceList.size());
            paginationMetadata.setHasNextPage(false);
            List<Section> sections = new ArrayList<>();

            Section section = new Section();
            section.setComponentType("ExperienceUI");
            section.setDisplayType("carousel");
            section.setTitle("Lo mejor del oriente Antioqueño");
            //section.setSectionItems(Collections.singletonList(experienceList));
            List<Object> sectionItems = new ArrayList<>();
            int index = 1;
            for (Experience experience : experienceList) {
                //log.debug("--experience " + experience);
                sectionItems.add(experience);
                if (index == 3) {
                    section.setSectionItems(sectionItems);
                    sections.add(section);

                    section = new Section();
                    section.setComponentType("ExperienceUI");
                    section.setDisplayType("carousel");
                    section.setTitle("");

                    sectionItems = new ArrayList<>();

                    index = 1;
                } else {
                    index++;
                }

            }


            page.setPaginationMetadata(paginationMetadata);
            page.setSections(sections);

            //log.debug("--page " + page);

            return new ResponseEntity<Page>(page, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
            return new ResponseEntity<Page>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Void> updateExperience(@ApiParam(value = "Objecto experiencia que será actualizado" ,required=true )  @Valid @RequestBody Experience body) {
        log.debug("--updateExperience");
        String accept = request.getHeader("Accept");
        Experience experience = experienceService.updateExperience(body);
        log.debug("--experience update: " + experience);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
