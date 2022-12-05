import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class InputHandler
{
    private static Scanner globalInput = new Scanner(System.in);

    public static int inputMenuChoice(int options) throws InputMismatchException
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
            if(input <= options && input > 0)
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

    public static void InputStaeveneDataFromFile(ArrayList<StaevneResultat> staevneResultatList, String staevnePath) throws FileNotFoundException {
        String stavneLine = "";
        String staevneLine = "";
        BufferedReader br;
        br = new BufferedReader(new FileReader(staevnePath));
        {
            try {
                br = new BufferedReader(new FileReader(staevnePath));
                while((staevneLine = br.readLine()) != null)
                {

                    String[] values = staevneLine.split(",");
                    staevneResultatList.add(new StaevneResultat(values[0], values[1], Integer.parseInt(values[2]), Double.parseDouble(values[3])));

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static String inputPassword() throws InputMismatchException
    {

        boolean correctInput = false;
        String input = "null";
        while(!correctInput)
        {
            OutputHandler.printAskForPassword();
            try
            {
                input = globalInput.next();
            }
            catch(InputMismatchException e)
            {
                OutputHandler.printGenericErrorText();
            }
            if(input != "null")
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

    public static void InputMemberDataFromFile(ArrayList<Member> memberList, String memberPath) throws FileNotFoundException
    {
        String memberLine = "";
        BufferedReader br;
        {
            try {
                br = new BufferedReader(new FileReader(memberPath));
                while((memberLine = br.readLine()) != null)
                {

                    String[] values = memberLine.split(",");

                    if(values[0].equals("WorkoutSwimmer"))
                    {
                        memberList.add(new WorkoutSwimmer(values[0], values[1], AgeGroup.valueOf(values[2]), Boolean.parseBoolean(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6])));
                    } else if(values[0].equals("CompetitiveSwimmer"))
                    {
                        memberList.add(new CompetitiveSwimmer(values[0], values[1], AgeGroup.valueOf(values[2]), Boolean.parseBoolean(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]), Double.parseDouble(values[7]), Double.parseDouble(values[8]), Double.parseDouble(values[9]), Double.parseDouble(values[10]), values[11], Boolean.parseBoolean(values[12]), Boolean.parseBoolean(values[13]), Boolean.parseBoolean(values[14]), Boolean.parseBoolean(values[15])));
                    }
                }
                OutputHandler.printListSize("Number of members", memberList);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


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
        OutputHandler.printInputBool();
        while(!correctInput)
        {
            int input;
            try
            {
                OutputHandler.printTextBoxStart();

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
    public static int inputInt()
    {
        int input = 0;
        boolean correctInput = false;
        while(!correctInput)
        {
            try {
                input = globalInput.nextInt();
                correctInput = true;
            } catch (InputMismatchException e) {
                OutputHandler.printGenericErrorText();
            }
        }
        return input;

    }

    public static boolean inputPayDebt()
    {

        boolean payment = false;
        OutputHandler.printPayDebtMenu();
        int input = inputMenuChoice(2); //Has try catch

        if(input == 1)
        {
            payment = true;
        }
        else if(input == 2)
        {
           payment = false;
        }
        return payment;
    }



}
