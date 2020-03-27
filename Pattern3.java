import java.util.Scanner;

class Pattern3


{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for(int j=1;j<=n; j++){
            for(int i=1;i<=n-j;i++)
            {
                System.out.print("  ");

            }
            
            
        
        for(int k=1;k<=j; k++)
        {
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
        
    }


}