/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhienLap;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bai10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguỷn duong n: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to!");
        } else {
            System.out.println(n + " khong phai la so nguyen to!");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

