package org.example;

import java.util.ArrayList;

public class figurePrime {
ArrayList<Integer> primearray=new ArrayList<>();


 void figurePrime(int N){
     int n=2;
     while(n<=N){
         int m=2;
         while(m<n && n%m!=0){
             m++;
         }
         if(m==n){
             primearray.add(n);
         }
         n++;
     }
 }


}
