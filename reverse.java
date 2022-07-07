import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0;i<matrix[0].length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                res[i][j]=matrix[j][i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
  
  
}
