package lab4part1;

public class Main {
    public static void main(String[] args) {
        Toolbox toolbox = new Toolbox();
        //get input
        System.out.println("Pleasse enter the number you want the times table for");
        int initialInput = toolbox.readIntegerFromCmd();
        int input = initialInput;
        System.out.print(initialInput + ", ");
        //for loop to print their times table
        for(int i = 1; i < 20 ; i++) {
            input = input + initialInput;
            System.out.print(input + ", ");
        }

        System.out.println("");
        //adding to 500
        int total = 0;
        int counter = 1;
        while (total < 500) {
            total = total + counter;
            System.out.print(total + ", ");
            counter++;
        }
        System.out.println("");
        counter--;
        System.out.println("This took: " + counter + " iterations to complete");
    }


}
