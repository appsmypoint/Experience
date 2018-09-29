/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package co.com.mypoint.experience.controller;


import co.com.mypoint.experience.domain.Experience;
import co.com.mypoint.experience.domain.Page;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T21:44:27.075Z")

@Api(value = "experience", description = "the experience API")
public interface ExperienceApi {

    @ApiOperation(value = "Nueva experiencia/paquete", nickname = "addExperience", notes = "Agregar nueva experiencia o paquete de servicios", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify experience in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your experience")
            })
    }, tags={ "experience", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/experience",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addExperience(@ApiParam(value = "Objecto experiencia que será agregado", required = true) @Valid @RequestBody Experience body);


    @ApiOperation(value = "Lista las experiencias registradas", nickname = "listExperience", notes = "Lista las experiencias registradas por diferentes parámetros", response = Experience.class, responseContainer = "List", tags={ "experience", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Experience.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/experience",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Experience>> listExperience(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Lugar") @Valid @RequestParam(value = "place", required = false) String place, @ApiParam(value = "Etiqueta") @Valid @RequestParam(value = "tag", required = false) String tag, @ApiParam(value = "page to be returned") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @ApiParam(value = "number of items to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "offset to be taken according to the underlying page and page size") @Valid @RequestParam(value = "offset", required = false) Integer offset);


    @ApiOperation(value = "Lista las secciones de una página", nickname = "listExperienceTabs", notes = "Lista las secciones con sus experiencias", response = Page.class, responseContainer = "List", tags={ "experience", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Page.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/experience/page",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Page>> listExperienceTabs(@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Lugar") @Valid @RequestParam(value = "place", required = false) String place, @ApiParam(value = "Etiqueta") @Valid @RequestParam(value = "tag", required = false) String tag, @ApiParam(value = "page to be returned") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @ApiParam(value = "number of items to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "offset to be taken according to the underlying page and page size") @Valid @RequestParam(value = "offset", required = false) Integer offset);


    @ApiOperation(value = "Actualiza experiencia/paquete", nickname = "updateExperience", notes = "Actualiza una experiencia o paquete de servicios existente", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify experience in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your experience")
            })
    }, tags={ "experience", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Experiencia not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/experience",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateExperience(@ApiParam(value = "Objecto experiencia que será actualizado", required = true) @Valid @RequestBody Experience body);

}
