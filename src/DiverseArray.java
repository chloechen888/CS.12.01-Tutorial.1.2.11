import com.sun.source.tree.BreakTree;

public class DiverseArray {

    public static int arraySum(int array [])
    {
        int sum =0;
        for(int i =0; i<array.length;i++)
        {
            sum+= array[i];
        }
        return sum;
    }

    public static int[] rowSums (int array2D [][])
    {
        int sum[] = new int[array2D.length];
        for(int i =0; i<array2D.length;i++)
        {
            int s=0;
            for(int f = 0; f<array2D[i].length;f++)
            {
                s= s+ array2D[i][f];
                sum[i] = s;
            }
        }

        return sum;
    }

    public static boolean isDiverse(int array [][])
    {
       int[] roooow = DiverseArray.rowSums(array);

       for(int i=0; i<roooow.length;i++)
       {
           System.out.println(roooow[i]);

           for( int f = 0; f<roooow.length;f++)
               if(roooow[i]==roooow[f]&& i!=f)
               {
                   return false;
               }

       }

        return true;

    }

}

