package model;
public class Question {

    String question;
    String anwserA;
    String answerB;

    public String getQuestion() {
        return question;
    }

    public String getAnwserA() {
        return anwserA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public Question(String question, String anwserA, String answerB) {
        this.question = question;
        this.anwserA = anwserA;
        this.answerB = answerB;


    }
}
