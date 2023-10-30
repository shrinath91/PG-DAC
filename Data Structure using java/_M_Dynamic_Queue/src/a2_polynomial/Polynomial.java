package a2_polynomial;

public class Polynomial
{
	int coe;
	int exp;
	
	public Polynomial(int coe, int exp)
	{
		this.coe = coe;
		this.exp = exp;
	}

	@Override
	public String toString()
	{
		return "("+coe+"X^"+exp+")";
	}
	
	
	
	
	

}
