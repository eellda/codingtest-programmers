package com.example.prog1;

import java.util.Arrays;

public class ArrayInt {
  public int[] solution(int[] arr, int divisor) {

    int idx = 0;
    for (int x : arr) {
      if (x % divisor == 0) {
        idx++;
      }
    }

    int[] answer;

    if (idx == 0) {
      answer  = new int[1];
      answer[0] = -1;
    } else {
      answer = new int[idx];
      idx = 0;

      for (int x : arr) {
        if (x % divisor == 0) {
          answer[idx] = x;
          idx++;
        }
      }
    }

    return Arrays.stream(answer).sorted().toArray();
  }
}

// element / divisor 의 값을 오름차순으로 정렬한 배열을 반환

// 람다 사용법
// int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//          if(answer.length == 0) answer = new int[] {-1};
//          java.util.Arrays.sort(answer);
//          return answer;