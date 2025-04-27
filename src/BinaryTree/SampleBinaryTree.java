package BinaryTree;

public class SampleBinaryTree {

   Node self;

   Node rightNode;

   Node leftNode;

    // implement a binary tree

    //         6
    //     2       8
    //       4  7     9


    public SampleBinaryTree(){
        self = new Node(6);
        leftNode = new Node(2);
        rightNode = new Node(8);

        leftNode.setRight(new Node (4));
        rightNode.setLeft(new Node(7));
        rightNode.setRight(new Node(9));
        self.setLeft(leftNode);
        self.setRight(rightNode);
    }

    public Node getTree() {
        return self;
    }

    public void insertNode(int number){
        self.insertNode(number);
    }

    public void inOrderTraversal(){
        self.inOrderTraversal();
    }

    public void preOrderTraversal(){
        self.preOrderTraversal();
    }

    public void postOrderTraversal(){
        self.postOrderTraversal();
    }

}
