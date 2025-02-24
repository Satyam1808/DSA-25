import java.util.ArrayList;
import java.util.Scanner;

public class if_else_03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
       
        ArrayList<Integer> numArr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numArr.add(sc.nextInt());
        }
        sc.close(); 
        
        int first = numArr.get(0);
        int second = numArr.get(1);
        int third = numArr.get(2);

        // Finding the largest number
        if (first >= second && first >= third) {
            System.out.println("First number is the largest: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Second number is the largest: " + second);
        } else {
            System.out.println("Third number is the largest: " + third);
        }
    
    }
}
