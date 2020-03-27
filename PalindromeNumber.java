import java.util.Scanner;

class PalindromeNumber
{

    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reversed=0;
        while(temp>0){
            int lastDigit=temp%10;
            reversed=reversed*10+lastDigit;
              }
        if(reversed==n){
            
            System.out.println("The palindrome Number is"+reversed);

        }
        else
        {
            System.out.println(n+"is not a palindrome number");
        }
    }
}