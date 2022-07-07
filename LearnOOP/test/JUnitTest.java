import org.junit.Test;

/*
 * 步骤：
 *   1. 装JUnit，可以直接跳过这步，然后在写注解的时候通过IDEA安装
 *   2. 创建test目录，右键目录并标记为Test Root
 *   3. 创建测试类，在需要测试的方法之前添加 @Test 注解
 *   4. 运行测试
 */

public class JUnitTest {
    int num = 10;

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        //ClassCastException的异常
        //		Object obj = new String("GG");
        //		Date date = (Date)obj;

        System.out.println(num);
        show();
    }

    public void show(){
        num = 20;
        System.out.println("show()....");
    }

    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
