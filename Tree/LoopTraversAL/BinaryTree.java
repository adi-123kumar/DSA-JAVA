package Tree.LoopTraversAL;

import java.util.*;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

//   inserting the node

    public void insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

//    deleting the node

    public void delete(int key) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!queue.isEmpty()) {

            temp = queue.poll();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }

        if (keyNode != null) {

            int x = temp.data; // deepest node value

            deleteDeepest(temp);

            keyNode.data = x;
        }
    }

    private void deleteDeepest(Node delNode) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.poll();

            if (temp.left != null) {

                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    queue.add(temp.left);
            }

            if (temp.right != null) {

                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    queue.add(temp.right);
            }
        }
    }

    // inorder traversal

    public void inorder() {

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }

//    preorder traversal

    public void preorder() {

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();
            System.out.print(node.data + " ");

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }
    }

//    post order traversal

    public void postorder() {

        if (root == null)
            return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {

            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null)
                stack1.push(node.left);

            if (node.right != null)
                stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }



    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println("\nPreorder Traversal:");
        tree.preorder();

        System.out.println("\nPostorder Traversal:");
        tree.postorder();

        
    }
}
