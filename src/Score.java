import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("輸入學生分數： ");
        int Score = sc.nextInt();

        String s = "丁";
        if(Score > 100 || Score < 0){
            s = "請重新輸入";
        }else if (Score >= 90 && Score <= 100) {
                s = "優";
        } else if (Score >= 80) {
                s = "甲";
        } else if (Score >= 70) {
                s = "乙";
        } else if (Score >= 60) {
                s = "丙";
        }
        System.out.println(s);

    }
}
