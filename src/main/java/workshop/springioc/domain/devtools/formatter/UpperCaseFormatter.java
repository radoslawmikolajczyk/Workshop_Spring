package workshop.springioc.domain.devtools.formatter;

import workshop.springioc.domain.devtools.CommitFormatter;

public class UpperCaseFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return message.toUpperCase();
  }

}
