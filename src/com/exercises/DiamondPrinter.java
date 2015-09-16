package com.exercises;

/**
 * Created by hxlin on 9/16/15.
 */
public class DiamondPrinter {

    public static void main(String[] args) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        diamondPrinter.printIsoscelesTriangle(3);
        System.out.println("------------------------------");
        diamondPrinter.printDiamond(3);
        System.out.println("------------------------------");
        diamondPrinter.printDiamondwithName(3, "Hansun");

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

    public void printDiamond(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = n - row; spaces >= 1; spaces--)
                System.out.print(" ");
            for (int stars = 1; stars < row + row; stars++)
                System.out.print("*");
            System.out.println();
        }

        for (int row = n - 1; row >= 1;row--){
            for (int spaces = 1; spaces <= n - row; spaces++)
                System.out.print(" ");
            for (int stars = 1; stars < row + row; stars++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void printDiamondwithName(int n, String name ) {
        for (int row = 1; row < n; row++) {
            for (int spaces = n - row; spaces >= 1; spaces--)
                System.out.print(" ");
            for (int stars = 1; stars < row + row; stars++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println(name);

        for (int row = n - 1; row >= 1;row--){
            for (int spaces = 1; spaces <= n - row; spaces++)
                System.out.print(" ");
            for (int stars = 1; stars < row + row; stars++)
                System.out.print("*");
            System.out.println();
        }
    }


}
