package com.exercises;

public class Main {

    public static void main(String[] args) {
        TrianglePrinter printer = new TrianglePrinter();
        printer.printOneAsterisk();
        printer.printHorizontalAsterisksWithNumber(8);
        printer.printVerticalAsterisksWithNumber(3);
        printer.drawRightTriangle(3);
    }
}
