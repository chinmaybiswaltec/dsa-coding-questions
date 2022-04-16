package com.chinmaybiswaltech.arraymanipulation;

import java.util.HashSet;
import java.util.Set;

public class RepeatedDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(getRepeatedDigitNumbersCount(99,105));
    }

    static int checkIfDigitsRepeated(int n){
        Set<Integer> set = new HashSet<>();
        while(n!=0){
            int rem = n%10;
            if(set.contains(rem)){
                return 1;
            }
            set.add(rem);
            n=n/10;
        }
        return 0;
    }

    static int getRepeatedDigitNumbersCount(int start, int end){
        int result =0;
        for(int i= start+1;i<end+1;i++){
            result = result + checkIfDigitsRepeated(i);
        }
        return result;
    }
}
