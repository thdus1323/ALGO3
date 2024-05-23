package org.example.algo3.addcycle;

public class Addcycle {
    public static void main(String[] args) {
        int n = 42;
        //처음초깃값 : result res로 저장
        int res = n;
        int tmp = 0;

        //사이클을 도는 횟수 cnt
        int cnt = 0;
        // 26 2+6=8 >> 68 6+8=14 >> 84 8+4=12 >>42 4+2=6 26 4회
        //05 0+5=5 => 55 5+5 = 10 >> 50 5+0=5 >> 05 3회
        //42 4 +2=6 >> 26  2+6=8 >> 68 6+8=14 >> 84 8+4=12 >> 42 4회

        do {
            tmp = res / 10 + res % 10;
            res = res % 10 * 10 + tmp % 10;
            cnt++;

        }while(n != res);

        System.out.println(cnt);

    }
}
