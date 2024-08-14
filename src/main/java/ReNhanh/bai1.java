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

public class bai1 {
    public static void main(String[] args) {
        double a, b;
        String kq;

        Scanner sc = new Scanner(System.in);
        System.out.println("=====Giai phuong trinh bac 1====");

        // Read coefficients a and b from the keyboard
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();

        // Solve the linear equation
        if (a == 0) {
            if (b == 0) {
                kq = "Phuong trinh vo so nghiem";
            } else {
                kq = "Phuong trinh vo nghiem";
            }
        } else {
            kq = "Phuong trinh co nghiem x = " + (-b / a);
        }

        // Display the result
        System.out.println(kq);
    }
}
