import java.util.ArrayList;

public class StackArrayLis {

    static class Stack{
        static ArrayList<Integer> arrayList=new ArrayList<>();
        public static boolean isEmpty(){
            return arrayList.size()==0;
        }
        public static void push(int data){
            arrayList.add(data);
        }
        public static int peek(){
            return arrayList.get(arrayList.size()-1);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=peek();
            arrayList.remove(arrayList.size()-1);
            return top;
        }

        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while (!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
