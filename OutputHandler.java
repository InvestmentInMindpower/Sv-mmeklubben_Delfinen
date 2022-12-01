import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class OutputHandler
{

    public static void printGenericErrorText()
    {
        System.out.println("An error Ocurred");
        System.out.println("Please try again");
    }

    public static void printErrorWIP()
    {
        System.out.println("An error Ocurred");
        System.out.println("This feature has not been made yet");
    }

    public static void printTextUIMenu()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-10 to select from the menu");
        printWithSpacing4("1: Register new member");
        printWithSpacing4("2: Update member");
        printWithSpacing4("3: Print top 5 best swimmers for all disciplines");
        printWithSpacing4("4: Print all member information");
        printWithSpacing4("5: Print members with unpaid subscription fees");
        printWithSpacing4("6: Add new Staevne data");
        printWithSpacing4("7: Receive payment");
        printWithSpacing4("8: Charge all members");
        printTextBoxEnd();
    }

    public static void printCprFormatInfo()
    {
        System.out.println("please enter your ");
    }

    public static void printInputDayInfo()
    {
        System.out.println("Please enter the day of the month you were born in the format [DD] ecs. 04");
    }

    public static void printCprFormError()
    {
        System.out.println("The CPR number is invalid");
        System.out.println("Please try again");
    }
    public static void printInputMonthInfo()
    {
        System.out.println("Please enter the month of the year you were born in the format [MM] ecs. 12");
    }
    public static void printInputYearInfo()
    {
        System.out.println("Please enter the year you were born in the format [YYYY] ecs. 1999");
    }
    public static void printInputCiphersInfo()
    {
        System.out.println("Please enter the last 4 ciphers of your social security number [NNNN] ecs. 2414");
    }
    public static void printInputFindMember() //bliver ikke brugt indtil videre
    {
        System.out.println("Please Enter Cpr number of the member you want information for");
    }
    public static void printAllMemberInformation(String information)
    {
        System.out.println(information);
    }
    public static void printWithSpacing4(String print)
    {
        System.out.println("    " + print);
    }
    public static void printTextBoxStart()
    {
        System.out.println("====================================================");
    }

    public static void printTextBoxEnd()
    {
        System.out.println("====================================================\n");
    }

    public static void writeToMemberDataBase(ArrayList<Member> memberList, String memberFileName)
    {
        String finalString = "";
        StringBuilder stringBuilder = new StringBuilder();

        //build finalString that should be printed
        for (int i = 0; i < memberList.size(); i++)
        {
            System.out.println(memberList.get(i).outputMemberstoDatabase());
            stringBuilder.append(memberList.get(i).outputMemberstoDatabase());
            stringBuilder.append(System.getProperty("line.separator"));
        }

        finalString = stringBuilder.toString();

        PrintStream output = null;
        try
        {
            output = new PrintStream(new File(memberFileName));
        } catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        output.println(finalString);
    }

    public static void writeToStaevneDataBase(ArrayList<StaevneResultat> staevneResultatList, String staevneFileName)
    {
        String finalString = "";
        String memberLine = "";

        StringBuilder stringBuilder = new StringBuilder();

        //build finalString that should be printed
        for (int i = 0; i < staevneResultatList.size(); i++)
        {
            System.out.println(staevneResultatList.get(i).outputStaevneResultat());
            stringBuilder.append(staevneResultatList.get(i).outputStaevneResultat());
            stringBuilder.append(System.getProperty("line.separator"));
        }

        finalString = stringBuilder.toString();

        PrintStream output = null;
        try
        {
            output = new PrintStream(new File(staevneFileName));
        } catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        output.println(finalString);
    }


}

