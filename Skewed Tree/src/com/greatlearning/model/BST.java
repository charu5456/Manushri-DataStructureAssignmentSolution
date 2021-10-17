package com.greatlearning.model;

public class BST {
    public Node node;
     Node prevNode = null;
     Node headNode = null;

    public void Skewed(Node root) {

        if (root != null) {
            Skewed(root.left);

            Node rightNode = root.right;

            if (headNode == null) {
                headNode = root;
            } else {
                prevNode.right = root;
            }
            root.left = null;
            prevNode = root;

            Skewed(rightNode);
        } else {
            return;
        }

    }

    public void SkewedTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        SkewedTree(root.right);
    }
}

