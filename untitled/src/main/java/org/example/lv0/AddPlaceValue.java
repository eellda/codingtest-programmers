package org.example.lv0;

public class AddPlaceValue {
    // 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    // 정수 n
    // n의 각 자리 숫자의 합
    // 접근 - int의 자릿수에 접근할 수 있는가? -> 어리석은 접근
    // 2차 접근 - 문자열은 가능
    // String으로 형변환 후 값 하나 하나 다시 int로 형변환 후 저장

    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        //System.out.print(s);

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }

}

//  while(n>0){
//      answer+=n%10;
//      n/=10;
//   }
// 처럼 소거법으로도 접근이 가능하다
