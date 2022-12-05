import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.SQLOutput;
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
        printWithSpacing4("9: Cancel Membership");
        printWithSpacing4("10: Close program");
        printTextBoxEnd();
    }

    public static void printTextUIMenuUpdate()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-4 to select from the menu");
        printWithSpacing4("1: Change Member type");
        printWithSpacing4("2: Change Member AgeGroup");
        printWithSpacing4("3: Change membership Status");
        printWithSpacing4("4: Sign up for, or change diciplines");
        printTextBoxEnd();
    }

    public static void printStaevneForm(String cpr, String lokation, int placering, double tid)
    {
        System.out.println("CPR: " + cpr + "\nLokation: " + lokation + "\nPlacering: " + placering + "\nTid: " + tid);
        System.out.println("Are these information correct?");
    }

    public static void printCloseProgram()
    {
        System.out.println("Closing program...");
    }

    public static void printCharged()
    {
        System.out.println("Successfully charged all members");
    }

    public static void printRemovedMember()
    {
        System.out.println("Successfully canceled the membership");
    }

    public static void printErrorAccess()
    {
        System.out.println("An error Ocurred");
        System.out.println("You don´t have permission to use this feature");
    }

    public static void printAskForPassword()
    {
        System.out.println("Please enter your password, your permissions will be granted accordingly");
    }

    public static void printMembersWhoHaveDebtMessage()
    {
        System.out.println("All the members who have a debt:");
    }

    public static void printMember(Member member)
    {
        System.out.println(member);
    }
    public static void printErrorUserNotFound()
    {
        System.out.println("We do not have a member who matches that number");
    }
    public static void printErrorWrongPassword()
    {
        System.out.println("Wrong password");
        System.out.println("please try again");
    }

    public static void printOutOfAttemps()
    {
        System.out.println("You´re out of password attemps");
        System.out.println("Shutting down...");
    }

    public static void printTextUIMenuSwimDiscipline()
    {
        printTextBoxStart();
        System.out.println("Choose Which Discipline To Change");
        printWithSpacing4("1: Crawl");
        printWithSpacing4("2: Brystsvoemning");
        printWithSpacing4("3: Butterflysvoemning");
        printWithSpacing4("4: RygCrawl");
        printTextBoxEnd();
    }

    public static void printProvideTime()
    {
        System.out.println("Provide time");
    }

    public static void printProvidePlacement()
    {
        System.out.println("Provide placement");
    }

    public static void printProvideLocation()
    {
        System.out.print("Provide Staevne Location");
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

    public static void printBestTimesFor(String dicipline)
    {
        System.out.println("Best times for " + dicipline + ":");
    }

    public static void printPayDebtMenu()
    {
        printWithSpacing4("Press 1 for Yes");
        printWithSpacing4("Press 2 for No");
    }

    public static void printPersonDebt(int debt)
    {
        System.out.println("Your current debt is: " + debt);
    }

    public static void printWishToPay()
    {
        System.out.println("Do you wish to pay your debt?");
    }
    public static void printThankPayment()
    {
        System.out.println("Thank you for your payment");
    }

    public static void printGoodDay()
    {
        System.out.println("Okay have a good day");
    }


    public static void printChargedToTrue()
    {
        System.out.println("Changed To: True");
    }

    public static void printChargedToFalse()
    {
        System.out.println("Changed To: False");
    }

    public static void printListSize(String text, ArrayList<Member> list)
    {
        System.out.println("Number of members: " + list.size());
    }

    public static void printInputBool()
    {
        System.out.println("Enter either [1] for Active membership status, or [2] for passive membership Status");
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
    public static void printMemberInformation(String information)
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
            //System.out.println(memberList.get(i).outputMembersToDatabase());
            stringBuilder.append(memberList.get(i).outputMembersToDatabase());
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

