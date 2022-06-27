package model;

public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }
    public void running(){
        System.out.println("running...");
    }
    public void eatting(){
        System.out.println("eatting...");
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
