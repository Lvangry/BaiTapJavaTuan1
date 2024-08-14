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

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();

        int maxDigit = 0, minDigit = 9;
        while (n > 0) {
            int digit = n % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            n /= 10;
        }

        System.out.println("Chu so lon nhat la: " + maxDigit);
        System.out.println("Chu so nho nhat la: " + minDigit);
    }
}

