package org.example.algo3.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String n = "12321";

        int len = n.length();
        boolean flag = true;
        //플래그 넘이면 true가 나오겠지

        for (int i = 0; i < len/2; i++) {
            if (n.charAt(i) != n.charAt(len-i-1)) {
                // -> != <-
                flag = false;
                //플래그넘이 아니면 false 출력
            }
        }
        System.out.println(flag);
    }
}
