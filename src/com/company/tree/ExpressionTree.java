package com.company.tree;

public class ExpressionTree {
    private Node left;
    private Node right;
    private String top;

    public ExpressionTree() {}

    public ExpressionTree(Node left, Node right, String top) {
        this.left = left;
        this.right = right;
        this.top = top;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
