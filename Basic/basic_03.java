package Basic;

import java.util.Scanner;

public class basic_03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        //int addedNum = firstNum+secondNum;

        System.out.println("Number after addtion is: "+(firstNum+secondNum));
    }
}
