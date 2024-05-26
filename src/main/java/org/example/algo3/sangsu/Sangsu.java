package org.example.algo3.sangsu;

public class Sangsu {
    public static void main(String[] args) {
        int a = 734;
        int b = 893;

        int arrA[] = new int [3]; //[0]=4 [1]=3 [2]=7 => 437
        int arrB[] = new int [3];

        int lenA = 0;
        do{
            arrA[lenA] = a % 10;
            a /= 10;
            lenA++;
        } while (a > 0);

        //arry에 넣은 수를 다시 10진수로 합치는 과정
        int tranA = 0;
        int mux = 1; // 1-> 10 -> 100 -> 1000
        //[0]=4 [1]=3 [2]=7
        //400 + 30 + 7 => 437
        for (int i = arrA.length-1 ; i >=0 ; i--) {
            tranA += arrA[i]*mux;
            mux *= 10;
        }
        System.out.println("tranA = " + tranA);


        int lenB = 0;
        do{
            arrB[lenB] = b % 10;
            b /= 10;
            lenB++;
        } while (b > 0);

        int tranB = 0;
         mux = 1; // 1-> 10 -> 100 -> 1000
        //[0]=4 [1]=3 [2]=7
        //400 + 30 + 7 => 437
        for (int i = arrB.length-1 ; i >=0 ; i--) {
            tranB += arrB[i]*mux;
            mux *= 10;
        }
        System.out.println("tranB = " + tranB);

        if (tranA > tranB){
            System.out.println(tranA);
        }
        else {
                System.out.println(tranB);
            }
        }
    }

