package lab6part2;

public class Wolf extends Animal {

    public Wolf (String name, Integer age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Awoooooooooo");
    }
}
