package workshop.springioc.domain;

import workshop.springioc.domain.devtools.CommitFormatter;
import workshop.springioc.domain.devtools.formatter.JavaFormatter;
import workshop.springioc.domain.devtools.formatter.JavaScriptFormatter;
import workshop.springioc.domain.devtools.formatter.KotlinFormatter;
import workshop.springioc.domain.devtools.formatter.UpperCaseFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterTest {

  @Test
  void testJavaFormatter() {
//    given:
    CommitFormatter formatter = new JavaFormatter();
//    when:
    var result = formatter.format("foo");
//    then:
    assertEquals("<J>foo<J>", result);
  }

  @Test
  void testKotlinFormatter() {
//    given:
    CommitFormatter formatter = new KotlinFormatter();
//    when:
    var result = formatter.format("foo");
//    then:
    assertEquals("|K| foo |K|", result);
  }

  @Test
  void testJavaScriptFormatter() {
//    given:
    CommitFormatter formatter = new JavaScriptFormatter();
//    when:
    var result = formatter.format("hello Java Script");
//    then:
    assertEquals("hellojavascript", result);
  }

  @Test
  void testUpperCaseFormatter() {
//    given:
    CommitFormatter formatter = new UpperCaseFormatter();
//    when:
    var result = formatter.format("Foo bar");
//    then:
    assertEquals("FOO BAR", result);
  }
}