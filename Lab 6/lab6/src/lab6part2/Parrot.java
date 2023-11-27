package lab6part2;

public class Parrot extends Animal {

    public Parrot(String name, Integer age){
        super(name, age);
    }

    @Override
    public void makeNoise(){
        System.out.println("Squawk!!!");
    }

}
