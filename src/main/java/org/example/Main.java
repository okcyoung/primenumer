package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final int N=100000000;
        prime1 f1 =new prime1();
        Date startdate=new Date();
        f1.figurePrime(N);
        Date finishdate=new Date();
        double estimate=N/Math.log(N);
        System.out.println(f1.primearray.toString());
        System.out.println("执行时间："+(finishdate.getTime()-startdate.getTime())+"ms");
        System.out.println("期望素数数量"+estimate+"    实际数量"+ f1.primearray.stream().count());
    }
}