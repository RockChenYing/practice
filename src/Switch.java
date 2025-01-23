import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Switch {

    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(in);

        System.out.println("輸入代號(0-3)： ");
        int number = keyBoard.nextInt();
//        short number = keyBoard.nextShort();
//        char number = keyBoard.next().charAt(0);
        String s = "";
        final int a = 0;
        switch (number){
            case a:
                s = "春天";
                break;
            case 1:
                s = "夏天";
                break;
            case 2:
                s = "秋天";
                break;
            case 3:
                s = "冬天";
                break;
            default:
                s = "代碼錯誤";
        }

        System.out.println(s);

//        Scanner keyBoard = new Scanner(in);
//        System.out.println("輸入起始日： ");
//        int startDay = keyBoard.nextInt();
//        System.out.println("輸入所計算的日： ");
//        int number = keyBoard.nextInt();
//
//        int theDay = startDay + number % 7;
//        theDay = theDay % 7;
//
//        String strDay = "";
//        switch (theDay) {
//            case 0:
//                strDay = "Sunday";
//                break;
//            case 1:
//                strDay = "Monday";
//                break;
//            case 2:
//                strDay = "Tuesday";
//                break;
//            case 3:
//                strDay = "Wednesday";
//                break;
//            case 4:
//                strDay = "Thursday";
//                break;
//            case 5:
//                strDay = "Friday";
//                break;
//            case 6:
//                strDay = "Saturday";
//                break;
//        }
//        System.out.println("strDay = " + strDay);
    }
}
