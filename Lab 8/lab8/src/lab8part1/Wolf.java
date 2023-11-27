package lab8part1;

public class Wolf extends Carnivore {

    public Wolf (String name, Integer age) {
        super(name, age);
    }

    public Wolf() {
        super("newborn", 0);
    }

    @Override
    public void makeNoise() {
        System.out.println("Awoooooooooo");
    }


}
