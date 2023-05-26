package org.example.lv0;

public class CountDown {
    // 정수 start와 end가 주어질 때,
    // start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    // 정수 start, end
    // start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트
    // 배열 생성
    // while 문 사용

    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int i = 0;

        while (true) {

            //System.out.print(start);
            //System.out.print(end);
            //System.out.print(i);
            //System.out.printf("i >> ", i);

            answer[i] = start;
            if (start == end) {
                break;
            }
            //System.out.println();
            i++;
            start--;
        }

        return answer;
    }

}


// stream 사용
// return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
