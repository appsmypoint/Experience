package co.com.mypoint.experience.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Secciones visuales del sitio
 */
@ApiModel(description = "Secciones visuales del sitio")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-02T03:21:31.603Z")

public class Section   {
  @JsonProperty("displayType")
  private String displayType = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("pictureBackground")
  private String pictureBackground = null;

  @JsonProperty("componentType")
  private String componentType = null;

  @JsonProperty("sectionItems")
  @Valid
  private List<Object> sectionItems = null;

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

  public Section pictureBackground(String pictureBackground) {
    this.pictureBackground = pictureBackground;
    return this;
  }

  /**
   * Foto de fondo
   * @return pictureBackground
  **/
  @ApiModelProperty(value = "Foto de fondo")


  public String getPictureBackground() {
    return pictureBackground;
  }

  public void setPictureBackground(String pictureBackground) {
    this.pictureBackground = pictureBackground;
  }

  public Section componentType(String componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Tipo componente visual
   * @return componentType
  **/
  @ApiModelProperty(value = "Tipo componente visual")


  public String getComponentType() {
    return componentType;
  }

  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }

  public Section sectionItems(List<Object> sectionItems) {
    this.sectionItems = sectionItems;
    return this;
  }

  public Section addSectionItemsItem(Object sectionItemsItem) {
    if (this.sectionItems == null) {
      this.sectionItems = new ArrayList<Object>();
    }
    this.sectionItems.add(sectionItemsItem);
    return this;
  }

  /**
   * Get sectionItems
   * @return sectionItems
  **/
  @ApiModelProperty(value = "")


  public List<Object> getSectionItems() {
    return sectionItems;
  }

  public void setSectionItems(List<Object> sectionItems) {
    this.sectionItems = sectionItems;
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
        Objects.equals(this.title, section.title) &&
        Objects.equals(this.pictureBackground, section.pictureBackground) &&
        Objects.equals(this.componentType, section.componentType) &&
        Objects.equals(this.sectionItems, section.sectionItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayType, title, pictureBackground, componentType, sectionItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pictureBackground: ").append(toIndentedString(pictureBackground)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    sectionItems: ").append(toIndentedString(sectionItems)).append("\n");
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

