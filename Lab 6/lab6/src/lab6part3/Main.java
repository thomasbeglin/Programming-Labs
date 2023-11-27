package lab6part3;

public class Main {
    public static void main(String[] args) {
        //animals
        Parrot barry = new Parrot("Barry", 24);
        Wolf larry = new Wolf("larry", 2);
        Stegosaur jeremy = new Stegosaur("jeremy", 400);

        //food
        Meat Steak = new Meat("Steak");
        Plant Berry = new Plant("Berry");

        try {
            larry.eat(Berry);
            barry.eat(Steak);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
