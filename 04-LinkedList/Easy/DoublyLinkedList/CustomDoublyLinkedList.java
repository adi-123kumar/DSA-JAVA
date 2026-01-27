package Easy.DoublyLinkedList;

public class CustomDoublyLinkedList {
    Node head;

    public CustomDoublyLinkedList(){
        this.head = null;
    }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            System.out.println("Doubly linked list is empyt");
            this.head=newNode;
            return;
        }else{
            newNode.next = head;
            this.head.prev = newNode;
            this.head = newNode;
        }

    }

    // insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            this.insertAtBegin(data);
        }
        else{
           Node temp = this.head;

           while(temp.next!=null){
            temp = temp.next;
           }
           newNode.prev = temp;
           temp.next = newNode;


        }
    }
    // insert at position
    public void insertAtPos(int data , int pos){
        Node newNode = new Node(data);

        if(this.head==null){
            this.insertAtBegin(data);
            return;
        }
        else{
             Node temp = this.head;
             int cnt = 0;
             while(temp.next!=null){
              cnt++;
              if(cnt==pos-1){
                break;
              }
              temp = temp.next;
            //   start from this point again
             }

        }
    }

    // deltelt from begin
    public int deleteFromBegin(){
        if(this.head==null){
            System.out.println("Stack in empty.");
            return -1;
        }
        else{
            Node temp = this.head;
            int data = temp.data;
            this.head = this.head.next;
            this.head.prev = null;
            temp.next=null;
            return data;

        }
    }
    // delete from end
    public int deleteFromEnd(){
        if(this.head==null){
            System.out.println("empty case.");
            return -1;
            
        }
        else{
            Node temp  = this.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            int data = temp.data;
            temp.prev.next = null;
            temp.prev= null;
            return data;
        }
    }
    //   delete from position
    public int deleteFromPos(int data,int pos){
        if(this.head == null){
            System.out.println("empypt");
            return -1;
            
        }
        else{
            Node temp = this.head;
            //again start form hear. 
            return 0;
        }
    } 
}
