import java.util.LinkedList;
import java.util.Queue;

public class BT {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
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

    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
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
            else{
                System.out.print(cur.val+" ");
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
        }

    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);

    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }

    public static int nodeSum(Node root){
        if(root==null){
            return 0;
        }
        int left=nodeSum(root.left);
        int right=nodeSum(root.right);
        return  left+right+ root.val;
    }

    public static int treeDiameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1=height(root.left)+height(root.right)+1;
        int dia2=treeDiameter(root.left);
        int dia3=treeDiameter(root.right);
        return Math.max(dia1,(Math.max(dia2,dia3)));
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int[] nodes={1,2,4,7,9,10,-1,-1,-1,-1,8,-1,11,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=tree.buildTree(nodes);
//        levelOrder(root);
//        preOrder(root);
//        postOrder(root);
//        inOrder(root);
//        System.out.println(height(root));
//        System.out.println(countNodes(root));
//        System.out.println(nodeSum(root));
        System.out.println(treeDiameter(root));
    }

}