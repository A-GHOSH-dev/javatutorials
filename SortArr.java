import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("\n Result of a Sorted Array :  ");
		for (int Number: a)
		{
			System.out.print(Number + "  ");
		}
	}
}