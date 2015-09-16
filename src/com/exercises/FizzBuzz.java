package com.exercises;

/**
 * Created by hxlin on 9/16/15.
 */
public class FizzBuzz {
    public static void main(String[] args){
        new FizzBuzz().FizzBuzz();
    }

    public void FizzBuzz () {
        for (int i = 1; i <= 100 ; i++){
            if( i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
