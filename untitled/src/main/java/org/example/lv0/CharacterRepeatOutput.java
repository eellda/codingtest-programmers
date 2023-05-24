package org.example.lv0;

public class CharacterRepeatOutput {
    // 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를
    // n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
    // 문자열 my_string
    // 정수 n
    // my_string에 들어있는 각 문자를 n만큼 반복한 문자열
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i ++) {
            //System.out.println(i);

            for (int j = 1; j <= n; j++) {
                //System.out.println(j);
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
