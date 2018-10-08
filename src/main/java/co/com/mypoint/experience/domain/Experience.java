package co.com.mypoint.experience.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Experience
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T20:31:26.708Z")
@NodeEntity
public class Experience   {

  @Id
  @GeneratedValue
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("pictures")
  @Valid
  private List<String> pictures = null;

  @JsonProperty("activityDescription")
  private String activityDescription = null;

  @Relationship(type="TAG", direction=Relationship.OUTGOING)
  @JsonProperty("tags")
  @Valid
  private List<Tag> tags = null;

  @JsonProperty("whatIncludes")
  @Valid
  private List<String> whatIncludes = null;

  @Relationship(type="PLACE", direction=Relationship.OUTGOING)
  @JsonProperty("places")
  @Valid
  private List<Place> places = null;

  public Experience id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador de la experiencia
   * @return id
  **/
  @ApiModelProperty(value = "Identificador de la experiencia")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Experience name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la experiencia
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nombre de la experiencia")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Experience title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Nombre de la experiencia
   * @return title
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "Nombre de la experiencia")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Experience summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Descripción corta
   * @return summary
  **/
  @ApiModelProperty(value = "Descripción corta")


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Experience description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción completa
   * @return description
  **/
  @ApiModelProperty(value = "Descripción completa")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Experience pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public Experience addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<String>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

  /**
   * Lista de fotos asociadas
   * @return pictures
  **/
  @ApiModelProperty(value = "Lista de fotos asociadas")


  public List<String> getPictures() {
    return pictures;
  }

  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  public Experience activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * Descripción de la actividad
   * @return activityDescription
  **/
  @ApiModelProperty(value = "Descripción de la actividad")


  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public Experience tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Experience addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(value = "Tags")

  @Valid

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Experience whatIncludes(List<String> whatIncludes) {
    this.whatIncludes = whatIncludes;
    return this;
  }

  public Experience addWhatIncludesItem(String whatIncludesItem) {
    if (this.whatIncludes == null) {
      this.whatIncludes = new ArrayList<String>();
    }
    this.whatIncludes.add(whatIncludesItem);
    return this;
  }

  /**
   * Qué incluye
   * @return whatIncludes
  **/
  @ApiModelProperty(value = "Qué incluye")


  public List<String> getWhatIncludes() {
    return whatIncludes;
  }

  public void setWhatIncludes(List<String> whatIncludes) {
    this.whatIncludes = whatIncludes;
  }

  public Experience places(List<Place> places) {
    this.places = places;
    return this;
  }

  public Experience addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<Place>();
    }
    this.places.add(placesItem);
    return this;
  }

  /**
   * Lugar
   * @return places
  **/
  @ApiModelProperty(value = "Lugar")

  @Valid

  public List<Place> getPlaces() {
    return places;
  }

  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Experience experience = (Experience) o;
    return Objects.equals(this.id, experience.id) &&
        Objects.equals(this.name, experience.name) &&
        Objects.equals(this.title, experience.title) &&
        Objects.equals(this.summary, experience.summary) &&
        Objects.equals(this.description, experience.description) &&
        Objects.equals(this.pictures, experience.pictures) &&
        Objects.equals(this.activityDescription, experience.activityDescription) &&
        Objects.equals(this.tags, experience.tags) &&
        Objects.equals(this.whatIncludes, experience.whatIncludes) &&
        Objects.equals(this.places, experience.places);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, summary, description, pictures, activityDescription, tags, whatIncludes, places);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experience {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    whatIncludes: ").append(toIndentedString(whatIncludes)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

