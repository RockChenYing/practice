package test;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class leapYear {

    public static void main(String[] args) throws IOException {

        Scanner keyBoard = new Scanner(in);

        int count = 0; // 計數器，計算你迴圈裡面各個行為所出現的次數
        char c = 'Y';
        while (c != 'N' && c != 'n') {

            out.println("輸入西元年(輸入0的時後離開)： ");
            int leapYear = keyBoard.nextInt();

            boolean year = false;
            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
                year = true;
                count++;
            }
            if (year) {
                out.println("閏年");
            } else {
                System.out.println("平年");
            }

            out.println("請輸入'N' 或 'n'結束程式，按其他鍵繼續執行 =>");
            c = (char) System.in.read();
        }
        out.println(count);
    }

//        char c = 'Y';
//        while (c == 'Y' || c == 'y') {
//
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            int leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//            if (year) {
//                out.println("閏年");
//            } else {
//                System.out.println("平年");
//            }
//
//            out.println("請輸入'Y' 或 'y'繼續程式，按其他鍵結束 =>");
//                c = (char) System.in.read();
//                out.println(c);
//        }

//        while (true) {
//
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            int leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//            if (year) {
//                out.println("閏年");
//            } else {
//                System.out.println("平年");
//            }
//
//            out.println("請輸入'Y' 或 'y'繼續程式，按其他鍵結束 =>");
//            char c = (char) System.in.read();
//            if(c != 'Y' && c != 'y'){
//                break;
//            }
//        }

//        while (true) {
//
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            int leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//            if (year) {
//                out.println("閏年");
//            } else {
//                System.out.println("平年");
//            }
//
//            out.println("請輸入'N' 或 'n'結束程式，按其他鍵繼續執行 =>");
//            char c = (char) System.in.read();
//            if(c == 'N' || c == 'n'){
//                break;
//            };
//        }

//        int count = 0; // 計數器，計算你迴圈裡面各個行為所出現的次數
//        char c = 'Y';
//        while (c != 'N' && c != 'n') {
//
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            int leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//                count++;
//            }
//            if (year) {
//                out.println("閏年");
//            } else {
//                System.out.println("平年");
//            }
//
//            out.println("請輸入'N' 或 'n'結束程式，按其他鍵繼續執行 =>");
//            c = (char) System.in.read();
//        }
//        out.println(count);
//}

}
