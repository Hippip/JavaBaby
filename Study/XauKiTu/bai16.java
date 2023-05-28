package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine();
    StringBuffer s2 = new StringBuffer();
    s2.append(input.nextLine());
    s1 = s1.toLowerCase();
    String []se1 = s1.split("\\s+");
    ArrayList<String> v = new ArrayList<>();

    //handle name
    for(int i = 0 ; i < se1.length; i++){
     String fistChar = se1[i].substring(0, 1);
     String remaningChar = se1[i].substring(1);
     String res = fistChar.toUpperCase() + remaningChar;
     v.add(res);
    }

    //handle date of birth
    if(s2.charAt(2) != '/') s2.insert(0, '0');
    if(s2.charAt(5) != '/') s2.insert(3, '0');

    for(String x: v){
      System.out.print(x + " ");
    }
    System.out.println();
    System.out.println(s2);
  }
}
