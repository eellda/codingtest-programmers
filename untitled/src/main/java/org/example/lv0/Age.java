package org.example.lv0;

import java.time.LocalDate;

public class Age {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age;
    }
}
