public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];      // Current element
            int j = i - 1;

            // Move elements of arr[0..i-1] 
            // that are greater than key 
            // to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at correct position
            arr[j + 1] = key;
        }
    }
public static void printArr(int arr[]){
    for (int num : arr) {
            System.out.print(num + " ");
        }
}
    public static void main(String[] args) {
         int[] arr = {5, 3, 4, 1, 2};
         printArr(arr);

        insertionSort(arr);

        System.out.println("\nSorted array:");
        printArr(arr);
        
    }
}
