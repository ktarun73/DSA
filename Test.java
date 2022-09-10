import java.util.Random;
//test
public class Test {
    static Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
        public void add(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }

        public void print(){
            if(head==null){
                System.out.println("Null");
                return;
            }
            Node cur=head;
            while (cur!=null){
                System.out.println(cur.val);
                cur=cur.next;
            }
        }
        public  void addFirst(int val){
            Node newNode=new Node(val);
            if(head==null) {
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

    public static void main(String[] args) {
//        Test list=new Test();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.addFirst(2);
//        list.print();


    }
}
