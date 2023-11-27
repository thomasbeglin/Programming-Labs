package lab6part3;

public class Wolf extends Carnivore {

    public Wolf (String name, Integer age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Awoooooooooo");
    }


}
