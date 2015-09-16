package com.exercises;

/**
 * Created by hxlin on 9/16/15.
 */
public class DiamondPrinter {

    public static void main(String[] args) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        diamondPrinter.printIsoscelesTriangle(3);
    }

    public void printIsoscelesTriangle(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++)
                System.out.print(" ");
            for (int stars = 1; stars < row + row ; stars++)
                System.out.print("*");
            System.out.println();
        }
    }
}
