/*
Some points about the Dynamic Stack Using Singly LinkedList.
1)Insertion
    >insertion always done at the start push()> insertAtBegin.
2)Deletion
    >deletion always done from the start pop()> deleteFromBegin.    

*/
public class Stack {
    // creating a top reference variable 
    Node top ;
    public Stack(){
        this.top = null;
    }
    // push operation.
    public void push(int data){
        // create a new node
        Node newNode = new Node(data);

        // check for top null case.
        if(this.top == null){
            this.top = newNode;
        } // if the stack in not null
        else{
            newNode.next = this.top;
            this.top = newNode;
        }
    }
    
    //pop operation.
    public int pop(){
        if(this.top == null){
            System.out.println("Stack is empty.");
            return -1;
        } // if the stack in not empty > delete from begin.
        else{
           int data = this.top.data;
           this.top = this.top.next;
           return data;
             
        }
    }
    // traversing the stack
    public void traverse(){
        System.out.println();
        
        if(this.top == null){
            System.out.println("Stack is empty.");
            return;
        }
       else{
           Node temp = top;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("NULL");
        }
    }
    
}
