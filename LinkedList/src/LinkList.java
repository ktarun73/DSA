public class LinkList {
    static Node head;
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static void add(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }

    static void print(){
        if(head==null) return;

        Node cur=head;
        while (cur!=null){
            System.out.print(cur.val+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }

    static Node mid(Node head){
        if(head==null || head.next==null) return head;

        Node slow=head , fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static void print(Node head){

        if(head==null) return;

        Node cur=head;
        while (cur!=null){
            System.out.print(cur.val+"->");
            cur=cur.next;
        }
        System.out.println("Null");

    }

    static void revExpectMid(Node head){
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prevDummy=new Node(-1);
        prevDummy.next=dummy;

        Node list1=prevDummy , mid1=dummy , mid2=head  , fast=head;

        while(fast!=null && fast.next!=null){
            list1=list1.next;
            mid1=mid1.next;
            mid2=mid2.next;
            fast=fast.next.next;
        }
        list1.next=null;
        list1=head;

        Node list2=mid2.next;

        mid2.next=null;

        list1=revList(list1);
        list2=revList(list2);


//        print(list1);
//        print(list2);

        mid2.next=list1;

//        print(mid2);

        Node cur1=list2;
        while (cur1.next!=null){
            cur1=cur1.next;
        }
        cur1.next=mid1;

//        print(list2);

        head=list2;

        print(head);

    }

    static Node revList(Node head){

        if(head==null || head.next==null) return head;

        Node prev=head , cur=head.next;

        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=null;
        head=prev;
        return head;


    }

    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.print();
        revExpectMid(list.head);


    }

}