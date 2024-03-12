package pattern;

public class SampleABC {
	
	public static void main(String[] args) {
		int no=1;
		char ch = 'A';
		for(int i=1;i<=4; i++)
		{
			for(int j=1; j<=4;j++)
			{
				if(i==1||i==3)
				{
					System.out.print(no);
					no++;
				}
				else
				{
					System.out.print(ch);
					 ch++;
				}
				
				
				}
			System.out.println();

			}
		}
		
	}

