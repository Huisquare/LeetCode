package BinaryTree;

import com.sun.source.tree.BinaryTree;

public class Main {

    public static void main(String[] args) {

        SampleBinaryTree tree = new SampleBinaryTree();

        System.out.println(" head node is: " + tree.self.value);

        System.out.println(" left node is: " + tree.self.left.value);

        System.out.println(" right node is: " + tree.self.right.value);

        System.out.println(" left bottom right node is: " + tree.self.left.right.value);

        System.out.println(" right bottom left node is: " + tree.self.right.left.value);

        System.out.println(" right bottom right node is: " + tree.self.right.right.value);

        tree.postOrderTraversal();

    }

}
