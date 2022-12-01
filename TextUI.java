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
                    memberHandler.outputToMemberDatabase();
                    break;
                }
                case 2:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 3:
                {
                    memberHandler.fetchBestBrystsvoemning();
                    memberHandler.fetchBestCrawlResultat();
                    memberHandler.fetchBestButterflyResultat();
                    memberHandler.fetchBestRygCrawlResultat();
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 4:
                {
                    memberHandler.PrintAllMemberInformation();
                    break;
                }
                case 5:
                {
                    OutputHandler.printErrorWIP();
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
