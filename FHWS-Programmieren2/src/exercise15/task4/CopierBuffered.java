package exercise15.task4;

import java.io.*;

public class CopierBuffered implements InterfaceCopier
{

    public void copy(String inPath, String outPath)
    {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try
        {
            bis = new BufferedInputStream(new FileInputStream(inPath));
            bos = new BufferedOutputStream(new FileOutputStream(outPath));

            int data;
            while ((data = bis.read()) != -1)
            {
                bos.write(data);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                bis.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                bos.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}