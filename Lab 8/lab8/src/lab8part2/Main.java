package lab8part2;

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
            larry.eat(Steak, 10);
        } catch (Exception e) {
            System.out.println(e);
        }

        Wolf cricketyJim = new Wolf();
        System.out.println(cricketyJim.getAge());

    }
}
