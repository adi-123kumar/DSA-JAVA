package Queue;

public class CustomQueue {
 private int arr[];
 private int size;
 private int front;
 private int rear;

 CustomQueue(int size){
    this.size = size;
    this.arr = new int[this.size];
    this.rear = -1 ;
    this.front = -1;
    System.out.println("Constructor created.");
    
 }



 public static void main(String[] args) {
     CustomQueue q = new CustomQueue(5);
     q.enqueue(12);
     q.enqueue(89);
     
     q.enqueue(61);
     q.enqueue(86);
     q.enqueue(12);
     q.enqueue(45);
     q.display();

     q.dequeue();
     


 }

 public void enqueue(int data){
    // check for full
    if(this.isFull()){
        System.out.println("Queue is full");
        
    }
    else if (this.isEmpty()){
        this.rear = 0;
        this.front =0;
        this.arr[this.rear]=data;
    }
    else{
        this.arr[++this.rear]=data;
    }
 }
 public int dequeue(){
//    situation 1
// check for empty case
    if(this.isEmpty()){
       System.out.println("Queue is empt");
       return  -1;
       
    }
    // deleting one last element .
    else if (this.isEmpty() && this.front==this.rear) {
        int data = this.arr[this.front];
        this.front = -1;
        this.rear = -1;
        return data;
    }
    else{
         int data = this.arr[this.front];
         this.front++;
         return data;
    }
 }
 public void display(){
    if(this.isEmpty()){
        System.out.println("Queue is full.");
        
    }
    else{
  for(int i=this.front;i<=this.rear;i++)
    System.out.print(arr[i]+" ");
    }
 
    
 }
 public boolean isEmpty(){
    if(this.front==-1 && this.rear==-1){
        return true;
    }
    return false;
 }
 public boolean isFull(){
    if(this.rear == this.size-1){
        return true;
    }
    return false;
 }
//  public int frontElement(){

//  }
//  public int rearElement(){

//  }
    
}
