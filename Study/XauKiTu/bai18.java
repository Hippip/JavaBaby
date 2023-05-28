package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    while(n != 0){
      String s1 = input.nextLine();
      
      s1 = s1.toLowerCase();
      String []se = s1.split("\\s+");

      StringBuffer s2 = new StringBuffer();
      s2.append(se[se.length-1]);
      s2.delete(2, 4);
      s2.delete(3, 4);

      String ans = se[se.length -2];
      for(int i = 0 ; i < se.length - 2; i++){
        ans = ans + se[i].charAt(0);
      }
      ans = ans + "@xyz.edu.vn";
      System.out.println(ans);
      System.out.println(s2);
      n--;
    }
  }
}
