package workshop.springioc.domain.devtools.formatter;

import org.springframework.stereotype.Component;
import workshop.springioc.domain.devtools.CommitFormatter;

@Component
public class KotlinFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return "|K| " + message + " |K|";
  }

}
