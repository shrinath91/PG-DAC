package shapes;

import shapeutil.Drawable;

public class Circle implements Drawable {
	private double rad;

	public Circle() {
		super();
	}

	public Circle(double rad) {
		super();
		this.rad = rad;
	}
	
	public void drawShape()
	{
		System.out.println("In drashape() of Circle");
	}
	public void calArea()
	{
		System.out.println("Area of circle: "+PI*rad*rad);
	}
	

}
