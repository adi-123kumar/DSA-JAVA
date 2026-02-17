/*
whenever a general tree creted it must contain a root node. 
*/
import java.util.LinkedList;
import java.util.Queue;
public class GeneralTree {
 
    Node root ;

    public GeneralTree(Node root){
        this.root = root;
    }

    // inset at parent 
    public boolean insert(Node root , int childData , int parentData){
        // create a queue for inserting the element of the tree
        Queue<Node> q = new LinkedList<>();
        // root node should me added first to the queue.
        q.add(root);
        while(!q.isEmpty()){
            // current variable for dequeue the first element of the queue
            Node current = q.poll();
            // parent found
            if(current.data == parentData){
                current.children.add(new Node(childData));
                return true;
            }// insert all the children of the current to the queue
            else{
              for(Node child : current.children){
                q.add(child);
              }
            }
        }
        return false;
    }
    // Traversing the General Tree
    public void traverse(){
        if(this.root == null){
            return;
        }
         // empty queue
        Queue<Node> q = new LinkedList<>();
        q.add(this.root);
       while(!q.isEmpty()){
        //   current node 
        Node current = q.poll();
        // printing the data of the current
        System.out.print(current.data+"->");
        // adding the children of the current to the queue
        for(Node child : current.children){
            //  add child   
            q.add(child);
        }
        
        }
       
    }
}