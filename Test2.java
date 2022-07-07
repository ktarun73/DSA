public class Test2 {
    Node head;
    static int size=0;
    static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void insert(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        size++;
        cur.next=newNode;
    }

    public void remove(){
        if(head==null ){
            return;
        }
        if(head.next==null){
            size--;
            head=null;
            return;
        }
        Node cur=head;
        while (cur.next.next!=null){
            cur=cur.next;
        }
        size--;
        cur.next=null;
    }

    public void print(){
        if(head==null) {
            System.out.println("Null");
            return;
        }

        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" -> ");
            cur=cur.next;
        }
        System.out.println("Null");
    }

    public void removeDummy(){
        if(head==null) return;
        Node dummy=new Node(-1);
        dummy.next=head;
        Node cur=dummy , last=head;
        while (last.next!=null){
            last=last.next;
            cur=cur.next;
        }
        size--;
        cur.next=null;
    }
    public int size(){
        return size;
    }




    public static void main(String[] args) {
        Test2 list=new Test2();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        System.out.println(list.size());
        list.removeDummy();
        list.print();
        System.out.println(list.size());
        list.remove();
        list.print();
        System.out.println(list.size());
        list.insert(4);
        list.print();
        System.out.println(list.size());

    }
}
