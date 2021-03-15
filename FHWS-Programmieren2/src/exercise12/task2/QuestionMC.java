package exercise12.task2;

public class QuestionMC extends Question
{

    public String[] choices;

    public QuestionMC(String question, String solution, String... choices)
    {
        super(question, solution);
        this.choices = choices;
    }

    public String toString()
    {
        String string = super.toString() + "\t";
        for (int i = 0; i < choices.length; i++)
        {
            string += String.format("%c: %s\t", i + 65, choices[i]);
        }
        return string;
    }
}