public class LList {
    Node head;
    private int size;
    LList(){
        size=0;
    }
class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }


}
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void printList(){
        if(head==null){
            System.out.println(" No Linked List Created");
            return;
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+" -> ");
            curNode=curNode.next;
        }
        System.out.println("null ");
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
        size++;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Nothing to remove");
            return;
        }
        head=head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Nothing to remove");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node curNode=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            curNode=curNode.next;
            lastNode=lastNode.next;
        }
        curNode.next=null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LList list=new LList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("Linked List");
        System.out.println("LinkedList Created");
        list.printList();
        System.out.println("Remove first ");
        list.removeFirst();
        list.printList();
        System.out.println("Remove Last");
        list.removeLast();
        list.printList();
    }
}
