public class GuessingGame {
    public static void main(String[] args) {
        int numberToGuess;
        int guessedNumber;

        Toolbox myToolbox = new Toolbox();

        System.out.println("Welcome to the guessing game!");
        numberToGuess = myToolbox.getRandomInteger(10);
        System.out.println("Please guess the number!");
        guessedNumber = myToolbox.readIntegerFromCmd();

        if ( numberToGuess == guessedNumber ) {
            System.out.println("right");
        } else if ( numberToGuess < guessedNumber ) {
            System.out.println("too high");
        } else if ( numberToGuess > guessedNumber ) {
            System.out.println("too low");
        }
    }
}
