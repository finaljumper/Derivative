package com.company;

import com.company.tree.ExpressionTree;

public class Parser {

    private StringBuilder builder;
    private String expression;
    private ExpressionTree tree;



    public Parser(String expression) {
        this.expression = expression;
    }

    public ExpressionTree getTree() {
        return tree;
    }
}
