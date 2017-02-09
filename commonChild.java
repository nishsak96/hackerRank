import java.util.*;

class commonChild
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int ls=s.length();
		int lt=t.length();
		int i,j,k,l=0,c,a,b=0,flag;
		int str[] = new int[5000];
		c=0;
		while(l!=ls)
		{
			a=0;c=0;flag=1;
			for(i=b;i<ls;i++)
			{
				for(j=a;j<ls;j++)
				{
					if(s.charAt(i)==t.charAt(j))
					{
						if(flag==1)
						{
							b=i+1;
							flag=0;
						}
						str[l]=str[l]+1;
						a=j+1;
						break;
					}
				}
			}
			l++;
		}
		
		System.out.println(Arrays.stream(str).max().getAsInt());
	}
}