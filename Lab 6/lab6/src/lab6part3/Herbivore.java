package lab6part3;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, Integer age) {
        super(name, age);
    }
    @Override
    public void eat(Food food) throws Exception{
        if (food instanceof Meat) {
            throw new Exception("Herbivore cannot eat Meat!!!");
        }
        System.out.println("Wolf eats the " + food.getName());
    }
}
