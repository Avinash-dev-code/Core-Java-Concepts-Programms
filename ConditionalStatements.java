import java.util.Scanner;

class ConditionalStatements
{
    public static void main(String[] args) {
        Scanner sic=new Scanner(System.in);
        int age=sic.nextInt();

        if(age>18)
        {
            System.out.println("You can vote");

        }
        else
        {
            System.out.println("You can't vote because your are below 18");
        
        }
    }
}