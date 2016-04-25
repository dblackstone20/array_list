import java.util.ArrayList;

public class Term {
	private String coeff;
	private String  expo;
	ArrayList<String> termList;
	
	public Term(String c, String e)
	{
		Term object = new Term(c,e);
		termList = new ArrayList<String>(3);
		coeff = c;
		expo = e;
		String  variable = "x^";
		termList.add(0, coeff);
		termList.add(1, variable);
		termList.add(2, expo);
		
	}
	public void returnCoefficient()
	{
		String c = coeff.toString();
		System.out.printf("The coefficent is " + c + "!");
	
		
	}
	public void returnExponent()
	{
		String e = expo.toString();
		System.out.printf("The coefficent is " + e + "!");
	}
	
	public boolean compareTerms(Term obj)
	{
		String exponent1 = obj.termList.get(2);//the object that it's being compared to.
		String exponent2 = this.termList.get(2); //this object
		int e1 = Integer.parseInt(exponent1);
		int e2 = Integer.parseInt(exponent2);
		if(e1 > e2)
		{
			return true;
		}
		else
			return false;
	}
	
	public void toString(Term obj)
	{
		String heading1 = "Coefficent";
		String heading2 = "Exponent";
		String heading3 = "Returns";
		String c = obj.coeff.toString();
		String e = obj.expo.toString();
		System.out.printf("%-15s%15s%15s %n", heading1, heading2, heading3);
		System.out.printf("%-15s%15s%15s %n", c, e, c + "x^" + e );
	}
