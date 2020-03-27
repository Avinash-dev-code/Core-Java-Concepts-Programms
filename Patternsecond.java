import java.util.Scanner;

class Patternsecond
{
    public static void main(String[] args) { 
         System.out.println("Enter a number for pattern :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int k=1;k<=a;k++){
        for(int i=1;i<=k;i++){
            System.out.print("* ");
        }
        System.out.println();

    }
        
    }
}