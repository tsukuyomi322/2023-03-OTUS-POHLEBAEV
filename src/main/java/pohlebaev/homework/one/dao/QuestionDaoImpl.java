package pohlebaev.homework.one.dao;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;
import pohlebaev.homework.one.config.AppProps;
import pohlebaev.homework.one.model.Question;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    private final AppProps appProps;
    private final MessageSource messageSource;

    public QuestionDaoImpl(AppProps appProps, MessageSource messageSource) {
        this.appProps = appProps;
        this.messageSource = messageSource;
    }

    public List<Question> getAllQuestions() {
        return getLocalQuestions();
    }

    public List<Question> getLocalQuestions() {
        String question1 = messageSource.getMessage("question.one", new Object[]{}, appProps.getLocale());
        String answer1 = messageSource.getMessage("answer.one", new Object[]{}, appProps.getLocale());

        String question2 = messageSource.getMessage("question.two", new Object[]{}, appProps.getLocale());
        String answer2 = messageSource.getMessage("answer.two", new Object[]{}, appProps.getLocale());

        String question3 = messageSource.getMessage("question.three", new Object[]{}, appProps.getLocale());
        String answer3 = messageSource.getMessage("answer.three", new Object[]{}, appProps.getLocale());

        String question4 = messageSource.getMessage("question.four", new Object[]{}, appProps.getLocale());
        String answer4 = messageSource.getMessage("answer.four", new Object[]{}, appProps.getLocale());

        String question5 = messageSource.getMessage("question.five", new Object[]{}, appProps.getLocale());
        String answer5 = messageSource.getMessage("answer.five", new Object[]{}, appProps.getLocale());

        Question questionOne = new Question(question1, answer1);
        Question questionTwo = new Question(question2, answer2);
        Question questionThree = new Question(question3, answer3);
        Question questionFour = new Question(question4, answer4);
        Question questionFive = new Question(question5, answer5);

        return List.of(questionOne, questionTwo, questionThree, questionFour, questionFive);

    }
}
