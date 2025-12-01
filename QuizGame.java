package quiz;

import java.util.List;
// runs the quiz by generating questions

public class QuizGame {
    private int score = 0;

    public void start(String text) {
        IQuestionGenerator generator = new TextQuestionGenerator();
        List<Question> questions = generator.generateQuestions(text);

        System.out.println("===== TEST YOUR JAVA KNOWLEDGE =====");
// ask questions
        for (Question q : questions) {
            boolean correct = q.ask();
// loop to print correct and incorrect answers
            if (correct) {
                System.out.println("✔ Correct!");
                score++;
            } else {
                System.out.println("✘ Incorrect!");
            }
        }
// prints the score
        System.out.println("\nFinal Score: " + score + "/" + questions.size());
    }
}
