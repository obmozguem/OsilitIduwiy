package com.walking.lesson26_StringBuilder.task1;

/* Реализуйте задачу 3 (уыыщт6) используя StringBuilder или StringBuffer. Объясните свой выбор.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle's length: ");
        int length = sc.nextInt();
        System.out.print("Enter rectangle's width: ");
        int width = sc.nextInt();
        sc.close();
        StringBuilder horizontalLine = createHorizontalLine(length);
        StringBuilder verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }
    static void printRectangle(StringBuilder horizontalLine, StringBuilder verticalLines) {
        StringBuilder resctangle = new StringBuilder();
        System.out.print(resctangle.append(horizontalLine).append(verticalLines).append(horizontalLine));
    }

    static StringBuilder createHorizontalLine(int length) {
        StringBuilder horizontalLine = new StringBuilder(" ");

        for (int i = 0; i < length; i++) {
            horizontalLine.append("-");
        }

        horizontalLine.append(" \n");

        return horizontalLine;
    }

    static StringBuilder createVerticalLines(int length, int width) {
        StringBuilder verticalLinesUnit = getVerticalLinesUnit(length);

        StringBuilder verticalLines = new StringBuilder();

        for (int i = 0; i < width; i++) {
            verticalLines.append(verticalLinesUnit);
        }
        return verticalLines;
    }

    static StringBuilder getVerticalLinesUnit(int length) {
        StringBuilder verticalLinesUnit = new StringBuilder("|");

        for (int i = 0; i < length; i++) {
            verticalLinesUnit.append(" ");
        }

        verticalLinesUnit.append("|\n");
        return verticalLinesUnit;
    }
}
