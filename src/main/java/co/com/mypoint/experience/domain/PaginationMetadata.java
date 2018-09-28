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
 * Manejo de la paginación de las secciones
 */
@ApiModel(description = "Manejo de la paginación de las secciones")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-28T15:30:46.932Z")

public class PaginationMetadata   {
  @JsonProperty("hasNextPage")
  private Boolean hasNextPage = null;

  @JsonProperty("itemsOffset")
  private Integer itemsOffset = null;

  @JsonProperty("sectionOffset")
  private Integer sectionOffset = null;

  public PaginationMetadata hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  /**
   * Tiene más páginas
   * @return hasNextPage
  **/
  @ApiModelProperty(value = "Tiene más páginas")


  public Boolean isHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  public PaginationMetadata itemsOffset(Integer itemsOffset) {
    this.itemsOffset = itemsOffset;
    return this;
  }

  /**
   * Número de items
   * @return itemsOffset
  **/
  @ApiModelProperty(value = "Número de items")


  public Integer getItemsOffset() {
    return itemsOffset;
  }

  public void setItemsOffset(Integer itemsOffset) {
    this.itemsOffset = itemsOffset;
  }

  public PaginationMetadata sectionOffset(Integer sectionOffset) {
    this.sectionOffset = sectionOffset;
    return this;
  }

  /**
   * Número de secciones
   * @return sectionOffset
  **/
  @ApiModelProperty(value = "Número de secciones")


  public Integer getSectionOffset() {
    return sectionOffset;
  }

  public void setSectionOffset(Integer sectionOffset) {
    this.sectionOffset = sectionOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMetadata paginationMetadata = (PaginationMetadata) o;
    return Objects.equals(this.hasNextPage, paginationMetadata.hasNextPage) &&
        Objects.equals(this.itemsOffset, paginationMetadata.itemsOffset) &&
        Objects.equals(this.sectionOffset, paginationMetadata.sectionOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, itemsOffset, sectionOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationMetadata {\n");
    
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    itemsOffset: ").append(toIndentedString(itemsOffset)).append("\n");
    sb.append("    sectionOffset: ").append(toIndentedString(sectionOffset)).append("\n");
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

