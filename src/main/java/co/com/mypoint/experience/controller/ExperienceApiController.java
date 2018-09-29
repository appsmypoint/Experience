package co.com.mypoint.experience.controller;

import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.domain.Page;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-04T04:07:12.369Z")

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
    public ResponseEntity<List<Page>> listExperienceTabs(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Lugar") @Valid @RequestParam(value = "place", required = false) String place, @ApiParam(value = "Etiqueta") @Valid @RequestParam(value = "tag", required = false) String tag, @ApiParam(value = "page to be returned") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @ApiParam(value = "number of items to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "offset to be taken according to the underlying page and page size") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        return null;
    }

    public ResponseEntity<Void> updateExperience(@ApiParam(value = "Objecto experiencia que será actualizado" ,required=true )  @Valid @RequestBody Experience body) {
        log.debug("--updateExperience");
        String accept = request.getHeader("Accept");
        Experience experience = experienceService.updateExperience(body);
        log.debug("--experience update: " + experience);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
