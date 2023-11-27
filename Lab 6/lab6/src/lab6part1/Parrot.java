package lab6part1;

public class Parrot extends Animal {

    public Parrot(String name, Integer age){
        super(name, age);
    }

    public void makeNoise(){
        System.out.println("Squawk!!!");
    }

}
