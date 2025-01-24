package test;

import java.io.IOException;
import java.util.Scanner;

public class while_OptionMenu {

    public static void main(String[] args) throws IOException {

//        char c= '1';
//        while(c != '5'){
//            System.out.println("請輸入服務項目編號: 1提款 2.轉帳 3. 餘額查詢 4.其他服務 5.離開  =>");
//            c = (char)System.in.read();
//            /**
//             * "因為 System.in.read() 會讀取用戶輸入的第一個字符（例如數字 1），
//             * 但按下 Enter 之後，會有一個換行符號（\n）留在緩衝區，這會影響下一次迴圈的輸入。
//             * 為了消耗這個換行符號，使用第二次 System.in.read() 來讀取並丟棄它。"
//            */
//            System.in.read();
//            switch (c){
//
//                case '1':
//                    System.out.println("提款");
//                    break;
//                case '2':
//                    System.out.println("轉帳");
//                    break;
//                case '3':
//                    System.out.println("餘額查詢");
//                    break;
//                case '4':
//                    System.out.println("其他服務");
//                    break;
//                case '5':
//                    System.out.println("離開");
//                    break;
//                default:
//                    System.out.println("請選擇正確編號");
//            }
//        }

        char c= '1';
        while(c != '5'){
            System.out.println("請輸入服務項目編號: 1提款 2.轉帳 3. 餘額查詢 4.其他服務 5.離開  =>");

            c = (char)System.in.read();
            System.in.read();
            boolean b = true; // 旗標，也可以是其他型別，讓後面程式碼可以做出反應
            switch (c){

                case '1':
                    System.out.println("提款");
                    break;
                case '2':
                    System.out.println("轉帳");
                    break;
                case '3':
                    System.out.println("餘額查詢");
                    break;
                case '4':
                    System.out.println("其他服務");
                    break;
                case '5':
                    System.out.println("離開");
                    b = false;
                    break;
                default:
                    System.out.println("請選擇正確編號");
            }
            if(!b){
                break; //用來離開 while 的 break
            }
            System.out.println("其他程式碼");
        }

    }
}
