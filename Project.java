package se_02;

public class Project {
	
	String [][] order;
	public Project(String[][] order)
	{
		this.order= order;
	}
	public boolean isWellSorted(String [] inp)
	{
		for (int i=0;i<inp.length-1;i++)
		{
			for (int j=i+1;j<inp.length;j++)
			{
				for(String[] a:order)
				{
					if(a[0].equals(inp[j])&&a[1].equals(inp[i]))return false;
				}
			}
		}
		return true;
	}

}
