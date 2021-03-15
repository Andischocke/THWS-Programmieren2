package exercise13.task4;

public class Main
{
    public static void main(String[] args)
    {
        EnumDirection threat = EnumDirection.AHEAD;
        AbstractIntelligence robot = new Robot();
        AbstractIntelligence human = new Human();
        AbstractIntelligence cyborg = new Cyborg();

        robot.printDecision(threat);
        human.printDecision(threat);
        cyborg.printDecision(threat);
    }
}
