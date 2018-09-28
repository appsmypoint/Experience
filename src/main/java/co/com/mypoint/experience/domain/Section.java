package co.com.mypoint.experience.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Secciones visuales del sitio
 */
@ApiModel(description = "Secciones visuales del sitio")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T15:30:46.932Z")

public class Section   {
  @JsonProperty("displayType")
  private String displayType = null;

  @JsonProperty("title")
  private String title = null;

  public Section displayType(String displayType) {
    this.displayType = displayType;
    return this;
  }

  /**
   * Tipo de presentación visual (carousel,)
   * @return displayType
  **/
  @ApiModelProperty(value = "Tipo de presentación visual (carousel,)")


  public String getDisplayType() {
    return displayType;
  }

  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }

  public Section title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Título de la sección
   * @return title
  **/
  @ApiModelProperty(value = "Título de la sección")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.displayType, section.displayType) &&
        Objects.equals(this.title, section.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

