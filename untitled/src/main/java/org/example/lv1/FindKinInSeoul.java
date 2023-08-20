package com.example.prog1;

public class FindKinInSeoul {
  public String solution(String[] seoul) {
    String answer = "";
    int idx = 0;
    for (String s : seoul) {
      if(s.equals("Kim")) {
        // answer = "김서방은 " + idx + "에 있다";
        break;
      }
      idx++;
    }
    // return answer;
    return String.valueOf(new StringBuilder("김서방은 ").append(idx).append("에 있다"));
  }
}

// String 형 qoduf seoul
// Kim 의 위치 x를 찾는다.
// 찾은 후 김서방은 x 에 있다. 를 반환.

// seoul 배열에 Kim 과 일치하는 index 값을 찾는다

// StringBuilder를 사용하면
// 기본 연산 속도인 6 ~ 10ms 에서
// 0.06 ~ 0.10ms 까지 단축 가능하다.

