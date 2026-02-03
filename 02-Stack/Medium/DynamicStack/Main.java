
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(34);
        s.push(56);
        s.push(90);
        s.push(67);
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
        
    }
}
