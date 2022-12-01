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
                    int updateChoice = InputHandler.inputMenuChoice(3);
                    switch(updateChoice)
                    {
                        case 1:
                        {
                            //TODO: make a change membership type method
                            //remember that this will change subscription fee and possibly remove staevneresults
                            OutputHandler.printErrorWIP();
                            break;
                        }
                        case 2:
                        {
                            //TODO: make a change membership AgeGroup method
                            OutputHandler.printErrorWIP();
                            break;
                        }
                        case 3:
                        {
                            //TODO: make a Change membership passive/active method
                            //remember this will change subscription fee for member
                            OutputHandler.printErrorWIP();
                            break;
                        }
                        case 4:
                        {
                            //TODO: make a sign up to a dicipline method which asks for each dicipline type
                            OutputHandler.printErrorWIP();
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
