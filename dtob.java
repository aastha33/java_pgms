import java.util.*;

public class dtob
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int count=0;
        int num = sc.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
           binary[index++] = num%2;
           num = num/2;
         }
        for(int i = index-1;i >= 0;i--){
           System.out.print(binary[i]);
           if(binary[i]==0)
           {
               count+=1;
           }
        }
        System.out.println(" ");
        System.out.print("Number of zero bits : ");
        System.out.print(count);
        
    }
  
  
}
