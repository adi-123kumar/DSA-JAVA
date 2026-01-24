/*
 * Program Name: Custom Array Implementation in Java
 *
 * Description:
 * This program demonstrates the manual implementation of an array in Java.
 * It covers basic array operations such as:
 *  - Insertion at the end
 *  - Insertion at the beginning
 *  - Insertion at a specific position
 *  - Deletion from the end
 *  - Displaying array elements
 *
 * Purpose:
 * The goal of this program is to understand how arrays work internally
 * and how common operations are performed without using built-in
 * dynamic data structures like ArrayList.
 *
 * Concepts Used:
 *  - Fixed-size arrays
 *  - Index manipulation
 *  - Element shifting
 *  - Overflow and underflow checks
 *
 * Language: Java
 * IDE: Visual Studio Code
 */
<<<<<<< HEAD
=======

>>>>>>> 4c8e5c1e604ed4f7c3970ab738973dd14b5b6bb6
package Arrays;
public class CustomArray{
    private int[] arr;
    private int size;
    private int idx;

    public CustomArray(int size){
        this.size=size;
        this.idx=-1;
        this.arr= new int[this.size];
    }
    public static void main(String arg[]){
        // creaitng an object of the arrau
        CustomArray c = new CustomArray(4);
        // print empty element 
        // c.show();
        // adding new data at the end;
        c.addLast(25);
        // c.show();

        // adding at begin
        c.addFirst(39);
        c.addFirst(90);
        c.show();
        // adding at the positon.
        c.addPos(100,2 );
        c.show();

        // delete from last 
        c.delLast();
        c.show();
        
    }
     // adding data to the last of the array
    public boolean addLast(int data){
       if(this.idx+1>=this.size){
        System.out.println("Array is full.");
        
        return false;
       }
       else{
          this.idx++;
          this.arr[idx]= data;
        return true;
       }
    }
    // print array element 
    public void show(){
        System.out.println("Array elements : ------------");
        
        for(int i=0;i<=this.idx;i++){
            System.out.print(this.arr[i]+" ");
            
        }
           System.out.println();
                            
    }

    //add at first
    public boolean addFirst(int data){
    if(this.idx+1>=this.size){
        System.out.println("Array is full.");
        return false;
    }
    else{
       int i = this.idx;
    //    making the idx to point to the last element ;
    this.idx = i+1;
    //   shifting elements of the array to the right.
       while(i>=0){
          this.arr[i+1] = this.arr[i];
          i--;
       }
    //    adding the new data at the first index of the array.
    this.arr[0]=data;
    return true;
    }
    }

    // insertion at postion
    public boolean addPos(int data,int pos){
        if(this.idx+1>=this.size){
            System.out.println("array is full.");
            return false;
        }
        else{
          int i = this.idx;
        //   incrementing the idx value because we will add new data to the array.
          this.idx=i;
        //   shifting the element upto the postion to the right of the array.
        while(i>=pos-1){
           this.arr[i+1]=this.arr[i];
           i--;
        }
        // adding the element at the specified position.
        this.arr[pos-1]=data;
            return true;
        }
    }
//    DELETING THE DATA FROM THE ARRAY------------------
// delete from end;
public int delLast(){
    if(idx<0){
        return -1;
    }
    else{
        
        int deleted = this.arr[this.idx];
        this.idx = this.idx-1;
        return deleted;

    }
}
}
