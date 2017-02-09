import java.util.*;

/**
 * Created by Nishit on 2/9/2017.
 */
public class AlmostSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, k = 1, r1 = 0, r2 = 0,flag=0;
        int n = sc.nextInt();
        int[] index = new int[2];
        int[] a = new int[n];
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        //String s=sc.nextLine();
        System.arraycopy(a, 0, a1, 0, a.length);
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a1[i]) {
                c++;
                k++;
                k %= 2;
                index[k] = i + 1;
            }
        }
        if (c == 0) {
            System.out.println("yes");
            System.exit(0);
        } else if (c == 2) {
            System.out.println("yes");
            System.out.println("swap " + index[0] + " " + index[1]);
            System.exit(0);
        } else {
            for (int i = 0; i < n; i++)
                if (a[i] != a1[i]) {
                    r1 = i;
                    break;
                }
            //System.out.println(r1);

            for (int i = n - 1; i > 0; i--)
                if (a[i] != a1[i]) {
                    r2 = i;
                    break;
                }
            //System.out.println(r2);

//            for (int i = r1+1; i <= r2; i++) {
//                if (a1[i-1] > a1[i]) {
//                    if (r2 == i) {
//                        System.out.println("yes");
//                        System.out.println("reverse " + (r1+1) + " " + (r2+1));
//                        System.exit(0);
//                    }
//                }
//            }
            int i,j;
            for(i=r1,j=r2;i<=r2&&j>=r1;i++,j--)
            {
                if (a1[i] != a[j]) {
                    flag=1;
                    System.out.println("no");
                    System.exit(0);
                }
            }
            if(j==r1-1) {
                        System.out.println("yes");
                        System.out.println("reverse " + (r1+1) + " " + (r2+1));
                        System.exit(0);
            }
            System.out.println("no");
        }
    }
}