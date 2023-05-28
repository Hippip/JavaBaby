package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine();
    String s2 = input.nextLine();
    
    Set<Character>se1 = new TreeSet<>();
    Set<Character>se2 = new TreeSet<>();
    Set<Character>se3 = new TreeSet<>();
    Set<Character>se4 = new TreeSet<>();

    for(int i = 0 ; i < s1.length(); i++){
      se1.add(s1.charAt(i));
      se3.add(s1.charAt(i));
    }

    for(int i = 0; i < s2.length(); i++){
      se2.add(s2.charAt(i));
      se3.add(s2.charAt(i));
    }
    
    for(Character x: se1){
      if(se2.contains(x)){
        se4.add(x);
      }
    }

    for(Character x : se4){
      System.out.print(x);
    }
    System.out.print("\n");

    for(Character x: se3){
      System.out.print(x);
    }

  }
}
