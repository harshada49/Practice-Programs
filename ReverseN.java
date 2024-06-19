import java.util.Scanner;
//program to reverse a number.
public class ReverseN{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        String s = "";
        while(n != 0){
            int r = n % 10;
            s = s + Integer.toString(r);    //use to convert integer to string
            n = n / 10;

        }
        System.out.println(s);
        sc.close();
    }
}
