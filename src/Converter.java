import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type '1' for Binary --> Decimal or type '2' for Decimal --> Binary");
        int dir = scanner.nextInt();

        System.out.println("What number to convert?");
        scanner.nextLine();
        String number = scanner.nextLine();

        System.out.print("Your result: ");
        switch (dir) {
            case 1:
                System.out.println(toDecimal(number));
                break;
            case 2:
                System.out.println(toBinary(number));
                break;
        }
        
    }

    private static long toDecimal(String number) {
        long scale = 1;
        long res = 0;
        while(number.length() > 0) {
            char c = number.charAt(number.length()-1);
            if(c == '1') {
                res += scale;
            }
            number = number.substring(0, number.length()-1);
            scale *= 2;
        }
        return res;
    }

    private static String toBinary(String number) {
        long n = Long.parseLong(number);
        String res = "";
        while(n>0) {
            if(n%2==0) {
                res = "0" + res;
            } else {
                res = "1" + res;
            }
            n /= 2;
        }
        return res;
    }
}
