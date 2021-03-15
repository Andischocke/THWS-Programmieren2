package exercise12.task4;

public class ChangeCalculator
{

    public int[] getChange(int euro, int cent)
    {
        int[] changeArray = new int[Coin.availableCoins.length];
        cent = euro * 100 + cent;
        changeArray[0] = cent;
        return changeArray;
    }

    public void printChange(int euro, int cent)
    {
        System.out.printf("Your change is %d Euro and %d Cent.\n", euro, cent);
        int coinCount = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++)
        {
            System.out.printf("%5d x %s\n", getChange(euro, cent)[i], Coin.availableCoins[i].getName());
            coinCount += getChange(euro, cent)[i];
        }
        System.out.printf("Your change consists of %d coins.\n\n", coinCount);
    }
}