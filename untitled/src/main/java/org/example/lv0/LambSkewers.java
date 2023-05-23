package org.example.lv0;

public class LambSkewers {
    public int solution(int n, int k) {
        int yang = n * 12000;
        int drink = k * 2000;

        for (int i = 0; i <= n; i++) {
            if (i != 0 && i % 10 == 0) drink -= 2000;
        }

        return yang + drink;
    }
}
