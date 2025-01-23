import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(System.in);
        System.out.println("輸入帳號： ");
        int number = keyBoard.nextInt();
        System.out.println("輸入密碼： ");
        int password = keyBoard.nextInt();

        int answer = 1;
        /*
        if (number == 1234 && password == 5678){
            answer = 0;
        }
        if (number !=1234){
            answer = 1;
        }
        if (password != 5678){
            answer = 2;
        }
         */
//        將password 跟 number 順序換掉
        if(password == 5678 && number == 1234){
            answer = 0;
        }
        if(password != 5678){
            answer = 2;
        }
//        if(number = 1234){
//            answer = 0;
//        }

        if (answer == 0) {
            System.out.println("Welcome");
        }
        if (answer == 1) {
            System.out.println("編號錯誤");
        }
        if(answer == 2){
            System.out.println("密碼錯誤");
        }

    }
}