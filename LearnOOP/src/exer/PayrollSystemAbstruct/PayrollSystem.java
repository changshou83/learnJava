package exer.PayrollSystemAbstruct;

import java.util.Calendar;

public class PayrollSystem {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获取当前的月份
        int month = calendar.get(Calendar.MONTH);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("马森", 1002,new EntryDate(1992, 2, 28),10000);
        emps[1] = new HourlyEmployee("潘雨生", 2001, new EntryDate(1991, 1, 6),60,240);

        for (Employee emp : emps) {
            System.out.println(emp);
            double salary = emp.earnings();
            System.out.println("月工资为：" + salary);

            if ((month + 1) == emp.getBirthday().getMonth()) {
                System.out.println("生日快乐！奖励100元");
            }
        }
    }
}

