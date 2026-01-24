
public class CustomStack {
    private int stack[];
    private int top;
    private int capacity;

    public CustomStack(int capacity){
          this.capacity = capacity;
          this.stack = new int[this.capacity];
          this.top = -1;
    }

    
    public static void main(String[] args){
        // creating first object of stack
        CustomStack s = new CustomStack(4);
        s.display();
        s.push(56);
        s.push(78);
        s.push(45);
        s.display();
        s.push(23);
        s.display();
        s.pop();
        s.display();
        System.out.println(s.peek());
        
    }
// push operation in stack
    public void push(int data){
        if(this.isOverflow()){
            System.out.println("Stack Overflow");
        }else{
            this.top++;
            this.stack[this.top]=data;
        }
    }
// pop operation in stack
    public int pop(){
      if(isUnderflow()){
        System.out.println("Stack underflow");
        return -1;
      }
      else{
        int popedElement = this.stack[this.top];
        this.top--;
        return popedElement;
      }
    }
// peek operation in stack
    public int peek(){
        if(isUnderflow()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return this.stack[this.top];
        }
    }
    public boolean isOverflow(){
        if(this.top>=this.capacity){
            return true;
        }
        else{
            return false;
        }
    }
    // check for underflow
    public boolean isUnderflow(){
        if(this.top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    // display stack
    public void display(){
        if(this.isUnderflow()){
            System.out.println("Stack underflow.");
        }
        for(int i = 0; i<=this.top; i++){
            System.out.print(+this.stack[i]+" ");
        }
        System.out.println();
        
    }
    
}
