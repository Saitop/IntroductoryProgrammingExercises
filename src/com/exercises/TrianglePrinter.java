package com.exercises;

/**
 * Created by hxlin on 9/14/15.
 */
public class TrianglePrinter {
    public void printOneAsterisk() {
        System.out.println("*");
        System.out.println("--------------------");
    }

    public void printHorizontalAsterisksWithNumber(int asterisk){
        for (int i = 0; i < asterisk ; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
        System.out.println("--------------------");
    }

    public void printVerticalAsterisksWithNumber(int asterisk){
        for (int i = 0; i < asterisk ; i++) {
            System.out.println("*");
        }
    }
}
