package quiz;

import java.util.Scanner;
// multiplechoicequestion inherits from questions
public class MultipleChoiceQuestion extends Question {
    private String[] options; // encapsulates possible answers



    // constructor initializes questions text , answer questions and correct
    public MultipleChoiceQuestion(String questionText, String[] options, String correctAnswer) {
        super(questionText, correctAnswer); // calls parent class
        this.options = options; // stores options
    }

    @Override

public boolean ask() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n" + questionText);

// shows all options
    for (int i = 0; i < options.length; i++) {
        System.out.println((i + 1) + ") " + options[i]);
    }

    TimerThread timer = new TimerThread(20);
    timer.start();

    // Wait for user input
    String answer = sc.nextLine();

    //  Stop timer immediately after user answers
    timer.stop = true;
    System.out.println(); // moves to next line so output looks neat

    //  Check if time already ran out
    if (timer.outOfTime) {
        System.out.println("⏳ Time's up!");
        return false;
    }

    //  Compare answer with correct answer
    return answer.equals(correctAnswer);
}

}

