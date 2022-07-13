package basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OtherClass {

    @Test
    public void someSystemConstants() {
        String javaVersion = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");

        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String userDir = System.getProperty("user.dir");

        System.out.println("java的version:" + javaVersion);
        System.out.println("java的home:" + javaHome);
        System.out.println("os的name:" + osName);
        System.out.println("os的version:" + osVersion);
        System.out.println("user的name:" + userName);
        System.out.println("user的home:" + userHome);
        System.out.println("user的dir:" + userDir);
    }

    @Test
    public void bigInt() {
        BigInteger bi = new BigInteger("1243324112234324324325235245346567657653");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");

        System.out.println(bi);
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 25, BigDecimal.ROUND_HALF_UP));
    }
}
