package Trees;

public class BSTree {
    private BSTNode root;

    public BSTNode insert(int element) {
        return insert(root, element);
    }

    public BSTNode insert(BSTNode node, int element) {
        if (node == null) {
            return new BSTNode(element, null, null);
        }

        if (element < node.value) {
            node = insert(node.left, element);
        } else {
            node = insert(node.right, element);
        }

        return node;
    }

    public void display() {
        display(root);
    }
    public void display(BSTNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            display(node.left);
            display(node.right);
        }
    }


    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(16);
        tree.insert(19);

        tree.display();
    }
}
