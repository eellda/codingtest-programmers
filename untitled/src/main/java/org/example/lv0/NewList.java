package org.example.lv0;

import java.util.Arrays;

public class NewList {
    // 정수 리스트 num_list와 정수 n이 주어질 때,
    // n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요
    // 정수 리스트 num_list
    // 정수 n
    // n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return
    // n 은 인덱스라 가정, n-1 ~ 끝까지
    // 새로운 배열 생성
    // 3, 2 = 0
    // 4, 2 = 1
    // 5, 2 = 2 ...

    public int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length - (n - 1)]; // num_list.length로 하면 남은 인덱스는 0으로 채워지기 때문

        for (int i = (n - 1); i < num_list.length; i++) {
        System.out.println(num_list[i]);
        answer[i - n + 1] = num_list[i]; // 0번부터 채움
    }

        return answer;
    }
}

// copyOfRange 메소드만 알면 한줄로 끝남
// int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
