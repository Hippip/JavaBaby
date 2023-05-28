package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    s = s.toLowerCase();
    Set<Character> se = new TreeSet<>();
    for(int i = 0; i < s.length(); i++){
      se.add(s.charAt(i));
    }

    if(se.size() == 26){
      System.out.println("YES");
    }
    else System.out.println("NO");
    
  }
}
