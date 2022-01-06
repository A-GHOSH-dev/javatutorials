
import java.util.Scanner;


public class InputClass {
    public static void main(String args[]){
        int a;
        Scanner inpObj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        a = inpObj.nextInt();
        System.out.println(a);
    }
}
