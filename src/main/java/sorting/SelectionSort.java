package sorting;

/**
 * Time Complexity: O(n^2)
 * Unstable Algorithm
 */
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {45,8,74,1,9,88}; //unsorted array
        int lastUnsortedIndex = array.length - 1;
        for(int i=lastUnsortedIndex; i > 0; i--){  //O(n)
            int largest = 0;
            for(int j=1; j<=i ; j++){           //O(n)
                if(array[j] > array[largest]){
                    largest = j;
                }
            }
            swap(array,largest,i);            //O(1)
        }
        for(int i=0; i< array.length;i++) {
            System.out.println(array[i]);
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp=0;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
