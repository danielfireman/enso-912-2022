package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Index controller = new Index();
    assertEquals("Welcome to Jooby!", controller.index());
  }
}
