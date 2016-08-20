package algorithm;
import DBConnection.ConnectDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime1;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime2;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Bubble Sort
		algo.bubbleSort(num);
		long bubleSortExecutionTime = algo.executionTime3;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubleSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....
		algo.mergeSort(num);
		long MergeSortExecutionTime = algo.executionTime4;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + MergeSortExecutionTime + " milli sec");

		List<String> heapsortEXT = new ArrayList<String>();
		         try {
			             heapsortEXT = ConnectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_heapsort", "ExecutionTime");
			         } catch (Exception e) {
			             e.printStackTrace();
			         }
		       System.out.println("Sort Execution Time");


		      for(String st:heapsortEXT){
			           System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in heapsort Sort take: " + st + " milli sec");
		        }


	}

}
