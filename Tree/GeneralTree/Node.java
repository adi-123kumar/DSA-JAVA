/*
General Tree contails two thing 
1) data : int 
2) children : ArrayList<Node>
*/
import java.util.ArrayList;
import java.util.List;
public class Node {
    int data;
    List<Node> children;

    public Node(int data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}
