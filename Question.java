package quiz;
// Abstract class for all questions
public abstract class Question {
    protected String questionText;
    protected String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }
// access correct answer
    public String getCorrectAnswer() {
        return correctAnswer;
    }
// implementation by subclass
    public abstract boolean ask();
}
