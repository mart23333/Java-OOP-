package quiz;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// runs the quiz by generating questions
public class QuizGame {
    private int score = 0;

    public void start(String text) {
        Scanner sc = new Scanner(System.in);

        // 🔥 Ask for player name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Create player profile
        Player player = new Player(name);

        IQuestionGenerator generator = new TextQuestionGenerator();
        List<Question> questions = generator.generateQuestions(text);

        //  Shuffle the order of questions
        Collections.shuffle(questions);

        System.out.println("\n===== TEST YOUR JAVA KNOWLEDGE =====");

        // ask questions
        for (Question q : questions) {
            boolean correct = q.ask();

            if (correct) {
                System.out.println("✔ Correct!");
                score++;
            } else {
                System.out.println("✘ Incorrect!");
            }
        }

        // update player high score
        player.updateHighScore(score);

        // prints the results
        System.out.println("\nFinal Score: " + score + "/" + questions.size());
        System.out.println("Player: " + player.getName());
        System.out.println("Your High Score: " + player.getHighScore());
    }
}
