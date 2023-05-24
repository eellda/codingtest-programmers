package org.example.lv0;

public class FirstNegative {
    // 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다
    // 정수 리스트 num_list
    // 첫 번째로 나오는 음수의 인덱스
    // 음수가 없으면 -1
    // for, i, else

    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] <= 0) return i;
        }
        return -1;
    }
}
