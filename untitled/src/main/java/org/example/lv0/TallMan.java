package org.example.lv0;

public class TallMan {
    // 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    // 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

    // 반 친구들의 키가 담긴 정수 배열 array
    // 머쓱이의 키 height
    // height 보다 값이 큰 사람의 수

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int k : array) {
            if (k > height) answer++;
        }
        return answer;
    }
}
