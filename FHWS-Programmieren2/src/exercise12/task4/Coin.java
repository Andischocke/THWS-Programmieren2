package exercise12.task4;

public class Coin
{
    private String coinName;
    private int coinValue;

    public Coin(String coinName, int coinValue)
    {
        this.coinName = coinName;
        this.coinValue = coinValue;
    }

    public String getName()
    {
        return coinName;
    }

    public int getValue()
    {
        return coinValue;
    }

    public static Coin[] availableCoins = new Coin[]{
            new Coin(" 1-Cent", 1),
            new Coin(" 2-Cent", 2),
            new Coin(" 5-Cent", 5),
            new Coin("10-Cent", 10),
            new Coin("20-Cent", 20),
            new Coin("50-Cent", 50),
            new Coin(" 1-Euro", 100),
            new Coin(" 2-Euro", 200),
    };
}