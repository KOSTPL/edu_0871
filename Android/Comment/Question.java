ackage com.example.myapplication;

public class Question {// класс Question со списком вопросов
    private int questionTextId; //создаем идентификатор для вопроса
    private boolean answerTrue; //создаем  True boolean переменную answerTrue

    public Question(int questionTextId, boolean answerTrue) {// создали конструктор Question для двух полей questionTextId и answerTrue
        this.questionTextId = questionTextId;
        this.answerTrue = answerTrue;
    }
// создаем геттеры и сеттеры для questionTextId и answerTrue
    public int getQuestionTextId() {
        return questionTextId;
    }

    public void setQuestionTextId(int questionTextId) {
        this.questionTextId = questionTextId;
    }

    public boolean isAnswerTrue() {
        return answerTrue;
    }// возвращает answerTrue значение boolean

    public void setAnswerTrue(boolean answerTrue) {
        this.answerTrue = answerTrue;
    }
}
