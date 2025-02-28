import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class OutputHandler
{

    public static void printGenericErrorText()
    {
        printErrorOcurred();
        System.out.println("Please try again");
    }

    public static void printErrorWIP()
    {
        printErrorOcurred();
        System.out.println("This feature has not been made yet");
    }

    public static void printErrorOcurred()
    {
        System.out.println("An error Occurred");
    }
    public static void printErrorUserType()
    {
        printErrorOcurred();
        System.out.println("This user is not a competitive svimmer");
    }

    public static void printErrorResultNotBetter()
    {
        printErrorOcurred();
        System.out.println("The result entered is not better than the original result");
        System.out.println("Nothing was changed");
    }

    public static void printString(String printMessage)
    {
        System.out.println(printMessage);
    }

    public static void printTextUIMenu()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-10 to select from the menu");
        printWithSpacing4("1: Register new member");
        printWithSpacing4("2: Update member information or subscription");
        printWithSpacing4("3: Show training or Staevne results");
        printWithSpacing4("4: Show all member information");
        printWithSpacing4("5: Show members with unpaid subscription fees");
        printWithSpacing4("6: Add new Staevne data");
        printWithSpacing4("7: Receive payment");
        printWithSpacing4("8: Charge all members");
        printWithSpacing4("9: Cancel Membership");
        printWithSpacing4("10: Close program");
        printTextBoxEnd();
    }

    public static void printTextUIMenuBestResults()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-3 to select from the menu");
        printWithSpacing4("1: Show top 5 best swimmers for all disciplines");
        printWithSpacing4("2: Show a specific swimmers staevneresults");
        printWithSpacing4("3: Go Back");
        printTextBoxEnd();
    }

    public static void printTextUIMenuUpdate()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-6 to select from the menu");
        printWithSpacing4("1: Change Member type");
        printWithSpacing4("2: Change Member AgeGroup");
        printWithSpacing4("3: Change membership Status");
        printWithSpacing4("4: Sign up for, or change diciplines");
        printWithSpacing4("5: Change Training result");
        printWithSpacing4("6: Go back");
        printTextBoxEnd();
    }

    public static void printTextUIMenuUpdateTime()
    {
        printTextBoxStart();
        System.out.println("Enter a number from 1-5 to select from the menu");
        printWithSpacing4("1: Change Crawl Result For a member");
        printWithSpacing4("2: Change Butterfly Result For a member");
        printWithSpacing4("3: Change Brystsvoemning Result For a member");
        printWithSpacing4("4: Change RygCrawl Result For a member");
        printWithSpacing4("5: Go back");
        printTextBoxEnd();
    }

    public static void printPleaseEnterTime()
    {
        System.out.println("Please enter the new training result in the form of a time ecs: [24.324]");
    }

    public static void printStaevneForm(String cpr, String lokation, int placering, double tid)
    {
        System.out.println("CPR: " + cpr + "\nLokation: " + lokation + "\nPlacering: " + placering + "\nTid: " + tid);
    }

    public static void printPleaseEnterCpr()
    {
        System.out.println("Please Enter Cpr Number");
    }

    public static void printPleaseEnterUpdatedCpr()
    {
        System.out.println("Please Update With New Cpr Number");
    }

    public static void printIsInformationCorrect()
    {
        System.out.println("Are these information correct?");
        System.out.println("Enter 1 for yes, 2 for no");
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

