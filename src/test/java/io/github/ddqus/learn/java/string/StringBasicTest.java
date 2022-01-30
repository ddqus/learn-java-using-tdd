package io.github.ddqus.learn.java.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringBasicTest {
  @Test
  void test() {
    String s = "this is string";
    assertThat(s).isInstanceOf(String.class);
  }
}