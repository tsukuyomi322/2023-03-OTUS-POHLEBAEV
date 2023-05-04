package pohlebaev.homework.one.model;

import java.util.Objects;

public class Question  {

    private String question;

    private String answer;

    public Question() {

    }

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }


    public boolean isAnswerCorrect(String answer) {
        return this.getAnswer().equalsIgnoreCase(answer.trim());
    }

    @Override
    public String toString() {
        return "QuestionImpl{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return question.equals(question1.question) && answer.equals(question1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }
}