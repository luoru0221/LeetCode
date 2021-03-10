package pta;

import java.util.Scanner;

public class Main04_正整数 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.nextLine();
            String[] splits = str.split(" ",2);

            if (splits.length != 2) {
                System.out.println("? + ? = ?");
            } else {
                if (check(splits[0]) && check(splits[1]) && Integer.parseInt(splits[0]) > 0 && Integer.parseInt(splits[0]) <= 1000 && Integer.parseInt(splits[1]) > 0 && Integer.parseInt(splits[1]) <= 1000) {
                    int ans = Integer.parseInt(splits[0]) + Integer.parseInt(splits[1]);
                    System.out.println(splits[0] + " + " + splits[1] + " = " + ans);
                } else if (check(splits[0]) && Integer.parseInt(splits[0]) > 0 && Integer.parseInt(splits[0]) <= 1000) {
                    System.out.println(splits[0] + " + ? = ?");
                } else if (check(splits[1]) && Integer.parseInt(splits[1]) > 0 && Integer.parseInt(splits[1]) <= 1000) {
                    System.out.println("? + " + splits[1] + " = ?");
                } else {
                    System.out.println("? + ? = ?");
                }
            }
        }

    }

    private static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                if (c == '-' && i == 0) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
