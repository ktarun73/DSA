import java.util.Stack;

public class StackJCF {
   public static void insertAtBottom(Stack<Integer> s,int n){
        Stack<Integer> temp=new Stack<>();
        while (!s.isEmpty()){
            temp.push(s.peek());
            s.pop();
        }
        s.push(n);
        while (!temp.isEmpty()){
            s.push(temp.peek());
            temp.pop();
        }
    }
    static void revStack(Stack<Integer> s){
       if(s.isEmpty()){
           return;
       }
        int top=s.pop();
        revStack(s);
        insertAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        insertAtBottom(s,0);
        revStack(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
