package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int[] a ={10,2,13,51,123};

        int[] b = a;

        b[3] =12;


        for(int i =0;i<a.length;i++) {
            b[i]++;
            System.out.print(b[i]+ "\t");
        }
        System.out.println();

        for(int var : a){
            var++;
            System.out.print(var + "\t");
        }

        System.out.println();

        String[] str = {"dwan","dadaw","dwada","swdas"};

        for(String var : str){
            var= var+"sssss";
            System.out.print(var + "\t");

        }



    }
}
