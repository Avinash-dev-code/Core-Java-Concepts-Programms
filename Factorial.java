import java.util.Scanner;

class Factorial
{

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sic=new Scanner(System.in);
        int a=sic.nextInt();
        int fact=1;
        for(int i=a;i>=1;i--)
         {
            fact=fact*i;
         }
        System.out.println(fact);


        
    }

}