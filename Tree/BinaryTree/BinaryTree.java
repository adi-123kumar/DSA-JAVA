import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    BTNode root;
   public BinaryTree(){
     this.root = null;
    }

    // insert in binary tree.
    public void insertNode(int data){
        // check for root null case 
        BTNode newNode = new BTNode(data);
        if(this.root == null){
            this.root = newNode;
            return;
        }
        // if root is not null
        // create a queue to store the nodes in level by order
        Queue<BTNode> q = new LinkedList<>();
        // insert root to the queue
        q.add(this.root);

        // loop until the queue gets empty.
        while(!q.isEmpty()){
        //    fetch the first node of the queue
        BTNode current = q.poll();

        // left is empty
        if(current.left==null){
         current.left = newNode;
         return;
        }else{
            q.add(current.left);
        }
        if(current.right == null){
            current.right = newNode;
            return;
        }else{
            q.add(current.right);
        }
        }
    }

    // traversing the binary tree.
    public void traverse(){
        if(this.root == null){
            System.out.println("Empty");
            return;
        }
        Queue<BTNode> q = new LinkedList<>();
        q.add(this.root);

        while(!q.isEmpty()){
            BTNode current = q.poll();

            System.out.print(current.data+" ");

            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                 q.add(current.right);
            }
            


        }
    }
    // deleting node in binary tree (by replacing the target node to the deepest leaf node)
    public void deleteNode(int key){
        // check for root null case 
        if(this.root == null){
            System.out.println("Tree is empty");
            return;
        }
        else if(this.root.left == null && this.root.right == null){
            int data = this.root.data;
            this.root = null;
            return;
        }else{
            // creating queue for level order traversal
            Queue<BTNode> q = new LinkedList<>();
            q.add(this.root);
             
            BTNode current = null;
            BTNode target = null;
            // loop until the queue gets empty.
            while(!q.isEmpty()){
                current = q.poll();

                if(current.data == key){
                    target = current;
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            // check wheather the target is null or not.
            // at this point current is storing the last node of the queue , hence we have a reference to the last node.
            if(target!=null){
                int data = current.data;
               target.data = data;
            //    delete the deepest node 
              deepestNode(current);
              
            }
    
        }
    }
    public void deepestNode(BTNode deepest){
         if(this.root == null){
            return;
         }
         Queue<BTNode> q = new LinkedList<>();

         q.add(this.root);

         while(!q.isEmpty()){
            BTNode temp = q.poll();

            if(temp.left!=null){
                if(temp.left == deepest){
                    temp.left = null;
                }else{
                    q.add(temp.left);
                }
            }
            if(temp.right!=null){
                if(temp.right == deepest){
                    temp.right = null;
                }
                else{
                    q.add(temp.right);
                }
            }
         }
    }
}
