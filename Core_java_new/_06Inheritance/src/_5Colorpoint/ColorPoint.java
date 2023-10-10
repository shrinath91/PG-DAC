package _5Colorpoint;

public class ColorPoint extends Point {

	private String color;
	private static String []colors;
	static 
	 {
		 colors = new String[3];
		 colors[0] = "Red";
		 colors[1] = "Green";
		 colors[2] = "Blue";
	 }
	
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		boolean flag =false;
		for(int i=0; i<colors.length; i++)
		{
			if(colors[i]==color)
			{
				this.color = color;
				flag = true;
				
			}
			if(flag==true)
				this.color="White";
			
		}
	}
	public void display()
	{
		super.display();
		System.out.println(color);
	}





	
	
	
	
}
