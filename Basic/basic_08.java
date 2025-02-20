package Basic;

import java.util.Scanner;

public class basic_08 {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);

        System.out.println("Enter first decimal number: ");
        float fNum = sc.nextFloat();

        System.out.println("Enter second decimal number: ");
        float sNum = sc.nextFloat();

        float mulNum = fNum*sNum;

        System.out.println("Multiplication of numbers is: "+mulNum);

    }
}
