package Study.Map;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class exampleWithCollectionsFrequency {
  public static void main(String[] args) {
        // Let us create a list of strings
        List<String>  mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
  
      // Here we are using frequency() method
      // to get  frequency of element "code"
      int freq = Collections.frequency(mylist, "code");
      // trả về số lần xuất hiện phần tử
      System.out.println(freq);
  }
}
