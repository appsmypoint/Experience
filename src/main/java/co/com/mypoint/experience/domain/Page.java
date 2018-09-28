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
 * Page
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T20:31:26.708Z")

public class Page   {
  @JsonProperty("paginationMetadata")
  private PaginationMetadata paginationMetadata = null;

  @JsonProperty("sections")
  @Valid
  private List<Section> sections = null;

  public Page paginationMetadata(PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
    return this;
  }

  /**
   * Get paginationMetadata
   * @return paginationMetadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }

  public void setPaginationMetadata(PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
  }

  public Page sections(List<Section> sections) {
    this.sections = sections;
    return this;
  }

  public Page addSectionsItem(Section sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<Section>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Secciones
   * @return sections
  **/
  @ApiModelProperty(value = "Secciones")

  @Valid

  public List<Section> getSections() {
    return sections;
  }

  public void setSections(List<Section> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.paginationMetadata, page.paginationMetadata) &&
        Objects.equals(this.sections, page.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationMetadata, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

