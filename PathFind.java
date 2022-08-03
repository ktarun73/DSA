class BinaryTree{
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    static class CreateTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}

public class PathFind {
    public static void main(String[] args) {
        int[] nodes={3,5,6,-1,2,7,-1,4,-1,1,0,-1,8,-1};
        BinaryTree.Node tree= BinaryTree.CreateTree.buildTree(nodes);
        BinaryTree.CreateTree.preOrder(tree);

    }
}