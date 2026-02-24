public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happens, array is already sorted
            if (!swapped) {
                break;
            }
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

        bubbleSort(arr);

        System.out.println("\nSorted array:");
        printArr(arr);
        
    }
}