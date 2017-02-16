import java.io.*;
import java.util.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int i,k,j,c=0;
		String s=sc.nextLine();
		s.replace(" ", "");
		int l=s.length();
		char[][] ch;
		int x=(int)Math.ceil(Math.sqrt(l));
		int y=0;
		if(((x-1)*x)>l)
			y=x-1;
		else
			y=x;
		
		ch=new char[y][x];
		
		for(i=0;i<y;i++)
		{
			for(j=0;j<x;j++)
			{
			//	System.out.println(i+" "+j+" "+c);
				if(c<l)
					ch[i][j]=s.charAt(c);
				else
					ch[i][j]=' ';
				c++;
			}
		}
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				if(ch[j][i]!=' ')
					System.out.print(ch[j][i]);
			}
			System.out.print(" ");
		}
    }
}