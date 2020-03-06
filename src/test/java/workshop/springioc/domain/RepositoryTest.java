package workshop.springioc.domain;

import workshop.springioc.domain.devtools.repository.BackendRepository;
import workshop.springioc.domain.devtools.repository.FrontendRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RepositoryTest {

  @Test
  void testBackendRepository() {
//    given:
    var repository = new BackendRepository();
//    when:
    repository.commit("foo");
    repository.commit("bar");
//    then:
    assertIterableEquals(List.of("BE: foo", "BE: bar"), repository.getCommits());
  }

  @Test
  void testFrontendRepository() {
    //    given:
    var repository = new FrontendRepository();
//    when:
    repository.commit("foo");
    repository.commit("bar");
//    then:
    assertIterableEquals(List.of("FE: foo", "FE: bar"), repository.getCommits());
  }
}
