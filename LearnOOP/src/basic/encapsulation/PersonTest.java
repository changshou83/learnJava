package basic.encapsulation;
/*
 * 面向对象的特征一：封装与隐藏     3W:what? why? how?
 * 一、问题的引入：
 *  当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。
 *  这里，赋值操作要受到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
 *  但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。
 *  这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。
 *  同时，我们需要避免用户再使用"对象.属性"的方式对属性进行赋值。则需要将属性声明为私有的(private).
 *  此时，针对于属性就体现了封装性。
 *
 * 二、封装性的体现：
 *  我们将类的属性xxx私有化(private),同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值
 *
 *  拓展：封装性的体现：① 如上  ② 不对外暴露的私有的方法  ③ 单例模式   ...
 *
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 *  1.Java规定的4种权限（从小到大排列）：private、缺省、protected 、public
 *  2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *  3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *        修饰类的话，只能使用：缺省、public
 *
 *  总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.isMale = true;
        // p1.language = "chinese";
        System.out.println(p1.name);

        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        //*******************************
        Person p2 = new Person();
        // null
        System.out.println(p2.name);
        // false
        System.out.println(p2.isMale);

        //*******************************
        Person p3 = p1;
        System.out.println(p3.name);

        p3.age = 10;
        System.out.println(p1.age);

    }
}

class Person {
    String name;
    int age = 1;
    boolean isMale;
    private String language;

    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        this.language = language;
        System.out.println("人可以说话,使用的是：" + this.language);
    }

    public void code() {
        String language = "Java";
        System.out.println("我现在编写的语言是" + language);
    }
}
