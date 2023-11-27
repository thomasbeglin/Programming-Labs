public class ATM {
    Toolbox myToolbox = new Toolbox();

    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    public void go() {
        System.out.println("Welcome to online ATM banking\nHow much do you want in your account?");
        int bankBalance = myToolbox.readIntegerFromCmd();
        System.out.println(bankBalance);
    }
}
