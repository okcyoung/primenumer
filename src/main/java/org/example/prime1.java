package org.example;

import java.util.ArrayList;

public class prime1 {
    ArrayList<Integer> primearray=new ArrayList<>();

    void figurePrime(int N){
        int n=2;
        while(n<=N){
            int m=2;
            while((m<=Math.sqrt(n)) && (n%m!=0)){
                m++;
            }
            if(m>Math.sqrt(n)){
                primearray.add(n);
            }
            n++;
        }
    }

}
