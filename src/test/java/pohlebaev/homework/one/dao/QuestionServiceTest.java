package pohlebaev.homework.one.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pohlebaev.homework.one.model.Question;
import pohlebaev.homework.one.service.QuestionServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.*;

public class QuestionServiceTest {

     QuestionDao questionDao;

     QuestionServiceImpl questionService;

     Scanner scanner;


     @BeforeEach
     public void setUp() {
          scanner = mock(Scanner.class);
          questionDao = mock(QuestionDao.class);
          questionService = new QuestionServiceImpl(questionDao);
     }

     @Test
     public void check_startAskQuestion() {
          when(questionDao.getAllQuestionsAndCheckErrors()).thenReturn(getQuestionList());
          questionService.startAskQuestion();
          //?
     }

     public List<Question> getQuestionList() {
          List<Question> questionList = new ArrayList<>();
          questionList.add(new Question("1+1", "2"));
          questionList.add(new Question("1+1", "2"));
          questionList.add(new Question("1+1", "2"));
          questionList.add(new Question("1+1", "2"));
          questionList.add(new Question("1+1", "2"));
          return questionList;
     }
}
