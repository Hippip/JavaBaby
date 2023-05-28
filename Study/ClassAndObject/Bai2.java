package Study.ClassAndObject;

public class Bai2 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.setLength(5);
    r1.setWidth(6);
    display(r1);

    Rectangle r2 = new Rectangle(7, 9);
    display(r2);
  }

  public static void display(Rectangle r){
    System.out.println(r.toString());
    System.out.println("Area: " + r.getArea());
    System.out.println();
  }
}
