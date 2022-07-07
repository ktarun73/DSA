public class MultiplyLists {
    Node head;

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
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
        if(head==null) return;

        Node cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
        System.out.println();
    }

    public int generateNum(){

        if(head==null){
            return 1;
        }
        int num=head.val;
        Node cur=head.next;
        while(cur!=null){
            num=(num*10)+cur.val;
            cur=cur.next;
        }
        return num;
    }

    public static void main(String[] args) {
        MultiplyLists list1=new MultiplyLists();
        MultiplyLists list2=new MultiplyLists();
        list1.add(9);
        list1.add(4);
        list1.add(6);
        list1.print();

        list2.add(8);
        list2.add(4);
        list2.print();

        int num1= list1.generateNum();
        int num2=list2.generateNum();
        System.out.println(num1*num2);



    }
}
