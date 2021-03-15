package exercise12.task2;

import java.util.ArrayList;
import java.util.List;

public class Quiz
{
    public List<Question> questionList = new ArrayList<>();

    public void printQuiz()
    {
        for (int i = 0; i < questionList.size(); i++)
        {
            System.out.printf("%6d. %s\n\n", i + 1, questionList.get(i));
        }
    }

    public static void main(String[] args)
    {
        Quiz quiz = new Quiz();
        quiz.questionList.add(new Question("Was ist die Hauptstadt von Deutschland?", "Berlin"));
        quiz.questionList.add(new QuestionMC("Wie viele Protonen hat ein WasserstoffAtom?", "1", "4", "2", "1", "0"));
        quiz.printQuiz();
    }
}