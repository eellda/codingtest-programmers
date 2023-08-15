package com.example.prog1;

public class Square {

  public long solution(long n) {


    int res = (int) Math.sqrt(n);
    String[] arr = Long.toString(n).split("");

    return (n == Math.pow(res, 2)) ? (long) Math.pow(res + 1, 2) : -1;

  }

}

// 정수 제곱근 판별
// 변수의 제곱근을 파악후 int로 변환한다 (소수점 제거)
// int로 변환된 값을 제곱 했을때 n 과 같은지 비교 한다.
// 같으면 + 1 제곱하고 다르면 -1을 리턴 시킨다.