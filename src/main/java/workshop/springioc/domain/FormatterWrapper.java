package workshop.springioc.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.springioc.domain.devtools.CommitFormatter;

@Component
public class FormatterWrapper {

    @Autowired
    CommitFormatter formatter;

    public String format(String message){
        return formatter.format(message);
    }

}
