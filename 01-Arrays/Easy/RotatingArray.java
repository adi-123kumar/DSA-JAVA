import java.util.*;
public class RotatingArray
{
    public static void rotateArray(int arr[],int key){
       for(int j=0;j<key;j++){
        int temp=arr[arr.length-1];
    for(int i=1;i<arr.length;i++){
        arr[arr.length-i]=arr[arr.length-i-1];
        }
     arr[0]=temp;
    }
    
    
    // printing the rotateArray;
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int arr_length=sc.nextInt();
        int arr[]=new int [arr_length];
        for(int i=0;i<arr_length;i++){
            System.out.println("Enter the "+(i+1)+" element of the array.");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter how much you want to rotate the array.");
        int key=sc.nextInt();
        
		rotateArray(arr,key);
        sc.close();
	}
}