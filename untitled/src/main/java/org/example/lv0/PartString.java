package org.example.lv0;

import java.util.stream.Stream;

public class PartString {

    // 문자열 A
    // 문자열 B
    // A ㄷ B = A를 B의 부분 문자열 이라 호칭
    // 비교 메소드 contains

    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
