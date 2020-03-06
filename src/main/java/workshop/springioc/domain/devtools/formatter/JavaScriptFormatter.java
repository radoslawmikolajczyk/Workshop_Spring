package workshop.springioc.domain.devtools.formatter;

import workshop.springioc.domain.devtools.CommitFormatter;

public class JavaScriptFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return message
        .replaceAll("\\s", "")
        .toLowerCase();
  }

}
