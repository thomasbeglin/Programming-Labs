public class ATM {
    Toolbox myToolbox = new Toolbox();
    int bankBalance = 0;

    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    public void go() {
        System.out.println("Welcome to online ATM banking\nHow much do you want in your account?");
        bankBalance = myToolbox.readIntegerFromCmd();
        System.out.println(bankBalance);

        System.out.println("What do you want to do?\n" +
                "1 : Withdraw\n" +
                "2 : Deposit\n" +
                "3 : Inquire\n" +
                "4 : Quit");
        int input = myToolbox.readIntegerFromCmd();

        if (input == 1) {
            withdraw();
        } else if (input == 2) {
            deposit ();
        } else if (input ==3) {
            inquire ();
        } else if (input == 4) {
            quit ();
        }
    }

    public void withdraw () {
        System.out.println("*****************************************\n" +
                "              Withdrawal                 \n" +
                "*****************************************\n" +
                "How much would you like to withdraw?");
        int input = myToolbox.readIntegerFromCmd();
        bankBalance = bankBalance - input;
        System.out.println("\n" +
                "*****************************************\n" +
                "         Your new balance is " + bankBalance + "       \n" +
                "*****************************************");
    }

    public void deposit () {
        System.out.println("*****************************************\n" +
                "              Deposit                 \n" +
                "*****************************************\n" +
                "How much would you like to deposit?");
        int input = myToolbox.readIntegerFromCmd();
        bankBalance = bankBalance + input;
        System.out.println("\n" +
                "*****************************************\n" +
                "         Your new balance is " + bankBalance + "       \n" +
                "*****************************************");
    }
    public void inquire () {
        System.out.println("\n" +
                "*****************************************\n" +
                "          Your balance is "+ bankBalance +"       \n" +
                "***************************************** ");
    }
    public void quit () {
        System.out.println("\n" +
                "******************************************\n" +
                "         GoodBye!\n" +
                "******************************************");
    }
}
