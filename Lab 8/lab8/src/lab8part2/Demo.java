package lab8part2;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        Wolf Jimmy = new Wolf("Jimmy", 20);
        Parrot LarryTheParry = new Parrot("LarryTheParry", 12);
        Stegosaur Steggy = new Stegosaur("Steggy", 206);
        ArrayList<Animal> animalArray = new ArrayList<>();
        animalArray.add(Jimmy);
        animalArray.add(LarryTheParry);
        animalArray.add(Steggy);
        //interfaces are different to abstract classes in that the latter can have constructors, and interfaces have the ability to support multiple inheritance.
        System.out.println(Steggy.compareTo(Jimmy));
        for (Animal animal : animalArray) {
            System.out.println(animal.getName() + " " + animal.getAge());
        }
        Collections.sort(animalArray);
        for (Animal animal : animalArray) {
            System.out.println(animal.getName() + " " + animal.getAge());
        }
    }
}
