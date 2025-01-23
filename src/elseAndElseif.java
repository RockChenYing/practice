public class elseAndElseif {


    public static void main(String[] args) {
        /*
        int a = -1, b = -1;
        if (a > 0) {
            System.out.println("Hi");
        } else if (b > 0) {
            System.out.println("Hello");
        } else {
            System.out.println("Dora");
        }
         */

        int a = -1, b = -1;
        if (a > 0) {
            System.out.println("Hi");
        } else
            if(b > 0) {
                System.out.println("Hello");
            } else {
                System.out.println("Dora");
        }
        System.out.println("Laaa");

    }
}

