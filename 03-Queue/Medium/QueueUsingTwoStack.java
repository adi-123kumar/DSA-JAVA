import java.util.Stack;


public class QueueUsingTwoStack{
 Stack<Integer> stack1 ;
 Stack<Integer> stack2;
 public QueueUsingTwoStack(){
    this.stack1 = new Stack<Integer>();
    this.stack2 = new Stack<Integer>();
 }
// enqueue operation > adding data to the queue.
 public void enqueue(int data){
     stack1.push(data);
 }

//  dequeue operating > removing the data from the front
public void dequeue(){
    if(stack1.isEmpty() && stack2.isEmpty()){
        return;
    }

    while(!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    int popData = stack2.pop();
    System.out.println(popData+" removed sucessfully.");
}

public void print(){
    if(stack1.isEmpty() && stack2.isEmpty()){
      System.out.println("Nothing to remove Queue is empty.");
      return;
    }
    while(!stack1.isEmpty()){
    stack2.push(stack1.pop());
    }

  for(int i = stack2.size()-1; i >= 0; i--){
    System.out.print(stack2.get(i) + " ");
}
    System.out.println();
    
}
}