import java.util.Scanner;

class Pattern4
{
    public static void main(String[] args) { 
         System.out.println("Enter a number for pattern :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rows=2*a-1;
        for(int k=1;k<=rows;k++){
        
            if(k<=a){
                 for(int i=1;i<=k;i++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }      
            else{

            
           for(int m=1;m<=rows-k+1;m++)
           {
               System.out.print("* ");
           } 
        
        
        System.out.println();

    }
        
    }
}
    }