package pohlebaev.homework.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pohlebaev.homework.one.service.QuestionServiceImpl;

@ComponentScan
@Configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        QuestionServiceImpl questionService = applicationContext.getBean(QuestionServiceImpl.class);
        questionService.startAskQuestion();


    }
}