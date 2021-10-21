package com.saumitra;

public class special_triplet {
    public static void main(String[] args) {
        int prod =1;
        for (int i =1;i<=998/2; i++){

            for (int j = 1;j <= 998/2;j++){

                for (int k = 1000 - (i +j); k>=1;k--){

                 if ((i*i + j*j)==k*k && (i + j + k ==1000 )){
                     System.out.println(i + " " + j + " " + k +"");
                 prod = i*j*k;

                 }
                else
                    break;
                }
            }
        }
        System.out.println(prod);
    }
}
