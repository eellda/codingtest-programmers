package org.example.lv0;

public class RemoveSpecificChar {
    // 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    // 문자열 my_string
    // 문자 letter
    // my_string에서 letter를 제거한 문자열

    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}