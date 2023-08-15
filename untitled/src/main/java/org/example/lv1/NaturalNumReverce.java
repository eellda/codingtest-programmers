package com.example.prog1;

public class NaturalNumReverce {

  public int[] solution(long n) {

    StringBuffer sb = new StringBuffer(Long.toString(n));
    String sn = sb.reverse().toString();
    int[] answer = new int[sn.length()];

    for (int i = 0; i < sn.length(); i++) {
      answer[i] = Integer.parseInt(sn.substring(i));

    }
    return answer;
  }
}
// 먼저 long 타입의 n을 String 으로 변환한다
// 그 후 변환된 n 을 뒤집은 후 String 으로 담아준다.
// 변환된 String 길이 만큼 새로운 배열을 생성해준다
// String 의 i 번째 값을 int 로 변환 후 생성한 배열에 순서대로 담는다.


// return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
