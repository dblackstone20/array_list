import java.util.ArrayList;

public class Polynomial {
	String plus ="+";
	String minus = "-";
	ArrayList<Term> Polynomial;
	public Polynomial()
	{
		Polynomial = new ArrayList<Term>();
		int size = Polynomial.size();
	}
	
	public void insert(String c, String e)
	{
		Term term = new Term(c,e);
		Polynomial.add(term);
	
	}
	
	public void sort(Polynomial List)
	{
		int currentIndex = 0;
		String c_exponent = Polynomial.get(currentIndex).termList.get(2);
		int c_ex = Integer.parseInt(c_exponent);
		int nextIndex = currentIndex +1;
		String n_exponent = Polynomial.get(currentIndex).termList.get(2);
		int n_ex = Integer.parseInt(n_exponent);
		int end = Polynomial.size()-1;
		int x = 0;
		int y = end;
		int z = 0;
		int rev_current = y;
		int rev_next = rev_current -1;
		int c_current = 0;
		int c_next = c_current +1;
		Term temp;
		Term next = Polynomial.get(nextIndex);
		Term term = Polynomial.get(currentIndex);
		//String exponent = term.termList.get(2);
		while(x < end)
		{
			if (c_ex > n_ex)
			{
				x++;
				currentIndex = x;
				nextIndex = currentIndex+1;
			}
			else if(c_ex < n_ex)
			{
				temp = Polynomial.get(currentIndex);
				term = Polynomial.get(nextIndex);
				next = temp;
				x++;
				currentIndex = x;
				nextIndex = currentIndex +1;
				
			}
			else
			{
				x++;
				currentIndex = x;
				nextIndex = currentIndex+1;
			}
		}
	}
	public void delete(String x, String y)
	{
		int end = 0;
		for(int i = 0; i <= end; i++)
		{
			
		}
	}

		
	

}