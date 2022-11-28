import java.sql.SQLOutput;

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

