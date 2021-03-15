package exercise13.task4;

public class Cyborg extends AbstractIntelligence
{
    Robot robot = new Robot();
    Human human = new Human();

    @Override
    public EnumDirection decide(EnumDirection threat)
    {
        EnumDirection evadeRobot = robot.decide(threat);
        EnumDirection evadeHuman = human.decide(threat);

        if (evadeHuman == evadeRobot)
        {
            return evadeRobot;
        } else
        {
            if ((int) (Math.random() * 2) == 0)
            {
                return evadeRobot;
            } else
            {
                return evadeHuman;
            }
        }
    }
}