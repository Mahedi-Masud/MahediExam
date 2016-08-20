package algorithm;


public class Sort {

    long executionTime1 = 0;
    long executionTime2 = 0;
    long executionTime3 = 0;
    long executionTime4 = 0;
    long executionTime5 = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime1 = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {

        long executionTime2 = 0;

        final long insertionTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        // public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - insertionTime;
        this.executionTime2 = executionTime;
        return list;
    }



    public int[] bubbleSort(int[] array) {


        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (array[j - 1] > array[j]) {
                    //swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime3 = executionTime;
        return list;
    }



    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        MergeSort objMS = new MergeSort();
                 list = objMS.myMergeSort(list);


                 final long endTime = System.currentTimeMillis();
                 final long executionTime = endTime - startTime;
                 this.executionTime4 = executionTime;



        return list;
    }

//    public int [] quickSort(int [] array){
//        int [] list = array;
//        //implement here
//
//
//
//        return list;
//    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        HeapSort objHS = new HeapSort();
                 list =  objHS.MyHeapSort(list);


                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime5 = executionTime;



        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
