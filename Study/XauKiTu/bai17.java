package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    s = s.toLowerCase();
    String[]s1 = s.split("\\s+");
    ArrayList<String> v = new ArrayList<>();
    StringBuffer se = new StringBuffer();
    StringBuffer se1 = new StringBuffer();

    int vt_ten = s1.length - 1;
    for(int i = 0 ; i < s1.length; i++){
      if(i == vt_ten){
        String res = s1[i].toUpperCase();
        v.add(res);
      }
      else{
        String firstChar = s1[i].substring(0, 1);
        String remainingChar = s1[i].substring(1);
        String res = firstChar.toUpperCase() + remainingChar;
        v.add(res);
      }
      
    }
    
    int vt = v.size() - 2;
    for(int i = 0 ; i < v.size(); i++){
      if(i == vt){
        se.append(v.get(i) + ',' + " ");
      }
      else se.append(v.get(i) + " ");
    }
    
    se1.append(v.get(v.size()-1) + ',' + " ");
    for(int i = 0; i < v.size() - 1; i++){
      se1.append(v.get(i) + " ");
    }
    
    System.out.println(se);
    System.out.println(se1);
  }
}
