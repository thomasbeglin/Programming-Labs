package lab6part3;

public class Parrot extends Omnivore {

    public Parrot(String name, Integer age){
        super(name, age);
    }

    @Override
    public void makeNoise(){
        System.out.println("Squawk!!!");
    }


}
