import java.util.Scanner;


class SendMutlipleMessageusinforloop 
{

   public static void main(String[] args) {
       System.out.println("Enter a message:");
       Scanner sc=new Scanner(System.in);
       String message=sc.nextLine();
       for(;;){
           System.out.println(message);


       }

   }

}