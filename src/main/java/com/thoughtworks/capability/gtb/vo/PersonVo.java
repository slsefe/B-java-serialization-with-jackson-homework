package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "age", "name", "hobby"})
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;

  @JsonGetter("age")
  public Integer getAge() {
    if (age == null) {
      return 0;
    }
    return age;
  }
}
