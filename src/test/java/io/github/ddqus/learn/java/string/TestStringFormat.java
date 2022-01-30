package io.github.ddqus.learn.java.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestStringFormat {
  @Test
  void testPrintf() {
    String s = "hello";
    assertThat(String.format("%s", s)).isEqualTo("hello");
    assertThat(String.format("%s %s", "prefix", s)).isEqualTo("prefix hello");
    assertThat(String.format("%s %s", s, "suffix")).isEqualTo("hello suffix");
  }
}
