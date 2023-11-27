package lab6part3;

public class Stegosaur extends Herbivore{
    public Stegosaur(String name, Integer age) {
        super(name, age);
    }
    @Override
    public void makeNoise(){
        System.out.println("Raaaaaaarrrrr");
    }

}
