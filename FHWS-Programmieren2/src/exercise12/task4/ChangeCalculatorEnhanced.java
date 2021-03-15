package exercise12.task4;

public class ChangeCalculatorEnhanced extends ChangeCalculator
{

    @Override
    public int[] getChange(int euro, int cent)
    {
        int[] changeArray = new int[Coin.availableCoins.length];
        cent = euro * 100 + cent;
        for (int i = Coin.availableCoins.length - 1; i >= 0; i--)
        {
            changeArray[i] = cent / Coin.availableCoins[i].getValue();
            cent = cent % Coin.availableCoins[i].getValue();
        }
        return changeArray;
    }

    public static void main(String[] args)
    {
        ChangeCalculator simple = new ChangeCalculator();
        simple.printChange(1, 70);
        simple.printChange(3, 88);
        ChangeCalculator enhanced = new ChangeCalculatorEnhanced();
        enhanced.printChange(1, 70);
        enhanced.printChange(3, 88);
    }
}