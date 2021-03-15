package exercise12.task2;

public class Question
{
    public String question;
    public String solution;

    public Question(String question, String solution)
    {
        this.question = question;
        this.solution = solution;
    }

    public String toString()
    {
        return String.format("%-60s%s\n", question, solution);
    }
}