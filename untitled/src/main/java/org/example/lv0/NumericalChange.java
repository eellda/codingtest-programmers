package org.example.lv0;

public class NumericalChange {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }

}

// 나는 무식하게 반목문으로 했다
// 이걸 보고 벽을 느껴보자
// if(k%2==0) {
//  return IntStream.of(arr).map(i->i+k).toArray();
// }
//
// return IntStream.of(arr).map(i->i*k).toArray();

// return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();