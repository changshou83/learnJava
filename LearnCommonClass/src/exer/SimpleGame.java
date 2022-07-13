package exer;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleGame {
    /*
     * 练习二："三天打渔两天晒网"   1990-01-01  xxxx-xx-xx 打渔？晒网？
     *
     * 举例：2020-09-08 ？ 总天数
     *
     * 总天数 % 5 == 1,2,3 : 打渔
     * 总天数 % 5 == 4,0 : 晒网
     *
     * 总天数的计算？
     * 方式一：( date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
     * 方式二：1990-01-01  --> 2019-12-31  +  2020-01-01 -->2020-09-08
     */
    @Test
    public void testExer() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse("2020-09-08");
        Date nowDate = new Date();
        long days = (nowDate.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24) + 1;
        long temp = days % 5;
        if(temp == 1 || temp == 2 || temp == 3) {
            System.out.println("打渔");
        } else if(temp == 4 || temp == 0) {
            System.out.println("晒网");
        }
    }
}
