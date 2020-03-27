import java.util.Scanner;

class Patternassign2

{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n; j++){
            for(int i=1;i<1-j;i++)
            {
                System.out.print("  ");

            }
            
            
        
        for(int k=1;k<=n+1-j; k++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }


}