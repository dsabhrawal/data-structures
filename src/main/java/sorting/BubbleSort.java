package sorting;

/**
 * Bubble sort algorithm is having O(n^2) time complexity
 * Bubble sort is also a stable algorithm that maintains the order
 * of same value elements
 *  [45,8,52,8,2] --> [2,8(index:1),8(index:3),45,52] //stable algorithm
 */
public class BubbleSort {

    public static void main(String[] args) {
       int array[] = {45,8,74,1,9,88}; //unsorted array
        boolean assending = false;
       int sortedArrayIndex = array.length -1;
       for(int i=sortedArrayIndex ; i>=0; i--){ //O(n)
           for(int j=0; j< sortedArrayIndex;j++){   //O(n)
               if(assending){
               if(array[j] > array[j+1]) {
                   swap(array, j, j+1); // O(1)
               }} else{
                   if(array[j] < array[j+1]) {
                       swap(array, j, j+1); // O(1)
                   }
               }
           }
       }
        printArray(array);
        anotherImplementation();
    }

    private static void printArray(int[] array) {
        for(int a: array){
            System.out.println(a);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp=0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public  static void anotherImplementation(){
        int array[] = {45,8,74,1,9,88}; //unsorted array
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0; i<array.length-1;i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    sorted = false;
                }
            }
        }
        printArray(array);
    }

}
