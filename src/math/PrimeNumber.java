package math;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		//public static void main (String[] args)

		Scanner scanner = new Scanner(System.in);
		int i =2;
		int num =0;
		//Empty String
		String  primeNumbers = " ";
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		for (i = 1; i <= n; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " \n ";
			}
		}
		System.out.println("Prime numbers from 2 to n are : " + " \n ");
		System.out.println(primeNumbers+ " \n");
	}
}