package workshop.springioc.domain.devtools;

import java.util.List;

public interface CodeRepository {

  void commit(String message);

  List<String> getCommits();

}