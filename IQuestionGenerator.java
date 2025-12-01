package quiz;

import java.util.List;
// Generates a list of questions from the given text

public interface IQuestionGenerator {
    List<Question> generateQuestions(String text);
}

