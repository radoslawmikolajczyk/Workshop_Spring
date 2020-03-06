package workshop.springioc.domain;

import org.junit.jupiter.api.Test;
import workshop.springioc.domain.developer.JavaDeveloper;
import workshop.springioc.domain.developer.KotlinDeveloper;
import workshop.springioc.domain.devtools.formatter.JavaFormatter;
import workshop.springioc.domain.devtools.formatter.KotlinFormatter;
import workshop.springioc.domain.devtools.repository.BackendRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SoftwareDeveloperTest {

  @Test
  void testJavaDeveloper() {
//    given:
    var formatter = new JavaFormatter();
    var repository = new BackendRepository();
    var developer = new JavaDeveloper(repository,formatter);

//    when:
    developer.workOn("CQC-123");
    developer.workOn("CQC-456");
//    then:
    assertIterableEquals(List.of("BE: <J>CQC-123 in Java<J>", "BE: <J>CQC-456 in Java<J>"), developer.getCommits());
  }

  @Test
  void testKotlinDeveloper() {
//    given:
    var formatter = new KotlinFormatter();
    var repository = new BackendRepository();
    var developer = new KotlinDeveloper(repository,formatter);
//    when:
    developer.workOn("CQC-123");
    developer.workOn("CQC-456");
//    then:
    assertIterableEquals(List.of("BE: |K| CQC-123 in Kotlin |K|", "BE: |K| CQC-456 in Kotlin |K|"), developer.getCommits());
  }
}
