import java.util.Scanner;

class Calculator
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a=sc.nextInt();
          System.out.println("Enter a second number:");
        int b=sc.nextInt();
        System.out.println("Enter a operations:");
        sc.nextLine();
        char operations=sc.nextLine().charAt(0);
        int result=0;
        switch(operations)
        {
            case '+':
            result=a+b;
            break;
            case '-':
            result=a-b;
            break;
            case '*':
            result=a*b;
            break;
            case '/':
            result=a/b;
            break;
            default:
            System.out.println("Invalid operations");
             }
        System.out.println("the Result is:"+result);
    }
}