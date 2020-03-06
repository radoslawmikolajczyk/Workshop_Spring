package workshop.springioc.domain.devtools.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import workshop.springioc.domain.devtools.CommitFormatter;

@Component
@Primary
public class JavaFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return "<J>" + message + "<J>";
  }

}
