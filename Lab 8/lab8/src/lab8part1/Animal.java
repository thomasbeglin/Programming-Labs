package lab8part1;

public abstract class Animal {
    String name;
    Integer age;
    public Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this.name = "newborn";
        this.age = 0;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public abstract void makeNoise();

    public abstract void eat(Food food) throws Exception;

    public void eat(Food food, Integer numTimes) {
        for (int i = 0; i < numTimes; i++){
            System.out.println("The animal eats the " + food.getName());
        }
    }

}
