package basic.polymorphism;

import java.util.Random;

class Animal {
    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat extends Animal {
    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat bone");
    }
}

class Sheep extends Animal {
    public void eat() {
        System.out.println("Sheep eat grass");
    }
}

public class WhoEat {
    public static Animal getInstance(int key) {
        switch (key) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        Animal animal = getInstance(key);

        System.out.println(key);
        animal.eat();
    }
}
