import java.util.ArrayList;

public class AccessManager {

    protected String chairmanPassword = "chairman";
    protected String cashierPassword = "cashier";
    protected String trainerPassword = "trainer";
    protected String memberPassword = "guest";

    Boolean[] permissions = new Boolean[]{false, false, false, false, false, false, false, false, false, false, false};
    public Access askPassword()
    {
        int counter = 0;
        Access accessLevel = Access.nill;
        while(counter <= 5)
        {
            String password = InputHandler.inputPassword();
            if(password.equals(chairmanPassword))
            {
                accessLevel = Access.chairman;
                return accessLevel;

            }
            else if(password.equals(cashierPassword))
            {
                accessLevel = Access.cashier;
                return accessLevel;

            }
            else if(password.equals(trainerPassword))
            {
                accessLevel = Access.trainer;
                return accessLevel;

            }
            else if(password.equals(memberPassword))
            {
                accessLevel = Access.guest;
                return accessLevel;
            }
            if(counter >= 5)
            {
                OutputHandler.printOutOfAttemps();
            }
            else
            {
                OutputHandler.printWrongPassword();
            }
            counter++;
        }
        return accessLevel;
    }

    public Boolean[] determinePermissions(Access accecessLevel)
    {
        if(accecessLevel == Access.chairman)
        {

            for(int i = 1; i <= 10;i++)
            {
                if(i == 7) permissions[i] = false;
                else if(i == 8) permissions[i] = false;
                else permissions[i] = true;
            }
        }
        else if(accecessLevel == Access.cashier)
        {
            for(int i = 1; i <= 10;i++)
            {
                if(i == 5) permissions[i] = true;
                else if(i == 7) permissions[i] = true;
                else if(i == 8) permissions[i] = true;
                else if(i == 9) permissions[i] = true;
                else if(i == 10) permissions[i] = true;
                else permissions[i] = false;
            }
        }
        else if(accecessLevel == Access.trainer) {
            for (int i = 1; i <= 10; i++)
            {
                if(i == 2) permissions[i] = true;
                else if(i == 4) permissions[i] = true;
                else if(i == 10) permissions[i] = true;
                else permissions[i] = false;
            }
        }
        else if(accecessLevel == Access.guest)
        {
            for(int i = 1; i <= 10; i++)
            {
                if(i == 4) permissions[i] = true;
                else if(i == 10) permissions[i] = true;
                else permissions[i] = false;

            }
        }
        else if(accecessLevel == Access.nill)
        {
            for(int i = 1; i <= 10; i++)
            {
                permissions[i] = false;
            }
        }

        return permissions;
    }
}
