package test;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class leapYear {

    public static void main(String[] args) throws IOException {

        Scanner keyBoard = new Scanner(in);
        char c = 'Y';
        while (c == 'Y') {
            out.println("輸入西元年(輸入0的時後離開)： ");
            int leapYear = keyBoard.nextInt();

            boolean year = false;
            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
                year = true;
            }
            if (year) {
                out.println("閏年");
            } else {
                System.out.println("平年");
            }
            out.println("請輸入'Y'繼續程式，按其它鍵盤結束 =>");
            c = (char) System.in.read();
            out.println(c);
        }
    }

}
