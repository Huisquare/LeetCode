package BinaryTree;

public class Node {

    Node left;

    Node right;

    int value;

    public Node(int value){
        this.value = value;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void insertNode(int number){

        if (number > this.value){

            if (this.right == null){
                this.right = new Node(number);
            } else {
                this.right.insertNode(number);
            }
        }

        else {

            if (this.left == null){
                this.left = new Node(number);
            } else {
                this.left.insertNode(number);
            }
        }

    }

    public void inOrderTraversal() {

        if (this.left != null) {
            this.left.inOrderTraversal();
        }

        System.out.println(this.value);

        if (this.right != null) {
            this.right.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {

        System.out.println(this.value);

        if (this.left != null) {
            this.left.preOrderTraversal();
        }

        if (this.right != null) {
            this.right.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {

        if (this.left != null) {
            this.left.postOrderTraversal();
        }

        if (this.right != null) {
            this.right.postOrderTraversal();
        }

        System.out.println(this.value);
    }

}
