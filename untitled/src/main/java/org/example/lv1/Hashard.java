package com.example.prog1;

public class Hashard {
  public boolean solution(int x) {

    String temp = "" + x;
    int y = 0;

    for (int i = 0; i < temp.length(); i++) {
      y += Integer.parseInt(temp.substring(i, i));
    }

    return (x % y) == 0 ? true : false;
  }
}

// 양의 정수 x 가 하샤드 수려면 x 자릿수의 합으로 x 가 나눠져야 함.
// ex) 18
// 1 + 8 = 9
// 18 / 9 = 0

// 1. x 를 string 으로 바꾼다
// 2. temp 의 자릿수의 값을 찾는다.

