package org.example.lv0;

public class CharListForString {
    // 문자들이 담겨있는 배열 arr가 주어집니다.
    // arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
    // 문자들이 담겨있는 배열 arr
    // arr의 원소들을 순서대로 이어 붙인 문자열
    // arr의 원소들을 하나로 붙여라

    public String solution(String[] arr) {
        String answer = "";

        for (String i : arr) {
            answer += i;
        }

        return answer;
    }
}
