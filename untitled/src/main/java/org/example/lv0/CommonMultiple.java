package org.example.lv0;

public class CommonMultiple {
    // 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

    // 공배수는 a로도 나눠지고 b로도 나눠짐
    // 이때 나머지는 0
    // 나머지가 0이면 1을 리턴
    public int solution(int number, int n, int m) {
        return ((number % n) == 0 && (number % m) == 0) ? 1 : 0;
    }
}
