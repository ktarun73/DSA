import java.util.LinkedList;
import java.util.Queue;

public class TreeSearch {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
        public void preOrder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public boolean search(Node root,int val){
            if (root==null) return false;

            if(root.val==val){
//                System.out.println("Yes");
                return true;
            }

            boolean left =search(root.left,val);
            if(left) return true;
            boolean right=search(root.right,val);
            return right;
        }

        public void levelOrder(Node root){
            if(root==null) return;

            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()){
                Node cur=queue.remove();
                if(cur==null){
                    System.out.println();
                    if(queue.isEmpty()){
                        break;
                    }
                    else {
                        queue.add(null);
                    }
                }
                else {
                    System.out.print(cur.val+" ");
                    if(cur.left!=null) queue.add(cur.left);
                    if(cur.right!=null) queue.add(cur.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root=tree.buildTree(nodes);
//        tree.preOrder(root);
//        if(tree.search(root,6)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

        tree.levelOrder(root);

    }
}
