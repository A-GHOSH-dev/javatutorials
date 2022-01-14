import java.util.*;

public class SearchNum
{
	  public static void main(String args[]){
		  int n,loop;
		  
		  Scanner SC=new Scanner(System.in);
		  System.out.print("Enter total number of elements: ");
		  n=SC.nextInt();
		  
		 
		  int arr[]=new int[n];
	
		  System.out.println("Enter array elements:");
		  for(loop=0; loop<n; loop++){
			  System.out.print("Enter element (" + (loop+1) +"): ");
			  arr[loop]=SC.nextInt();
		  }
		  
	
		  int num;
		  System.out.print("Enter number to search: ");
		  num=SC.nextInt();
		  

		  int index=-1;		  
		  for(loop=0;loop<n;loop++){
			  if(arr[loop]==num){
				  index=loop;
				  break;
			  }
		  }
		  
		  if(index==-1){
			  System.out.println("Sorry! " + num + " is not found in array.");
		  }
		  else{
			  System.out.println(num + " found at index " + index);
		  }
		  
		  SC.close();		  
	  }
}