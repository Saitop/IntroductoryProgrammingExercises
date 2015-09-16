package com.exercises;

import java.util.ArrayList;

/**
 * Created by hxlin on 9/16/15.
 */
public class PrimeFactors {
    public static void main(String[] args){
        ArrayList facotrs = new PrimeFactors().generate(30);
        System.out.print(facotrs);
    }

    public ArrayList<Integer> generate(int numbers ){
        ArrayList factors = new ArrayList();
        for (int each = 2; each < numbers ; each ++){
            if ( numbers % each == 0 && isPrime(each)){
                factors.add(each);
            }
        }
        return factors;
    }

    private boolean isPrime(int each) {
        if ( each == 2 ) {
            return true;
        } else if (each%2==0) {
            return false;
        }
        //if not, then just check the odds
        for(int i=3; i*i<=each; i+=2) {
            if( each%i == 0)
                return false;
        }
        return true;
    }
}
