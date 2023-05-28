package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.net.SocketTimeoutException;
import java.util.regex.*;

public class Bai12 {
  static boolean check(String s){
    StringBuffer s_revese = new StringBuffer();
    for(int i = s.length() - 1; i >= 0 ; i--){
      s_revese.append(s.charAt(i));
    }

    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) != s_revese.charAt(i)){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String [] word = s.split(" ");
    Set<String> se = new LinkedHashSet<>(new Collection<String>() {
      public int compare(String a, String b){
        int dodai = Integer.compare(a.length(), b.length())
        if(dodai != 0) return dodai;
        else a.compareTo(b);
      }
    })
  }
}
