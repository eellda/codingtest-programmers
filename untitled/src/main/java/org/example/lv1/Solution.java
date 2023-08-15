package com.example.prog1;

public class Solution {
  public int solution(int n) {
//    n = 24;
    int answer = 0;
    String sn = Integer.toString(n);

    for (int i = 0; i < sn.length(); i++) {
      answer += Integer.parseInt(sn.substring(i, i+1));
    }
    System.out.println(sn.length());

    return answer;
  }
}
