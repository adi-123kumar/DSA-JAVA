/*
 * Day 4 – DSA (Singly Linked List Implementation)
 *
 * This program demonstrates the complete implementation of a
 * Singly Linked List using Java.
 *
 * Operations implemented in this code:
 *
 * 1. Insertion Operations:
 *    - Insert node at the beginning of the singly linked list
 *    - Insert node at a specific position
 *    - Insert node at the end of the singly linked list
 *
 * 2. Deletion Operations:
 *    - Delete node from the beginning
 *    - Delete node from a specific position
 *    - Delete node from the end
 *
 * 3. Update Operations:
 *    - Update node value at the beginning
 *    - Update node value at a specific position
 *    - Update node value at the end
 *
 * 4. Traversal:
 *    - Traverse and display all elements of the singly linked list
 *
 * This code focuses on:
 * - Node creation and linking using single references
 * - Pointer/reference movement in a singly linked list
 * - Handling edge cases such as empty list and single-node list
 * - Understanding the core working of Singly Linked List
 *
 * Part of my DSA learning series – Day 4
 */



package Easy.SinglyLinkedList;

public class CustomSinglyLinkedList {
   Node head;
// creating constructor for singly linked list
   public CustomSinglyLinkedList(){
    this.head = null;
   }
// adding node to the linked list
   public void insert(int data){
    // Create a new node of type Node
    Node newNode = new Node(data);

    // check wheather the singly linkedlist is empty or not if yes then add the node make head(referece node) point to the newNode.
    if(this.head == null){
        this.head = newNode;
        return;
    }
    //  iterating until we found the next value is null
    // before that we have to make a temp variable of type Node to iterate over the linkedlist.
    Node temp = this.head;
    while(temp.next!=null){
        // incrementing the value of the temp.next unil it found the null.
        temp = temp.next;
    }
    // right now temp reached to the lastElement so we just have to point he temp.next to the newData
    temp.next = newNode;
   }

//    traversing the singlyLinkedList
   public void traverse(){
    if(this.head == null){
        System.out.println("SinglyLinked List is empty.");
        return;
    }
    // creating a temp variable for traversing
    Node temp = this.head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println();
   }
   public void insertAtBegin(int data){
    Node newData = new Node(data);
     if(this.head==null){
       this.head = newData;
       return;
     }
     newData.next = head;
     head = newData;
   }
//    inserting at specific position.
   public void insertAtPos(int data , int pos){
    Node newNode = new Node(data);
    int count = 0;
    // check for empty case.
     if(this.head == null ){
        this.head = newNode;
        return;
     }
     else{
        Node temp = this.head;
        while(temp.next!=null){
            count++;
            if(count==pos-1){
                break;
            }
            temp = temp.next;
        }
        // changing the next value of the pointer to new data
        newNode.next = temp.next;
        temp.next = newNode;


     }

   }
   // deleting the elements from the linkedlist.
   // delete from begin
   public int deleteFromBegin(){
      if(this.head==null){
         System.out.println("Linkedlist is empty.");
         return -1;
         
      }else{
         Node temp = this.head;
         int data = temp.data;
         head = temp.next;
         return data;
      }
   }
   // delete from end
   public int deleteFromEnd(){
      if(this.head == null){
         System.out.println("Linked list is empty");
         return -1;
         
      }
      // single node
      else if(this.head.next==null){
         int data = this.head.data;
         this.head = null;
         return data;
      }
      // multiple nodes
      else{
        Node temp = this.head;
        while(temp.next.next!=null){
         temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
        return data;
         
      }
   }
   // delete from given position
   public int deleteFromPos(int pos){
      if(this.head.next==null){
         int data = head.data;
         this.head = null;
         return data;        
      }else{
         int cnt = 0;
         Node temp = this.head;
         Node prevTemp = temp;

         while(temp.next!=null){
            cnt++;
            if(cnt==pos){
               break;
            }
            temp = temp.next;
         }
         while(prevTemp.next!=temp){
            prevTemp = prevTemp.next;
         }
          int data = temp.data;
          prevTemp.next = temp.next;
          return data;
      }
   }
}
