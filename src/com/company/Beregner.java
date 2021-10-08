package com.company;

class Beregner {

    int arraySum(int[] a){
        int sum =0;
        for(int i = a.length-1; i > -1; i--){
            sum = sum+a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Beregner b = new Beregner();
        int [] eksempelArray= {12, 5, 6, 8};
        int resultat = b.arraySum(eksempelArray);
        System.out.println(resultat);
    }
}