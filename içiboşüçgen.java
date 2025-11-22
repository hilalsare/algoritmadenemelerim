
import java.util.Scanner;


public class içiboşüçgen {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            
             // soldaki boşluklar            
            for (int j =1; j <= n-i; j++) {
                System.out.print(" ");
             }
             
             // yıldızlar ve iç boşluklar
            for (int j = 1; j <=2*i-1; j++) {
                if (j==1 || i==n || j==2*i-1) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    
}
