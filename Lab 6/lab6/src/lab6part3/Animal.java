package lab6part3;

public abstract class Animal {
    String name;
    Integer age;
    public Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public abstract void makeNoise();

    public abstract void eat(Food food) throws Exception;

}
