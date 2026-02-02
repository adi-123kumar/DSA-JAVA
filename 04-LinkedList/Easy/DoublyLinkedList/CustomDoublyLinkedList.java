package Easy.DoublyLinkedList;

public class CustomDoublyLinkedList {
    Node head;

    public CustomDoublyLinkedList(){
        this.head = null;
    }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(this.head==null){
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
        }else if(pos==1){
            // this.head.prev = newNode;
            // newNode.next = head;
            // this.head = newNode;
            // newNode.prev=null;
            // or we can do this
            this.insertAtBegin(data);
        }
        else{
               int count = 0;
               Node temp = this.head;
               while(temp.next!=null){
                count++;
                if(count==pos-1){
                    break;
                }
                temp = temp.next;
               
               }
            //    again start from here.
                if(temp.next==null){
                    this.insertAtEnd(data);
                }else{
                    // changing the node pointers
                        temp.next.prev = newNode;
                        newNode.next = temp.next;
                        temp.next = newNode;
                        newNode.prev = temp;
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
    public int deleteFromPos(int pos){
        if(this.head == null){
            System.out.println("empypt");
            return -1;

        }
        else{
           Node temp = this.head;
           int count = 1;
           if(pos<=0){
            System.out.println("INvalid positions");
            return -1;
           }
           while(temp.next!=null){
              if(count==pos){
                break;
              } 
              temp = temp.next;
              count++;
           }
        // dilink the nodes
        int delData = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        return delData;
           
        }
    } 
    // update the data
    public void update(int data,int pos){
        if(this.head==null){
            System.out.println("Empty case.");
            return;
            
        }
        else{
            if(pos<=0){
                System.out.println("Invalid position.");
                return;
            }else{
                int count = 1;
                Node temp = this.head;
                while(temp!=null){
                   if(count==pos){
                    temp.data = data;
                    System.out.println("Updation successfull");
                    return;
                   }else{
                    temp = temp.next;
                    count++;
                   }
                }
            }
        }
    }
    public void traverse(){
        if(this.head==null){
            System.out.println("Empty");
            return ;
        }else{
            System.out.println();
            Node temp = this.head ;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
        }
    }
}
