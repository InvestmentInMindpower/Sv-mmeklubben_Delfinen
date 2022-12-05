import java.io.FileNotFoundException;

public class TextUI {

    final private int menuOptionsCountMainMenu = 10;
    final private int menuOptionsSubmenu = 4;

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
                choice = InputHandler.inputMenuChoice(menuOptionsCountMainMenu);
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
                        int updateChoice = InputHandler.inputMenuChoice(menuOptionsSubmenu);
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
                                int disciplineChoice = InputHandler.inputMenuChoice(menuOptionsSubmenu);
                                switch(disciplineChoice)
                                {
                                    case 1: {
                                        memberHandler.updateSwimDisciplineCrawl();
                                        break;
                                    }
                                    case 2: {
                                        memberHandler.updateSwimDisciplineBrystSvoemning();
                                        break;
                                    }
                                    case 3: {
                                        memberHandler.updateSwimDisciplineButterflySvoemning();
                                        break;
                                    }
                                    case 4: {
                                        memberHandler.updateSwimDisciplineRygcrawl();
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
                        memberHandler.PrintMemberInformation();
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
                        memberHandler.getUserData();
                        memberHandler.getUserData().createStaevneResultat();
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
                        memberHandler.payDebt();
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
                        memberHandler.chargeMembers();
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
                        memberHandler.removeMember();
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
                        OutputHandler.printCloseProgram();
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