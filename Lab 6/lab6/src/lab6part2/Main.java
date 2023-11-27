package lab6part2;

public class Main {
    public static void main(String[] args) {
        Parrot barry = new Parrot("Barry", 24);
        Wolf larry = new Wolf("larry", 2);
        Meat Steak = new Meat("Steak");
        Plant Berry = new Plant("Berry");
        System.out.println(barry.getName());
        System.out.println(larry.getName());
        System.out.println(Steak.getName());
        System.out.println(Berry.getName());
        System.out.println(barry.getAge());
        barry.makeNoise();
    }
}
