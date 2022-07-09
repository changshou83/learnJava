package basic;

/*
 * 类的成员之四：代码块（或初始化块）
 *
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰的话，只能使用static.
 * 3. 分类：静态代码块  vs 非静态代码块
 *
 * 4. 静态代码块
 * 	   > 作用：初始化类的信息
 * 	   > 静态代码块的执行要优先于非静态代码块的执行
 *
 * 5. 非静态代码块
 * 	   > 作用：可以在创建对象时，对对象的属性等进行初始化
 * 6. 执行顺序：由父及子，静态先行(父类静态-子类静态-父类普通代码块-子类普通代码块)
 */

public class Block {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);

        Person.info();
    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //非static的代码块
    {
        System.out.println("hello, block - 2");
    }
    {
        System.out.println("hello, block - 1");
        //调用非静态结构
        age = 1;
        eat();
        //调用静态结构
        desc = "我是一个爱学习的人1";
        info();
    }
    //static的代码块
    static{
        System.out.println("hello,static block-2");
    }
    static{
        System.out.println("hello,static block-1");
        //调用静态结构
        desc = "我是一个爱学习的人";
        info();
        //不可以调用非静态结构
        //		eat();
        //		name = "Tom";
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public static void info(){
        System.out.println("我是一个快乐的人！");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
