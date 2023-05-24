package org.example.lv0;

public class Letter {
    // 한 자 2cm
    // 전체 문자열 길이 * 2
    public int solution(String message) {
        StringBuilder sb = new StringBuilder(message);
        return sb.length() * 2;
        // return message.length() * 2;
    }
}
