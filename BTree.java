public class BTree {
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
            newNode.left= buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    public static void preorderTraversal(Node root){
        if(root==null){
//            System.out.print("-1 ");
            return;
        }
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    public static void main(String[] args) {
        int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTree(nodes);
//        System.out.println(root.right.right.right.val);
//        preorderTraversal(root);
//        inOrder(root);
        postOrder(root);
    }

}
