import java.util.Scanner;


class SendMutlipleMessageusingforloop 
{

   public static void main(String[] args) {
       System.out.println("Enter a message:");
       Scanner sc=new Scanner(System.in);
       String message=sc.nextLine();
      
       for(int i=1;i<=12;i++){
           System.out.println(message);


       }

   }

}