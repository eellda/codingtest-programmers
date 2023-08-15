package com.example.prog1;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


public class HelloApplication {
  public static void main(String[] args) {
    PAndY solution = new PAndY();

    System.out.println(solution.solution("happyy"));
//    System.out.println(solution);
  }
}