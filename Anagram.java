class Anagram
{
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        Boolean isAnagram=true; // boolean condition for showing Anagram is or not
    //     Boolean visited[]=new Boolean[b.length()]; 
    //     if(a.length()==b.length()) //it checks the length of a is equals to b or not if it is then enter the loop 
    //     {

        
    //     for(int i=0;i<a.length();i++)
    //     { 
    //         char c = a.charAt(i); //character from string a 
    //         for(int j=1;j<b.length();j++)
    //         {
    //             if(b.charAt(j)==c && !visited[j])  
    //             {
    //                 visited[j]=true;
    //                 isAnagram=true;
    //                 break;

    //             }


    //         }
    //         if(!isAnagram){
    //             break;
    //         }
    //     }
    // }

    //below methods for optimization output
    
       int al[]=new int[256];
    //    int bl[]=new int[256];
       for(char c:a.toCharArray())
       {
           int index=(int) c;
           al[index]++;
       }
       for(char c:b.toCharArray())
       {
           int index=(int) c;
           al[index]--;
       }
       for(int i=0;i<256;i++)
       {
           if(al[i]!=0)
           {
               isAnagram=false;
               
           }

       }

        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not an anagram");
        }

    }
}