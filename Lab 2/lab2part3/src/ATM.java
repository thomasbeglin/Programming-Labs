public class ATM {
    Toolbox myToolbox = new Toolbox();
    int bankBalance = 0;
    Boolean programRunning = true;

    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    public void go() {
        System.out.println("Welcome to online ATM banking\nHow much do you want in your account?");
        Boolean startBalNeg = true;
        while (startBalNeg) {
            bankBalance = myToolbox.readIntegerFromCmd();
            if (bankBalance >= 0) {
                startBalNeg = false;
            } else {
                System.out.println("You cannot enter a negative value, enter another number");
            }
        }

        while (programRunning) {
            System.out.println("What do you want to do?\n" +
                    "1 : Withdraw\n" +
                    "2 : Deposit\n" +
                    "3 : Inquire\n" +
                    "4 : Quit");
            int input = myToolbox.readIntegerFromCmd();

            if (input == 1) {
                withdraw();
            } else if (input == 2) {
                deposit();
            } else if (input == 3) {
                inquire();
            } else if (input == 4) {
                quit();
            }
        }
    }

    public void withdraw() {
        Boolean validInput = false;
        int input = 0;
        while (!validInput) {
            System.out.println("*****************************************\n" +
                    "              Withdrawal                 \n" +
                    "*****************************************\n" +
                    "How much would you like to withdraw?");

            input = myToolbox.readIntegerFromCmd();
            if (input < 0) {
                System.out.println("You cannot enter a negative number, please try again");
            } else if (bankBalance - input < 0) {
                System.out.println("You do not have enough to withdraw that!");
            } else {
                validInput = true;
            }
        }

        bankBalance = bankBalance - input;
        System.out.println("\n" +
                "*****************************************\n" +
                "         Your new balance is " + bankBalance + "       \n" +
                "*****************************************");
    }

    public void deposit() {
        Boolean validInput = false;
        int input = 0;
        while (!validInput) {
            System.out.println("*****************************************\n" +
                    "              Deposit                 \n" +
                    "*****************************************\n" +
                    "How much would you like to deposit?");
            input = myToolbox.readIntegerFromCmd();
            if (input < 0) {
                System.out.println("You cannot deposit a negative number, please try again");
            } else {
                validInput = true;
            }
        }

        bankBalance = bankBalance + input;
        System.out.println("\n" +
                "*****************************************\n" +
                "         Your new balance is " + bankBalance + "       \n" +
                "*****************************************");
    }

    public void inquire() {
        System.out.println("\n" +
                "*****************************************\n" +
                "          Your balance is " + bankBalance + "       \n" +
                "***************************************** ");
    }

    public void quit() {
        System.out.println("\n" +
                "******************************************\n" +
                "         GoodBye!\n" +
                "******************************************");
        System.exit(0);
    }
}
