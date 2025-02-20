package Basic;

import java.util.Scanner;

public class basic_07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        
        char input = sc.nextLine().charAt(0); 

        int asciiValue = (int) input; 
        System.out.println("The ASCII value of '" + input + "' is: " + asciiValue);

        sc.close();

    }
}
