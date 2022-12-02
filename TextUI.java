import java.io.FileNotFoundException;

public class TextUI {

    public void runUI() throws FileNotFoundException {
        MemberHandler memberHandler = new MemberHandler();
        boolean run = true;
        while(run)
        {
            OutputHandler.printTextUIMenu();
            int choice = InputHandler.inputMenuChoice(10);
            switch(choice)
            {
                case 1:
                {
                    memberHandler.CreateMember();
                    break;
                }
                case 2:
                {
                    //Submenu for update Member
                    OutputHandler.printTextUIMenuUpdate();
                    int updateChoice = InputHandler.inputMenuChoice(4);
                    switch(updateChoice)
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
                        {   //submenu for valg af Discipline
                            OutputHandler.printTextUIMenuSwimDiscipline();
                            int disciplineChoice = InputHandler.inputMenuChoice(4);
                            switch(disciplineChoice)
                            {
                                case 1:
                                {
                                    OutputHandler.printGenericErrorText();
                                    break;
                                }
                                case 2:
                                {
                                    OutputHandler.printGenericErrorText();
                                    break;
                                }
                                case 3:
                                {
                                    OutputHandler.printGenericErrorText();
                                    break;
                                }
                                case 4:
                                {
                                    OutputHandler.printGenericErrorText();
                                    break;
                                }
                            }

                            //TODO: make a sign up to a dicipline method which asks for each dicipline type

                            break;
                        }
                    }
                    break;
                }
                case 3:
                {
                    memberHandler.getBestSwimmerData();
                    break;
                }
                case 4:
                {
                    memberHandler.PrintAllMemberInformation();
                    break;
                }
                case 5:
                {
                    memberHandler.printResidualMembers();
                    break;
                }
                case 6:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 7:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 8:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 9:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 10:
                {
                    OutputHandler.printErrorWIP();
                    run = false;
                    break;
                }

            }
        }
    }


}
