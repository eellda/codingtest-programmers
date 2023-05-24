package org.example.lv0;

public class EvenOddNumber {
    // 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int k : num_list) {
            if (k % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] answer = new int[] {even, odd};
        return answer;
    }
}

// 대박 코드
//   public int[] solution(int[] num_list) {
//        int[] answer = new int[2];
//
//        for(int i = 0; i < num_list.length; i++)
//            answer[num_list[i] % 2]++;
//
//        return answer;
//    }