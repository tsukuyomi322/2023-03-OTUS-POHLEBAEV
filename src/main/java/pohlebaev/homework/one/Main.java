package pohlebaev.homework.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pohlebaev.homework.one.service.QuestionServiceImpl;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
       ApplicationContext applicationContext =  SpringApplication.run(Main.class, args);
       QuestionServiceImpl questionService = applicationContext.getBean(QuestionServiceImpl.class);
       questionService.startAskQuestion();

    }
}