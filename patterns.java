package love_babbar;

public class patterns {
    private void patterns(int n)
    {
//        pattern 1
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//        pattern 2
        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
//        pattern 3
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
//        pattern 4
        System.out.println();
        int k=0;
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
//        pattern 5
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//        pattern 6
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
//        pattern 7
        System.out.println();
         k=0;
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <=i; j++)
            {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
//        pattern 8
        System.out.println();

        for(int i=1;i<=n;i++)
        {   k=i;
            for (int j =1; j <= i; j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++)
        {   k=0;
            for (int j =0; j < i; j++)
            {
                k=i+j;
                System.out.print(k);
                ;
            }
            System.out.println();
        }
//        pattern 9
        for(int i=1;i<=n;i++)
        {   k=i;
            for (int j =1; j <= i; j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++)
        {   k=0;
            for (int j =0; j < i; j++)
            {
                k=i-j;
                System.out.print(k);
            }
            System.out.println();
        }
//        pattern 10
        System.out.println();
        char ch='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch++;

        }
        //        pattern 10
        System.out.println();
        ch='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //        pattern 11
        System.out.println();
        ch='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {

                System.out.print(ch);
                ch= (char) (i+j-2+ch);
            }
            System.out.println();
        }
        //        pattern 12
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
//        pattern 13
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //        pattern 14
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int p=i;p<=n;p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //        pattern 15
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int p=i;p<=n;p++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //        pattern 16
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //        pattern 17
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int p=i;p<=n;p++)
            {
                System.out.print(p);
            }
            System.out.println();
        }
        //        pattern 18
        System.out.println();
            k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
            {   k++;
                System.out.print(k);
            }
            System.out.println();
        }
        //        pattern 19
        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
            {
                System.out.print(p);
            }
            for(int number=1;number<i;number++)
            {
                System.out.print(i-number);
            }
            System.out.println();
        }
        //        pattern 20 imp
        System.out.println();

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            for(int p=1;p<=i;p++)
            {
                System.out.print("**");
            }
            for(int number=n-i;number>0;number--)
            {
                System.out.print(number);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        patterns p=new patterns();
        p.patterns( 5);
    }
}
