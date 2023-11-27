package lab8part2;

public abstract class Carnivore extends Animal {
    public Carnivore(String name, Integer age) {
        super(name, age);
    }
    public Carnivore() {
        super("newborn", 0);}
    @Override
    public void eat(Food food) throws Exception{
        if (food instanceof Plant) {
            throw new Exception("Carnivore cannot eat Plant!!!");
        }
        System.out.println("Wolf eats the " + food.getName());
    }
}
