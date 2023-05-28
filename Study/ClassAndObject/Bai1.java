package Study.ClassAndObject;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Bai1 {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    display(c1);

    Circle c2 = new Circle(2.0);
    display(c2);

    Circle c3 = new Circle(2.0, "Bule");
    display(c3);

    Circle c4 = new Circle();
    c4.setRadius(3.0);
    c4.setColor("Black");
    display(c4);

 
  }

  public static void display(Circle c){
    System.out.println(c.toString());
    System.out.println("Area: " + c.getArea());
    System.out.println();
  }
}
