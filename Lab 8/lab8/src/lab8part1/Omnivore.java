package lab8part1;

public abstract class Omnivore extends Animal {
    public Omnivore(String name, Integer age) {
        super(name, age);
    }
    @Override
    public void eat(Food food) throws Exception{

        System.out.println("Omnivore eats the " + food.getName());
    }
}
