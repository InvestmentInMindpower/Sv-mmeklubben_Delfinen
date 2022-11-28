import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class InputHandler
{
    Scanner globalInput = new Scanner(System.in);

    public int inputMenuChoice() throws InputMismatchException
    {
        boolean correctInput = false;
        int input = 0;
        while(!correctInput)
        {
            try
            {
                input = globalInput.nextInt();
            }
            catch(InputMismatchException e)
            {
                OutputHandler.printGenericErrorText();
            }
            if(input <= 10 && input > 0)
            {
                correctInput = true;
            }
            else
            {
                OutputHandler.printGenericErrorText();
            }
        }
        return input;
    }
}
