package workshop.springioc.domain;

import java.util.List;

public interface SoftwareDeveloper {

    void workOn(String task);

    List<String> getCommits();
}
