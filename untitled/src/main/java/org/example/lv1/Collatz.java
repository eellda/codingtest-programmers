package com.example.prog1;

public class Collatz {
  public int solution(Integer num) {
    int cnt = 0;

    if (num == 1) {
      return 0;
    }

    while (true) {
      ++cnt;
      num = num % 2 == 1 ? num * 3 + 1 : num / 2;

      System.out.println("num == " + num);
      System.out.println("cnt == " + cnt);
      if (num == 1) {
        return cnt;
      }

      if (cnt == 500) {
        return -1;
      }
    }
  }
}

// num = 1 == return 0
// action = 500 == return -1

// 1. num % 2 == 0 이면 num / 2
// 1-2. num % 2 != 0 이면 num * 3 + 1
// 2. res = 1이 나올때까지 반복