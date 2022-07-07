package ProjectMVC01.util;

import java.util.Scanner;

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char selection;

        while(true) {
            String str = readKeyBoard(1, false);
            selection = str.charAt(0);
            if(selection != '1' && selection != '2' && selection != '3' && selection != '4' && selection != '5') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }

        return selection;
    }

    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    public static int readNumber() {
        int number;

        while(true) {
            String str = readKeyBoard(2, true);
            try {
                number = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }

        return number;
    }

    public static int readNumber(int defaultValue) {
        int number;

        while(true) {
            String str = readKeyBoard(2, true);
            if(str.equals("")) {
                return defaultValue;
            }

            try {
                number = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }

        return number;
    }

    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    public static char readConfirmSelection() {
        char selection;

        while(true) {
            String str = readKeyBoard(1, false).toUpperCase();
            selection = str.charAt(0);

            if(selection == 'Y' || selection == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }

        return selection;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}
