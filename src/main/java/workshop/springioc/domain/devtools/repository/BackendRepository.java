package workshop.springioc.domain.devtools.repository;

public class BackendRepository extends AbstractRepository {

  @Override
  protected String getMessagePrefix() {
    return "BE";
  }

}
