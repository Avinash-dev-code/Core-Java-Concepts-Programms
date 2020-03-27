import java.util.Scanner;


class Forloops
{
    public static void main(final String[] args) {
        System.out.println("Enter a number for table");


         Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
         int k=1;
         while(k<=10){
        for(int i=1;i<=10;i++)
        {
       
       

            System.out.println("\n"+number+"*"+k+"="+number*i);
            k++;
            
       
       
        }
    }
        
    
        
        
    }
}