package org.example.lv0;

public class OperationLength {
    // 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
    // 정수 list num_list
    // list.length >= 11 이면 list의 모든 원소의 합
    // list.length <= 11 이면 list의 모든 원소의 곱
    public int solution(int[] num_list) {
        int answer = 0;
        //System.out.println(num_list.length);

        if (num_list.length >= 11) {
            for (int k : num_list) {
                answer += k;
            }
        } else {
            answer = 1;
            for (int k : num_list) {
                answer *= k;
            }
        }
        return answer;
    }
}

// stream을 사용한 다른사람의 풀이
//  IntStream stream = IntStream.of(num_list);
//  return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
