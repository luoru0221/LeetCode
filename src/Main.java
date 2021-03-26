import java.util.Scanner;

/**
 * @author RuL
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int start = input.nextInt();
            int pass = input.nextInt();

            int minus = start % 100;
            int endMinus = minus + pass;

            int hour = start / 100;

            if (endMinus >= 60) {
                hour = hour + endMinus / 60;
                endMinus %= 60;
            } else if (endMinus < 0) {
                while (endMinus < 0) {
                    endMinus = endMinus + 60;
                    hour -= 1;
                }
            }

            if (hour >= 24) {
                hour %= 24;
            } else if (hour < 0) {
                while (hour < 0) {
                    hour = hour + 24;
                }
            }

            System.out.printf("%d%02d\n", hour, endMinus);
        }
    }
}
