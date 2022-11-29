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
        printWithSpacing4("3: Remove member");
        printWithSpacing4("4: Print all member information");
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




}

