package Easy.SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        // Creating a singlyLinked List
        CustomSinglyLinkedList c = new CustomSinglyLinkedList();
        c.insert(20);
        c.insert(30);
        c.insert(40);
        c.insert(50);
        c.traverse();
        c.insertAtPos(60,3);
       
        c.traverse();
        // delete 
        // delete from begin
        c.deleteFromBegin();
        c.insertAtBegin(45);
        c.traverse();
        c.deleteFromEnd();
        c.deleteFromEnd();
        c.insertAtBegin(90);
        c.traverse();
        c.deleteFromPos(3);
        c.traverse();
        c.deleteFromPos(3);
        c.traverse();
       


    }
}
