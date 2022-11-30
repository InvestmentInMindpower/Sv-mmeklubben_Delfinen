import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class InputHandler
{
    private static Scanner globalInput = new Scanner(System.in);

    public static int inputMenuChoice() throws InputMismatchException
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

    public static String inputCPR() throws InputMismatchException
    {
        boolean correctInput = false;
        String inputDay = "";
        String inputMonth = "";
        String inputYear = "";
        String inputCifers = "";
        while(!correctInput)
        {
            try
            {
                 OutputHandler.printInputDayInfo();
                 inputDay = globalInput.next();
                 OutputHandler.printInputMonthInfo();
                 inputMonth = globalInput.next();
                 OutputHandler.printInputYearInfo();
                 inputYear = globalInput.next();
                 OutputHandler.printInputCiphersInfo();
                 inputCifers = globalInput.next();
                if(Integer.valueOf(inputDay) <= 31 && Integer.valueOf(inputDay) > 0 && Integer.valueOf(inputMonth) <= 12 && Integer.valueOf(inputMonth) > 0 && Integer.valueOf(inputYear) > 0 && Integer.valueOf(inputCifers) > 0 && Integer.valueOf(inputCifers) < 9999)
                {
                    correctInput = true;
                }
                else
                {
                    OutputHandler.printCprFormError();
                }
            }
            catch(Exception e)
            {
                OutputHandler.printGenericErrorText();
            }

        }
        String outputString = inputDay + inputMonth + inputYear + inputCifers;
        return outputString;
    }

    public static boolean fromInputToBool()
    {
        boolean correctInput = false;
        boolean outPutBoolean = false;

        while(!correctInput)
        {
            int input;
            try
            {
                OutputHandler.printTextBoxStart();
                System.out.println("Enter either [1] for Active membership status, or [2] for passive membership Status");
                input = globalInput.nextInt();
                OutputHandler.printTextBoxEnd();
                if(input == 1 || input == 2)
                {
                    if(input == 1)
                    {
                        outPutBoolean = true;
                        correctInput = true;
                    }
                    else
                    {
                        outPutBoolean = false;
                        correctInput = true;
                    }
                }
                else
                {
                    OutputHandler.printGenericErrorText();
                }
            }
            catch(InputMismatchException e)
            {
                OutputHandler.printGenericErrorText();
            }
        }
        return outPutBoolean;
    }

    public static String inputString()
    {
        //return any string
        String input = globalInput.next();
        return input;
    }



}
