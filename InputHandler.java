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
                    staevneResultatList.add(new StaevneResultat(values[0], values[1], values[2], Integer.parseInt(values[3]), Double.parseDouble(values[4])));
                    //System.out.println("Number of members: " + staevneResultatList.size());
                    //System.out.println(staevneResultatList.get(staevneResultatList.size()-1).outputStaevneResultat());

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

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
                        //TODO Write constructor for WorkoutSwimmer
                        memberList.add(new WorkoutSwimmer(values[0], values[1], AgeGroup.valueOf(values[2]), Boolean.parseBoolean(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6])));
                        //System.out.println("I am a WorkoutSwimmer!");
                    } else if(values[0].equals("CompetitiveSwimmer"))
                    {
                        //TODO Write constructor for CompetitiveSwimmer
                        memberList.add(new CompetitiveSwimmer(values[0], values[1], AgeGroup.valueOf(values[2]), Boolean.parseBoolean(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]), Double.parseDouble(values[7]), Double.parseDouble(values[8]), Double.parseDouble(values[9]), Double.parseDouble(values[10]), values[11], Boolean.parseBoolean(values[12]), Boolean.parseBoolean(values[13]), Boolean.parseBoolean(values[14]), Boolean.parseBoolean(values[15])));
                        //System.out.println("I am a CompetitiveSwimmer!");
                    }

                    //memberList.add(new Member(values[0],AgeGroup.valueOf(values[1]), Boolean.parseBoolean(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Double.parseDouble(values[6]), Double.parseDouble(values[7]), Double.parseDouble(values[8]), Double.parseDouble(values[9])));
                    System.out.println("Number of members: " + memberList.size());
                }
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
    public static int inputInt()
    {
        int input = globalInput.nextInt();
        return input;
    }

    public static double inputDouble()
    {
        double input = globalInput.nextDouble();
        return input;
    }

    public static boolean inputPayDebt()
    {
        boolean payment = false;
        System.out.println("Do you wish to pay your debt?");
        System.out.println("Press 1 for Yes\nPress 2 for No");
        int input = globalInput.nextInt();

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
