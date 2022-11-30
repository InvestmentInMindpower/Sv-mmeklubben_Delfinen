public class TextUI {

    public void runUI()
    {
        MemberHandler memberHandler = new MemberHandler();
        boolean run = true;
        while(run)
        {
            OutputHandler.printTextUIMenu();
            int choice = InputHandler.inputMenuChoice();
            switch(choice)
            {
                case 1:
                {
                    memberHandler.CreateMember();
                    break;
                }
                case 2:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 3:
                {
                    System.out.println("Write your CPR number");
                    memberHandler.removeMember(InputHandler.inputString());
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
                    System.out.println("Write your CPR number");
                    memberHandler.payDebt(InputHandler.inputString());
                    break;
                }
                case 8:
                {
                    memberHandler.chargeMembers();
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
