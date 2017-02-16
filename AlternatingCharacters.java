import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s = sc.next();
			int c=0;
			int ls=s.length();
			for(int j=0;j<ls-1;j++)
			{
				if(s.charAt(j)==s.charAt(j+1))
				{
					c++;
				}
			}
			System.out.println(c);
		}
		
    }
}