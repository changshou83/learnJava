package exer.ObjectMethods;

public class Finalize {
    public static void main(String[] args) {
        Person p = new Person("Peter", 12);
        System.out.println(p);

        //此时对象实体就是垃圾对象，等待被回收。但时间不确定。
        p = null;
        //强制性释放空间
        System.gc();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //子类重写此方法，可在释放对象前进行某些操作
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放--->" + this);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
