/**
 * 
 */

/**
 * 
 * Day 4 - 6 More on points
 * 
 * Write a program in which you create and use a class called Point, with two fields of type (e.g. x,y) and
 * the following methods:
 * 
 * distanceTo(Point): calculates the distance to another point
 * distanceToOrigin(): calculates the distance to teh origin. Implement it by calling teh first method.
 * moveTo(double x, double y): changes the coordinates of this point to be given parameters x and y
 * moveTo(Point): changes the coordinates of this point to move where the given point is:
 * clone(): returns a copy of the current point with the same coordinates
 * opposite(): returns a copy of the current point with the coordinates multiplied by -1
 * 
 * Two methods in a class can have the same name (identifier) as long as their parameters are different.
 * This is called OVERLOADING and we will see more of this in the future.
 * 
 * @author DAVISON
 *
 */
public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//Calculates the distance to another point
	public double distanceToPoint(Point point){
		double distanceToPoint = Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
		return distanceToPoint;
	}
		
	//Calculates the distance to the origin. Implement it by calling the first method
	public double distanceToOrigin(){
		
		distanceToPoint(this.Point)
		double distanceToOrigin = 0;
	
		return distanceToOrigin;
	}
	
	//Changes the coordinates of this point to be the given parameters x and y
	public void moveTo(double x, double y){
		this.x = this.x + x;
		this.y = this.y + y;
	}

	
	//Changes the coordinates of this point to move where the given point is
	public void moveTo(Point p){
		this.x = p.x;
	    this.y = p.y;
	}
	
	//public Point clone(){
	//	Point p = new Point(0,0);
	//	p = this.Point();
	//}

	//Returns a copy of the current point with the coordinates multiplied by -1
	public void opposite(){
		this.x = this.x * -1;
		this.y = this.y * -1;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
