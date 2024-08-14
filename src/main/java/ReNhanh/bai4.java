/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReNhanh;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so can kiem tra: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " la so chan!");
        } else {
            System.out.println(n + " la so le!");
        }
    }
}


