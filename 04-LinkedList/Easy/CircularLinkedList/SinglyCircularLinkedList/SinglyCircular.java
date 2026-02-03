package Easy.CircularLinkedList.SinglyCircularLinkedList;

public class SinglyCircular {
    Node head;
    Node tail;
    // creating the constructor
    public SinglyCircular(){
        this.head = null;
        this.tail = null;
    }
    // insert at begin.
    public void insertAtBegin(int data){
    //    create new node
     Node newNode = new Node(data);
    // check for head null case
    if(this.head == null){
        this.head = newNode;
        this.tail = newNode;
        this.tail.next = this.head;
    }
    else{
        newNode.next = this.head;
        this.head = newNode;
        this.tail.next = this.head;
    }
    }

    public void traverse(){
        Node temp = this.head;
        if(this.head == null ){
            System.out.println("SCLL is empty;.");
            return;
        }else{
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
                
            } while (temp!=this.head);
        }
    }
}
