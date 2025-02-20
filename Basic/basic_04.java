package Basic;

import java.util.Scanner;

public class basic_04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Divisor: ");
        int divisor = sc.nextInt();
        System.out.print("Enter the Divident: ");
        int divident = sc.nextInt();

        int quitent = divisor/divident;
        int rem = divisor%divident;

        int addition = quitent+rem;

        System.out.println("Addition is : "+rem);

    }
}
