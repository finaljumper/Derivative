package com.company;

public class BracketMatcher {
    private static int leftBraces = 0;
    private static int rightBraces = 0;

    public static void newBrace() {
        leftBraces++;
    }

    public static void closeBrace() {
        rightBraces++;
    }

    public static int getBraceCount() {
        return leftBraces;
    }

    public static boolean isMatched() {
        return leftBraces == rightBraces;
    }
}
