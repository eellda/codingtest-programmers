package org.example.lv0;

public class Rny_String {
    // 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    // 문자열 rny_string
    // m -> rn으로 바꿔라
    // 문자열의 원소 하나 하나 찾기
    // m이 있으면 rn으로 바꾸기
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}
