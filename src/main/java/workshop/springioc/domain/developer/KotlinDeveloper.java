package workshop.springioc.domain.developer;

import workshop.springioc.domain.devtools.AbstractSoftwareDeveloper;
import workshop.springioc.domain.devtools.CodeRepository;
import workshop.springioc.domain.devtools.CommitFormatter;

public class KotlinDeveloper extends AbstractSoftwareDeveloper {

    public KotlinDeveloper(CodeRepository repository, CommitFormatter formatter) {
        super(repository, formatter);
    }

    @Override
    public void workOn(String task) {
        var messsage = task + " in Kotlin";
        repository.commit(formatter.format(messsage));
    }

}
