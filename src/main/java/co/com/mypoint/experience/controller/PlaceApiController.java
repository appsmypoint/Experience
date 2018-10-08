package co.com.mypoint.experience.controller;

import co.com.mypoint.experience.domain.Place;
import co.com.mypoint.experience.service.PlaceService;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T20:31:26.708Z")

@CrossOrigin(origins = "*")
@Controller
public class PlaceApiController implements PlaceApi {

    private static final Logger log = LoggerFactory.getLogger(PlaceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final PlaceService placeService;

    @org.springframework.beans.factory.annotation.Autowired
    public PlaceApiController(ObjectMapper objectMapper, HttpServletRequest request, PlaceService placeService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.placeService = placeService;
    }

    public ResponseEntity<Void> addPlace(@ApiParam(value = "Objecto place que será agregado" ,required=true )  @Valid @RequestBody Place body) {
        log.debug("--addPlace");
        String accept = request.getHeader("Accept");
        Place place = placeService.addPlace(body);
        log.debug("--Place created: " + place);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Place>> listPlace(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        try {
            List<Place> tagList = placeService.findAll();
            return new ResponseEntity<List<Place>>(tagList, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
            return new ResponseEntity<List<Place>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Void> updatePlace(@ApiParam(value = "Objecto lugar que será actualizado" ,required=true )  @Valid @RequestBody Place body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
