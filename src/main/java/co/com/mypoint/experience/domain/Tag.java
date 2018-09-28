package co.com.mypoint.experience.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Etiqueta
 */
@ApiModel(description = "Etiqueta")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T20:31:26.708Z")
@NodeEntity
public class Tag   {

  @Id
  @GeneratedValue
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("image")
  private String image = null;

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre
   * @return name
  **/
  @ApiModelProperty(value = "Nombre")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Imagen que representa la etiqueta
   * @return image
  **/
  @ApiModelProperty(value = "Imagen que representa la etiqueta")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.image, tag.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

