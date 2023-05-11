package pohlebaev.homework.one.dao;

import org.springframework.stereotype.Repository;
import pohlebaev.homework.one.model.Question;

import java.util.List;
public interface QuestionDao {

    List<Question> getAllQuestions();
}
