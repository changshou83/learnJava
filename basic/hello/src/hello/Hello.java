package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) throws Exception{
		    Scanner scan = new Scanner(System.in);

		    System.out.println("���������������");
		    String name = scan.next();
		    System.out.println(name);

		    System.out.println("������������䣺");
		    int age = scan.nextInt();
		    System.out.println(age);
		    
		    System.out.println("������������أ�");
		    Double weight = scan.nextDouble();
		    System.out.println(weight);
		    
		    System.out.println("���ǳ���Ա��(true/false)");
		    Boolean isCoder = scan.nextBoolean();
		    System.out.println(isCoder);
		    
		    System.out.println("����������Ա�(��/Ů)");
		    String gender = scan.next();
//		    char genderChat = gender.chatAt(0);
		    System.out.println(gender);
		    
		    scan.close();
	}
}