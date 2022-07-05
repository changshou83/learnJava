package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) throws Exception{
		    Scanner scan = new Scanner(System.in);

		    System.out.println("请输入你的姓名：");
		    String name = scan.next();
		    System.out.println(name);

		    System.out.println("请输入你的年龄：");
		    int age = scan.nextInt();
		    System.out.println(age);
		    
		    System.out.println("请输入你的体重：");
		    Double weight = scan.nextDouble();
		    System.out.println(weight);
		    
		    System.out.println("你是程序员吗：(true/false)");
		    Boolean isCoder = scan.nextBoolean();
		    System.out.println(isCoder);
		    
		    System.out.println("请输入你的性别：(男/女)");
		    String gender = scan.next();
//		    char genderChat = gender.chatAt(0);
		    System.out.println(gender);
		    
		    scan.close();
	}
}