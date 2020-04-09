package stqa.ant.projects.sandbox;

public class MySecondProgram {

  public static void main(String[] args) {
    zdra("World");
    zdra("Antoshka");

    double l = 5;
    System.out.println ("S of the square with a side" + l + " = " + area (l));

    double a = 4;
    double b = 6;
    System.out.println("S of the rectangle with sides" + a + "and" + b + " = " + area (a,b));

  }
  public static void zdra (String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

  public static double area (double len) {
    return len * len;
  }

  public static double area(double a, double b) {
  return a * b;
  }
}
