import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        int largest=0;
        for(int i=0; i < 26; i++){
            h[i] = in.nextInt();
        }
        String word = in.next();
        int l=word.length();
        for(int i=0;i<l;i++)
        {
            int x=((int)(word.charAt(i)))-97;
            if(largest<h[x])
                largest=h[x];
        }
        System.out.println(largest*l);
    }
}
