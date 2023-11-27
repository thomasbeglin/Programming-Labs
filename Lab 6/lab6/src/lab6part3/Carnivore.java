package lab6part3;

public abstract class Carnivore extends Animal {
    public Carnivore(String name, Integer age) {
        super(name, age);
    }
    @Override
    public void eat(Food food) throws Exception{
        if (food instanceof Plant) {
            throw new Exception("Carnivore cannot eat Plant!!!");
        }
        System.out.println("Wolf eats the " + food.getName());
    }
}
