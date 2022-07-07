package basic.extend;

public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        // super关键字访问父类
        super(name, age);
        // this关键字访问实例对象
        this.major = major;
    }

    // 方法重写
    @Override
    public void eat() {
        System.out.println("吃饭");
        study();
    }

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name:" + name + ",age:" + getAge());
    }
}