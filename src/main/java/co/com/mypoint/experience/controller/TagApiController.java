package co.com.mypoint.experience.controller;

import co.com.mypoint.experience.domain.Tag;
import co.com.mypoint.experience.service.TagService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T15:45:18.681Z")

@CrossOrigin(origins = "*")
@Controller
public class TagApiController implements TagApi {

    private static final Logger log = LoggerFactory.getLogger(TagApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final TagService tagService;

    @org.springframework.beans.factory.annotation.Autowired
    public TagApiController(ObjectMapper objectMapper, HttpServletRequest request, TagService tagService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.tagService = tagService;
    }

    public ResponseEntity<Void> addTag(@ApiParam(value = "Objecto tag que será agregado" ,required=true )  @Valid @RequestBody Tag body) {
        log.debug("--addTag");
        String accept = request.getHeader("Accept");
        Tag tag = tagService.addTag(body);
        log.debug("--Tag created: " + tag);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Tag>> listTag(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        try {
            List<Tag> tagList = tagService.findAll();
            return new ResponseEntity<List<Tag>>(tagList, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
            return new ResponseEntity<List<Tag>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Void> updateTag(@ApiParam(value = "Objecto tag que será actualizado" ,required=true )  @Valid @RequestBody Tag body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
