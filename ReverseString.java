class ReverseString 
{
    public static void main(String[] args) {
        String text="I love Java, the coffee";
        int a[]=new int[256];
        String reveser="";
        
        for(int i=text.length()-1;i>=0;i--){

            reveser+=text.charAt(i);
            
        }
        System.out.println("The reverse number is"+reveser);
        

        

    }
}