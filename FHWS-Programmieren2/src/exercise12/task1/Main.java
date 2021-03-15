package exercise12.task1;

public class Main
{
    public static void main(String[] args)
    {
        AbstractPerson[] personArray = new AbstractPerson[100];
        for (int i = 0; i < personArray.length; i++)
        {
            if (i % 2 == 0)
            {
                personArray[i] = new Professor();
            } else
            {
                personArray[i] = new Student();
            }
        }
        for (AbstractPerson p : personArray)
        {
            p.printActivity();
        }
    }
}
