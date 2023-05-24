package org.example.lv0;

public class VowelRemoval {
    // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        return my_string.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }
}

// 위 코드는 무식했던 방법으로 다음부터는 정규 표현식을 써보자
//  return my_string.replaceAll("[aeiou]", "");
