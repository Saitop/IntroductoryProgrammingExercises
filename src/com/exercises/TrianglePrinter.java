package com.exercises;

/**
 * Created by hxlin on 9/14/15.
 */
public class TrianglePrinter {
    public static void main(String[] args) {

        TrianglePrinter trianglePrinter = new TrianglePrinter();
        trianglePrinter.printOneAsterisk();
        System.out.println("--------------------");

        trianglePrinter.printHorizontalAsterisksWithNumber(8);
        System.out.println("--------------------");

        trianglePrinter.printVerticalAsterisksWithNumber(3);
        System.out.println("--------------------");

        trianglePrinter.drawRightTriangle(3);
        System.out.println("--------------------");


    }

    public void printOneAsterisk() {
        System.out.println("*");
    }

    public void printHorizontalAsterisksWithNumber(int asterisk){
        for (int i = 0; i < asterisk ; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    public void printVerticalAsterisksWithNumber(int asterisk){
        for (int i = 0; i < asterisk ; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int asterisk){
        for (int row = 0; row < asterisk ; row++ ) {
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
