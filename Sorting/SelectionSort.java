package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        
        // phase 
        for( int i = 0 ; i<arr.length-1 ; i++){
            int minIdx =i;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
 public static void printArr(int arr[]){
    for(int i : arr){
        System.out.print(i+" ");
    }
 }
    public static void main(String[] args) {
        int arr[] = {45,1,34,78, 100};
        printArr(arr);
        System.out.println();
        
        selectionSort(arr);
        printArr(arr);
        
    }
}