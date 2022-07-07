//public class Test3 {
//    static class Node{
//        int val;
//        Node next;
//        Node(int val){
//            this.val=val;
//            this.next=null;
//        }
//    }
//
//    static class Stack{
//        public static Node head;
//        public static boolean isEmpty() {return head==null;}
//        public void push(int val){
//            Node newNode=new Node(val);
//            if(isEmpty()){
//                head=newNode;
//                return;
//            }
//            Node cur=head;
//            while (cur.next!=null){
//                cur=cur.next;
//            }
//            newNode.next=head;
//            head=newNode;
//        }
//
//        public int pop(){
//            if (isEmpty()) return -1;
//
//
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//        Stack stack=new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//
//
//    }
//}
