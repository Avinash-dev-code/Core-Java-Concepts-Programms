import java.util.Scanner;

class Patternassign1

{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n; j++){
            for(int i=1;i<=n-j+1;i++)
            {
                System.out.print("  ");

            }
            
            
        
        for(int k=1;k<=j-1+1; k++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }


}