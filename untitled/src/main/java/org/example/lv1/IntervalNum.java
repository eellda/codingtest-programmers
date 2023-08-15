package com.example.prog1;

import java.util.Arrays;

public class IntervalNum {
  public long[] solution(int x, int n) {

      long[] answer = new long[n];


      for (int i = 0; i < n; i++) {
        answer[i] = (long) x + ((long) x * i);
      }

      return answer;

  }
}

// 2, 3 = return [2, 4, 6]