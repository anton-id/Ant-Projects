package stqa.ant.projects.sandbox;

import java.sql.SQLOutput;

public class MySecondProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello ("Anton");

    Square s = new Square(5);
    System.out.println ("S of square with side" + s.l + " = " + s.area());

    Rectangle r = new Rectangle (4, 6);
    System.out.println("S of rectangle with sides" + r.a + " & " + r.b + " = " + r.area() );
  }
  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

}