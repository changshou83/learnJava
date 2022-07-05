import java.util.Scanner;

public class Utility {
	private static Scanner scanner = new Scanner(System.in);
	
	public static char readMenuSelection() {
		char selection;
		
		while(true) {
			String str = readKeyBoard(1);
			selection = str.charAt(0);
			if(selection != '1' && selection != '2' && selection != '3' && selection != '4') {
				System.out.print("选择错误，请重新输入：");
			} else break;
		}
		
		return selection;
	}
	
	public static int readNumber() {
		int number;
		
		while(true) {
			String str = readKeyBoard(4);
			try {
				number = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.print("数字输入错误，请重新输入：");
			}
		}
		
		return number;
	}
	
	public static String readString() {
		String str = readKeyBoard(8);
		return str;
	}
	
	public static char readConfirmselection() {
		char selection;
		
		while(true) {
			String str = readKeyBoard(1).toUpperCase();
			selection = str.charAt(0);
			
			if(selection == 'Y' || selection == 'N') {
				break;
			} else {
				System.out.print("选择错误，请重新输入：");
			}
		}
		
		return selection;
	}
	
	private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}
