package workshop.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import workshop.springioc.domain.FormatterWrapper;
import workshop.springioc.domain.devtools.CommitFormatter;
import workshop.springioc.domain.devtools.formatter.JavaFormatter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class);
        CommitFormatter javaFormatter = (CommitFormatter) ctx.getBean("javaFormatter");
        System.out.println(javaFormatter.format("Foo"));



        FormatterWrapper wrapper = (FormatterWrapper) ctx.getBean("formatterWrapper");
        System.out.println(wrapper.format("WRAPPER"));
    }


}
