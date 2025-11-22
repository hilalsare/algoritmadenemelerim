
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hp
 */
public class boşlukluyıldız {

    
    public static void main(String[] args) {
        // ****  ***
        // *  *  * *
        // *  *  ***
        // ****     
        Scanner input = new Scanner(System.in);
        System.out.print(" n sayısını giriniz ");
        int n = input.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
