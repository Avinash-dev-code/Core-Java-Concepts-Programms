import java.util.Scanner;

class SumOfDigitusingWhileLoop
{

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int temp=m;
        int sum=0;
        while(temp>0){
            int lastdigit=temp%10;
            temp/=10;
            sum+=lastdigit;
      
            
        }
        System.out.println("the sum of "+m+" is"+sum);
    }


}