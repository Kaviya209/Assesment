package AssesmentQ2;

public class Tester {
	  public static void main(String[] args) {
	    Point p1 = new Point(2, 3);
	    System.out.println("The distance of p1 from the origin is " + Math.round(p1.distance()* 100.0) / 100.0);
	    Point p2 = new Point(5, 6);
	    System.out.println("The distance of p1 from p2 is " + Math.round(p1.distance(p2)* 100.0) / 100.0);
	  }
	}
