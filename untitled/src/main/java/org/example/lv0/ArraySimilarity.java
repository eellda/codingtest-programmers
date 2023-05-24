package org.example.lv0;

public class ArraySimilarity {
    // 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

    // 문자열 배열 s1
    // 문자열 배열 s2
    // 같은 원소의 개수

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String k : s1) {
            for (String i : s2) {
                if (k.equals(i)) answer++;
            }
        }
        return answer;
    }
}
