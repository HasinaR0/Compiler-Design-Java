import java.util.Scanner;

public class TreZeri {
    public static boolean result(String s) {
        int state = 0;
        int i = 0;
        while (state >= 0 && i < s.length()) {
            final char ch = s.charAt(i++);
            switch (state) {
                case 0:
                    if (ch == '0')
                        state = 1;
                    else if (ch == '1')
                        state = 0;
                    else
                        state = -1;
                    break;
                case 1:
                    if (ch == '0')
                        state = 2;
                    else if (ch == '1')
                        state = 0;
                    else
                        state = -1;
                    break;
                case 2:
                    if (ch == '0')
                        state = 3;
                    else if (ch == '1')
                        state = 0;
                    else
                        state = -1;
                    break;
                case 3:
                    if (ch == '0' || ch == '1')
                        state = 3;
                    else
                        state = -1;
                    break;
            }
        }
        // return state == 3;
        return state != 3 && state >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Sequence: ");

        String input = sc.nextLine();

        System.out.println(result(input) ? "OK" : "NOPE");

        sc.close();
    }
}