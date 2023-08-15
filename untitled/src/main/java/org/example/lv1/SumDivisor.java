package com.example.prog1;

public class SumDivisor {

  public int sum(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        answer += i;
      }
    }

    return answer;
  }
}


