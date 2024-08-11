import java.util.Scanner;

public class Main {
    public static void table(int num){
        for (int i=0; i <= 10; i++){
            int mult = num*i;
            System.out.println(num+" x "+i+" = "+ mult);

        }
    }
    public static void hund(){
        for (int i=1000000000; i >= 100;i--){

            System.out.println(i+" java is fun");

        }
    }
    public static void main(String[] args) {
// Write a programme to add all the numbers till the given number.
        Scanner s = new Scanner(System.in);
//        int sum = 0;
//        System.out.println("pls enter the number");
//        int number =s.nextInt();
//        for (int i = 0; i <= number; i++) {
//            sum = sum+i;
//
//        }
//        System.out.println(sum);
        //System.out.println("pls enter the number");

        //int numuser = s.nextInt();
        //table(numuser);
        hund();
    }
}