package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    TreeSet<String> se = new TreeSet<>();
    while(input.hasNext()){
      String s = input.next();
      se.add(s);
    }
     System.out.println(se.size());
     System.out.print(se.first() + " " + se.last());
    
  }
}
