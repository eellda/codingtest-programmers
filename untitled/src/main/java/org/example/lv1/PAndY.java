package com.example.prog1;

public class PAndY {
  boolean solution(String s) {
    String[] sl = new String[s.length()];
    int p = 0;
    int y = 0;

    for (int i = 0; i < s.length(); i++) {
      sl[i] = s.substring(i, i + 1);
    }

    System.out.println(sl);

    for (String v : sl) {
      if (v.equalsIgnoreCase("p")) {
        p++;
      } else if (v.equalsIgnoreCase("y")) {
        y++;
      }
    }

    if (p == 0 && y == 0) {
      return true;
    } else if (p == y) {
      return true;
    }

    return false;
  }
}

// s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

// return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;