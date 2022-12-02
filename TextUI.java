import java.io.FileNotFoundException;

public class TextUI {

    public void runUI() throws FileNotFoundException {

        AccessManager accessManager = new AccessManager();
        Access accessLevel = accessManager.askPassword();
        Boolean[] permissions =  accessManager.determinePermissions(accessLevel);
        MemberHandler memberHandler = new MemberHandler();
        boolean run = true;
        while(run)
        {
            OutputHandler.printTextUIMenu();

            int choice = 0;
            if(accessLevel.equals(Access.nill))
            {
                choice = 10;
            }
            else
            {
                choice = InputHandler.inputMenuChoice(10);
            }

            switch(choice)
            {
                case 1:
                {
                    if(permissions[choice])
                    {
                        memberHandler.CreateMember();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 2:
                {
                    if(permissions[choice])
                    {
                        //Submenu for update Member
                        OutputHandler.printTextUIMenuUpdate();
                        int updateChoice = InputHandler.inputMenuChoice(3);
                        switch (updateChoice)
                        {
                            case 1:
                            {
                                memberHandler.UpdateMemberType();
                                //remember that this will change subscription fee and possibly remove staevneresults
                                break;
                            }
                            case 2:
                            {
                                memberHandler.UpdateMemberAgeGroup();
                                break;
                            }
                            case 3:
                            {
                                memberHandler.UpdateMemberShipStatus();
                                //remember this will change subscription fee for member !!!!! (dette skal vi lige kigge på sammen)
                                break;
                            }
                            case 4:
                            {
                                OutputHandler.printTextUIMenuSwimDiscipline();
                                int disciplineChoice = InputHandler.inputMenuChoice(4);
                                switch(disciplineChoice)
                                {
                                    case 1: {
                                        OutputHandler.printGenericErrorText();
                                        break;
                                    }
                                    case 2: {
                                        OutputHandler.printGenericErrorText();
                                        break;
                                    }
                                    case 3: {
                                        OutputHandler.printGenericErrorText();
                                        break;
                                    }
                                    case 4: {
                                        OutputHandler.printGenericErrorText();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 3:
                {
                    if(permissions[choice])
                    {
                        memberHandler.getBestSwimmerData();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 4:
                {
                    if(permissions[choice])
                    {
                        memberHandler.PrintAllMemberInformation();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 5:
                {
                    if(permissions[choice])
                    {
                        memberHandler.printResidualMembers();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 6:
                {
                    if(permissions[choice])
                    {
                        OutputHandler.printErrorWIP();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 7:
                {
                    if(permissions[choice])
                    {
                        OutputHandler.printErrorWIP();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 8:
                {
                    if(permissions[choice])
                    {
                        OutputHandler.printErrorWIP();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 9:
                {
                    if(permissions[choice])
                    {
                        OutputHandler.printErrorWIP();
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
                case 10:
                {
                    if(permissions[choice])
                    {
                        OutputHandler.printErrorWIP();
                        run = false;
                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                }
            }
        }
    }


}
