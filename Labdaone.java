import java.util.Scanner;

public class Labdaone {

	public static void main(String[] args) {
		int numOfStudents, numOfQuestions;
		
		System.out.println("Enter the number of Students:");
		Scanner inpInt = new Scanner(System.in);
		Scanner inpText = new Scanner(System.in);
		numOfStudents = inpInt.nextInt();
		
		System.out.println("Enter the number of Questions:");
		numOfQuestions = inpInt.nextInt();
		
		char student_answers[][] = new char[numOfStudents][numOfQuestions];
		char answerkey[] = new char[numOfQuestions];
		
		System.out.println("Enter the Answer Key: ");
		for(int i=0; i<numOfQuestions; i++)
		{
			answerkey[i] = inpText.next().charAt(0);
		}
		
		for(int i=0; i<numOfStudents; i++)
		{
			if(i==0)
			{
				System.out.println("Enter the choices of the first student: ");
			}
			else
			{
				System.out.println("Enter the choices of the next student: ");
			}
			for(int j=0; j<numOfQuestions; j++)
			{
				student_answers[i][j] = inpText.next().charAt(0);
			}
		}
		
		int marks_arr[] = new int[numOfStudents];
		for(int i=0; i<numOfStudents; i++)
		{
			int count = 0;
			for(int j=0; j<numOfQuestions; j++)
			{
				if(student_answers[i][j]==answerkey[j])
				{
					count +=1;
				}
			}
			marks_arr[i] = count;
		}
		
		for(int i=0; i<numOfStudents; i++)
		{
			System.out.println("Marks scored by Student " + (i+1) + " are " + marks_arr[i]);
		}

	}

}