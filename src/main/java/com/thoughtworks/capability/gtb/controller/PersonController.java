package com.thoughtworks.capability.gtb.controller;

import com.thoughtworks.capability.gtb.vo.PersonVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class PersonController {

  @GetMapping("/persons/{id}")
  public PersonVo getPerson(@PathVariable("id") String id) {
    return new PersonVo(id, null, "张三", null);
  }

  @PostMapping("/persons")
  public PersonVo createPerson(@RequestParam String id,
                               @RequestParam(required = false) Integer age,
                               @RequestParam String name,
                               @RequestParam(required = false) String hobby) {
    return new PersonVo(id, age, name, hobby);
  }
}
