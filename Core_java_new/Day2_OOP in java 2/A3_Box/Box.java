class Box
{
	private int height;
	private int width;
	private	int depth;
	
	public Box()
	{
		height=0;
		width=0;
		depth=0;
	}
	public Box(int height, int width, int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public Box(int t)
	{
		height=width=depth=t;
	}
	public int calVolume()
	{
		return height*width*depth;
	}
}