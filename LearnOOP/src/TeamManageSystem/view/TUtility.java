package TeamManageSystem.view;

import java.util.*;

public class TUtility {
    private static final Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char selection;

        while(true) {
            String str = readKeyBoard(1, false);
            selection = str.charAt(0);
            if(selection == '1' || selection == '2'|| selection == '3'|| selection == '4') {
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }

        return selection;
    }
    public static void readReturn() {
        System.out.print("按回车键继续...");
        readKeyBoard(100, true);
    }
    public static int readNumber() {
        int number;

        while(true) {
            String str = readKeyBoard(2, false);
            try {
                number = Integer.parseInt(str);
                break;
            } catch(NumberFormatException e) {
                System.out.println("输入错误，请重新输入：");
            }
        }

        return number;
    }
    public static char readConfirmSelection() {
        char selection;

        while(true) {
            String str = readKeyBoard(1, false).toUpperCase();
            selection = str.charAt(0);
            if(selection == 'Y' || selection == 'N') {
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }

        return selection;
    }
    public static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            if(line.length() == 0) {
                if(blankReturn) return line;
                continue;
            }

            if(line.length() > limit) {
               System.out.println("输入长度（不大于" + limit + "）错误，请重新输入：");
               continue;
            }
            break;
        }

        return line;
    }
}
