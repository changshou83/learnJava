package exer.ObjectMethods;

public class Clone {
    public static void main(String[] args) {
        Animal animal1 = new Animal("花花");

        try {
            Animal animal2 = (Animal) animal1.clone();
            System.out.println("原始对象：" + animal1);

            animal2.setName("毛毛");
            System.out.println("clone之后的对象：" + animal2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Animal implements Cloneable {
    private String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
