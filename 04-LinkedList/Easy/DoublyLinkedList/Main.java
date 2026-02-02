package Easy.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkedList c = new CustomDoublyLinkedList();
        // insert at end
        c.insertAtBegin(45);
        c.insertAtBegin(90);
        c.insertAtBegin(22);
        c.traverse();
        // insert at end
        c.insertAtEnd(90);
        c.insertAtEnd(67);
        c.insertAtEnd(100);
        c.traverse();
        // insert at pos
        System.out.println("\nInsert At pos");
        
        c.insertAtPos(89,2);
        c.traverse();
        c.insertAtPos(990,3);
        c.traverse();
        c.insertAtPos(32,4);
        c.traverse();
        c.insertAtPos(54, 1);
        c.traverse();
        c.insertAtPos(43,1);
        c.traverse();
        System.out.println("\n Starting to insert at end using pos");
        
        c.insertAtPos(699, 11);
        c.traverse();
        c.insertAtPos(90, 12);
        c.traverse();
        c.insertAtPos(37, 13);
        c.traverse();

    }
}
