import java.util.Scanner;

class ScannerUserInput
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gettingmarks=sc.nextInt();
        int totalmarks=sc.nextInt();
        int percentage=gettingmarks*100/totalmarks;
        System.out.print("Percentage calculate"+"=" +percentage+"%");
    }
}