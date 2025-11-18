package DSA_Ass1;

public class StackArray {
       int top;
       int size;
       int[] stack;

       StackArray(int size){
           this.size=size;
           int top=-1;
           stack=new int[size];

       }

       public void push(int no){
           if(top==size-1){
               System.out.println("Stack is full");
               return;
           }
            stack[++top]=no;
           System.out.println(no+" is pushed into stack");
       }

       public int pop(){
           if(top==-1){
               System.out.println("Stack is empty");
               return -1;
           }
           return stack[top--];
       }

       public int peek(){
           if(top==-1){
               System.out.println("Stack is empty");
               return -1;
           }
           return stack[top];

       }

    // check empty
    public boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());
        System.out.println("Is Empty? " + s.isEmpty());
    }
    }

