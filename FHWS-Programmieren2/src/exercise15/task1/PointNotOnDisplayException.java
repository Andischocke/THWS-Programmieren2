package exercise15.task1;

@SuppressWarnings("all")
public class PointNotOnDisplayException extends Exception
{

    public PointNotOnDisplayException(String string)
    {
        super(string);
    }
}

// Checked Exception erben von Exception und m�ssen gecatched werden
// Unchecked Exception erben von RuntimeException und k�nnen gecatched werden