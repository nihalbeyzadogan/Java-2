package de.fhws.UnitTest;

public class Sign {
	public static int sign(double x) 
	{
		if(x < 0) return -1;
		else if (x > 0) return +1;
		else return 0;
	}
}
