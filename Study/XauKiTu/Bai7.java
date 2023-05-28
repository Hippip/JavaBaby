package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    StringBuffer s_reverse = new StringBuffer();
    for(int i = s.length() - 1; i >= 0; i--){
      s_reverse.append(s.charAt(i));
    }
    for(int i = 0 ; i < s.length(); i++){
      if(s.charAt(i) != s_reverse.charAt(i)){
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
