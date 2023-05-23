package org.example.lv0;


import java.util.Arrays;

public class Triangle {
    // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    // c < a + b
    // 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
    // arr = [a, b, c]

    // 내 가정
    // 받은 배열에서 가장 큰 값을 배열에서 뺀다
    // 뺀 배열을 새로운 배열로 만든다
    // 둘이 더한 값이 가장 큰 값과 같은지 비교한다
    // 큰 값을 찾으면 따로 뺄 필요 없이 재배치를 하면 될거 같다
    // 정렬 후 마지막 값이 앞에 두 값이랑 비교만 하면 된다

    public int solution(int[] sides) {
        Arrays.sort(sides);

        if ((sides[0] + sides[1]) > sides[2]) return 1;
        return 2;
    }
}
