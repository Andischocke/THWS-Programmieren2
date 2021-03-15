package exercise15.task4;

public class CopyTime
{
    public String inPath = "resources\\exercise15.svg";
    public String outPath = "resources\\output\\exercise15Copy.svg";

    public long getCopyTime(InterfaceCopier copier)
    {
        long startTime = System.nanoTime();
        copier.copy(inPath, outPath);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public void differenceTime()
    {
        CopierUnbuffered cub = new CopierUnbuffered();
        CopierBuffered cb = new CopierBuffered();

        long unbufferedTime = getCopyTime(cub);
        long bufferedTime = getCopyTime(cb);

        System.out.printf("Time for buffered copy: %d nanoseconds\n", bufferedTime);
        System.out.printf("Time for unbufferdCopy: %d nanoseconds\n", unbufferedTime);
        System.out.printf("Difference: %d nanoseconds\n", Math.abs(unbufferedTime - bufferedTime));
    }

    public static void main(String[] args)
    {
        CopyTime ct = new CopyTime();
        ct.differenceTime();
    }
}