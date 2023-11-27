package lab8part1;

public class Parrot extends Omnivore {

    public Parrot(String name, Integer age){
        super(name, age);
    }
    public Parrot(Integer age) {
        this("Polly", age);
    }

    @Override
    public void makeNoise(){
        System.out.println("Squawk!!!");
    }


}
