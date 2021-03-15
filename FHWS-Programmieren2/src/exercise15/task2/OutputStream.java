package exercise15.task2;

import java.io.IOException;

public class OutputStream
{

    public void write(byte[] b, int off, int len) throws IOException
    {
        if (b == null)
        {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length) || ((off + len) < 0))
        {
            throw new IndexOutOfBoundsException();
        } else if (len == 0)
        {
            return;
        }
        for (int i = 0; i < b.length; i++)
        {
            // write(b[off + i]);
        }
    }
}

// Precondition:
// (b != null)
// (off >= 0) && (off < b.length)
// (len >= 0) && (len < b.length - off)

// Exception:
// NullPointerException
// IndexOutOfBoundsException