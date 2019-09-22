package com.danjenator.immutabilitywithspring.mongo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class FooController {

  private final FooRepository fooRepository;

  FooController(final FooRepository fooRepository) {
    this.fooRepository = fooRepository;
  }

  @PostMapping(path = "/foo")
  Foo createFoo(@RequestBody Foo foo) {
    log.info("[Foo: {}]", foo);
    return fooRepository.save(foo);
  }
}
