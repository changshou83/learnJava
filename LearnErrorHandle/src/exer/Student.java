package exer;

import basic.CustomError;

public class Student {
    private int id;

    public void register(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            throw new CustomError("你输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }

    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.register(-1001);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("收尾");
        }
    }
}
