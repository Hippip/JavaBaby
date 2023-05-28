package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String t = input.nextLine();
    int x = s.indexOf(t);
    if(x >= 0) System.out.println("YES");
    else System.out.println("NO");
  }
}
