package AssesmentQ2;

public class Point {
	  private double x;
	  private double y;

	  public Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }

	  public double distance() {
	    return Math.sqrt(x * x + y * y);
	  }

	  public double distance(Point point) {
	    double xDiff = x - point.x;
	    double yDiff = y - point.y;
	    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	  }
	  public double getX() {
		  return x;
	  }
	  public double getY()
	  {
		  return y;
	  }
	  
	}
