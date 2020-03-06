package workshop.springioc.domain.devtools.repository;

public class FrontendRepository extends AbstractRepository {

  @Override
  protected String getMessagePrefix() {
    return "FE";
  }

}
