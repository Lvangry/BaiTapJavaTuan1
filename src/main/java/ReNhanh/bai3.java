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

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = sc.nextInt();

        System.out.print("Nhap so thu ba: ");
        int num3 = sc.nextInt();

        // Tìm số nhỏ nhất
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("So nho nhat la: " + min);
    }
}
