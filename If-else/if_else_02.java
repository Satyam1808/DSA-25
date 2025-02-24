import java.util.Scanner;

public class if_else_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {

            char lowerCh = Character.toLowerCase(ch);

            if ("aeiou".indexOf(lowerCh)!=-1 ) {
                System.out.println("Given characte is vowel!");
            }else{
                System.out.println("Given characte is constent!");
            }
        }else{
            System.out.println("Input is not a character. Please enter character!");
        }

        
    }
}
