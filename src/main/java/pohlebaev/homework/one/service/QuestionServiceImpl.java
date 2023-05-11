package pohlebaev.homework.one.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import pohlebaev.homework.one.config.AppProps;
import pohlebaev.homework.one.dao.QuestionDao;
import pohlebaev.homework.one.model.Question;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final AppProps appProps;

    private final QuestionDao questionDao;

    private final MessageSource messageSource;
    

    public QuestionServiceImpl(QuestionDao questionDao, MessageSource messageSource, AppProps appProps) {
        this.questionDao = questionDao;
        this.messageSource = messageSource;
        this.appProps = appProps;
    }

    @Override
    public void startAskQuestion() {
        List<Question> questionList = questionDao.getAllQuestions();
        try (Scanner scanner = new Scanner(System.in)) {
            int correctAnswer = 0;
            String greet =  messageSource.getMessage("enter.greeting", new Object[]{}, appProps.getLocale());
            System.out.println(greet);
            String name = scanner.nextLine();
            String nameLocale = messageSource.getMessage("enter.name", new Object[]{name}, appProps.getLocale());
            System.out.println(nameLocale);
            for (Question question : questionList) {
                System.out.println(question.getQuestion());
                String answer = scanner.nextLine();
                if(question.isAnswerCorrect(answer)) {
                    correctAnswer++;
                }
            }
            System.out.println(name + ", amount of correct answers: " + correctAnswer +"\n" + "quiz is over");
        }
    }
}
