package workshop.springioc.domain.devtools;

import workshop.springioc.domain.SoftwareDeveloper;

import java.util.List;

public abstract class AbstractSoftwareDeveloper implements SoftwareDeveloper {

    protected final CodeRepository repository;
    protected final CommitFormatter formatter;

    public AbstractSoftwareDeveloper(CodeRepository repository, CommitFormatter formatter) {
        this.repository = repository;
        this.formatter = formatter;
    }

    @Override
    public void workOn(String task) {

    }

    @Override
    public List<String> getCommits() {
        return List.copyOf(repository.getCommits());
    }
}
