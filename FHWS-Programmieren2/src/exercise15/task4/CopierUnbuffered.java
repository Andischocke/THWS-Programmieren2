package exercise15.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierUnbuffered implements InterfaceCopier
{

    public void copy(String inPath, String outPath)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(inPath);
            fos = new FileOutputStream(outPath);

            int data;
            while ((data = fis.read()) != -1)
            {
                fos.write(data);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                fis.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                fos.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}