import java.util.Scanner;

public class AreaofCircle {
    
        public static void main(String[] args) {
            Scanner inpObj = new Scanner(System.in);

            float radius;
            double area;
            radius=inpObj.nextFloat();
            area = 3.14*radius*radius;
            
            System.out.println("Area of Circle:" + area);
            
            char c = inpObj.next().charAt(0);
            System.out.println("Char:" + c);

            String str = inpObj.next(); //nextLine
            System.out.println("String:" + str);

        }
    
    
}
