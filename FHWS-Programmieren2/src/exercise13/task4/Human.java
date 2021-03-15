package exercise13.task4;

public class Human extends AbstractIntelligence
{

    @Override
    public EnumDirection decide(EnumDirection threat)
    {
        EnumDirection evade = super.decide(threat);
        if ((int) (Math.random() * 4) == 0)
        {
            return EnumDirection.UNDECIDED;
        }
        return evade;
    }
}