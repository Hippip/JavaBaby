package Study.ClassAndObject;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circle {
  private double radius;
  private String color;

  Circle(){
    this.radius = 1.0;
    this.color = " red";
  }

  Circle(double radius){
    this.radius = radius;
  }

  Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }
  
  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public double getArea(){
    return this.radius * this.radius * Math.PI;
  }

  public String toString(){
    return "Radius: " + this.radius + "- Color: " + this.color;
  }
}
