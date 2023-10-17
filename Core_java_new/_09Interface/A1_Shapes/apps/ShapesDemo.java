package apps;

import shapes.Circle;
import shapes.Square;
import shapeutil.Drawable;

public class ShapesDemo {

	public static void main(String[] args) {
		Drawable []shapes = { new Circle(2), new Square(5)};
		
		for(Drawable d: shapes)
		{
			d.drawShape();
			d.calArea();
		}
		
		
		
	}

}
