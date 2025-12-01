package quiz;

import java.util.Scanner;
// TrueFalse questions inherits from question
public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public boolean ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + questionText);

        // True/False options
        System.out.println("1) True");
        System.out.println("2) False");

        TimerThread timer = new TimerThread(20);
        timer.start();

        String answer = sc.nextLine();
        timer.stop = true;  // stop the timer

        if (timer.outOfTime) { // check if time ran out
            System.out.println("⏳ Time's up!");
            return false;
        }

        // Accept either "True"/"False" or "1"/"2" as correct input
        if (answer.equalsIgnoreCase(correctAnswer) ||
            (answer.equals("1") && correctAnswer.equalsIgnoreCase("True")) ||
            (answer.equals("2") && correctAnswer.equalsIgnoreCase("False"))) {
            return true;
        }

        return false;
    }
}
