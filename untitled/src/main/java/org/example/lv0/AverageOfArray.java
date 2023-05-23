package org.example.lv0;

public class AverageOfArray {
    public double solution(int[] numbers) {
        double answer  = 0;

        for (int j : numbers) {
            answer += j;
        }

        return answer / numbers.length;
    }
}
