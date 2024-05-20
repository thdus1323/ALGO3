package org.example.algo3.duplicatenums;

public class RemoveNum {
    public static void main(String[] args) {
        boolean arr[] = new boolean[101];
        int inArr[] = new int[101];
        inArr[0] = 1;
        inArr[1] = 2;
        inArr[2] = 3;
        inArr[3] = 1;
        inArr[4] = 1;
        inArr[5] = 2;
        inArr[6] = 3;
        inArr[7] = 4;
        inArr[8] = 5;
        inArr[9] = 5;
        inArr[10] = 7;
        inArr[11] = 15;
        //답 : 1 2 3 4 5 7 15

        for(int i = 0; i<=100; i++){

            arr[inArr[i]] = true;
            //arr[]으로 inArr[i]의 값을 표시를 해 놓는 것.
        }
        for (int i = 1; i <=100 ; i++) {
            if(arr[i]){
                System.out.print(i + " ");
            }
        }


    }
}
