public class LLis {
   Node head;
//    public int size=0;
    class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

        public void addLast(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            Node curNode=head;
            while (curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.next=newNode;
        }
        public void printNode(){
            if (head==null){
                System.out.println("Empty List");
                return;
            }
            Node curNode=head;
            while (curNode!=null){
                System.out.print(curNode.val+" -> ");
                curNode=curNode.next;
            }
            System.out.println("null");
        }

        public void addFirst(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void removeFirst(){
            if(head==null){
                System.out.println("Empty List");
                return;
            }
            head=head.next;
        }
        public void removeLast(){
            if(head==null){
                System.out.println("Empty List");
                return;
            }
            Node dummy=new Node(-1);
            dummy.next=head;
            Node curNode=head;
            Node prevNode=dummy;
            while(curNode.next!=null){
                prevNode=prevNode.next;
                curNode=curNode.next;
            }
            prevNode.next=null;
        }



    public static void main(String[] args) {
        LLis list=new LLis();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.removeFirst();
        list.removeLast();
        list.printNode();
    }
}
