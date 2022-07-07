package basic.encapsulation;

import java.lang.reflect.Field;

import basic.encapsulation.Person;
import exer.Triangle;

import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

public class PackageImport {
    public static void main(String[] args) {
        // 全导入 java.lang.util.*
        String info = Arrays.toString(new int[]{1, 2, 3});
        ArrayList list = new ArrayList();
        HashMap map = new HashMap();
        Scanner s = null;
        // 指定导入
        Field field = null;
        Triangle triangle = new Triangle(10, 2);
        // 如果使用的类或接口是本包下定义的，则可以省略import结构
        Person p = new Person();
        // 以全类名的方式导入
        exer.Circle circle = new exer.Circle(2);
        // 如果使用的类或接口是java.lang包下定义的，则可以省略import结构
        System.out.println("hello");
        // 使用"xxx.*"方式表明可以调用xxx包下的所有结构。但是如果使用的是xxx子包下的结构，则仍需要显式导入
        // import static:导入指定类或接口中的静态结构:属性或方法。
        out.println("hello");
        long num = round(123.434);
    }
}
