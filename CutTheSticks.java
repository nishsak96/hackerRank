import java.util.*;

/**
 * Created by Nishit on 2/16/2017.
 */
public class CutTheSticks {
    public static void main(String arg[]) {
        int i,l,c,low=0,loww;
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        while(low<n) {
            c=0;
            loww=a[low];
            for (i = low; i < n; i++) {
                a[i]=a[i]-loww;
                    c++;

                if(a[i]==0) {
                    low++;
                }
            }
            System.out.println(c);
        }
    }
}
