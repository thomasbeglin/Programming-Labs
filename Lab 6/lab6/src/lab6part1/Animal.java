package lab6part1;

public class Animal {
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
}
