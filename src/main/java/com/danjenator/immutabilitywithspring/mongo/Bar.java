package com.danjenator.immutabilitywithspring.mongo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = Bar.BarBuilder.class)
class Bar {
  String oneMore;
  @JsonPOJOBuilder(withPrefix = "")
  static class BarBuilder { }
}
