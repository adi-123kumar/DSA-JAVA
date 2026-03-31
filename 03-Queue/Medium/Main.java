public class Main {
    public static void main(String[] args) {
QueueUsingTwoStack q = new QueueUsingTwoStack();
q.enqueue(45);
q.enqueue(33);
q.enqueue(78);
q.enqueue(11);
q.enqueue(10);
q.print();
q.dequeue();
q.dequeue();
q.dequeue();
q.print();
    }
}
