import java.util.Scanner;

import static java.lang.System.*;

public class leapYear {

    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(in);

//        int leapYear = 1;
//        while (leapYear != 0) {
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            // 以下If條件式的敘述，可能什麼都不做
//
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//
//            if (year) {
//                if( leapYear != 0) {
//                    System.out.println("閏年");
//                }else{
//                    out.println("掰掰");
//                }
//            }
//            if (!year) {
//                System.out.println("平年");
//            }
//
//        }

//         方法2---------------------------------------------------------
//        int leapYear = 1;
//        while (leapYear != 0) {
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            // 以下If條件式的敘述，可能什麼都不做
//
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//
//            if(leapYear != 0) {
//                if (year) {
//                    out.println("閏年");
//                } else {
//                    System.out.println("平年");
//                }
//            }else{
//                System.out.println("掰掰");
//            }
//        }
//        簡化成 else-if 的方法
//        int leapYear = 1;
//        while (leapYear != 0) {
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            leapYear = keyBoard.nextInt();
//
//            boolean year = false;
//            // 以下If條件式的敘述，可能什麼都不做
//
//            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                year = true;
//            }
//            if(leapYear == 0){
//                out.println("掰掰");
//            }else if (year) {
//                out.println("閏年");
//            }else{
//                System.out.println("平年");
//            }
//        這裡是還沒簡化成else-if的
//            if(leapYear == 0){
//                out.println("掰掰");
//            }else {
//                if (year) {
//                    out.println("閏年");
//                } else {
//                    System.out.println("平年");
//                }
//            }
//        int leapYear = 1;
//        while (leapYear != 0) {
//            out.println("輸入西元年(輸入0的時後離開)： ");
//            leapYear = keyBoard.nextInt();
//
//            if(leapYear == 0) {
//                out.println("掰掰");
//            }else{
//                boolean year = false;
//                // 以下If條件式的敘述，可能什麼都不做
//                if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
//                    year = true;
//                }
//                if (year) {
//                    out.println("閏年");
//                } else {
//                    System.out.println("平年");
//                }
//            }
//        }

//        int leapYear = 1;
        // 這邊(true)代表我不檢查直接進入迴圈， 如果 leapYear 不是0，就會跳出迴圈，執行迴圈外的步驟
        // (leapYear != 0) 因為，【不等於0要繼續；等於0要離開】意思是一樣的
        while (true) {
            out.println("輸入西元年(輸入0的時後離開)： ");
            int leapYear = keyBoard.nextInt();

            if(leapYear == 0) {
                out.println("掰掰");
                break; // 只要if成立，就直接離開迴圈
            }
            boolean year = false;
            // 以下If條件式的敘述，可能什麼都不做
            if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
                year = true;
            }
            if (year) {
                out.println("閏年");
            } else {
                System.out.println("平年");
            }
        }
    }
}
