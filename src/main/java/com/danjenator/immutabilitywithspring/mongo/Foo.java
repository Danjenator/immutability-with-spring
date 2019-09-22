package com.danjenator.immutabilitywithspring.mongo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.Wither;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Builder
@Document
@JsonDeserialize(builder = Foo.FooBuilder.class)
class Foo {

  @Id
  @Wither
  String id;
  String text;
  Bar bar;

  @JsonPOJOBuilder(withPrefix = "")
  static class FooBuilder { }
}
