package shapes;

import shapeutil.Drawable;

public class Square implements Drawable {

	private int side;
	
	public Square() {////////////////////////////////////////
		super();
	}
	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	public void drawShape() {///////////////////////////////
		System.out.println("In drawShpae() of Square");
	}

	@Override
	public void calArea() {
		System.out.println("Area of Square: "+ side*side);
	}

}
