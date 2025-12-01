
package quiz;

import java.util.*;
// generates a predefined set of questions
public class TextQuestionGenerator implements IQuestionGenerator {

    @Override
    public List<Question> generateQuestions(String text) {
        List<Question> questions = new ArrayList<>();

        // Inheritance  questions
questions.add(new MultipleChoiceQuestion(
        "Which OOP principle allows a class to acquire properties of another class?",
        new String[]{"Polymorphism", "Inheritance", "Encapsulation", "Abstraction"},
        "2"
));

//   Polymorphism question
questions.add(new MultipleChoiceQuestion(
        "Which OOP concept allows methods to behave differently based on the object?",
        new String[]{"Polymorphism", "Overclocking", "Compiling", "Loading"},
        "1"
));

//  Encapsulation question
questions.add(new MultipleChoiceQuestion(
        "Encapsulation mainly protects:",
        new String[]{"Data inside a class", "Keyboard input", "Network connections", "CPU registers"},
        "1"
));

//  inheritance  question
questions.add(new MultipleChoiceQuestion(
        "Which Java keyword is used to implement inheritance?",
        new String[]{" Extend", "The Compiler", "The GPU", "The BIOS"},
        "1"
));

//  Abstract Class question
questions.add(new MultipleChoiceQuestion(
        " what is an abstract class?:",
        new String[]{" A Tables", "Objects and Classes", "A class that cannot be instantiated ", " A class with no variable"},
        "3"
));

// True/False Question
questions.add(new TrueFalseQuestion(
        "Java is an object-oriented programming language.",
        "true"
));
// Object Question
questions.add(new MultipleChoiceQuestion(
        " what is an object?:",
        new String[]{" A blueprint", "instance of a Classes", "Files", " A package"},
        "2"
));


        return questions;
    }
}