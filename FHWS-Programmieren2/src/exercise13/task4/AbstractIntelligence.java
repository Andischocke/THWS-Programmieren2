package exercise13.task4;

public abstract class AbstractIntelligence
{

    public EnumDirection decide(EnumDirection threat)
    {
        if (threat == EnumDirection.AHEAD)
        {
            return EnumDirection.BREAK;
        } else if (threat == EnumDirection.LEFT)
        {
            return EnumDirection.RIGHT;
        } else if (threat == EnumDirection.RIGHT)
        {
            return EnumDirection.LEFT;
        }
        return null;
    }

    public void printDecision(EnumDirection threat)
    {
        String name = this.getClass().getSimpleName().toString();
        String decision = this.decide(threat).toString();
        System.out.printf("Threat was %s. %20s decision: %s\n", threat.toString(), name, decision);
    }
}
