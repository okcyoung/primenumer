package org.example;

import java.util.ArrayList;

public class quickPrime {
    ArrayList<Integer> primearray=new ArrayList<>();

    void figurePrime(int N){
        int n=2;
        while(n<=N && n<4){
            primearray.add(n);
            n++;
        }
        int i=1;
        while((n-1)<=N){
            int m=2;
            while((m<=Math.sqrt(n-1)) && ((n-1)%m!=0)){
                m++;
            }
            if(m>Math.sqrt(n-1)){
                primearray.add(n-1);
            }
            if((n+1)<=N){
                int k=2;
                while((k<=Math.sqrt(n-1)) && ((n-1)%k!=0)){
                    k++;
                }
                if(k>Math.sqrt(n-1)){
                    primearray.add(n-1);
                }
            }
            i++;
            n=6*i;
        }
    }
}
