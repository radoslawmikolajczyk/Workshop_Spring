package workshop.springioc.domain.developer;

import workshop.springioc.domain.devtools.AbstractSoftwareDeveloper;
import workshop.springioc.domain.devtools.CodeRepository;
import workshop.springioc.domain.devtools.CommitFormatter;

public class JavaDeveloper extends AbstractSoftwareDeveloper {

    public JavaDeveloper(CodeRepository repository, CommitFormatter formatter) {
        super(repository, formatter);
    }

    @Override
    public void workOn(String task) {
        var messsage = task + " in Java";
        repository.commit(formatter.format(messsage));
    }
}
