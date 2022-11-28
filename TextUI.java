public class TextUI {

    public void runUI()
    {
        InputHandler inputHandler = new InputHandler();
        boolean run = true;
        while(run)
        {
            OutputHandler.printTextUIMenu();
            int choice = inputHandler.inputMenuChoice();
            switch(choice)
            {
                case 1:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 2:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 3:
                {
                    OutputHandler.printErrorWIP();
                    break;
                }
                case 4:
                {
                    OutputHandler.printErrorWIP();
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
