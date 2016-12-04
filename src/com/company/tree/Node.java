package com.company.tree;

public class Node extends ExpressionTree {
    private String expression;

    private boolean brackets;

    public Node(String expression) {
        super();
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public boolean hassBrackets() {
        return brackets;
    }

    public void setBrackets(boolean brackets) {
        this.brackets = brackets;
    }
}
