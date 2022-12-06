import java.io.FileNotFoundException;

public class TextUI {

    final private int menuOptionsMainMenu = 10;
    final private int menuOptionsSubmenu = 4;

    public void runUI() throws FileNotFoundException {
        boolean run = false;
        AccessManager accessManager = new AccessManager();
        Access accessLevel = accessManager.askPassword();
        Boolean[] permissions =  accessManager.determinePermissions(accessLevel);
        MemberHandler memberHandler = null;
        if(accessLevel != Access.nill)
        {
            memberHandler = new MemberHandler();
            run = true;
        }
        else if(accessLevel == Access.nill)
        {
            run = false;
        }
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
                choice = InputHandler.inputMenuChoice(menuOptionsMainMenu);
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
                        int updateChoice = InputHandler.inputMenuChoice(menuOptionsSubmenu + 2);
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
                            case 5:
                            {
                                OutputHandler.printTextUIMenuUpdateTime();
                                int menuChoice = InputHandler.inputMenuChoice(menuOptionsSubmenu + 1);
                                switch(menuChoice) {
                                    case 1: {
                                        memberHandler.updateTrainingTimeCrawl();
                                        break;
                                    }
                                    case 2: {
                                        memberHandler.updateTrainingTimeButterfly();
                                        break;
                                    }
                                    case 3: {
                                        memberHandler.updateTrainingTimeBryst();
                                        break;
                                    }
                                    case 4: {
                                        memberHandler.updateTrainingTimeRygCrawl();
                                        break;
                                    }
                                    case 5: {
                                        //exit menu by going back
                                        break;
                                    }
                                }
                            }
                            case 6:
                            {
                                //exit menu by going back
                                break;
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
                    if (permissions[choice]) {
                        OutputHandler.printTextUIMenuBestResults();
                        int updateChoice = InputHandler.inputMenuChoice(menuOptionsSubmenu - 1);
                        switch (updateChoice) {
                            case 1: {
                                memberHandler.getBestSwimmerData();
                                break;
                            }
                            case 2: {
                                memberHandler.printBestTournamentTimeForSpecificUser();
                                break;
                            }
                            case 3: {
                                //exit menu by going back
                                break;
                            }
                        }

                    }
                    else
                    {
                        OutputHandler.printErrorAccess();
                    }
                    break;
                    //Submenu for update Member
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