package pta;

import java.util.Scanner;

public class Main01_碱基序列匹配 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str = new String[15];
        while (input.hasNext()) {
            int test = input.nextInt();
            while (test-- > 0) {
                int string_num = input.nextInt();
                input.nextLine();
                for (int i = 0; i < string_num; i++) {
                    str[i] = input.nextLine();
                }

                String ans = null;

                boolean found = false;

                for (int i = 60; i >= 3; i--) {
                    for (int j = 0; j <= 60 - i; j++) {
                        String substr = str[0].substring(j, j + i);

                        boolean contains = true;
                        for (int k = 1; k < string_num; k++) {
                            if (!str[k].contains(substr)) {
                                contains = false;
                                break;
                            }
                        }

                        if (contains && (ans == null || ans.compareTo(substr) > 0)) {
                            ans = substr;
                            found = true;
                        }
                    }

                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    System.out.println("no significant commonalities");
                } else {
                    System.out.println(ans);
                }
            }
        }
    }
}
