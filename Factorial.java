//1. Write a program to find the factorial of a number.
import java.util.Scanner;  
public class Factorial {  
        public static void main(String[] args) {  
        int fact = 1;  
        int i = 1;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number whose factorial is to be found: ");  
        int num = sc.nextInt();  
        while( i <= num ){  
            fact = fact * i;   
            i++;  
        }     
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  