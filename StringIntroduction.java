class StringIntroduction
{
    public static void main(String[] args) {
        String name=" Avinash ";
        String email=new String("Avinash");
        
 System.out.println(email);
        System.out.println(name==email);  //this will prove that first string stored in string pool and second stored in heap memory
        System.out.println(name.length());  //for find length of the string
        System.out.println(name.charAt(2));  //finding charater with givinig index value so that they con return extact  character
        System.out.println(name.substring(3));  //this will used to where to start your string means givinig start index value
        System.out.println(name.substring(0,3));   //this is same but you can provide begning and ending index
        System.out.println(name.toLowerCase());   //use to convert lower case
        System.out.println(name.toUpperCase());   //use to convert in Upper case
        System.out.println(name.isEmpty());  // this will check string are empty or not
        System.out.println(name.trim());  // this will remove extra space


       


    }
}